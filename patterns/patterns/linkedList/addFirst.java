import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        linkedList list = new linkedList();
        System.out.println("enter the number at the beginnig of the list");
        while(list.size()<n){
            System.out.println("enter the data");
            int data = scn.nextInt();
            if(data == -1){
                break;
            }
            list.addFirst(data);
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
        Node head;
        private int size;
        linkedList(){
            this.head = null;
            this.size =0;
        }
        void addFirst(int data){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            size++;
        }
        int size(){
            return size;
        }
    void printList(){
        Node current = head;
        while(current != null){
            System.out.println(current.data +" ");
            current = current.next;
        }
        System.out.println("null");
    }
}
