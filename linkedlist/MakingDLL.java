public class MakingDLL {
      public static void main(String[] args) {
            MakingDLL ob = new MakingDLL();

            int arr[] = {1, 2, 3, 4, 5};
            Node head = new Node(arr[0]);
            Node prev = new Node(arr[0]);
            Node mover = head;
            Node temp = head;
            temp = ob.arrToDLL(head, arr);

            ob.print(temp);
      }

      Node arrToDLL (Node head, int arr[]) {
            Node temp = head;
            Node prev = head;
            int i;
            for (i = 1; i < arr.length; i++) {
                  temp = new Node(arr[i], null, prev);
                  temp.prev = prev;
                  prev.next = temp;
                  prev = temp; // prev = prev.next can also be written
            }

            return head;
      }
      void print (Node head) {
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
      Node next, prev;

      Node (int data1, Node next1, Node prev1) {
            this.data = data1;
            this.next = next1;
            this.prev = prev1;
      }
      Node (int data1) {
            this.data = data1;
            this.next = null;
            this.prev = null;
      }
}
