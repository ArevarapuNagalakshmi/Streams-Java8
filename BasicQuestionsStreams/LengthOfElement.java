package Streams.BasicQuestionsStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthOfElement {
    public static void main(String[] args) {
        List<String>l1= Arrays.asList("apple","banana","carrot","dall","elephant","fan","gate");
        System.out.println("Length of the Elements");
        List<String>l2=l1.stream()
                .map(a->a+"-"+a.length())
                .collect(Collectors.toList());
        System.out.println(l2);//op:apple-5
    }
}
