import java.util.*;
public class inv_rot_halfPyramid {
    public static void irhPyramid(int n){

        for(int i=1;i<=n;i++){
            // for loop to print spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for loop to print star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        System.out.println("Enter number of Lines");
        Scanner ob1=new Scanner(System.in);
        int r=ob1.nextInt();
        //int col=ob1.nextInt();
        irhPyramid(r);
    }
}
