package test;

import org.junit.Test;

public class Solution {
    static String toCamelCase(String s){
        String[] temp=s.split("-|_");
        StringBuilder sb=new StringBuilder();
        temp[0].charAt(0);
        return "";
    }

    @Test
    public void testSolution(){
        String s="the_Stealth_Warrior";
        String[] temp=s.split("-|_");
        StringBuilder sb=new StringBuilder();
        for (String i:temp) {
            String first= String.valueOf(i.charAt(0));
            sb.append(first.toUpperCase());
            sb.append(i.substring(1,i.length()));
        }
        System.out.println(sb.toString());
    }
}
