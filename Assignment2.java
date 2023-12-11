import java.util.Scanner;
import java.util.Arrays;
public class Assignment2 {
    public static void main(String[] args) {

        int[] Sale_Month = {125000,93000,80000,75000,84000,110000,105000,120000,90000,115000,123000,150000};
        int[] SaleQ = new int[4];
        int add1 = 0;
        int add2 = 0;
        int add3 = 0;
        int add4 = 0;
        //int add1,add2,add3,add4=0;

            //System.out.println("Sales Monthly = "+ Arrays.toString(Sale_Month));

            for (int i = 0; i < Sale_Month.length; i++) {
                if ( i < 3) {
                    add1 = add1 + Sale_Month[i];
                } else if ( i > 2 && i < 6) {
                    add2 = add2 + Sale_Month[i];
                } else if ( i > 5 && i < 9) {
                    add3 = add3 + Sale_Month[i];
                } else {
                    add4 = add4 + Sale_Month[i];
                }
            } 
            SaleQ[0] = add1;
            SaleQ[1] = add2;
            SaleQ[2] = add3;
            SaleQ[3] = add4;  

             //System.out.println("Reports of Quartly = "+ Arrays.toString(SaleQ));
             //System.out.println();
             System.out.println("Reports of yearly = "+ (add1+add2+add3+add4));
    }}