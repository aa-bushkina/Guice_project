package ru.vk.handlers;

import com.google.inject.Inject;
import org.jetbrains.annotations.NotNull;
import ru.vk.loggers.CustomLogger;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class LogHandler
{
  @NotNull
  protected final CustomLogger logger;

  @NotNull
  protected AtomicInteger uniqueNum = new AtomicInteger(0);

  @Inject
  public LogHandler(@NotNull final CustomLogger fileLogger)
  {
    this.logger = fileLogger;
  }

  public void makeLog(@NotNull final String text, @NotNull final String tag)
  {
    logger.run(uniqueNum, text, tag);
  }
}
