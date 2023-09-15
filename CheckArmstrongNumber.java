import java.util.*;
import java.lang.Math;

public class CheckArmstrongNumber {
    void display() {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter count for how many numbers you want to check for armstrong between 0-infi :");
        int m = SC.nextInt();
        int[] myArr = new int[m];
        for (int i = 0; i < m; i++) {
            int c = SC.nextInt();
            myArr[i]= c;
        }
        int temp, last;
        for (int i = 0; i < myArr.length; i++) {
            int sum = 0;
            int d=0;
            temp = myArr[i];
            while (temp > 0) {
                temp = temp / 10;
                d++;
            }
            temp = myArr[i];
            while (temp > 0) {
                last = temp % 10;
                sum += (Math.pow(last, d));
                temp=temp/10;
            }
            if (sum == myArr[i]) {
                System.out.println(myArr[i] +" is Armstrong!");
            } else {
                System.out.println(myArr[i]+ " is not a Armstrong!");
            }
        }
    }
        public static void main(String[] args){
            CheckArmstrongNumber obj = new CheckArmstrongNumber();
            obj.display();
        }

}
