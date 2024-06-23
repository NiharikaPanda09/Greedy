import java.util.*;
public class MinNumOfMoves {
    public static void main(String[] args) {
                int [] seats = {3,1,5};
                int[] st = {2,7,4};
        System.out.println(minMovesToSeat(seats,st));
    }
    public static int minMovesToSeat(int[] seats, int[] students) {
                      int add =0;

        Arrays.sort(seats);
        Arrays.sort(students);
        int i=0,j=0;
        while (i < seats.length && j < students.length) {
             add += Math.abs(seats[i] - students[j]);
            i++;j++;
        }
        return add;

    }
}
