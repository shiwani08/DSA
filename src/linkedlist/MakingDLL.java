// package linkedlist;

public class MakingDLL {
      public static void main(String[] args) {
            MakingDLL ob = new MakingDLL();

            int arr[] = {1, 2, 3, 4, 5};
            if (arr.length == 0) {
                  System.out.println("Array is empty.");
                  return;
            }

            Node head = new Node(arr[0]);  // Initialize the head of the list
            Node temp = head;
            temp = ob.arrToDLL(head, arr);

            ob.print(temp);
      }

      Node arrToDLL (Node head, int arr[]) {
            Node temp = head;
            for (int i = 1; i < arr.length; i++) {  // Start from second element
                  Node mover = new Node(arr[i]);  // Create a new node
                  temp.next = mover;  // Link the current node to the new node
                  mover.prev = temp;  // Link back to the previous node
                  temp = mover;  // Move the temp pointer forward
            }
            return head;
      }

      void print (Node head) {
            Node temp = head;
            while (temp != null) {  // Traverse and print the list
                  System.out.print(temp.data + " ");
                  temp = temp.next;
            }
            System.out.println();
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
