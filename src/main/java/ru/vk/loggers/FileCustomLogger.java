package ru.vk.loggers;

import com.google.inject.Singleton;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.jetbrains.annotations.NotNull;

@Singleton
public class FileCustomLogger implements CustomLogger
{
  @NotNull
  private final Logger logger;

  public FileCustomLogger()
  {
    this.logger = LogManager.getLogger("fileLogger");
  }

  @Override
  public void run(@NotNull final String text, @NotNull final String tag)
  {
    logger.info("<" + tag + ">" + text + "</" + tag + ">");
  }
}
