public class DeleteTail {
      public static void main(String[] args) {
            int a[] = {1,2,3,4,5}, i;
            Node head = new Node(a[0]), temp;
            Node mover = head;

            for (i = 1; i < a.length; i++) {
                  temp = new Node(a[i]);
                  mover.next = temp;
                  mover = temp;
            }
            temp = head;

            while (temp.next.next != null) {
                  temp = temp.next;
            }
            temp.next = null;

            System.out.println("now the tail element is: " + temp.data);
      }
}

class Node {
      int data;
      Node next;
      Node(int data1, Node next1) {
            this.data = data1;
            this.next = next1;
      }
      Node(int data1) {
            this.data = data1;
            this.next = null;
      }
}