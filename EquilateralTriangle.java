public class MyClass {
    void display() {
        for (int i = 1; i < 11; i++) {

            for (int j = 10; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k<i; k++) {
                System.out.print(" *");
            }
                System.out.println("");
            }

        }


    public static void main(String[] args){
        MyClass obj=new MyClass();
        obj.display();
    }
}
