package com.testcompany.ds.day6;

public class LongCommonSubString {

    public int longestCommonSubstring(char str1[], char str2[]){
        int [][] arry = new int[str1.length +1][str2.length +1];
         int longest = 0;
         for(int i = 0 ; i < str1.length ; i++ ){
             for (int j = 0 ; j <  str2.length ; j++){
                 if (i ==0  || j == 0){
                     arry[i][j] =0;
                 }else if( str1[i -1] == str2[j- 1]){
                     arry[i][j] = arry[i -1][j-1] +1;
                     longest = Math.max(longest ,arry[i][j]);
                 }else {
                     arry[i][j] =0;
                 }
             }
         }

        return longest;
    }

    public static void main(String[] args) {

            LongCommonSubString lcs = new LongCommonSubString();
            char str1[] = "abcdefamitkumar".toCharArray();
            char str2[] = "zcdemfamitkumar".toCharArray();
            System.out.println(lcs.longestCommonSubstring(str1, str2));

        }

}
