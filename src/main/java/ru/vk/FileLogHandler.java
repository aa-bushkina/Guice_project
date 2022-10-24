package ru.vk;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.jetbrains.annotations.NotNull;
import ru.vk.loggers.CustomLogger;
import ru.vk.notations.File;

@Singleton
public class FileLogHandler
{
  @NotNull
  private final CustomLogger fileLogger;


  @Inject
  public FileLogHandler(@NotNull final @File CustomLogger fileLogger)
  {
    this.fileLogger = fileLogger;

  }

  public void makeLog(final int uniqueNum, @NotNull final String text, @NotNull final String tag)
  {
      fileLogger.run(uniqueNum, text, tag);
  }
}
