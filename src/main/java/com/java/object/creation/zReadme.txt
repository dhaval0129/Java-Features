
Different ways to create objects in Java

Following are some ways in which you can create objects in Java:

1) Using new Keyword 
Using new keyword is the most basic way to create an object.

2) Using New Instance ( Class.forName )
If we know the name of the class & if it has a public default constructor we can create an object –Class.forName

3) Using clone() method
Whenever clone() is called on any object, 
the JVM actually creates a new object and copies all content of the previous object into it.

4) Using de-serialization
Whenever we serialize and then deserialize an object, JVM creates a separate object.

5) Using newInstance() method of Constructor class 
There is one newInstance() method in the java.lang.reflect.Constructor 

Reference: http://www.geeksforgeeks.org/different-ways-create-objects-java/
