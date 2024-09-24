public class making {
      public static void main(String[] args) {
            int a[] = {1,2,3,4,5,6};
            Node y = new Node(a[2]);
            System.out.println(y.data);   //the value which it is storing
            System.out.println(y);        // the address at which this value is stored
      }
}

class Node {
      int data;
      Node next;

      Node (int data1, Node next1) {
            this.data = data1;
            this.next = next1;
      }
      Node (int data1) {
            this.data = data1;
            this.next = null;
      }
}
