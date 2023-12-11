import java.util.Scanner;
class Stack 
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
      Node top=null; 
      void push(Scanner sc)
      {
            System.out.println("Enter data");
            int data=sc.nextInt();
            Node new_node=new Node(data);

            if(top==null)
            {
                top=new_node;
            }
            else
            {
                new_node.next=top;
                top=new_node;
            }
      }

      void pop(){
        if(top==null)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            top=top.next;
        }
      }

      void display()
      {
            Node temp=top;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
      }
}

public class Stack_LL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack s = new Stack();
        int c;
        int l;

        do{
            System.out.println("PRESS 1 TO PUSH OPERATION");
            System.out.println("PRESS 2 TO POP OPERATION");
            System.out.println("PRESS 3 TO DISPLAY OPERATION");
            System.out.println("ENTER THE CHOICE");
            c=sc.nextInt();

            switch(c){
                case 1:
                {
                    s.push(sc);
                    break;
                }    
                
                case 2:
                {
                    s.pop();
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

