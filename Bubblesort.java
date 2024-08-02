import java.util.Scanner;

public class Bubblesort{

    public static void bubbleSort(int arr[]){
        for(int itr=0;itr<arr.length-1;itr++){
            for(int itr1=0;itr1<arr.length-itr-1;itr1++){
                if(arr[itr1]>arr[itr1+1]){
                    int temp=arr[itr1];
                    arr[itr1]=arr[itr1+1];
                    arr[itr1+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr);
        for (int idx = 0; idx<size; idx++) {
            System.out.print(arr[idx]+" ");
        }
    }
}