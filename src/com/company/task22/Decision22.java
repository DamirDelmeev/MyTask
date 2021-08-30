package com.company.task22;

import java.io.*;
import java.util.*;

public class Decision22 {
    public static void main(String[] args) {
        Set<String> poem = findPoem();
        String author = getAuthor(poem);
        List<String> sortPoem = new ArrayList<>(poem);
        write(sortPoem);
    }

    private static Set<String> findPoem() {
        Set<String> poem = new HashSet<>();
        String line = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D:/test/Poem.txt"))) {
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("Автор:")) {
                    continue;
                } else {
                    poem.add(line);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return poem;
    }

    private static String getAuthor(Set<String> poem) {

        String line = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D:/test/Poem.txt"))) {
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("Автор:")) {
                    return line;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Автор не указан.";
    }

    private static void write(List<String> list) {
        Collections.sort(list, Comparator.comparing(String::length));
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:/test/outputPoem.txt"))) {
            for (int i = 0; i < list.size(); i++) {
                String line = (list.get(i));
                bufferedWriter.write(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
/**
 * * Читает строки из исходного файла и сохраняет в выходной .
 * Формирует упорядоченный список строк из стихотворений указанного автора.
 *
 * @param poems Анализируемое множество стихотворений.
 * @param author Автор, стихотворения которого необходимо выбрать.
 * @return Список, упорядоченных по длине строк, составляющих стихотворения автора.
 */