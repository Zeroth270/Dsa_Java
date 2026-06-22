package Array;

public class PainterPartitionProblem {

    public static boolean isValid(int[] board, int maxPaint, int maxPainter){

        int painter = 1;
        int paint = 0;

        for (int j : board) {
            if (paint + j <= maxPaint) {
                paint += j;
            } else {
                painter++;
                if (painter > maxPainter || j > maxPaint) return false;
                else {
                    paint = 0;
                    painter += j;
                }
            }
        }
        return true;
    }

    public static int minTime(int[] boards, int painter){
        int sum = 0;

        for(int e : boards){
            sum += e;
        }

        int s = 0;
        int e = sum;

        int ans = -1;

        while(s <= e){
            int mid = s + (e-s)/2;

            if(isValid(boards, mid, painter)){
                ans = mid;
                e = mid-1;
            }else {
                s = mid + 1;
            }
        }
        return ans;

    }

    static void main() {
        //int[] boards = {10, 20, 30, 40};
        int[] boards = {5, 10, 30, 20, 15};
        int painter = 2;
        int ans = minTime(boards, painter);
        System.out.println(ans);
    }
}
