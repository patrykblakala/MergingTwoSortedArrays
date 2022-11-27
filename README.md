# MergingTwoSortedArrays

## Description

In this project I am creating and testing a method accepting 2 sorted integer arrays and returning a merged array.

## Definition of an Array

An array is a container object that holds a fixed number of values of a single type. The length of an array is established when the array is created. After creation, its length is fixed.

(![image](https://user-images.githubusercontent.com/22456028/204130184-63de226c-b71c-4850-8ffd-adbb34f0c1b0.png)

## Getting Started

In the project I have tested created method using Junit unit-testing framework. In order to implement it first I added junit-jupiter dependency to my pom.xml file.

### Dependencies

```java
<dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.9.0</version>
        </dependency>
```

### Solution of the problem

In my solution I used a while loop 

**Java while loop** is a control flow statement that allows code to be executed repeatedly based on a given Boolean condition. 
The while loop is considered as a repeating if statement. If the number of iterations is not fixed, it is recommended to use the while loop.

![image](https://user-images.githubusercontent.com/22456028/204139254-af38f286-f1c0-47db-b58e-a9afaca8036b.png)

In my method I used a while loop that compares elements from the first array to elements of the second array and adds the accordingly to the merged array of the combined length
of the first and second array

```java
   int[] mergedArray = new int[arrayA.length + arrayB.length];

        int i = 0, j = 0, k = 0;

        while (i < arrayA.length && j < arrayB.length) {
            if (arrayA[i] < arrayB[j]) {
                mergedArray[k] = arrayA[i];
                i++;
                k++;
            } else {
                mergedArray[k] = arrayB[j];
                j++;
                k++;
            }
        }
```
If the input arrays have different length I use additional while loops to add the remaining elemants from the larger array

```java
 while (i < arrayA.length) {
            mergedArray[k] = arrayA[i];
            i++;
            k++;
        }
        while (j < arrayB.length) {
            mergedArray[k] = arrayB[j];
            j++;
            k++;
        }
```
Also in order to make the algorithm more efficient at the beginning of my method I check for a situation when one or both of the arrays are empty.
In this scenarion method will not enter the while loops and will be executed more efficiently

```java
if (arrayA.length == 0) {
            return arrayB;
        } else if(arrayB.length == 0) {
            return
                    arrayA;
        }
```
### Testing

In testing methods for my algorithm I tested for inputs of: 2 sorted arrays of different sizes, 2 empty arrays, 2 arrays with identical elements,
2 arrays of which one is empty, 2 arrays with negative values

## Author

## Patryk Blakala 

## Useful resources

[https://www.geeksforgeeks.org/java-while-loop-with-examples/)

[https://www.geeksforgeeks.org/java-program-to-merge-two-arrays/)


