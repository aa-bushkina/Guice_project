package ru.vk.loggers;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.atomic.AtomicInteger;

public interface CustomLogger
{
  void run(@NotNull AtomicInteger uniqueNum, @NotNull final String text, @NotNull final String tag);
}
