/**
Document this file. Class Headers, Method Headers, 
in-line comments, and all style guidelines.

Throwing exceptions as seen in TestExamples.java is convenient, but 
you may write your testers however you want as long as they actually
check the functionality of the code and allow you to determine the
correctness of it.
*/

import java.util.Arrays;

public class Testers {
    String alwaysPrint;
    
    
    /* TODO
    */
    public Testers(){
        alwaysPrint = "No-Arg Constructor Called";
    }
    /** TODO Method definitions go here */
    
    /*
     *
     */
    public static void test_p1()
    {
        // Normal test case when there is an anagram
        String[] testIn1 = {"abc", "bc", "c"};
        String testIn2 = "bac";
        System.out.println("**Test 1- Expected: " +
                    "\n" + "** 'Count: 1' " + 
                    "\n" + "** 'Anagrams: [abc]' " + 
                    "\n" + "**End Test 1**" + "\n");
        ReadDocumentation.p1(testIn1, testIn2);
        System.out.println("\n" + "\n");
        // No Contradiction

        // Normal test case when there are no anagrams
        String testIn3 = "bad";
        System.out.println("**Test 2- Expected: " +
                    "\n" + "** 'Count: 0' " + 
                    "\n" + "** 'Anagrams: []' " + 
                    "\n" + "**End Test 2**" + "\n");
        ReadDocumentation.p1(testIn1, testIn3);
        System.out.println("\n" + "\n");
        // No Contradiction
    
        // Testing Empty String Array
        String[] testEmptyArr = new String[0];
        System.out.println("**Test 3- Expected: " +
                    "\n" + "** 'Count: 0' " +
                    "\n" + "** 'Anagrams: []' " + 
                    "\n" + "**End Test 3**" + "\n");
        ReadDocumentation.p1(testEmptyArr, testIn3);
        System.out.println("\n" + "\n");
        // No Contradiction

        // Testing Empty String
        String testEmpty = "";
        System.out.println("**Test 4- Expected: " +
                    "\n" + "** 'Count: 0' " + 
                    "\n" + "** 'Anagrams: []' " + 
                    "\n" + "**End Test 4**" + "\n");
        ReadDocumentation.p1(testIn1, testEmpty);
        System.out.println("\n" + "\n");
        // No Contradiction

        try
        {
            // Testing null String Array
            String[] testNullArr = null;
            System.out.println("**Test 5- Expected: " +
                        "\n" + "** NullPointerException " + 
                        "\n" + "**End Test 5**" + "\n");
            ReadDocumentation.p1(testNullArr, testIn3);
        }
        catch (NullPointerException e)
        {
            System.out.println("NullPointerException Caught");
            System.out.println("\n" + "\n");
        }
        // ***Contradiction***
        // Throws NullPointerException

        try
        {
            // Testing null String
            String testNull = null;
            System.out.println("**Test 6- Expected: " +
                        "\n" + "** NullPointerException " + 
                        "\n" + "**End Test 6**" + "\n");
            ReadDocumentation.p1(testIn1, testNull);
        }
        catch (NullPointerException e)
        {
            System.out.println("NullPointerException Caught");
            System.out.println("\n" + "\n");
        }
        // ***Contradiction***
        // Throws NullPointerException

        try
        {
            // Testing String Array with null Strings
            String[] testArrNull = {null, null, null};
            System.out.println("**Test 7- Expected: " +
                        "\n" + "** NullPointerException " + 
                        "\n" + "**End Test 7**" + "\n");
            ReadDocumentation.p1(testArrNull, testIn3);
        }
        catch (NullPointerException e)
        {
            System.out.println("NullPointerException Caught");
            System.out.println("\n" + "\n");
        }
        // ***Contradiction***
        // Throws NullPointerException

        // Testing Empty String Array
        String[] testEmptyStrArr = {"", " ", "  "};
        System.out.println("**Test 8- Expected: " +
                    "\n" + "** 'Count: 1' " +
                    "\n" + "** 'Anagrams: []' " + 
                    "\n" + "**End Test 8**" + "\n");
        ReadDocumentation.p1(testEmptyStrArr, testEmpty);
        System.out.println("\n" + "\n");
        // No Contradiction

        // Testing Empty String Array
        String testIn4 = "18-/7/;.[!@#$%";
        System.out.println("**Test 9- Expected: " +
                    "\n" + "** 'Count: 0' " +
                    "\n" + "** 'Anagrams: []' " + 
                    "\n" + "**End Test 9**" + "\n");
        ReadDocumentation.p1(testIn1, testIn4);
        System.out.println("\n" + "\n");
        // No Contradiction
    }

