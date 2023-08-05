package com.hvdbs.savra.geeksforgeeks.statsgenerator;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;
import lombok.Builder;
import lombok.Data;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StatsGenerator {
    private static final String PACKAGE_NAME = "com.hvdbs.savra.geeksforgeeks.solution.java";
    private static final String SOLUTION_BASE_URL = "https://github.com/savra/GeeksforGeeks/tree/master/src/main/java/com/hvdbs/savra/geeksforgeeks/solution/java/";

    public static void generate() {
            try (BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get("README.md"), StandardOpenOption.TRUNCATE_EXISTING)) {

                bufferedWriter.append("# GeeksforGeeks");
                bufferedWriter.newLine();
                bufferedWriter.append("## Solving problems on GeeksforGeeks");
                bufferedWriter.newLine();
                bufferedWriter.append("### Solutions by difficulty");

                List<OutputGeeksForGeeksFormat> solutions = findSolutions(PACKAGE_NAME);

                Map<Difficulty, List<OutputGeeksForGeeksFormat>> difficultyListMap = solutions.stream()
                        .collect(Collectors.groupingBy(OutputGeeksForGeeksFormat::getDifficulty));

                for (Difficulty difficulty : difficultyListMap.keySet()) {
                    bufferedWriter.newLine();
                    bufferedWriter.append("<details>");
                    bufferedWriter.newLine();
                    bufferedWriter.append("<summary>").append(String.valueOf(difficulty)).append("</summary>");
                    bufferedWriter.newLine();
                    bufferedWriter.newLine();
                    bufferedWriter.append("|Name|Problem|Solution|");
                    bufferedWriter.newLine();
                    bufferedWriter.append("|---|---|---|");
                    bufferedWriter.newLine();

                    for (OutputGeeksForGeeksFormat outputGeeksForGeeksFormat : difficultyListMap.get(difficulty)) {
                        bufferedWriter.append("|")
                                .append(outputGeeksForGeeksFormat.getName())
                                .append("|")
                                .append("<a href='").append(outputGeeksForGeeksFormat.getProblemUrl()).append("'>").append(outputGeeksForGeeksFormat.getName()).append("</a>")
                                .append("|")
                                .append("<a href='").append(outputGeeksForGeeksFormat.getSolutionUrl()).append("'>").append(outputGeeksForGeeksFormat.getName()).append("</a>")
                                .append("|");
                        bufferedWriter.newLine();
                    }
                    bufferedWriter.append("</details>");
                }
            } catch (IOException ignored) {}
    }

    private static List<OutputGeeksForGeeksFormat> findSolutions(String packageName) {
        List<OutputGeeksForGeeksFormat> solutionsList = new ArrayList<>();

        try (InputStream inputStream = ClassLoader.getSystemClassLoader().getResourceAsStream(packageName.replace('.', '/'))) {
            if (inputStream == null) {
                return solutionsList;
            }

            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
                solutionsList = bufferedReader.lines()
                        .map(solution -> {
                            String className = packageName + "." + solution.substring(0, solution.lastIndexOf('.'));

                            try {
                                GeeksForGeeksInfo geeksForGeeksInfo = Class.forName(className).getAnnotation(GeeksForGeeksInfo.class);

                                if (geeksForGeeksInfo != null) {
                                    return OutputGeeksForGeeksFormat.builder()
                                            .difficulty(geeksForGeeksInfo.difficulty())
                                            .name(geeksForGeeksInfo.name())
                                            .problemUrl(geeksForGeeksInfo.url())
                                            .solutionUrl(SOLUTION_BASE_URL + solution.replace("class", "java"))
                                            .build();
                                }

                                return null;
                            } catch (ClassNotFoundException e) {
                                return null;
                            }
                        })
                        .filter(Predicate.not(Objects::isNull))
                        .collect(Collectors.toList());
            }
        } catch (IOException e) {
            return solutionsList;
        }

        return solutionsList;
    }

    @Builder
    @Data
    private static final class OutputGeeksForGeeksFormat {
        private String name;
        private String problemUrl;
        private String solutionUrl;
        private Difficulty difficulty;
    }
}
