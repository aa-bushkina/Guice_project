package ru.vk.handlers;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.jetbrains.annotations.NotNull;
import ru.vk.loggers.CustomLogger;
import ru.vk.notations.Console;

@Singleton
public class ConsoleLogHandler extends LogHandler
{
  @Inject
  public ConsoleLogHandler(@NotNull final @Console CustomLogger consoleLogger)
  {
    super(consoleLogger);
  }
}
