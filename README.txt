Author: Manuel Fernando Gallego Arias
Date: 16 / 06 / 2017

****************************************

Exercise statement:
Given an array with sorted data, e.g.
  0, 1, 2, 4, 4, 6, 7, 7, 7, 7, 8, 9, 10, 12, 15, 15
Write a java class that implements binary search in O(log(n)) to find all instances of element X (for instance X=7),
and the accompanying JUnit unit tests. Return all the indices if the element is found at least once, or -1 if not found.
Explicitly identify any assumption you are making while solving this problem.



****************************************

Detail execution:
For run in the console need to pass the params of the number to find the index and/or the values of the array input of integers.

Execution Example 1:
java BinarySearchStarter 7

This execution will return the indices of where found the 7 number in the "Exercise statement" default list.
output:
Starting the execution.
Indices of instances found :
 6
 7
 8
 9
End of execution.


Execution Example 2:
java BinarySearchStarter 6 1 2 6 7 7 10

This execution will return the indices of where found the 7 number in the "Exercise statement" default list.
output:
Starting the execution.
Indices of instances found :
 2
End of execution.