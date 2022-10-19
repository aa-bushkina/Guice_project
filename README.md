A console application that waits for line input and logs what is entered in the specified way. This can be one of three options:
output to the console,
output to a file
both of these options at once (composite), first to the console, and then to the file.

The type of logging is set by the parameter when launching the console application. Logging to a file encloses a string in a tag, for example, like this: <a>input</a>. The tag name is also specified as a parameter when launching the application.

Each doping is accompanied by a unique sequence number. So, if composite logging is selected, then the entered line is output to the console with the number N and to the file with the number N + 1.