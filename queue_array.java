import java.util.Scanner;

class queue {
    Scanner sc=new Scanner(System.in);
    int front=-1,rear=-1;
    int n=10;
    int[] q=new int[n];

    void enqueue(){
        if(rear==n-1){
            System.out.println("Queue is overflow data not insert");
            
        }
        else{
            System.out.println("Enter the data");
            int i=sc.nextInt();
            if(front==-1 & rear==-1){
                front=0;
                rear=0;
                q[rear]=i;
            }
            else{
                rear=rear+1;
                q[rear]=i;
            }

        }

    }

    void dequeue(){
        if(front==-1 & rear==-1){
            System.out.println("UnderFlow Queue");
        }
        else{
            front=front+1;
        }
    }

    void display(){
        System.out.print("ALL elements are : ");
            for(int i=front;i<rear;i++){
            System.out.println(q[i] +" ");
            }
    }


}

public class queue_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        queue s = new queue();
        int c;
        int l;

        do{
            System.out.println("PRESS 1 TO ENQUEUE");
            System.out.println("PRESS 2 TO POP DEQUEUE");
            System.out.println("PRESS 3 TO DISPLAY");
            System.out.println("ENTER THE CHOICE");
            c=sc.nextInt();

            switch(c){
                case 1:
                {
                    s.enqueue();
                    break;
                }    
                
                case 2:
                {
                    s.dequeue();
                    break;
                }
                
                case 3:
                {
                    s.display();
                    break;
                }

               
                
            }  
            System.out.println("\n Enter 0 TO GO TO THE MAIN MENU");
            System.out.println("\n Enter any key to exit");
            l=sc.nextInt();
        }
        while(l==0);
            System.out.println("Exit Sucessfully");
        sc.close();
    }
}

