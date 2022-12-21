import java.util.*;
public class solidRhombus{
    public static void sdRhombus(int n){
        
        for(int i=1;i<=n;i++){
            //spaces
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        //stars
        for(int j=1;j<=n;j++){
            System.out.print("*");
        }
        System.out.println();//to change row

    }

    }
    public static void main(String args[]){
        System.out.println("Enter number of lines");
        Scanner ob=new Scanner(System.in);
        int totRow=ob.nextInt();
        sdRhombus(totRow);

    }
}