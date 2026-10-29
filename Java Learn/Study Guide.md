Datatypes

Variables

&#x20;- Static, Non-Static and Local Variables

Operators

&#x20;- Arithmetic, Assignment, Unary, Relational, Logical, Bitwise, Shift, Ternary

Methods

Control Flow Statements

&#x20;- If else, If-else-if(Else-if ladder), Nested if

&#x20;- Switch case

&#x20;- Looping Statements (for, while, do while, nested)

&#x20;- Jumping Statements (break, continue)

Typecasting

Naming Conventions

Packages

&#x20;- default, public, protected, private

Access Modifier

Scanner Class

**OOPS - Object Oriented Programming**

1.Memory Allocation

2.Class \& Object

&#x20;- Multiple Object Creation

&#x20;- Array of the Object

3.Static \& Non-Static Block

4.Constructors

&#x20;- this, super, this(), super()

&#x20;- Types of Constructor

&#x20;- Copy Constructor

&#x20;- Constructor Overloading

&#x20;- Constructor Chaining

5.IS-A Relationship -> Inheritance

&#x20;- Single, Multilevel, Hierarchical

6.Encapsulation

&#x20;- Private Keyword

&#x20;- getter \& setter methods

7.Polymorphism

&#x20;- Static - Method Overloading - Compile time

&#x20;- Dynamic - Method Overriding - Runtime

8.Abstraction

&#x20;- class - cannot be used to create objects

&#x20;- Method

Note: abstract method is a method which will not have the body, where as concrete methods must have the body.

• Any class that extends an abstract class must implement all the abstract methods declared by the super class.

9.Interface

&#x20;- In interface all the variables declared in final static variables by default and methods are public abstract by default.

&#x20;- Multiple Inheritance can be achieved with interfaces, because the class can implement multiple interfaces.

&#x20;- The class which is implementing the interface, must define all the methods of interface.

&#x20;- We cannot create object for interface.

10.HAs-A Relationship -> Association

&#x20;- Aggregation

&#x20;- Composition

11.Casting

&#x20;- Upcasting

&#x20;- Down casting



**String Class**

&#x20;- String Methods

&#x20;- String Buffer \& String Builder

&#x20;- String Buffer \& String Builder Methods



**Exception handling**

&#x20;- Exception Types :

&#x20;- Checked Exceptions, Unchecked Exceptions, Errors

&#x20;- try \& catch  block

&#x20;- throw, throws

&#x20;- User-defined Exception



**Arrays**

&#x20;- Types :

&#x20;- Single Dimensional Array

&#x20;- Multi Dimensional Array

&#x20;- Jagged Array



**Multithreading**

&#x20;- Thread Life Cycle

&#x20;- Thread class \[methods]

&#x20;- Runnable interface

&#x20;- Anonymous Inner Class

&#x20;- Synchronization

&#x20;- Executor Service

&#x20;- Callable Interface

&#x20;- Inner Thread Communication

&#x20;- Daemon Thread

&#x20;- Deadlock

**File Handling**

&#x20;-

&#x20;- Serialization \& De-serialization



1)Datatypes

&#x20;- is used to specifies the size and value

Primitive

1.Numerical

&#x20;1.Integer - byte, short, int, long

&#x20;2.Decimal - float, double

2.Non-Numerical

&#x20;- Char, Boolean

Non Primitive

&#x20;- Array, String, Interface, Class

2)Variables:

&#x20;- is a token/container used to hold the value (or) name of the memory location.

Types

Instance Variables

&#x20;- When a value in an object varies between Object to Object is known Instance variable

&#x20;- This is created when an object is created and destroyed during object destruction.

&#x20;- The scope of the instance variable is scope of the object

&#x20;- Also known as attributes or object level variable

&#x20;- It is declared inside the class and outside the method and block

&#x20;- It is directly called inside the Instance variable and need object reference to call inside the static method

Static Variables

Local Variables

3)Method

&#x20;- is a named block of code and it is used perform a specific task.

&#x20;- Whenever there is a need to write a same code again and again, we can write it inside a method and reuse it whenever needed.

Types

&#x20;- Static method, Non-Static method

&#x20;- without parameter and return type, without parameter but with return type, With parameter and return type, with parameter and without return type

&#x20;- void disp(){}, int disp(){return int;}, String disp(String name){return name;}, void disp(int name){}

4)Switch:

&#x20;- Expression must be byte, short, int, char, String and enums

5)Looping Statements

&#x20;- Looping statements are used to executed the block of code repeatedly until a specific condition was satisfied.

&#x20;- In Java, we have the following looping statements

&#x20;- while, do while, for, for each and nested loop

while:- It is used to repeated the block of code. It is preferable while we do not know the exact no. of iterations of the loop.

do-while:- It first run the loop once then check for the condition and it is also known as exit-controlled loop

for:- whenever we know the exact no. of iterations loop through the block of code, we use for instead of while.

nested:- A loop inside another loop is known as nested loop. It contains inner and outer loop. when the outer loop executes once, the inner loop executes completely.

6)Type Casting

&#x20;- The process of converting one datatype into another is called type-casting.

&#x20;- Two Types - 1.Implicit Casting(Widening), 2.Explicit Casting(Narrowing)

Widening:

&#x20;- converting a smaller datatype into larger one

&#x20;- No data loss

&#x20;- Automatically done by java itself

&#x20;- Safe conversion

Narrowing

&#x20;- converting a larger datatype into smaller one

&#x20;- Possible data loss

&#x20;- Done manually by programmer

&#x20;- Risky Conversion

7)Operators

&#x20;- Arithmetic - +,-,\*,/,%

&#x20;- Assignment - +=,-=,\*=,/=,%=

&#x20;- Relational - >,<,==,!=,>=,<=

&#x20;- Logical - \&\&,||,!

&#x20;- Unary - it is perform by single operand (++,--), cannot be perform by constant values(10++)

&#x20;- Ternary - (a>b)?a:b



