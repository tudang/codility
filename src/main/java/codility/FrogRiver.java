package codility;

/**
 * User: Tu Huynh Dang
 * Date: 11/12/13
 * Time: 7:46 PM
 */
public class FrogRiver {
    public static void main(String[] args) {

        int A[] = {2, 4, 3, 3, 2, 4, 5, 1};
//        int A[] = {1};
        System.out.println(solution(5, A));
    }
    public static int solution(int X, int[] A) {
        int j = 1, min = 0;
        int count[] = new int[X];
        count[A[0]-1]++;
        for (int i = 1; i < A.length; i++) {
            if (j == X)
                return min;
            else {
                if (count[A[i]-1] == 0) {
                    count[A[i]-1] = i;
                    j++;
                    min = i;
                }
            }
        }
        return (j == X) ? min : -1;
    }
}
