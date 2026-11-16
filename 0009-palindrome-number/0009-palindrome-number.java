class Solution {
    public boolean isPalindrome(int x) {

        // String s = String.valueOf(x);

        if(x<0){
            return false;
        }

        // int l = 0;
        // int r = s.length()-1;
        // while(l<=r){
        //     if(s.charAt(l) != s.charAt(r)){
        //         return false;
        //     }

        //     l++;
        //     r--;
        // }
        // return true;

        int original = x;
        int rev = 0;

        while(x != 0){
            
            rev = rev*10 + x%10;
            x /= 10;
        }

        return original == rev;
        


    }
}