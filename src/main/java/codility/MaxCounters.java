package codility;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Tu Huynh Dang
 * Date: 11/13/13
 * Time: 9:24 AM
 */
public class MaxCounters {

    public static void main(String[] args) {
        MaxCounters mc = new MaxCounters();
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int X = 5;
        int[] r = mc.solution(X, A);
        System.out.println(Arrays.toString(r));

    }

    public int[] solution(int X, int[] A) {
        int[] res = new int[X];
        int max = 0;
        for (int i = 0; i < A.length; i++) {
             if (A[i] != (X+1)) {
                 res[A[i] - 1]++;
                 if (max < res[A[i]-1])
                     max = res[A[i]-1];
             }
            else
                 res[A[i] - 1] = max;
        }
        return res;
    }

    public void maxCounter(int max, int[] X) {
        for (int i = 0; i < X.length; i++) {
            X[i] = max;
        }
    }

}
