package ru.vk;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import ru.vk.loggers.ConsoleCustomLogger;
import ru.vk.loggers.CustomLogger;
import ru.vk.loggers.FileCustomLogger;
import ru.vk.notations.Console;
import ru.vk.notations.File;

public class TextHandlerModule extends AbstractModule
{
  @Override
  protected void configure()
  {
    bind(CustomLogger.class)
      .annotatedWith(Console.class)
      .to(ConsoleCustomLogger.class)
      .in(Singleton.class);
    bind(CustomLogger.class)
      .annotatedWith(File.class)
      .to(FileCustomLogger.class)
      .in(Singleton.class);
  }
}
