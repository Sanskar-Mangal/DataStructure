import java.util.Scanner;

public class Array_Delection {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size,i;
        System.out.println("Enter the size of array");
        size=input.nextInt();

        System.out.println("Enter elements");
        int arr[] = new int[size];
        int arr2[] = new int[size-1];

        for(i=0;i<size;i++){
            arr[i]=input.nextInt();
        }

        System.out.println("Print Elements");

        for(i=0;i<size;i++){
            System.out.println(arr[i] + " ");
        }

        System.out.println("Enter the index of value to be deleted ");
        int in=input.nextInt();

        for(i=0;i<arr.length;i++){
            if(i<in){
                arr2[i]=arr[i];
            }
            else if(i==in){
                continue;
            }
            else{
                arr2[i-1]=arr[i];
            }
        }

        System.out.println("Elements are :");
        for(i=0;i<size-1;i++){
            System.out.println(arr2[i] + " ");
        }

    }
}

