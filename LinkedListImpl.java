class Node3{
    int data;
    Node3 next;
    Node3(int data){
        this.data=data;
    }
}
class LinkedList3{
    Node3 head,tail;
    public LinkedList3(){
        this.head=null;
        this.tail=null;
    }
    public void insert(int n){
        Node3 node=new Node3(n);
        if(head==null){
            head=node;
            tail=node;
        }
        else{
            tail.next=node;
            tail=node;
        }
    }
    public int deleteFirst(){
        if(head==null){
            System.out.println("List is Empty");
            return -1;
        }
        int temp=head.data;
        head=head.next;
        if(head==null)
            tail=null;
        return temp;
    }

    public void display(){
        if(head==null)
            System.out.println("List is Empty");
        else{
            Node3 temp=head;
            System.out.print("Display: ");
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public int peek(){
        if(head==null){
            System.out.println("List is Empty");
            return -1;
        }
        return head.data;
    }
    public boolean detectLoop(){
        Node3 slow=head;
        Node3 fast=head;
        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;
    }

}
public class LinkedListImpl {
    public static void main(String[] args) {
        LinkedList3 list=new LinkedList3();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        System.out.println(list.detectLoop());

    }
}
