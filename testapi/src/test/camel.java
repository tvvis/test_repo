package test;

public class camel {
    public static String camelCase(String str) {
        // your code here
        if (str.isEmpty()) return str;
        String[] list=str.split(" ");
        String first="",nstr="";
        for(String s:list){
            if(!s.isEmpty())
                first=String.valueOf(s.charAt(0));
                if(s.length()==1)
                    nstr+=first;
                else
                    nstr+=first.toUpperCase()+s.substring(1,s.length());
        }
        return nstr;
    }

    public static void main(String[] args) {
        String str=" hello world";
        str=camelCase(str);
        System.out.println(str);
    }
}
