public class DeleteTail {
      public static void main(String[] args) {
            DeleteTail ob = new DeleteTail();
            int a[] = { 1, 2, 3, 4, 5 }, i;
            Node head = new Node(a[0]), temp;
            Node mover = head;

            for (i = 1; i < a.length; i++) {
                  temp = new Node(a[i]);
                  mover.next = temp;
                  mover = temp;
            }
            temp = head;

            head = ob.deleteNode(head, 3);
            System.out.println("the list is:");
            while (temp != null) {
                  System.out.print(temp.data + " ");
                  temp = temp.next;
            }
            System.out.println();
            // deleting the tail
            // while (temp.next.next != null) {
            // temp = temp.next;
            // }
            // temp.next = null;

            // System.out.println("now the tail element is: " + temp.data);
      }

      Node deleteNode(Node head, int k) {
            Node temp = head, prev = temp;
            int count = 0;
            // we have to delete the head
            if (k == 1) {
                  head = head.next;
            }

            while (temp != null) {
                  count++;
                  if (count == k) {
                        prev.next = prev.next.next;
                  }
                  prev = temp;
                  temp = temp.next;
            }
            return head;
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