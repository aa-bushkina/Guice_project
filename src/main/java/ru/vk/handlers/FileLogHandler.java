package ru.vk.handlers;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.jetbrains.annotations.NotNull;
import ru.vk.loggers.CustomLogger;
import ru.vk.notations.File;

@Singleton
public class FileLogHandler extends LogHandler
{
  @Inject
  public FileLogHandler(@NotNull final @File CustomLogger fileLogger)
  {
    super(fileLogger);
  }
}
