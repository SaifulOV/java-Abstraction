public class Cricle extends Shape {
    //3.1416*r*r

    Cricle(double r){
        super(r,r);
    }
    void area() {
        double result = Math.PI * dim1 *dim2 ;
        System.out.println("Ractangle area :" + result);
    }
}
