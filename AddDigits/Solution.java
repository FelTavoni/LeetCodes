class Solution {
    public static int addDigits(int num) {
        int ret = 0;
        do {
            ret = 0;
            while (num != 0) {
                ret += num % 10;
                num = num / 10;
            }
            num = ret;
        } while (num >= 10);
        return ret;
    }

    public static void main(String[] args) {
        try {
            System.out.println(args[0] + " -> Adding it's digits -> " + addDigits(Integer.parseInt(args[0])));
        } catch (Exception e) {
            System.out.println("No argument was provided or is not a int. Calling standard example. Adding integers of 123: " + addDigits(123));
        }
    }
}