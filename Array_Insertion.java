import java.util.Scanner;

public class Array_Insertion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size,i;
        System.out.println("Enter the size of array");
        size=input.nextInt();

        System.out.println("Enter elements");
        int arr[] = new int[size];
        int arr2[] = new int[size+1];

        for(i=0;i<size;i++){
            arr[i]=input.nextInt();
        }

        System.out.println("Print Elements");

        for(i=0;i<size;i++){
            System.out.println(arr[i] + " ");
        }

        System.out.println("Enter the index of new value to be inserted ");
        int in=input.nextInt();

        System.out.println("Enter the new value ");
        int n=input.nextInt();

        for(i=0;i<size+1;i++){
            if(i<in){
                arr2[i]=arr[i];
            }
            else if(i==in){
                arr2[i]=n;
            }
            else{
                arr2[i]=arr[i-1];
            }
        }

        System.out.println("Elements are :");
        for(i=0;i<size+1;i++){
            System.out.println(arr2[i] + " ");
        }

    }
}
