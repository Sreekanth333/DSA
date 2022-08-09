package com.sreekanth;

public class Pangram {
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        boolean ans = checkIfPangram(str);
        System.out.println(ans);
    }
    static boolean checkIfPangram(String sentence){
        char[] ch = new char[sentence.length()];
        for(int i =0 ;i<sentence.length();i++){
            ch[i] = sentence.charAt(i);
        }
        int count =0;
        for(char c ='a';c<='z';c++){
            char target =c;
            for (int i = 0;i< ch.length;i++){
                if(target == ch[i]){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
        if(count >= 26){
            return true;
        }

        return false;
    }
}
