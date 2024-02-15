public class Main {
    static double sd(int[] X) {
        double SD = 0, a = 0, b = 0, avg = 0;
        int N = X.length;

        for (int i = 0; i < N; i++) { // to calculate sum of numbers
            avg += X[i];
        }
        avg = avg / N; // to calculate average

        for (int i = 0; i < N; i++) {
            a += Math.pow(X[i] - avg, 2); // numerator in SD equation
        }
        b = a / N;
        SD = Math.sqrt(b);
        return SD;
    }

    public static void main(String[] args) {
        System.out.println(sd(new int[]{1, 2, 3}));
    }
}