class Solution {
    public int firstUniqChar(String s) {
        
    

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for ( char ch : s.toCharArray() ) {

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

//        for (char ch : str.toCharArray() ) {
//            if (map.get(ch) == 1) {
//                return ch;
//            }
//        }


        for ( int i =0 ; i < s.length() ; i++ ) {

            if (map.get(s.charAt(i)) == 1) {
                return i;



            }
        }

        return -1;

}
}