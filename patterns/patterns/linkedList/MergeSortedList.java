import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        linkedList list1 = new linkedList();
        linkedList list2 = new linkedList();
        System.out.println("enter the elements for 1st ll");
        int n1 = scn.nextInt();
        for(int i =0;i<n1;i++){
            list1.add(scn.nextInt());
        }
         System.out.println("enter the elements for 2nd ll");
        int n2 = scn.nextInt();
        for(int i =0;i<n2;i++){
            list2.add(scn.nextInt());
        }
        System.out.println("list1");
        list1.display();
        System.out.println("list2");
        list2.display();
        linkedList mergedList = new linkedList();
        mergedList.head = linkedList.mergeSortedLists(list1.head,list2.head);
        System.out.println("merged List");
        mergedList.display();
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
     Node head;
    void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next!= null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public static Node mergeSortedLists(Node L1,Node L2){
        if(L1 == null || L2 == null)return L1!=null?L1:L2;
        Node dummy = new Node(-1);
        Node prev =dummy;
        Node c1 = L1;
        Node c2 = L2;
        while(c1!=null && c2!=null){
            if(c1.data<c2.data){
                prev.next = c1;
                c1 = c1.next;
            }
            else{
                prev.next = c2;
                c2 = c2.next;
            }
            prev = prev.next;
        }
        prev.next = c1!= null ? c1:c2;
        return dummy.next;
}
void display(){
    if(head == null){
        System.out.println("list is empty");
        return;
    }
    else{
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data +"");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
}