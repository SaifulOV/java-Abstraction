package anonymous_class;

public class TEst {
    public static void main(String[] args) {
        Student student = new Student(){
            void name(){
                System.out.println("AMi keu na .....");
            }
        };
        student.name();
    }
}
