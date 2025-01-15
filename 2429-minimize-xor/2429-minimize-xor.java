class Solution {
    public int minimizeXor(int num1, int num2) {
        int targetBits = Integer.bitCount(num2);
        int diffBits = targetBits - Integer.bitCount(num1);
        int bitMask = 1;
        
        while (diffBits != 0) {
            if (diffBits < 0 && (num1 & bitMask) != 0) {
                num1 ^= bitMask;
                diffBits++;
            } else if (diffBits > 0 && (num1 & bitMask) == 0) {
                num1 |= bitMask;
                diffBits--;
            }
            bitMask <<= 1;
        }
        
        return num1;
    }
}
