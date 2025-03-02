class Solution {
    public String reversePrefix(String word, char ch) {
        
        int index = word.indexOf(ch);

        if(index == -1){
            return word;
        }

        StringBuilder str = new StringBuilder();

        for(int i=0; i<=index; i++){
            str.append(word.charAt(i));
        }
        
        str.reverse();

        String sb = word.substring(index + 1);
        return str.toString() + sb;
    }
}
