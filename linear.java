import java.util.Scanner;

public class linear {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int i;
            System.out.println("Enter the size of array");
            int size=input.nextInt();

            int[] arr=new int[size];

            System.out.println("Enter the elements");

            for(i=0;i<size;i++){
                arr[i]=input.nextInt();
            }

            System.out.println("Print all elements :");

            for(i=0;i<size;i++){
                System.out.println(arr[i]+" ");
            }

            System.out.println("Enter the search element");
            int search=input.nextInt();

            for(i=0;i<size; i++){
                if(arr[i]==search){
                    System.out.println("Element is found :"+arr[i]);
                    System.out.println("Element index is: " + i);
                    break;   
                }
            }

            if(i==size){
                System.out.println("Element not found in the list.");
            }
        }
    }
}
