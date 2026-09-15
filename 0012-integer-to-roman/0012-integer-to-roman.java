class Solution {
    public String intToRoman(int num) {
        StringBuilder ans = new StringBuilder();

        int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] rom = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < 13; i++) {
            while (num >= val[i]) {
                ans.append(rom[i]);
                num -= val[i];
            }
        }

        return ans.toString();
    }
}