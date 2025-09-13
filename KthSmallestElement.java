import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {
        int a[]={5,3,7,2,8,9,10};
        int n=a.length,k=3;
        PriorityQueue<Integer> ps=new PriorityQueue<>();
        for(int num:a){
            ps.add(num);
        }
        for(int i=0;i<k-1;i++)
            ps.poll();
        System.out.println(ps.peek());

    }
}
