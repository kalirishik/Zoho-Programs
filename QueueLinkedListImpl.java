class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class LinkedList{
    Node head,tail;
    public LinkedList(){
        this.head=null;
        this.tail=null;
    }
    public void enqueue(int n){
        Node node=new Node(n);
        if(head==null){
            head=node;
            tail=node;
        }
        else{
            tail.next=node;
            tail=node;
        }
    }
    public int dequeue(){
        if(head==null){
            System.out.println("Queue is Empty");
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
            System.out.println("Queue is Empty");
        else{
            Node temp=head;
            System.out.print("Display: ");
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public int peek(){
        if(head==null){
            System.out.println("Queue is Empty");
            return -1;
        }
        return head.data;
    }

}
public class QueueLinkedListImpl {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.enqueue(1);
        linkedList.enqueue(2);
        linkedList.enqueue(3);
        linkedList.enqueue(4);
        linkedList.enqueue(5);
        linkedList.display();
        System.out.println("\nDequeue: "+linkedList.dequeue());
        linkedList.display();
        System.out.println("\nPeek: "+linkedList.peek());

    }
}
