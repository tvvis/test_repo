package test;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.lang.Math;

import static org.junit.Assert.assertEquals;

class eureka {
    public static List<Long> sumDigPow(long a, long b) {
        // your code
        List<Long> eureka=new ArrayList<Long>();
        int sum=0,num=0,tmp;
        for(long i=a;i<b;i++)
        {
            tmp=(int)i;
            while(tmp/10!=0){
                tmp=tmp/10;
                num++;
            }
            for(int j=num;j>=0;j--)
            {
                sum+=Math.pow(tmp%10,j+1);
                tmp=tmp/10;
            }
            if(sum==i){
                eureka.add(i);
            }
            sum=0;
            num=0;
        }
        return eureka;
    }

    public static void main(String[] args) {
        List<Long> eureka=sumDigPow(1,10);
        for (long a:eureka) {
            System.out.println(a);
        }
    }
}