class Node2{
    int data;
    Node2 next;
    public Node2(int data){
        this.data=data;
    }
}
class StackLinkedList{
    Node2 top;
    public void push(int num){
        Node2 newNode=new Node2(num);
        if(top==null){
            top=newNode;
        }
        else{
            newNode.next=top;
            top=newNode;
        }
    }
    public int pop(){
        if(top==null){
            System.out.println("Stack is Empty");
            return -1;
        }
        int temp=top.data;
        top=top.next;
        return temp;
    }
    public void display(){
        Node2 temp=top;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public int peek(){
        if(top==null){
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }
}
public class StackLinkedListImpl {
    public static void main(String[] args) {
        StackLinkedList stackLinkedList=new StackLinkedList();
        stackLinkedList.push(1);
        stackLinkedList.push(2);
        stackLinkedList.push(3);
        stackLinkedList.push(4);
        stackLinkedList.display();
        System.out.println("Pop: "+stackLinkedList.pop());
        stackLinkedList.display();
        System.out.println("Peek: "+stackLinkedList.peek());
        stackLinkedList.display();

    }
}
