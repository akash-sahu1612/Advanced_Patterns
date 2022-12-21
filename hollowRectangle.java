import java.util.*;
public class hollowRectangle{


public static void hollowRectangle1(int totRow,int totCol){
  //outer loop-rows
    for(int i=1;i<=totRow;i++){
//inner loop-columns-to traverse
for(int j=1;j<=totCol;j++){
    //cell-(i,j)
    if(i==1||i==totRow||j==1||j==totCol){
        //boundry cells
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
        System.out.println("Enter the Values of Rows and Columns");
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        int b=ob.nextInt();
hollowRectangle1(a,b);
    }
    
}