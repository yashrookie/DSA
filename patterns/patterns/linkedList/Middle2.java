import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        linkedList list = new linkedList();
        System.out.println("enter the number of elements");
        int n = scn.nextInt();
        System.out.println("enter the elements");
        for(int i =0;i<n;i++){
            int val = scn.nextInt();
            list.add(val);
        }
        System.out.println("original list");
        list.display();
        System.out.println("Middle of the list");
        System.out.println(list.findMiddle());
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
        void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
            }
            else{
                Node temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }
        int findMiddle(){
            if(head == null){
                throw new IllegalStateException("the list is empty");
            }
            Node slow = head;
            Node fast = head;
            while(fast != null && fast.next != null){//2 mid in even lengthcondition uses only...
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow.data;
        }
        void display(){
            if(head == null){
                System.out.println("the list is empty");
                return;
            }
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data +"");
                temp = temp.next;
            }
            System.out.println("null");
        }
        //System.out.println("null");
    }