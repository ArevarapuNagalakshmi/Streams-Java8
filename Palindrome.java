package Streams;

import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
        String s="madam";
        boolean a= IntStream.range(0,s.length()/2)
                .allMatch(i->s.charAt(i)==s.charAt(s.length()-1-i));
        System.out.println(a);
    }
}
