package ru.vk.loggers;

import com.google.inject.Singleton;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;


@Singleton
public class ConsoleCustomLogger implements CustomLogger
{
  @NotNull
  private final Logger logger;

  public ConsoleCustomLogger()
  {
    this.logger = LogManager.getLogger("consoleLogger");
  }

  @Override
  public void run(@NotNull final String text, @NotNull final String tag)
  {
    logger.info("<" + tag + ">" + text + "</" + tag + ">");
  }
}
