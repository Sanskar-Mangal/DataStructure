import java.util.Scanner;

class Stack {
    int top = -1;
    int n = 10;
    int arr[] = new int[n];
    Scanner sc = new Scanner(System.in);

    void push() {
        if (top == n - 1) {
            System.out.println("Overflow");
        } else {
            System.out.println("Enter element");
            int i = sc.nextInt();
            top = top + 1;
            arr[top] = i;
            System.out.println("Inserted Data");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Underflow");
        } else {
            top = top - 1;
            System.out.println("Deleted");
        }
    }

    void peek(){
        if (top == -1) {
            System.out.println("Underflow");
        } else {
            System.out.println(arr[top] + " ");
        }

    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Items are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}

public class Stack_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack s = new Stack();
        int c;
        int l;

        do{
            System.out.println("PRESS 1 TO PUSH OPERATION");
            System.out.println("PRESS 2 TO POP OPERATION");
            System.out.println("PRESS 3 TO PEEK OPERATION");
            System.out.println("PRESS 4 TO DISPLAY OPERATION");
            System.out.println("ENTER THE CHOICE");
            c=sc.nextInt();

            switch(c){
                case 1:
                {
                    s.push();
                    break;
                }    
                
                case 2:
                {
                    s.pop();
                    break;
                }
                
                case 3:
                {
                    s.peek();
                    break;
                }

                case 4:
                {
                    s.display();
                    break;
                }
                
            }  
            System.out.println("Enter 0 TO GO TO THE MAIN MENU");
            System.out.println("Enter any key to exit");
            l=sc.nextInt();
        }
        while(l==0);
            System.out.println("Exit Sucessfully");
        sc.close();
    }
}
