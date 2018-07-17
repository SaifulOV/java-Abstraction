public class Ractangle extends Shape {

    Ractangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    void area() {
        double result = dim1 * dim2;
        System.out.println("Ractangle area :" + result);
    }
}
