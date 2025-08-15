import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) {
        String name1 = "Rohit Sharma";
        String name2 = "Rohit Sharma";

        // how to create a diff obejct of same values
        String a = new String("Indranil");
        String b = new String("Indranil Chakraborty");

        //check both are equal or not
        //System.out.println(a==b); // == check memmory location
        //System.out.println(a.equals(b)); // does not check memory it only check the values

        // = assignment operator , == equality check , memory location same or not

        // in java string is mutable or immutable ?
        // understand mutabality (modify,add,delete)
        // int num1 = 10;
        // System.out.println(num1);
        // num1 = 20;
        // System.out.println(num1);

        // in java string are immutable
        // java does not supprot mutabality of string

        // method in string
        System.out.println(a.length());
        System.out.println(a.charAt(2));

        // convert a string into a array
        System.out.println(Arrays.toString(name2.toCharArray()));

        System.out.println(name1.toLowerCase());
        System.out.println(name1.toUpperCase());

        // string slicing in java
        String s = "I Love India";
        // substring(start,end)
        System.out.println(s.substring(1)); //end = end-1

    }
}
