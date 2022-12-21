import java.util.*;
public class pallindromic_pattern{
    public static void pallindromePattern(int n){
//lines
    for(int i=1;i<=n;i++){
        //spaces
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        //spaces+numbers
            //loop-to print 1st Half-descending
            for(int k=i;k>=1;k--){
                System.out.print(k);
            }
            //loop-to print 2nd Half-ascending
            for(int k=2;k<=i;k++){
                System.out.print(k);
            }
System.out.println();
        }
        
    }
    public static void main(String args[]){
        System.out.println("Enter number of lines");
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        pallindromePattern(a);
    }


    
}