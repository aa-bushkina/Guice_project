package ru.vk.handlers;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.jetbrains.annotations.NotNull;
import ru.vk.loggers.CompositeLogger;

@Singleton
public class CompositeLogHandler extends LogHandler
{
  @Inject
  public CompositeLogHandler(@NotNull final CompositeLogger logger)
  {
    super(logger);
  }
}
