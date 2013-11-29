package codility;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Tu Huynh Dang
 * Date: 11/29/13
 * Time: 8:44 AM
 * To change this template use File | Settings | File Templates.
 */
public class RobotMove {

    public static void main(String[] args) {
        int[] A = {2, 3, 2, 11, 1, 5, 5, 2, 5};
        int k = 4;
        int m = 4;
        System.out.println(find_route(A, k, m));


    }


    public static int find_route(int[] A, int k, int m) {
        int max = 0;
        int[] s = myUtils.prefix_sum(A);

        for (int p = 0; p <= m; p++) {
            int a = k - p;
            int b = k + (m-2*p);

            if (a < 0 || b>s.length-2) continue;
            if(b < k) b = k;
            int t = s[b + 1] - s[a];
            if (t > max) max = t;
//            System.out.printf("a=%d,b=%d,t=%d\n", a, b, t);
        }
        return max;
    }
}
