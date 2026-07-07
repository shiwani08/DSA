class Solution {
    public long sumAndMultiply(int n) {
        int last_d = 0, face = 0;
        long sum = 0, num = 0;
        long ans;

        while (n > 0) {
            last_d = n % 10;
            
            if(last_d != 0) {
                sum = sum + last_d;
                num = last_d * (int)Math.pow(10, face) + num;
                face++;
            }  

            n = n / 10;
        }

        ans = num * sum;
        return ans;
    }
}