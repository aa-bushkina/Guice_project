package ru.vk.loggers;

import com.google.inject.Singleton;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

@Singleton
public class ConsoleLogger implements CustomLogger
{
  @NotNull
  private final Logger logger;

  public ConsoleLogger()
  {
    this.logger = LogManager.getLogger("consoleLogger");
  }

  @Override
  public void run(final int uniqueNum, @NotNull final String text, @NotNull final String tag)
  {
    logger.info(uniqueNum + " <" + tag + ">" + text + "</" + tag + ">");
  }
}
