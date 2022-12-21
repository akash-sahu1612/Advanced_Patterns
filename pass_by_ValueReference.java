public class pass_by_ValueReference{
    public static void updation(int marks[],int nonchangable){
        nonchangable=10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
    }
    }
    public static void main(String args[]){
        int marks[]={97,98,99};
        int nonchangable=5;
        updation(marks,nonchangable);
        //print-marks
        for(int i=0;i<marks.lenght;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}