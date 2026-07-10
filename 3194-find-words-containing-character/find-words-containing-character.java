class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> arr = new ArrayList<>();
        int n=words.length;
        for(int i=0;i<n;i++){
            int m=words[i].length();
            for(int j=0;j<m;j++){
                if(words[i].charAt(j)==x){
                    arr.add(i);
                    break;
                }
            }
        }
        return arr;
    }
}