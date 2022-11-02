package ru.vk;

import org.jetbrains.annotations.NotNull;
import ru.vk.handlers.CompositeLogHandler;
import ru.vk.handlers.ConsoleLogHandler;
import ru.vk.handlers.FileLogHandler;
import ru.vk.handlers.LogHandler;

public enum LogTypeFactory
{
  Console,
  File,
  Composite;

  @NotNull
  public Class<? extends LogHandler> handlerClass()
  {
    return switch (this)
      {
        case Console -> ConsoleLogHandler.class;
        case File -> FileLogHandler.class;
        case Composite -> CompositeLogHandler.class;
      };
  }
}
