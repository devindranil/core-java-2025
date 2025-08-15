/*
 * 1. 1.fixed size 2.dynamic size
 * 2. array is an object in java, java.lang.Object
 * 3. can hold only element of same type (homogeneous)
 * 4. zero based indexing (0 to n-1)
 *      1. pos index - 0 to n-1
 *      2. neg index - -1 to -n
 * 5. store in contiguous memory
 * 6. Java arrays are object not a variable
 * 7. int[] numbers; a reference variable (stack memory)
 * it does not create any memory
 * created when object initiate
 * memory create inside the heap memory
 * in java array is static by only size
 * q) Is int[] or new int[5] an in-built java class or constructor?
 * 1. array is an object so int[] is treated like class internally
 * Internally jvm treats int[] as a class named I(not visible to us) but used by the jvm
 * 
 * *** technically java treat array as objects of special class but you can not import or define them like normal class
 * 
 * 2. int[5]; - nothing, java syntax how array memory create
 */

 import java.util.Scanner;
public class ArrayExample {
    public static void main(String[] args) {
        /* Declaring an array in java */
        // syntax - dataType[] arrayName or dataType arrayName[] ;
        int[] numbers; // integer declare - still act like static var
        boolean[] isStudent;

        /* Allocating the memory (Creating an array) */
        // use new keyword to allocate meomory of java array
        // syntax - arrayName = new int[size]
        numbers = new int[5];
        isStudent = new boolean[2];

        /* Declaring and allocation both */
        int[] rollNo = new int[5];
        String name[] = new String[5];

        /*System.out.println(numbers.getClass());
        System.out.println(numbers.getClass().getName());

        System.out.println(countries.getClass());
        System.out.println(countries.getClass().getName());

        System.out.println(isStudent.getClass());
        System.out.println(isStudent.getClass().getName());*/

        /* Initializing of the array */
        // by using index
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = -10;
        numbers[3] = 50;
        numbers[4] = 55;

        /* Print the array */
        // one element
        System.out.println("One element: " + numbers[3]);

        // all element
        /* traversing the array */

        // loop - version 1.0
        /*for(int i=0;i<numbers.length;i++){
            System.out.println("Elements of the array is " + numbers[i]);
        }*/

        // loop - version 2.0 (for each loop use)
        /*
            syntax
            for(dataType var : nameofArray){
                // loop body
            }
        */ 

        /*for(int x : numbers){
            System.out.println("Elements of the array is: " + x);
        }*/ 

        /* user input */
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        String countries[];
        countries = new String[n];
        for(int i=0;i<countries.length;i++){
            System.out.println("Enter a country name: ");
            countries[i]=sc.nextLine();
        }
        System.out.println("\nOutput of the array is: ");
        for(String x : countries){
            System.out.println(x);
        }

        sc.close();*/

        // array literal in java
        int[] marks = {10,20,55,60,75};
        for(int n:marks){
            System.out.println(n);
        }

    }
}
