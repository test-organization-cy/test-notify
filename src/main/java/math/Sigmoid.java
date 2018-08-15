package math;

/**
 * Created by keriezhang on 2018/6/11.
 *
 * @author keriezhang
 * @date 2018/6/11
 */
public class Sigmoid {

    public static double sigmoid(double value) {
        double ey = Math.pow(Math.E, -value);
        double result = 1 / (1 + ey);
        return result;
    }

    public static double sigmoidWithWeight(double value, double weight) {
        double ey = Math.pow(Math.E, - weight * value);
        double result = 1 / (1 + ey);
        return result;
    }

    public static void main(String[] args) {
        double sigmoid = sigmoid(10);
        System.out.println(sigmoid);
        double weightedSigmoid = sigmoidWithWeight(20, 0.01);
        System.out.println(weightedSigmoid);
        double weightedSigmoid2 = sigmoidWithWeight(200, 0.01);
        System.out.println(weightedSigmoid2);
        double weightedSigmoid3 = sigmoidWithWeight(2000, 0.01);
        System.out.println(weightedSigmoid3);
    }
}
