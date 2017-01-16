/**
Document this file. Class Headers, Method Headers, 
in-line comments, and all style guidelines.

Throwing exceptions as seen in TestExamples.java is convenient, but 
you may write your testers however you want as long as they actually
check the functionality of the code and allow you to determine the
correctness of it.
*/
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
        // Contradiction

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
        // Contradiction

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
        // Contradiction

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


    /* TODO 
    */
    public static void main (String[] args) {
        Testers testers = new Testers();

        /** TODO Put method calls go here */ 

        Testers.test_p1();




    }
}
