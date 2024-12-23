import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        linkedList list = new linkedList();
        System.out.println("enter the number to add at last");
        while(list.size()<n){
            int data = scn.nextInt();
            if(data == -1){
                break;
            }
            list.addLast(data);
        }
        System.out.println("linkedList elements");
        list.printList();
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
    
}
class linkedList{
    private Node head;
   private Node tail;
    private int size;
    linkedList(){
        this.head = null;
        this.tail = null;
        this.size =0;
    }
    void addLast(int data){
        Node newNode = new Node(data);
         if(head == null){
             head = newNode;
             tail = newNode;
         }
         else {
             tail.next= newNode;
             tail = newNode;
         }
         size++;
    }
    int size(){
        return size;
    }
    void printList(){
        Node current = head;
        while(current != null){
            System.out.println(current.data + "");
            current = current.next;
        }
        System.out.println("null");
    }
}