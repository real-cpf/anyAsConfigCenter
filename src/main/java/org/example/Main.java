package org.example;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
  public static void main(String[] args) {
    String root = System.getProperty("user.dir");
    Path rootPath = Path.of(root).resolve("README.md");
    try {
      Files.readAllLines(rootPath, StandardCharsets.UTF_8).forEach(l->{
        System.out.println(l);
      });
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
