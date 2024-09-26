public class SearchinLL {
      public static void main(String[] args) {
            
      }
      static boolean searchKey(int n, Node head, int key) {
            boolean present = false;
            Node temp = head;

            while (n > 0) {
                  if(key == temp.data) {
                        present  = true;
                        break;
                  }
                  temp = temp.next;
            }
            return present;
      }
}
