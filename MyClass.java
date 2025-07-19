public class MyClass {

    static char a;
    static int b;
    static byte c;
    static short s;
    static long l;
    static double d;
    static float f;
    static boolean bl;

    public static void main(String[] args) {
        // variable
        /*
         * int a = 10;
         * System.out.println(a);
         */
        // concatenation
        // System.out.println("The value of a is: " + a);

        /* Data types in java */
        /*
         * 2 Types
         * 1. Primiype ( Pre-Defined data types)
         * 1.1 - Numeric
         * 1.1.1 - Integer
         * byte (size = 1 byte) smallest
         * short (size = 2 byte)
         * int (size=4 bytes)
         * long (size=8) largest
         * 1.1.2 - Decimal
         * float (size=4 byte)
         * double (size = 8 byte)
         * 
         * 1.2 - Non-Numeric
         * char ( size = 2 byte)
         * boolean - true or false ( size = 1 bit)
         * 
         * 2. Non Primitypes (User defined data types)
         * class
         * Interface in java
         * Array
         * - Static array
         * - Dynamic Array ( ArrayList )
         * String
         * 
         * 3. Default values in java
         * bollean - false
         * char - "\U000" (uni code)
         * byte - 0
         * short - 0
         * int - 0
         * long - 0
         * float - 0.0
         * double - 0.0
         */

        /* practical */
        /*
         * char a = 'A';
         * int b = 1012;
         * byte c = 5;
         * short s = 56;
         * long l = 121234678;
         * double d = 4.355456355;
         * float f = 56.50f;
         * boolean bl = true;
         */

        /*System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(s);
        System.out.println(l);
        System.out.println(d);
        System.out.println(f);
        System.out.println(bl);*/

        /*int a = 10;
        int b = 20;
        int c = 30;
        if(a>b){
            if(a>c){
                System.out.println("a is greater");
            }else{
                System.out.println("c is greater");
            }
        }else if(b>c){
            System.out.println("b is greater");
        }else{
            System.out.println("c is greater");
        }*/

        /*Loop in java */
        int i = 0;
        /*while(i<=10){
            System.out.println(i);
            i++;
        }*/
        
        /*for(int j=0;j<=20;j++){
            System.out.println(j);
        }*/

        /*For each loop - array */

        /*infinite loop */
        //for(;;)
        //while(1)

        /*switch case */
        /*int ch=6;
        switch (ch) {
            case 1:
                System.out.println("hello");
                break;
            case 6:
                System.out.println("bye ");
                break;
            default:
                System.out.println("Tata");
        }*/

        /* type casting  ( imp ) */
        int a = 3; // 4 bytes
        double db = a; // 8 bytes - 4 bytes implicit type casting
        System.out.println(db);
        int db1 =(int)db; // 4 bytes - 8 bytes explicit type casting
        System.out.println(db1);
    }
}

/*
 * Identifier - a name (var, class, menthod)
 * valid - myVariable, my_variable, _myVariable, $myVar, myVar01
 * In VALID - my variable, 01myVar, my-var, my+var, keyword(static), myVar&name
 * only in class name first letter always capital
 * 
 */
