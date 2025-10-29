readme.txt

Here are the instructor supplied classes that you will need to use,
and will presumably also want to use, since they save you a great
deal of "busy work" when developing your Java programs for submission:

OpeningScreen
TextItems
Utils
OperationCounter
Stopwatch
Menu

You do not have access to the source code, since that is not necessary.
What you do have is the compiled classes (available in the public/jxtra
directory on the csci.cs.sum.ca server) and the class documentation
(available at https://cs.smu.ca/~porter/csc/341/code/examples/jxtra/).

This directory contains, in addition to the readme.txt file that you
are now reading, the following six files:

TestOpeningScreen.java
TestTextItems.java (uses info.txt)
TestOpeningScreenAndTextItems.java (uses info.txt)
TestOperationCounterAndStopwatch.java
TestMenu.java
info.txt

The purpose of these files is to show you how these instructor-supplied
classes work, so that you can use one or more of them in your own code.
The idea is that you will study the documentation of the classes, run
the sample test programs found here, and then experiment with the classes
by modifying, recompiling and re-running your revised version of these
sample programs.

Five of the six files in this directory are sample programs illustrating
the various classes. The sixth file is info.txt, which is just a file of
text, but it has a special syntax that allows it to be read by an object
of the TextItems class. You need to understand the syntax of such files,
which is illustrated by info.txt and described in detail in the TextItems
class documentation. We refer to files like this as TextItems files, and
they are very useful for displaying program usage information when you run
your program.

To run these files you should first create a working directory in your uxx
account and copy all of these files to that directory. Then study the class
documentation before running any program illustrating that class. To run
any of these programs you will need to use the jcru command, which "knows"
where the classes are located on the server and saves you from having to
type in much longer commands with both javac and java. The jcru command
both compiles and runs the program. For example, to compile and run the
sample program TestOpeningScreen.java you would simply use this command:

$ jcru TestOpeningScreen.java

One other important thing to remember is that the OpeningScreen and TextItems
classes are designed to display in an 80 by 25 command window so your testing
(especially of those classes) should be done in a command window of those
dimensions.

