package ru.vk.handlers;

import com.google.inject.Inject;
import org.jetbrains.annotations.NotNull;
import ru.vk.loggers.CustomLogger;
import ru.vk.notations.File;

public abstract class LogHandler
{
  @NotNull
  protected final CustomLogger logger;

  @Inject
  public LogHandler(@NotNull final @File CustomLogger fileLogger)
  {
    this.logger = fileLogger;
  }
  public void makeLog(final int uniqueNum, @NotNull final String text, @NotNull final String tag)
  {
    logger.run(uniqueNum, text, tag);
  }
}
