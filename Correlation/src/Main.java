public class Main {
    static double coRelation(double[] x, double[] y) {
        // temp is x , sales is y , we need to calculate x^2 y^2 xy to use them in formula

        int N = x.length;

        double[] xsquare = new double[N],
                ysquare = new double[N],
                xy = new double[N];
        double xSum = 0, ySum = 0, xSquareSum = 0, ySquareSum = 0, xySum = 0,
                numerator = 0, denominator = 0, a = 0, b = 0;

        for (int i = 0; i < N; i++) {
            xsquare[i] = Math.pow(x[i], 2);
            ysquare[i] = Math.pow(y[i], 2);
            xy[i] = x[i] * y[i];
        }
        for (int i = 0; i < N; i++) {
            xSum += x[i];
            ySum += y[i];
            xSquareSum += xsquare[i];
            ySquareSum += ysquare[i];
            xySum += xy[i];
        }

        numerator = (N * xySum) - (xSum * ySum);
        a = Math.sqrt((N * xSquareSum) - (Math.pow(xSum, 2)));
        b = Math.sqrt((N * ySquareSum) - (Math.pow(ySum, 2)));
        denominator = a * b;


        return numerator / denominator;
    }

    public static void main(String[] args) {

        double[] x = new double[]{14.2, 16.4, 11.9, 15.2, 18.5, 22.1, 19.4, 25.1, 23.4, 18.1, 22.6, 17.2};
        double[] y = new double[]{215, 325, 185, 332, 406, 522, 412, 614, 544, 421, 445, 408};

        System.out.println(coRelation(x, y));
    }

}