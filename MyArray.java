import java.util.*;

public class MyArray{
    public static void main(String suraj[]){
        
        int arr[]=new int[10];
        
        Scanner sc=new Scanner(System.in);
        
       for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+"  ");
        }
        
        int array[][]=new int[3][3];
        
        array[0][1]=200;
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                array[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(array[i][j]+"  ");
            }
            System.out.println();
        }
    }
}