package ru.vk;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import ru.vk.loggers.CompositeLogger;
import ru.vk.loggers.ConsoleLogger;
import ru.vk.loggers.CustomLogger;
import ru.vk.loggers.FileLogger;
import ru.vk.notations.Composite;
import ru.vk.notations.Console;
import ru.vk.notations.File;

public class TextHandlerModule extends AbstractModule
{
  @Override
  protected void configure()
  {
    bind(CustomLogger.class)
      .annotatedWith(Console.class)
      .to(ConsoleLogger.class)
      .in(Singleton.class);
    bind(CustomLogger.class)
      .annotatedWith(File.class)
      .to(FileLogger.class)
      .in(Singleton.class);
    bind(CustomLogger.class)
      .annotatedWith(Composite.class)
      .to(CompositeLogger.class)
      .in(Singleton.class);
  }
}
