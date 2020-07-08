# java-practice
Fundamental practice for building up strong base and preparation for advanced java.
1. constructor
2. inheritance
3. reference, object, instance, class
4. this, super, static
5. overriding and overloading, covariant return type
6. static vs instance method (which to use)
7. static vs instance variable (static: shared between instance)
8. extends Object class
9. composition vs inheritance
10. encapsulation: protect fields
11. polymorphism: unique functionality in inherited class
12. array, bubble sorting (while flag + for loop), common error (index out of bounds)、
13. reference type and value type
14. arrayList (advantage: automatic re-sizing)
15. arrayList (crud operations), scanner.nextLine() and scanner.nextInt()
16. arrayList, how to copy arraylist: 1) addAll 2) initialization with previous one (new arraylist<>(previousList)), 
    turn arraylist into the array: toArray(T a) method
17. factory method to create a new object
18. ClassA.method() call Class_a.method and enhance it according to scenario in ClassA. 
    class_ a is a variable of classA (contact and mobilePhone)
19. deal with duplicate in arrayList: indexOf() method's return value
20. arraylist store object (not primitive type data); primitive vs reference (stored in stack or heap); 
    autoboxing and unboxing
21. linkedList: save more work when add/delete one element from list, arrayList has to move many elements to the next position when saving,
    arrayList has to move many elements to the previous position when deleting.
22. iterator & listIterator, insert and remove of linkedList.
23. listIterator's infinite loop when using iterator.previous() and followed by iterator.next() because the implementation of its cursor.
24. operation on listIterator needs to be followed by next() or previous(). (such as remove() is called, needs to follow either
    next() or previous(), otherwise if you use remove() again, error will be thrown.)
25. interface: abstraction, used to group related methods with empty body (which will be implemented in classes)
26. use extends or interface.
27. use interface as method parameter. Such as Collections.sort(List<T> list)
28. declare the interface object, and get access to concrete class's method. (scenario: when plan to use variable/methods defined in
    the interface, which makes code generic).
29. inner class: when it will be only useful in the outer class, such as keySet in HashMap, it can be static when no 
    need to access members for outer class. (initialize: GearBox.Gear myGear = myGearBox.new Gear()).
30. local class and anonymous class.
31. abstract class. Difference between abstract class and interface.
32. implement abstract class.
33. generics in java. Use T in class (Except primitive type).
34. use <T extends someClass> to restrict the type of T in generics.
35. naming convention.
36. package creates namespace, so that class and interface name conflicts are avoided; different restriction on class access.
37. use exact package name when importing instead of using asterisk.
38. generate jar and add external jar in Intellij.
39. scope: enclosing block check for nearest declared variable; visibility in Java for inner class's variable.
40. access modifier.
41. static variable and static method. Static method is not allowed to access non-static variable.
42. final variable and final class. XOR operator.
43. final method can't be override by sub class, static block will be executed before constructor.
44. collection. Collections.binarySearch() improve the efficiency compared to brute force search.
45. Collection.copy() common exception, the difference among copy list methods.
46. Comparator method and Comparable class。
47. Map, difference between Map and Collection. remove and replace methods for different parameters.
48. Map iteration. Split method.
49. Immutable class. Search in intellij with regular expression. The use of private, final in variable and class, how to 
    refer a mutable object. Avoid setter method.[A Strategy for Defining Immutable Objects](https://docs.oracle.com/javase/tutorial/essential/concurrency/imstrat.html)