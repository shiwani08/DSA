public class DeleteHead {
      public static void main(String[] args) {
            int a[] = {};
            Node head = new Node(a[0]);
            Node mover = head;
            Node temp = head;
            int i;

            System.out.println("the initial pos of the head was: " + head);
            System.out.println("the initial value of the head was: " + head.data);

            for (i = 1; i < a.length; i++) {
                  temp = new Node(a[i]);
                  mover.next = temp; // mover should point to the next element which is stored at temp
                  mover = temp;
            }

            head = head.next;
            System.out.println("the updated pos of the head was: " + head);
            System.out.println("the updated value of the head was: " + head.data);
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
