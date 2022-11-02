package ru.vk;

import org.jetbrains.annotations.NotNull;

public class Tag
{
  @NotNull
  final private String text;

  public @NotNull String getText()
  {
    return text;
  }

  public Tag(@NotNull String text)
  {
    this.text = text;
  }
}
