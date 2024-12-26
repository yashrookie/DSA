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
        list.unfold();
        System.out.println("unfolded list");
        list.display();
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
    void unfold(){
        if(head == null || head.next == null){
            return;
        }
        Node firstHead = head;
        Node fp = head;
        Node secondHead =head.next;
        Node sp =secondHead;
        while(sp != null && sp.next!= null){
            fp.next = sp.next;
            fp = fp.next;
            sp.next = fp.next;
            sp = sp.next;
            fp = fp.next;
            sp = sp.next;
        }
        fp.next = null;
        secondHead = reverse(secondHead);
        fp.next = secondHead;
    }
    private Node reverse(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node prev = null;
        Node current = head;
        Node forw = null;
        while(current != null){
            forw = current.next;
            current.next = prev;
            prev= current;
            current = forw;
        }
        return prev;
    }
    void display(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }
        else{
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data +"->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
}