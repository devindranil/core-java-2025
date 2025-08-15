public class StringBuilderExample {
    // is a mutable sequence of character, introduced in java version 1.5
        // string == immutable
        // stringbuilder = mutable
        // under package.java.lang

        // why string builder over string
        // 1. every time changes created new string object inside the memory

        // modifying the same memory without creating new object for each change
    public static void main(String[] args) {
        
        StringBuilder s = new StringBuilder("Welcome");
        s.append(" to YCH");
        System.out.println(s.length());
        System.out.println(s);
        s.insert(14, " | Best Institute");
        System.out.println(s);

        s.replace(11, 14, "Youth Career Hub");
        System.out.println(s);

        // s.delete(11,15);
        // System.out.println(s);

        // s.deleteCharAt(0);
        // System.out.println(s);

        // s.reverse();
        // System.out.println(s);

        s.setCharAt(1, 'w');
        System.out.println(s);

        // StringBuffer also mutable 
        // it is thread safe
        StringBuffer s1 = new StringBuffer("Hii, ");
        System.out.println(s1);

    }
}
