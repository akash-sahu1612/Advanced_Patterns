import java.util.*;
public class floydsTriangle{

    public static void fldTriangle(int n){
        int counter=1;
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print(counter+" ");
        counter++;
    }
    System.out.println();
}
    }
    public static void main(String args[]){
        System.out.println("Enter Number of Lines");
        Scanner ob=new Scanner(System.in);
        int row=ob.nextInt();
        fldTriangle(row);
    }
}