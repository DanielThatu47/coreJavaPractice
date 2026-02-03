package java;

public class Second {

    public static void main(String[] args) {
        //write a java program to find 2nd largest among 5 numbers

        int a = 25;
        int b = 15;
        int c = 29;
        int d = 32;


        if(a > b && a>c&& a>d){
            if(b>c && b>d){
                System.out.println("2nd largest number is: " + b);
            }else if(c>b && c>d){
                System.out.println("2nd largest number is: " + c);
            }else{
                System.out.println("2nd largest number is: " + d);
            }
        } 
    }
}