    /**
     *
     */
    public static void test_p2()
    {
        Integer[] testIn1, testIn2, expected;
        int n = 1;

        // Test Case 1: Normal test case
        testIn1 = new Integer[] {1, 2};
        testIn2 = new Integer[] {2, 0};
        expected = new Integer[] {3, 2};
        Integer[] actual1 = ReadDocumentation.p2(testIn1, testIn2);
        if ( Arrays.equals(expected, actual1) )
        {
            System.out.println("Test " + n + ": Passed");
        }
        else 
        {
            System.out.println("Test " + n + ": Failed");
        }
        n++;
        // No Contradiction

        // Test Case 2: Testing negative integers
        testIn1 = new Integer[] {-1, -2};
        testIn2 = new Integer[] {2, 0};
        expected = new Integer[] {1, -2};
        Integer[] actual2 = ReadDocumentation.p2(testIn1, testIn2);
        if ( Arrays.equals(expected, actual2) )
        {
            System.out.println("Test " + n + ": Passed");
        }
        else 
        {
            System.out.println("Test " + n + ": Failed");
        }
        n++;
        // No Contradiction

        // Test Case 3: Another normal test case
        testIn1 = new Integer[] {0, 6};
        testIn2 = new Integer[] {3, 4};
        expected = new Integer[] {4, 0};
        Integer[] actual3 = ReadDocumentation.p2(testIn1, testIn2);
        if ( Arrays.equals(expected, actual3) )
        {
            System.out.println("Test " + n + ": Passed");
        }
        else 
        {
            System.out.println("Test " + n + ": Failed");
        }
        n++;
        // No Contradiction

        // Test Case 4: Another seemingly normal test case
        testIn1 = new Integer[] {6, 2};
        testIn2 = new Integer[] {4, 0};
        expected = new Integer[] {1, 0, 2};
        try
        {
            Integer[] actual4 = ReadDocumentation.p2(testIn1, testIn2);
        }
        catch ( ArrayIndexOutOfBoundsException e )
        {
            System.out.print("Test " + n + ": Failed");
            System.out.println("- Caught ArrayIndexOutOfBoundsException");
        }
        n++;
        // ***Contradiction***
        // Throws ArrayIndexOutOfBoundsException

        // Test Case 5: Testing different sized arrays
        testIn1 = new Integer[] {6};
        testIn2 = new Integer[] {3, 0};
        expected = new Integer[] {3, 6};
        try
        {
            Integer[] actual5 = ReadDocumentation.p2(testIn1, testIn2);
        }
        catch ( ArrayIndexOutOfBoundsException e )
        {
            System.out.print("Test " + n + ": Failed");
            System.out.println("- Caught ArrayIndexOutOfBoundsException");
        }
        n++;
        // ***Contradiction***
        // Throws ArrayIndexOutOfBoundsException
    }

    public static void print(java.lang.Object[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
    
    public static void test_p3()
    {
        int min, max;

        min = 65;
        max = 68;
        print( ReadDocumentation.p3(min, max) );
    }

    /* TODO 
    */
    public static void main (String[] args) {
        Testers testers = new Testers();

        /** TODO Put method calls go here */ 

        Testers.test_p1();
        Testers.test_p2();
        Testers.test_p3();



    }
}
