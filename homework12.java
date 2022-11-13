class homework12{
    public boolean isPalindrome(int x) {

        String num = x + "";
        int l = num.length();

        for(int i = 0;i < l/2;i++){
            if(num.charAt(i) == num.charAt(l - 1 - i)){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
