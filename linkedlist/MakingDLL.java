<<<<<<< HEAD
public class MakingDLL {
      public static void main(String[] args) {
            MakingDLL ob = new MakingDLL();

            int arr[] = {1, 2, 3, 4, 5};
            Node head = new Node(arr[0]);
            Node temp = head;
            temp = ob.arrToDLL(head, arr);

            ob.print(temp);
      }

      Node arrToDLL (Node head, int arr[]) {
            Node temp = head, mover;
            int i;
            for (i = 1; i < arr.length; i++) {
                  mover = new Node(arr[i]);
                  temp = temp.next;
            }

            return head;
      }
      void print (Node head) {
            Node temp = head;
            while (temp != null) {
                  System.out.print(temp.data);
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
=======
public class MakingDLL {
      public static void main(String[] args) {
            
      }
}

class Node {
      
}
>>>>>>> 20c8b4af57760d743d07eacb127fbca1b1a39dc4
