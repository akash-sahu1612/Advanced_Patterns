import java.util.*;
public class butterfly{
    public static void butterfly1(int n){
for(int i=1;i<=n;i++){
    //stars-i
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    //spaces-2*(n-i)
    for(int j=1;j<=2*(n-i);j++){
        System.out.print(" ");
    }
    //stars-i
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}


//2nd Half
for(int r=n;r>=1;r--){
     //stars-i
     for(int j=1;j<=r;j++){
        System.out.print("*");
    }
    //spaces-2*(n-r)
    for(int j=1;j<=2*(n-r);j++){
        System.out.print(" ");
    }
    //stars-i
    for(int j=1;j<=r;j++){
        System.out.print("*");
    }
    System.out.println();
    }

    }


    
    public static void main(String args[]){
        System.out.println("Enter number of Lines");
        Scanner ob=new Scanner(System.in);
        int totRow=ob.nextInt();
        butterfly1(totRow);
    }
}