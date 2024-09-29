package linkedlist;

public class DeleteInDLL {
      public static void main(String[] args) {
            DeleteInDLL ob = new DeleteInDLL();
            MakingDLL ob2 = new MakingDLL();

            int a[] = { 1, 2, 3, 4, 5 };
            Node head = new Node(a[0]);
            Node temp = head;
            ob2.arrToDLL(head, a);

            ob2.print(head);

            ob.DeleteHead(head);
            ob2.print(head);
      }

      Node DeleteHead(Node head) {
            Node prev = head;

            if (head == null || head.next == null)
                  return null;

            head = head.next;
            head.prev = null;
            prev.next = null;

            return head;
      }

      Node DeleteTail(Node head) {
            Node tail = head, prev = head;

            if(head == null) 
            return null;

            while (tail != null) {
                  tail = tail.next;
            }
            prev = tail.prev;
            prev.next = null;
            tail.prev = null;
            return head;
      }

      Node DeleteAnyElement(Node head) {
            Node temp = head;
            return temp;
      }

      Node DeleteAtAnyNode(Node head, int pos) {
            Node temp = head;
            int count = 0;
            if (head == null) 
            return null;

            // while 
            return temp;
      }

}

class Node {
      int data;
      Node next, prev;

      Node(int data1, Node next1, Node prev1) {
            this.data = data1;
            this.next = next1;
            this.prev = prev1;
      }

      Node(int data1) {
            this.data = data1;
            this.next = null;
            this.prev = null;
      }
}