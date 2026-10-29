IDE - Integrated Development Environment

&#x20;- An IDE is a software application that provides all the tools you need to write, compile, run, debug, and manage Java programs in one place.



**IDE Workflow**

Write Java Code

&#x20;    ↓

IDE detects errors

&#x20;    ↓

Compile

&#x20;    ↓

Run

&#x20;    ↓

See Output

&#x20;    ↓

Debug if necessary



**Important features of a Java IDE**

1.Code Editor

2.Auto-Completion

3.Error Detection

4.Compile and Run

5.Debugging

6.Project Management

7.Refactoring



| JDK                                   | IDE                                                 |

| ------------------------------------- | --------------------------------------------------- |

| Java Development Kit                  | Integrated Development Environment                  |

| Required to develop Java applications | Provides a convenient development environment       |

| Contains Java development tools       | Provides editor, debugger, project management, etc. |

| Provides `javac`                      | Uses the JDK to compile/run Java                    |

| Example: JDK 21, JDK 25               | Example: VS Code, Eclipse, IntelliJ IDEA            |





**Compiler:**

&#x20;- A compiler is a software program that converts human-readable source code into a form that the computer/JVM can execute.

&#x20;- In Java, the compiler is called javac.

Simple Program:



class Demo {

&#x20;  public static void main(String\\\[] args) {

&#x20;      System.out.println("Hello Java");

&#x20;  }

}

This is called source code.

We save it as Demo.java

Then the java compiler - javac Demo.java

converts it into: - Demo.class

The .class file contains Java bytecode.



Demo.java

&#x20; |

&#x20; |  javac (Java Compiler)

&#x20; ↓

Demo.class

&#x20; |

&#x20; |  JVM

&#x20; ↓

Program Output



What exactly does the Java compiler do?

The compiler performs several important checks.

&#x20;1. Syntax checking - System.out.println("Hello") - You forgot ;

&#x20;2. Type checking - int age = "Twenty"; - int cannot store String

&#x20;3. Converts source code to bytecode - The compiler converts: .java into .class - The .class file contains bytecode.



**Compiler vs JVM**



| Compiler                    | JVM                      |

| --------------------------- | ------------------------ |

| `javac`                     | Java Virtual Machine     |

| Takes `.java` source code   | Takes `.class` bytecode  |

| Produces `.class` bytecode  | Executes bytecode        |

| Performs compilation checks | Runs the program         |

| Happens before execution    | Happens during execution |





.java

&#x20;↓

javac

&#x20;↓

.class (Bytecode)

&#x20;↓

JVM

&#x20;↓

Execution





Compiler: "Convert and check my Java code."

JVM: "Run the bytecode."





Is the compiler part of the JDK? Yes.

The Java Development Kit (JDK) contains the Java compiler.

\----------------------------------------------------



How do you install jdk download?



\&#x20;- just go to your browser and search for jdk download





Java is platform independent is because of JVM, because in your machine you will be having JVM irrespective of which OS you use.

If you have JVM, you can run Java application





**Why Java is called "Write Once, Run Anywhere"**

&#x20;- The bytecode produced by the compiler is platform-independent. As long as a computer has a compatible JVM installed, the same .class file can run on different operating systems like Windows, macOS, or Linux without recompiling.





**Java code works in several steps:**



1\. You write the Java program

You create a file with a .java extension.

Ex:

public class Hello {

&#x20;  public static void main(String\\\[] args) {

&#x20;      System.out.println("Hello, World!");

&#x20;  }



}



2\. The Java compiler compiles the code

The Java compiler (javac) translates the source code into bytecode.

Command: javac Hello.java

This creates a file named: Hello.class



3.The JVM runs the bytecode

The Java Virtual Machine (JVM) reads the .class file and converts the bytecode into machine code that your computer's processor can execute.

Command: java Hello

Output: Hello, World!







Java Source Code (.java)

&#x20;        │

&#x20;        ▼

&#x20; Java Compiler (javac)

&#x20;        │

&#x20;        ▼

&#x20;   Bytecode (.class)

&#x20;        │

&#x20;        ▼



Java Virtual Machine (JVM)

&#x20;        │

&#x20;        ▼

Machine Code

&#x20;        │

&#x20;        ▼

Program Output













