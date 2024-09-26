public class InsertAtHead {
      public static void main(String[] args) {
            InsertAtHead ob = new InsertAtHead();
            int a[] = {1, 2, 3, 4, 5}, i;
            Node head = new Node(a[0]);
            Node mover = head, temp = head;

            for (i = 1; i < a.length; i++) {
                  temp = new Node(a[i]);
                  mover.next = temp;
                  mover = temp;
            }
            ob.printLL(head);

            temp = ob.AtHead(head, 10);
            ob.printLL(temp);

      }
      Node AtHead(Node head, int val) {
            Node temp = new Node(val, head);
            return temp;
      }

      void printLL (Node head) {
            Node temp = head;
            while (temp != null) {
                  System.out.print(temp.data + " ");
                  temp = temp.next;
            }
            System.out.println();
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
