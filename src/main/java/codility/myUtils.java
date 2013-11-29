package codility;

/**
 * Created with IntelliJ IDEA.
 * User: Tu Huynh Dang
 * Date: 11/29/13
 * Time: 9:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class myUtils {

        public static int[] prefix_sum(int[] A) {
            int[] p = new int[A.length + 1];

            for (int i = 1; i < A.length + 1; i++) {
                p[i] = p[i - 1] + A[i - 1];
            }

            return p;
        }
}
