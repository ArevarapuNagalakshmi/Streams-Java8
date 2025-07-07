package Streams.Part2StramApi.Intermediates;

import java.util.Arrays;
import java.util.List;
//First number that is greater than 50
public class FirstNumber {
    public static void main(String[] args) {
        List<Integer>l1= Arrays.asList(10,20,30,40,50,60);
        int b=l1.stream()
                .filter(i->i>50)
                .findFirst()
                .get();
        System.out.println(b);

        int[] a=new int[]{10,50,70,80,90,100};
    int a1=Arrays.stream(a)
                .filter(i->i>50)
                .findFirst()
                .getAsInt();
        System.out.println(a1);
    }
}
