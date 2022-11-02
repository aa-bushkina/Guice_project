package ru.vk.loggers;

import com.google.inject.Singleton;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.atomic.AtomicInteger;

@Singleton
public class CompositeLogger implements CustomLogger
{
  @NotNull
  private final Logger fileLogger;
  @NotNull
  private final Logger consoleLogger;

  public CompositeLogger()
  {
    this.fileLogger = LogManager.getLogger("fileLogger");
    this.consoleLogger = LogManager.getLogger("consoleLogger");
  }

  @Override
  public void run(@NotNull AtomicInteger uniqueNum, @NotNull final String text, @NotNull final String tag)
  {
    consoleLogger.info(uniqueNum.getAndIncrement() + " <" + tag + ">" + text + "</" + tag + ">");
    fileLogger.info(uniqueNum.getAndIncrement() + " <" + tag + ">" + text + "</" + tag + ">");
  }
}
