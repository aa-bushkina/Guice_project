package ru.vk.handlers;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.jetbrains.annotations.NotNull;
import ru.vk.loggers.CustomLogger;
import ru.vk.notations.Composite;
import ru.vk.notations.File;

@Singleton
public class CompositeLogHandler extends LogHandler
{
  @Inject
  public CompositeLogHandler(@NotNull final @Composite CustomLogger logger)
  {
    super(logger);
  }
}
