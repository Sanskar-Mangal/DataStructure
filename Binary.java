import java.util.Scanner;

public class Binary{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i;

        System.out.println("Enter the size of array");
        int size=input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements :");

        for(i=0;i<size;i++){
            arr[i]=input.nextInt();
        }

        System.out.println("Print all elements :");
        for(i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }

        System.out.println("Enter the search element :");
        int search=input.nextInt();
        
        int l=0;
        int h=size-1;

        while (l <= h) {
            int mid = (l + h) / 2;
        
            if (arr[mid] == search) {
                System.out.println("Element found at index " + mid);
                break;
            } else if (arr[mid] < search) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        
        if (l > h) {
            System.out.println("Element not found");
        }
        
        
    }
    
}