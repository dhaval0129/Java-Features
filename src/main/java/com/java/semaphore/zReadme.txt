
A semaphore controls access to a shared resource through the use of a counter. 
If the counter is greater than zero, then access is allowed. 
If it is zero, then access is denied. What the counter is counting are permits 
that allow access to the shared resource. 
Thus, to access the resource, a thread must be granted a permit from the semaphore.

Java provide Semaphore class in java.util.concurrent package that implements this mechanism, 
so you don’t have to implement your own semaphores.

Reference:  http://www.geeksforgeeks.org/semaphore-in-java/

