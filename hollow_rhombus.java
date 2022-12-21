import java.util.*;
public class hollow_rhombus{
    public static void hollowRhombus(int n){

        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //hollow_ractanghle
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        System.out.println("Enter number of lines");
        Scanner ob=new Scanner(System.in);
        int totRow=ob.nextInt();
        hollowRhombus(totRow);
    }
}