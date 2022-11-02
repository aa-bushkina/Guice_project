package ru.vk;

import com.google.inject.AbstractModule;
import org.jetbrains.annotations.NotNull;
import ru.vk.handlers.LogHandler;

import java.util.Arrays;

public class ApplicationModule extends AbstractModule
{
  @NotNull
  final String args[];

  public ApplicationModule(@NotNull final String[] args)
  {
    if (!checkArgs(args))
    {
      throw new RuntimeException("Incorrect args.");
    }
    this.args = args;
  }

  @Override
  protected void configure()
  {
    bind(Tag.class).toInstance(new Tag(args[1]));
    bind(LogHandler.class).to(LogTypeFactory.valueOf(args[0]).handlerClass());
  }

  private boolean checkArgs(@NotNull final String[] args)
  {
    return (args.length == 2) && (Arrays.asList("File", "Console", "Composite").contains(args[0]));
  }
}
