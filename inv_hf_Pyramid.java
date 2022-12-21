import java.util.*;
public class inv_hf_Pyramid{
    public static void ihPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
System.out.print(j);
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        System.out.println("Enter number of lines");
        Scanner ob=new Scanner(System.in);
        int row=ob.nextInt();
        ihPyramid(row);
    }

}