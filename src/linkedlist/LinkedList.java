class Node {
      int data;
      Node next;
      Node prev;
      // Constructor to create a new node
      Node(int data) {
          this.data = data;
          this.next = null;
          this.prev = null;
      }
  }
  
  public class LinkedList {
      Node head;
  
      // Method to add an element to the end of the list
      public void add(int data) {
          Node newNode = new Node(data);
  
          // If the list is empty, the new node becomes the head
          if (head == null) {
              head = newNode;
          } else {
              // Traverse to the last node
              Node temp = head;
              while (temp.next != null) {
                  temp = temp.next;
              }
  
              // Add the new node at the end
              temp.next = newNode;
          }
      }
  
      // Method to display the linked list
      public void display() {
          Node temp = head;
  
          // Traverse the list and print each node's data
          while (temp != null) {
              System.out.print(temp.data + " ");
              temp = temp.next;
          }
          System.out.println();
      }
  }
  