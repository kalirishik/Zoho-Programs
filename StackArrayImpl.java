import java.lang.reflect.Array;
import java.util.Arrays;

class StackArray{
    int stack[];
    int size;
    int top;
    public StackArray(int size){
        stack=new int[size];
        this.size=size;
        this.top=-1;
    }
    public boolean isFull(){
        return top==size-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public void push(int num){
        if(isFull()){
            System.out.println("Stack is Full");
            return;
        }
        stack[++top]=num;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        int temp=top;
        top--;
        return stack[temp];
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }
    public void display(){
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}
public class StackArrayImpl {
    public static void main(String[] args) {
        StackArray stackArray=new StackArray(5);
        stackArray.push(1);
        stackArray.push(2);
        stackArray.push(3);
        stackArray.push(4);
        stackArray.push(5);
        stackArray.display();
        System.out.println("Pop: "+stackArray.pop());
        stackArray.display();
        System.out.println("Peek: "+stackArray.peek());
    }
}
