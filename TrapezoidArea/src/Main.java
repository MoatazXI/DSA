public class Main {
    static double Area(double a, double b, double h){
        return (a+b)/2 * h;
    }

    public static void main(String[] args) {
        System.out.println(Area(2, 3, 4));
        System.out.println(Area(3, 4, 5));
    }
}