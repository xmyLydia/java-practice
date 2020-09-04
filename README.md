# java-practice
Fundamental practice for building up strong base and preparation for advanced java.
1. Constructor
2. Inheritance
3. Reference, object, instance, class
4. This, super, static
5. Overriding and overloading, covariant return type
6. Static vs instance method (which to use)
7. Static vs instance variable (static: shared between instance)
8. Extends Object class
9. Composition vs inheritance
10. Encapsulation: protect fields
11. Polymorphism: unique functionality in inherited class
12. Array, bubble sorting (while flag + for loop), common error (index out of bounds)、
13. Reference type and value type
14. ArrayList (advantage: automatic re-sizing)
15. ArrayList (crud operations), scanner.nextLine() and scanner.nextInt()
16. ArrayList, how to copy arraylist: 1) addAll 2) initialization with previous one (new arraylist<>(previousList)), 
    turn arraylist into the array: toArray(T a) method
17. Factory method to create a new object
18. ClassA.method() call Class_a.method and enhance it according to scenario in ClassA. 
    class_ a is a variable of classA (contact and mobilePhone)
19. Deal with duplicate in arrayList: indexOf() method's return value
20. Arraylist store object (not primitive type data); primitive vs reference (stored in stack or heap); 
    autoboxing and unboxing
21. LinkedList: save more work when add/delete one element from list, arrayList has to move many elements to the next position when saving,
    arrayList has to move many elements to the previous position when deleting.
22. Iterator & listIterator, insert and remove of linkedList.
23. ListIterator's infinite loop when using iterator.previous() and followed by iterator.next() because the implementation of its cursor.
24. Operation on listIterator needs to be followed by next() or previous(). (such as remove() is called, needs to follow either
    next() or previous(), otherwise if you use remove() again, error will be thrown.)
25. Interface: abstraction, used to group related methods with empty body (which will be implemented in classes)
26. Use extends or interface.
27. Use interface as method parameter. Such as Collections.sort(List<T> list)
28. Declare the interface object, and get access to concrete class's method. (scenario: when plan to use variable/methods defined in
    the interface, which makes code generic).
29. Inner class: when it will be only useful in the outer class, such as keySet in HashMap, it can be static when no 
    need to access members for outer class. (initialize: GearBox.Gear myGear = myGearBox.new Gear()).
30. Local class and anonymous class.
31. Abstract class. Difference between abstract class and interface.
32. Implement abstract class.
33. Generics in java. Use T in class (Except primitive type).
34. Use <T extends someClass> to restrict the type of T in generics.
35. Naming convention.
36. Package creates namespace, so that class and interface name conflicts are avoided; different restriction on class access.
37. Use exact package name when importing instead of using asterisk.
38. Generate jar and add external jar in Intellij.
39. Scope: enclosing block check for nearest declared variable; visibility in Java for inner class's variable.
40. Access modifier.
41. Static variable and static method. Static method is not allowed to access non-static variable.
42. Final variable and final class. XOR operator.
43. Final method can't be override by sub class, static block will be executed before constructor.
44. Collection. Collections.binarySearch() improve the efficiency compared to brute force search.
45. Collection.copy() common exception, the difference among copy list methods.
46. Comparator method and Comparable class。
47. Map, difference between Map and Collection. remove and replace methods for different parameters.
48. Map iteration. Split method.
49. Immutable class. Search in intellij with regular expression. The use of private, final in variable and class, how to 
    refer a mutable object. Avoid setter method. [A Strategy for Defining Immutable Objects.](https://docs.oracle.com/javase/tutorial/essential/concurrency/imstrat.html)
50. Set, addAll method in Set, compressed pointer in Java 7 ([Virtual Machine Performance Enhancements](https://docs.oracle.com/javase/8/docs/technotes/guides/vm/performance-enhancements-7.html))
51. HashSet, override equals method in intellij. [hashCode method and equals methods](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#equals-java.lang.Object-)
52. When to mark equal and hashcode methods as final in a class: consider behavior of subclass; otherwise
    in the overridden methods, prevent class and its subclass to be equal.
53. [Set bulk operations](https://docs.oracle.com/javase/tutorial/collections/interfaces/set.html): addAll(), retainAll(), removeAll(), containAll().
54. Sorted collection. Collections.unmodifiableMap() method. LinkedHashMap, TreeMap.
55. Exception: LBYL: look before you leak (test on null ...). EAFP: easy to ask for forgiveness than permission 
    (with try catch, which has less code and elegant).
56. Catching specific exception instead of general exception. Stack trace's printing way. Stack trace and call stack.
57. Catching and throwing exceptions. Multiple catch exceptions. Difference between single pipe and double pipe.
58. IO: sequential data and random access data. Checked exception and unchecked exception. Close file in a final block.
59. Try with resource: code without writing close in finally block; enable throwing exception when closing file writer stream.
60. FileReader and closeable. BufferedReader. Difference between BufferedReader, FileReader, InputStreamReader.
61. DataOutputStream, BufferedOutputStream, FileOutputStream. [Bitshift operator.](http://docs.oracle.com/javase/tutorial/java/nutsandbolts/op3.html)
62. [ObjectInputStream](https://docs.oracle.com/javase/7/docs/api/java/io/ObjectInputStream.html), [ObjectOutputStream](https://docs.oracle.com/javase/7/docs/api/java/io/ObjectOutputStream.html).
63. [Random access file](https://docs.oracle.com/javase/7/docs/api/java/io/RandomAccessFile.html#:~:text=A%20random%20access%20file%20behaves,pointer%20past%20the%20bytes%20read.), seek method.
64. Java NIO. Reading and writing in NIO (Files.write, Files.readAllLine...), NIO vs. IO.
65. Writing binary file with NIO.
66. Reading file with NIO: absolute/relative read.
67. Chained put methods. Writing sequentially by using channel.position method + flip method.
68. Pipes with threads. How to copy file in NIO channel.
69. Working with file system(copy, delete, move file ...): java.nio.file; Path interface; delimiter in windows: backslash;
    escape the backslash of path when it's in a string that has double quotes.
70. Check the existence of a file: Files.exists(); copy a file: Files.copy(); move/rename a file: Files.move();
    delete a file: Files.deleteIfExists()
71. Create a file: Files.createFile; create directory: Files.createDirectories(); file size, last modified time... by using
    Files.readAttributes().
72. Bitwise or used in catching multiple exception. DirectoryStream for reading directory content. Avoid hard-code separator
    in the path. Create temp file. Filestore (such as C: in windows).
73. Walk through directory tree: SimpleFileVisitor, Files.walkFileTree().
74. When to use IO: file contents. When to use NIO: file system such as copy file.
75. Thread and process; our code runs on main thread or other explicitly created thread. Thread stack and heap.
76. Thread color. Such as ANSI_GREEN, ANSI_PURPLE...
80. Runnable interface. run() and start(); sleep() method; 
81. There are the interrupt() and join() from one thread to another.
82. Multiple threads: can't predict which will run first.