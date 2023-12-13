import java.util.Scanner;

public class SinglyLinklist {
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
            new_node.next=head;
            head=new_node;
        }
        System.out.println("Do u want to add more data. if yes, press: 1");
        n=input.nextInt();
        }
        while(n==1);
        input.close();

    }

    public void display(){
        Node temp=head;
        if(head==null){
            System.out.println("Linked List does not exist");
        }
        else{
            while(temp!=null)
            {
                 
                System.out.println(temp.data +" ");
                temp=temp.next;

            }
        }
    }

    public static void main(String[] args) {
        //class ka object create
        SinglyLinklist ll=new SinglyLinklist();
        ll.creation();
        ll.display();
    }
}
