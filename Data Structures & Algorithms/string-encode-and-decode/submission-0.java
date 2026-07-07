class Solution {

    public String encode(List<String> strs) {
        StringBuilder ans = new StringBuilder();
        for (String word:strs){
            ans.append(word.length());
            ans.append('#');
            ans.append(word);
        }
        return ans.toString();
    
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();

        int i = 0;

        while(i < str.length()){

            int j = i;

            while(str.charAt(j) != '#'){
                j++;
            }

            int length = Integer.parseInt(str.substring(i,j));

            String word = str.substring(j+1, j+1+length);

            ans.add(word);

            i = j + 1 + length;

        }

        return ans;
    }
}
