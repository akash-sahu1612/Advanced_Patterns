import java.util.*;
public class number_pyramid{
    public static void numberPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }


    }
    public static void main(String args[]){
        System.out.println("Enter number of lines");
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        numberPyramid(a);
    }
}