public class Main {
    public static void main(String[] args) {
        Teachers t1 = new Teachers();
        t1.name="Dr. Partha Sarathi Chowdhury";
        t1.age = 52;
        t1.qualification = "Phd in Electronics";
        t1.display();

        /*Students s1 = new Students();
        s1.name="Indranil Chakraborty";
        s1.age=26;
        s1.dept="Electronics";
        s1.qualification="B.Sc Computer Science Honors";
        s1.display();*/
    }
    /*Never call */
    public static void main() {
        Teachers t1 = new Teachers();
        t1.name="Dr. Oindrila Saha";
        t1.age = 39;
        t1.qualification = "Phd in Computer Science";
        t1.display();

        /*Students s1 = new Students();
        s1.name="Indranil Chakraborty";
        s1.age=26;
        s1.dept="Electronics";
        s1.qualification="B.Sc Computer Science Honors";
        s1.display();*/
    }
}
