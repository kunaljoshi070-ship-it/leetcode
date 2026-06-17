class Solution {
    public char processStr(String s, long k) {
        long length = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '*'){
                if(length > 0){
                    length--;
                }
                continue;
            }

            if(s.charAt(i) == '#'){
                length *= 2;
                continue;
            }

            if(s.charAt(i) == '%'){
                continue;
            }

            length++;
        }

        if(k>=length){
            return '.';
        }

        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) == '*'){
                length++;
                continue;
            }
            if(s.charAt(i) == '#'){
                length = length/2;
                if(k>=length){
                    k = k - length;
                }
                continue;
            }
            if(s.charAt(i) == '%'){
                k = length - 1 - k;
                continue;
            }
            if(k == length-1){
                return s.charAt(i);
            }

            length--;
        }
        return '.';
    }
}