package com.company.task21;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Decision21 {
    public static void main(String[] args) {
        List<String> list = read();
        write(list);
    }

    private static void write(List<String> list) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:/test/output.txt"))) {
            for (int i = 0; i < list.size(); i++) {
                StringBuilder reverseLine = new StringBuilder(list.get(i));
                reverseLine.reverse();
                bufferedWriter.write(reverseLine + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String> read() {
        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D:/test/input.txt"))) {

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}

