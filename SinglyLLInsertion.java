import java.util.Scanner;

public class SinglyLLInsertion {
    static class Node{
        int data;
        Node next;

        Node(int data){    //Constructor
           this.data=data;
           this.next=null;
        }
    }

    Node head=null;

    public void creation(){
        int n;
        Scanner input=new Scanner(System.in);
        do
        {
        System.out.println("Enter the value");
        int data=input.nextInt();
        Node new_node=new Node(data);
        if(head==null)
        {
            head=new_node;
        }
        else
        {
            System.out.println("Enter 1 to insert the item at beginning, 2 to insert the item at end, 3 to insert the item at specific postion");
            int choice=input.nextInt();

            switch(choice)
            {
                case 1: 
                    new_node.next=head;
                    head=new_node;
                    break;

                case 2: 
                    Node temp=head;
                    while(temp.next!=null)
                    {
                        temp=temp.next;
                    }
                    temp.next=new_node;
                    break;

                case 3: 
                    System.out.println("Enter the position :");
                    int pos=input.nextInt();
                    Node temp1=head;
                    for(int i=0;i<(pos-1);i++){
                        temp1=temp1.next;
                    }
                    new_node.next=temp1.next;
                    temp1.next=new_node;
                    break;
            }
        }
        System.out.println("Do u want to add more data. if yes, press: 1");
        n=input.nextInt();
        }
        while(n==1);
        input.close();

    }

    public void display(){
        Node temp=head;
        if(head==null)
        {
            System.out.println("Linked List does not exist");
        }
        else{
            while(temp!=null)
            {
                 
                System.out.print(temp.data +" ");
                temp=temp.next;

            }
        }
    }

    public static void main(String[] args) {
        //class ka object create
        SinglyLLInsertion ll=new SinglyLLInsertion();
        ll.creation();
        ll.display();
        
    }
}

