import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size=input.nextInt();

        System.out.println("Enter the element");
        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }

        System.out.println("Print all elemant");

        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swaping elements
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("\nSorted Elements are:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
