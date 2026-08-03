class Solution {
    public static void main(String[] args) {
        System.out.println(evenlyDivides(123));
    }
    static int evenlyDivides(int n) {
        // code here
        int count=0;
        int m = n;
        int a = 0;

        while(n!=0) {
            a = n % 10;
            n = n / 10;
            if (a != 0 && m % a == 0) {
                count++;
            }
        }
       return count;
    }
}