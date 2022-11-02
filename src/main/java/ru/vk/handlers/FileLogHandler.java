package ru.vk.handlers;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.jetbrains.annotations.NotNull;
import ru.vk.loggers.FileLogger;

@Singleton
public class FileLogHandler extends LogHandler
{
  @Inject
  public FileLogHandler(@NotNull final FileLogger fileLogger)
  {
    super(fileLogger);
  }
}
