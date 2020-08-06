package test;

import java.util.Random;

public class random_test {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            int num=new Random().nextInt();
            System.out.println(num);
        }
    }
}
