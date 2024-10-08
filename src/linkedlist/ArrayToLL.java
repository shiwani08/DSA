// NEVER EVER tamper the head of a LL
// in case of arrays - we need to print the entire array. in case of LL, we need to print the head, the rest is taken care of by tracking


public class ArrayToLL {
      public static void main(String[] args) {
            int a[] = {1,2,3,4,5,6};
            Node head = new Node(a[0]);
            Node mover = head;
            Node temp;
            int i, length = 0;
            for (i = 1; i < a.length; i++) {
                  temp = new Node(a[i]);
                  mover.next = temp;      // mover should point to the next element which is stored at temp
                  mover = temp;
            }
            System.out.println(head);
            System.out.println(head.data);
            System.out.println(mover);    //pointer to the last element
            System.out.println(mover.data);

            System.out.println("the linkedlist is: ");

            temp = head;
            while (temp != null) {
                  System.out.print(temp.data + " ");
                  temp = temp.next;
                  length++;
            }
            System.out.println();
            System.out.println("The length of the linkedlist is: " + length);
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
