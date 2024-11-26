public class gcd {
      public static void main(String[] args) {
            int a = 520, b = 10, gcd = 1;

            System.out.print("The gcd of "+a+" and "+b+" is: ");
            while (a > 0 && b > 0) {
                  if(a > b)
                  a = a % b;

                  else 
                  b = b % a;
            }
            if(a == 0)
            gcd = b;
            
            else
            gcd = a;

            System.out.println(gcd);
      }
}
