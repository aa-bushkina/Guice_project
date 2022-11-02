package ru.vk.loggers;

import com.google.inject.Singleton;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.atomic.AtomicInteger;

@Singleton
public class FileLogger implements CustomLogger
{
  @NotNull
  private final Logger logger;

  public FileLogger()
  {
    this.logger = LogManager.getLogger("fileLogger");
  }

  @Override
  public void run(@NotNull AtomicInteger uniqueNum, @NotNull final String text, @NotNull final String tag)
  {
    logger.info(uniqueNum.getAndIncrement() + " <" + tag + ">" + text + "</" + tag + ">");
  }
}
