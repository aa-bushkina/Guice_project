package ru.vk;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Application
{
  static private Injector injector;

  public static void main(@NotNull String[] args)
  {
    injector = Guice.createInjector(new TextHandlerModule());
    injector.getInstance(Application.class).waitForInput(args);
  }

  public void waitForInput(@NotNull String[] args)
  {
    if (!checkArgs(args))
    {
      throw new RuntimeException("Incorrect args.");
    }
    String logType = args[0];
    String tag = args[1];
    try (Scanner scanner = new Scanner(System.in))
    {
      String text;
      int uniqueNum = 0;
      System.out.println("Waiting for new lines. Key in Ctrl+D to exit.");
      while (true)
      {
        text = scanner.nextLine();
        injector.getInstance(LogTypeFactory.valueOf(logType).handlerClass())
          .makeLog(uniqueNum, text, tag);
        uniqueNum+=2;
      }
    } catch (IllegalStateException | NoSuchElementException e)
    {
      e.printStackTrace();
    }
  }

  public boolean checkArgs(@NotNull String[] args)
  {
    return (args.length == 2) && (Arrays.asList("File", "Console", "Composite").contains(args[0]));
  }
}
