package ru.vk;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.jetbrains.annotations.NotNull;

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
      System.out.println("Incorrect args.");
      return;
    }
    String logType = args[0];
    String tag = args[1];
    try (Scanner scanner = new Scanner(System.in))
    {
      String text;
      System.out.println("Waiting for new lines. Key in Ctrl+D to exit.");
      while (true)
      {
        text = scanner.nextLine();
        if (logType.equals("console") || logType.equals("composite"))
        {
          injector.getInstance(ConsoleLogHandler.class).makeLog(text, tag);
        }
        if (logType.equals("file") || logType.equals("composite"))
        {
          injector.getInstance(FileLogHandler.class).makeLog(text, tag);
        }
      }
    } catch (IllegalStateException | NoSuchElementException e)
    {
      e.printStackTrace();
    }
  }

  public boolean checkArgs(@NotNull String[] args)
  {
    return args.length == 2 &&
      (args[0].equals("console") || args[0].equals("file") || args[0].equals("composite"));
  }
}
