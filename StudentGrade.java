import java.util.Scanner;

public class MyClass {
    void display() {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter student marks if following subjects out of 100 : ");
        System.out.print("Maths : ");
        int m=SC.nextInt();
        System.out.print("Hindi : ");
        int h=SC.nextInt();
        System.out.print("English : ");
        int e=SC.nextInt();
        System.out.print("Science : ");
        int s=SC.nextInt();
        System.out.print("Social Science : ");
        int ss=SC.nextInt();
        double ad=0;
        ad=m+h+e+s+ss;
        double per=ad/5.0;
        System.out.println("your percentage is : "+per);
        if(per>=95 && per<100){
            System.out.println("Outstanding Performance!");
        }else
            if(per>=90 && per<95){
                System.out.println("Excellent Performance!");
            } else
        if(per>=80 && per<90){
            System.out.println("Very good Performance!");
        }
        if(per>=70 && per<80){
            System.out.println("Good Performance!");
        }else
        if(per>=60 && per<70){
            System.out.println("fair Performance!");
        }else
        if(per<60){
            System.out.println("Failed");
        }
            }

            public static void main(String[] args){
        MyClass obj=new MyClass();
        obj.display();
    }
}