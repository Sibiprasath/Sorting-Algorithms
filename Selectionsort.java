import java.util.Scanner;

public class Selectionsort {
    public static void selectionSort(int arr[])
    {
        for(int itr=0;itr<arr.length; itr++)
        {
            int minIndex=itr;
            for(int ind=itr;ind<arr.length; ind++)
            {
                if(arr[ind]<arr[minIndex])
                minIndex=ind;
            }
            int temp=arr[itr];
            arr[itr]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        selectionSort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
