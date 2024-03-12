package org.example.HomeWork10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task4 {
    public static void main(String[] args) {
        String sourcePath = "source.txt";
        String targetPath = "target.txt";

        copyFileContent(sourcePath, targetPath);
    }

    public static void copyFileContent(String sourcePath, String targetPath) {
        try (FileReader reader = new FileReader(sourcePath);
             FileWriter writer = new FileWriter(targetPath)) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            System.out.println("Копирование завершено.");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        }catch (IOException e) {
            System.out.println("Ошибка копирования.");
        }
    }
}
