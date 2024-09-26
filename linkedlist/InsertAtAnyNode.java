import java.util.LinkedList;
public class InsertAtAnyNode {
      public static void main(String[] args) {

            InsertAtAnyNode ob = new InsertAtAnyNode();
            LinkedList list = new LinkedList<>();
            Node head = new Node(10);
            Node temp = ob.Insert(head, 100, 1);

            ob.printLL(temp);

      }
      Node Insert (Node head, int val, int pos) {
            Node temp = head;
            int count = 0;
            if(head == null && pos == 1) {
                  return new Node(val);
            }

            if(pos == 1) {
                  temp = new Node (val, head);
                  return temp;
            }

            while (temp != null) {
                  count++;
                  if(count == pos - 1) {
                        temp = new Node(val, temp.next);
                        return head;
                  }
            }
            return head;
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