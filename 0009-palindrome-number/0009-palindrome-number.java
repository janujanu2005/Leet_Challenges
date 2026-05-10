class Solution {
    public boolean isPalindrome(int n) {
        int rem=0, rev=0, org=n;
        if(n<0)
        {
            return false;
        }
        while(n>0)
        {
            rem=n%10;
            rev=rev*10 + rem;
            n/=10;
        }
        return (rev==org);
    }
}