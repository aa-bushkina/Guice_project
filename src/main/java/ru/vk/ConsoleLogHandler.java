package ru.vk;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.jetbrains.annotations.NotNull;
import ru.vk.loggers.CustomLogger;
import ru.vk.notations.Console;

@Singleton
public class ConsoleLogHandler
{
  @NotNull
  private final CustomLogger consoleLogger;


  @Inject
  public ConsoleLogHandler(@NotNull final @Console CustomLogger consoleLogger)
  {
    this.consoleLogger = consoleLogger;
  }

  public void makeLog(@NotNull final String text, @NotNull final String tag)
  {
    consoleLogger.run(text, tag);
  }
}
