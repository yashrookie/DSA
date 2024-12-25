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
        if(list.isPalindrome()){
            System.out.println("the list is palindrome");
        }
        else{
            System.out.println("the list is not palindrome");
        }
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next= null;
    }
}
class linkedList{
    private Node head;
    void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else {
            Node temp = head;
        while(temp.next != null){
          temp = temp.next;  
        }
        temp.next = newNode;
    }
}
boolean isPalindrome(){
    if(head == null || head.next == null)return true;
    Node slow = head;
    Node fast = head;
    while(fast.next != null && fast.next.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    Node secondHalfHead = reverse(slow);
    Node c1 = head ;
    Node c2 = secondHalfHead;
    boolean isPalindrome = true;
    while(c2!=null){
    if(c1.data != c2.data){
        isPalindrome = false;
        break;
    }
    c1= c1.next;
    c2= c2.next;
}
reverse(secondHalfHead);
return isPalindrome;
}

private Node reverse(Node head){
    Node prev = null;
    Node current = head;
    Node forw = null;
    while(current != null){
        forw = current.next;
        current.next= prev;
        prev = current;
        current = forw;
    }
    return prev;
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
}