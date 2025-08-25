public class Students{
    static String dept = "BCA";
    static String name;
    static int id;
    /*public Students(String name, int id) {
        this.name = name;
        this.id = id;
    }*/

    static void display(){
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Department: " + dept);
    }

    // static block
    static{
        dept="B.Tech";
        name="Indra";
        id=101;
    }
    
    

}
