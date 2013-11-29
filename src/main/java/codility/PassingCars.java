package codility;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: Tu Huynh Dang
 * Date: 11/29/13
 * Time: 9:19 AM
 * To change this template use File | Settings | File Templates.
 */
public class PassingCars {

    public static void main(String[] args) {
        int size = 100000;
        int[] A = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int k = random.nextInt(2);
            A[i] = k;
        }
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        long sum = 0;
        int[] p = myUtils.prefix_sum(A);
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                int t = (p[p.length-1] - p[i]);
                sum += t;
                //System.out.printf("t=%d, sum=%d\n", t, sum);
            }
        }
        System.out.println(sum);
        return (sum > 1000000000) ? -1 : (int) sum;
    }
}
