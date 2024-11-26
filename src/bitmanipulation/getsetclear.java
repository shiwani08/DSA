package bitmanipulation;

class GetSetClear {
      static void bitManipulation(int num, int i) {
            // code here

            int get, set, clear;
        
        // Get the bit at position i
        get = (num >> i) & 1;
        
        // Set the bit at position i
        set = num | (1 << i);
        
        // Clear the bit at position i
        clear = num & ~(1 << i);

        System.out.println("Get bit at position " + i + " is: " + get);
        System.out.println("Set bit at position " + i + " result: " + set);
        System.out.println("Clear bit at position " + i + " result: " + clear);
        }

        public static void main(String[] args) {
            int num = 0, i = 0;
            bitManipulation(num, i);
        }
}
