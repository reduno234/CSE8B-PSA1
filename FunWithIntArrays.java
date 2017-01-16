/*
 *  Name: Luis Calona
 *  Login: cs8bwaam
 *  Date: January 10, 2017
 *  File: FunWithIntArrays.java
 *  Sources of Help: None
 */

/* Bugs & Errors
 *
 *
 * Compile Error- Invalid Method Delcaration
 *
 * Incorrect: public static findMax(int[] array)
 *
 * Fix: public static int findMax(int[] array)
 *
 * Explanation: Method declarations need a return type. Since this method 
 *              returns the max integer, the return type should be int.
 *
 *
 *
 * Runtime Error- Array out of Bounds
 *
 * Incorrect: for (int i = 0; i <= array.length; i++) 
 *
 * Fix: for (int i = 0; i < array.length; i++) 
 *
 * Explanation: Incorrect index tries to access element at array.length but 
 *              goes out of bounds as arrays end at index array.length-1. 
 *              Correction makes sure index does not equal array.length.
 *
 *
 *
 * Compile Error- Cannot find symbol
 *
 * Incorrect: min = array[0];
 *
 * Fix: int min = array[0];
 *
 * Explanation: New variables need to be declared with a type before being used
 *
 *
 *
 * Logic Error- Incorrect Assignment
 *
 * Incorrect: min = i;
 * 
 * Fix: min = array[i]
 *
 * Explanation: Incorrect if statement sets min equal to index rather than the
 *              value at the index if it is less than current min. Fixed min 
 *              assignment to equal value at i rather than i.
 *
 *
 *
 * Compile Error- Not a Statement
 *
 * Incorrect: sum == array[i];
 * 
 * Fix: sum += array[i];
 *
 * Explanation: Incorrect compares sum and array[i] rather than assigning sum
 *              to a value, which is not allowed in this context. Fix adds each
 *              array[i] to the current value of sum, which is the intended
 *              outcome.
 *
 *
 * 
 * Compile Error- Incompatible types
 *
 * Incorrect: int average = ( sum / (array.length) );
 *
 * Fix: double average = ( sum / (array.length) );
 *
 * Explanation: Method was declared to return a double but incorrect returns an
 *              int. Fix changed average's type from int to double.
 *
 *
 *
 * Compile Error- Incompatible Types
 *
 * Incorrect: public static int[] arrayCopy(int array)
 *
 * Fix: public static int[] arrayCopy(int[] array)
 *
 * Explanation: Method tries to access elements of array but incorrect delcares
 *              the paramater as an int rather than an int array. Fix correctly
 *              delcares the parameter.
 *
 *
 *
 * Logic Error- Incorrect indices
 *
 * Incorrect: result[i++] = array[i];
 *
 * Fix: result[i] = array[i];
 *
 * Explanation: Incorrect will increment i before the for loop has completed 
 *              its iteration. Fixed for correct indices.
 * 
 *
 *
 * Logic & Compile Error- Should not return if not equal to null
 *
 * Incorrect: if (array != null)
 *              return;
 * 
 * Fix: if (array == null) 
 *          System.out.println("");
 *
 * Explanation: Method should not return since it was declared as void. Also, 
 *              if array is empty, it should print an empty string. This was 
 *              fixed.
 * 
 *
 *
 * Runtime Error- Index out of Bounds
 *
 * Incorrect: for (int j = 0; i < result.length - i - 1; j++)
 *
 * Fix: for (int j = 0; j < result.length - i - 1; j++)
 *
 * Explanation: In the incorrect code, j has no limit and therefore will go out
 *              of bounds. Fixed limit so j has to be less than 
 *              result.length - 1 - i.
 */ 
 
public class FunWithIntArrays {

 // return the largest element in the input array
 public static int findMax(int[] array) {
  //short circuit protects null access
  if (array == null || array.length == 0)
   return -1;

  int max = array[0];

  for (int i = 0; i < array.length; i++) {
   if (array[i] > max) {
    max = array[i];
   }
  }

  return max;
 }

 // return the smallest element in the input array
 public static int findMin(int[] array) {
  //short circuit protects null access
  if (array == null || array.length == 0)
   return -1;

  int min = array[0];

  for (int i = 0; i < array.length; i++) {
   if (array[i] < min) {
    min = array[i];
   }
  }

  return min;
 }


  // return the average of elements in the input array
  public static double findAvg( int array[] ) {
    //short circuit protects null access
    if ( array == null || array.length == 0 )
      return -1;

    double sum = 0;

    for ( int i=0; i < array.length; i++ ) {
      sum += array[i];
    }

    double average = ( sum / ( array.length ) );

    return average;
  }

 // return a copy of the input array
 public static int[] arrayCopy(int[] array) {
  if (array == null)
   return null;

  int[] result = new int[array.length];

  for (int i = 0; i < array.length; i++) {
   result[i] = array[i];
  }
  return result;
 }

 // output the elements of the input array
 public static void printArray(int[] array) {
  if (array == null)
      System.out.println("");

  for (int i = 0; i < array.length; i++) {
   System.out.print(array[i] + ", ");
  }

  System.out.println();
 }

 // return a sorted copy of the input array
 public static int[] arraySort(int[] array) {
  if (array == null)
   return null;

  int[] result = arrayCopy(array);

  for (int i = 0; i < result.length - 1; ++i) {
   for (int j = 0; j < result.length - 1 - i; j++) {
    if (result[j] > result[j + 1]) {
     //swapping result[j] and result[j+1]
     int temp = result[j];
     result[j + 1] = result[j];
     result[j] = temp;
    }
   }
  }
  return result;
 }
}
