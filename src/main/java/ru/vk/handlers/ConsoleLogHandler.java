package ru.vk.handlers;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.jetbrains.annotations.NotNull;
import ru.vk.loggers.ConsoleLogger;

@Singleton
public class ConsoleLogHandler extends LogHandler
{
  @Inject
  public ConsoleLogHandler(@NotNull final ConsoleLogger consoleLogger)
  {
    super(consoleLogger);
  }
}
