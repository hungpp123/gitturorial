/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hungnd62.testmaven;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
class ComparableTest {
    
    public static String longestConsec(String[] strarr, int k) {
        // your code
      if (k <= 0) return "";
      if (k >= strarr.length) return "";
      List<StringArray> lstStrArr = new ArrayList<>();
      for (int i =0 ; i < strarr.length; i++ ) {
        StringArray temp = new StringArray(strarr[i].length(), strarr[i]);
        lstStrArr.add(temp);
      } 
      Collections.sort(lstStrArr, Collections.reverseOrder());
      String finalStr = "";
      for (int j = 0; j < k; j++) {
        finalStr += lstStrArr.get(j);
      } 
      return finalStr;
    }
}
    class StringArray implements Comparable<StringArray> {
      private Integer strLength;
      private String str;
      public StringArray(int len, String content) {
        this.strLength = len;
        this.str = content;
      }
      public Integer getStrLength() {
        return this.strLength;
      }
      public void setStrLength(int len) {
        this.strLength = len;
      }
      public String getStr() {
        return this.str;
      }
      public void setStr(String strC) {
        this.str = strC;
      }
      @Override
      public int compareTo(StringArray d) {
        return this.getStrLength().compareTo(d.getStrLength());
      }
    }
