package ru.vk;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.jetbrains.annotations.NotNull;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Application
{
  public static void main(@NotNull String[] args)
  {
    final Injector injector = Guice.createInjector(/*modules*/);
    injector.getInstance(Application.class).waitForInput();
  }

  public void waitForInput() {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Waiting for new lines. Key in Ctrl+D to exit.");
      while (true) {
        /*your code here*/
      }
    } catch (IllegalStateException | NoSuchElementException e) {
    }
  }
}