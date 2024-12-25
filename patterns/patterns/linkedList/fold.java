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
        System.out.println("original List");
        list.display();
        list.Fold();
        System.out.println("Folded List");
        list.display();
    }
}
class Node{
    int data;
    Node next;
    Node (int data){
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
    void Fold(){
        if(head == null || head.next == null){
            return;
        }
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node secondHalf = reverse(slow.next);
        slow.next =null;
        Node c1= head;
        Node c2 =secondHalf;
        Node f1 = null;
        Node f2 = null;
        while(c2 != null){
        c1.next = f1;
        c2.next = f2;
        c1= f1;
        c2= f2;
    }
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
        System.out.println("list is empty");
        return;
    }
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data +"");
            temp = temp.next;
        }
        System.out.println("null");
    }
}