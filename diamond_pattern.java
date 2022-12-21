import java.util.*;
public class diamond_pattern {
      
    public static void diamond_ptr(int n){
//1st half
//for number of lines
         for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        System.out.println("Enter number of lines");
        Scanner og=new Scanner(System.in);
    
        int a=og.nextInt();
        diamond_ptr(a);
    }
    
}
