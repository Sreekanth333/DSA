package com.sreekanth;

public class Pngram1 {
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        boolean ans = checkIfPangram(str);
        System.out.println(ans);
    }
    static boolean checkIfPangram(String sentence) {
        for(char c='a';  c<='z'; c++){
            if(!sentence.contains(c+""))
                return false;
        }
        return true;
    }
}
