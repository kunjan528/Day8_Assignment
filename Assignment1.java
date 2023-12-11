import java.util.Scanner;
import java.util.Arrays;
public class Assignment1 {
    public static void main(String[] args) {
        int[] profit = {12, 18, 20, 38, 53, 93, 77, 61, 59, 56};

        for (int i = 1; i < profit.length; i++) {
            if (profit[i] > profit[i + 1]) {
                System.out.print(i+1+2001 + " year  decline in profits .");
                break;
            }
        }
     
    }
}