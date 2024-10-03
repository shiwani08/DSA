public class InsertNodeAtP {
      public static void main(String[] args) {
            LinkedList list = new LinkedList();
            InsertNodeAtP ob = new InsertNodeAtP();
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);

            // Display the elements of the linked list
            System.out.println("Linked List:");
            list.display();  

            list.head = ob.addNode(list.head, 2, 0);
            list.display();
      }
      Node addNode(Node head, int p, int x) {
            int count = 0;
            Node temp = head;
        
            // If the list is empty, add the new node as the head
            if (head == null) {
                head = new Node(x);
                return head;
            }
        
            // Traverse the list until we reach the position p
            while (temp != null && count < p) {
                temp = temp.next;
                count++;
            }
        
            // If we reach position p, insert the new node
            if (count == p && temp != null) {
                Node newNode = new Node(x);
                newNode.next = temp.next;
                newNode.prev = temp;
        
                if (temp.next != null) {
                    temp.next.prev = newNode;
                }
                temp.next = newNode;
            }
        
            return head;
        }
        
}
