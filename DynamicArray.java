


import java.util.ArrayList; // help us to use array list in java
public class DynamicArray {
    public static void main(String[] args) {
        // syntax
        /*
         * ArrayList<wrapper class> listName = new ArrayList<>();
         */

         ArrayList<Integer> numbers = new ArrayList<Integer>(); // dynamic array create
         numbers.add(10);
         numbers.add(25);
         numbers.add(35);
         numbers.addAll(0, numbers);
         System.out.println(numbers);
         numbers.remove(1);
         System.out.println(numbers);
         //numbers.clear();
         System.out.println(numbers.size());
         System.out.println(numbers);

         /*int maximum = Integer.max(10, 25);
         System.out.println(maximum);*/

         int x=5; // integer var
         Integer obj = x; // auto-boxing
         int y = obj; // un-boxing
         
    }
}

/*
 * -------Wrapper class in java----------
 * is an alternative primitive data types in java
 * it is an object representation of a primitive data type
 * wrap the primitive data types into an objects called wrapper class
 * 
 * primitive data types  -------->      wrapper class
 * 
 * byte                                     Byte
 * short                                    Short
 * int                                      Integer
 * long                                     Long
 * float                                    Float
 * double                                   Double
 * char                                     Character
 * bollean                                  Boolean
 */

 /* use in ArrayList, use utility methods */

 /* Limitation of wrapper class */
 // slower than primitive data type
 // take more memory space
 // check null to avoid nullPointer exception
 
