class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");
        for(String i:arr){
            sb.append(new StringBuilder(i).reverse());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}