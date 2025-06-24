class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();

        int p= num.length -1;

        int carry = 0;

        while(p>=0 || k>0 || carry >0){
            int numval= 0;

            if(p>=0){
                numval=num[p];
            }

            int d= k%10; //it is the last digit from k
            int sum= numval+ d+ carry;

            int digit = sum%10;
            carry=sum/10;

            ans.add(digit);

            p--;
            k=k/10; //removing the last digit from k
        }

        Collections.reverse(ans);
        return ans;
    }
}