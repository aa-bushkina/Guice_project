package ru.vk.loggers;

import org.jetbrains.annotations.NotNull;

public interface CustomLogger
{
  void run(final int uniqueNum, @NotNull final String text, @NotNull final String tag);
}
