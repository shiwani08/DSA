public class SecondLargest {
      public static void main(String[] args) {
            int arr [] = {6, 5, 6, 6, 6, 6};
            //largest = 6, sec_lar = 5
            int i, n = arr.length;
            int lar = Integer.MIN_VALUE, slar = Integer.MIN_VALUE;
            for (i = 0; i < n; i++) {
                  if(arr[i] > lar){
                        slar = lar;
                        lar = arr[i];
                  }
            }

            System.out.println("Largest: " + lar + " ,Second Largest: "+slar);
      }
}
