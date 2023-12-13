import java.util.Scanner;
class Queue 
{
    static class Node  //INNER CLASS
    {
        int data;
        Node next;


        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
        
    }
      Node front=null; 
      Node rear=null;

      void enqueue(Scanner sc)
      {
            System.out.println("Enter the data :");
            int data=sc.nextInt();
            Node node_node = new Node(data);
            if(front==null)
            {
                front=new_node;
                rear=new_node;
            }
            else
            {
                rear.next=new_node;
                rear=new_node;
            }
      }

      void dequeue()
      {
            if(front==null)
            {
                System.out.println("Underflow");
            } 
            else
            {
                front=front.next;
            }
      }

      void display()
      {
            Node temp=front;
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
      }
}

public class Queue_LinkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue s = new Queue();
        int c;
        int l;

        do{
            System.out.println("PRESS 1 TO ENQUEUE OPERATION");
            System.out.println("PRESS 2 TO DEQUEUE OPERATION");
            System.out.println("PRESS 3 TO DISPLAY OPERATION");
            System.out.println("ENTER THE CHOICE");
            c=sc.nextInt();

            switch(c){
                case 1:
                {
                    s.enqueue(sc);
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
            System.out.println("Enter 0 TO GO TO THE MAIN MENU");
            System.out.println("Enter any key to exit");
            l=sc.nextInt();
        }
        while(l==0);
            System.out.println("Exit Sucessfully");
        sc.close();
    }
}

