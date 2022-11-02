package ru.vk;

import com.google.inject.Inject;
import org.jetbrains.annotations.NotNull;
import ru.vk.handlers.LogHandler;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Application
{
  @NotNull
  final private Tag tag;
  @NotNull
  final private LogHandler logHandler;

  @Inject
  public Application(@NotNull final Tag tag, @NotNull final LogHandler logHandler)
  {
    this.tag = tag;
    this.logHandler = logHandler;
    waitForInput();
  }

  private void waitForInput()
  {
    try (final Scanner scanner = new Scanner(System.in))
    {
      String text;
      System.out.println("Waiting for new lines. Key in Ctrl+D to exit.");
      while (true)
      {
        text = scanner.nextLine();
        logHandler.makeLog(text, tag.getText());
      }
    } catch (IllegalStateException | NoSuchElementException e)
    {
      e.printStackTrace();
    }
  }
}
