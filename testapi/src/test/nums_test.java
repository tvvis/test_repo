package test;

import java.io.File;
import java.io.IOException;

public class nums_test {
    public static void main(String[] args) throws IOException {
        String s="test api";
        System.out.println(reverseWords(s));
    }

    private static String reverseWords(String s) {
        if(s.isEmpty()){
            return s;
        }
        StringBuilder a=new StringBuilder(s);
        String ans=a.reverse().toString();

        StringBuilder sb=new StringBuilder();
        int flag=0,temp=0,m=0;
        for(int i=ans.length()-1;i>=0;i--){
            char n=ans.charAt(i);
            if(n!=' '){
                sb.insert(m,n);
                flag=0;
                temp++;
            }
            else if(flag==0){
                flag=1;
                m+=temp+1;
                temp=0;
                sb.insert(m-1,n);
            }
        }
        return sb.toString();
    }
}



