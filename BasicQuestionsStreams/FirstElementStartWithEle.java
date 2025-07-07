package Streams.BasicQuestionsStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class FirstElementStartWithEle {
    public static void main(String[] args) {
        List<String>l1= Arrays.asList("hi","hello","bag","batter","cat","cot","nkjadshy","lkjg");
        System.out.println("First Element in list starts with a letter");
        Optional<String> l2=l1.stream()
                .filter(a->a.startsWith("c"))
                .findFirst();
        if(l2.isPresent()){
            String str=l2.get();
            System.out.println(str);
        }else {
            System.out.println("No words stsrt with c");
        }
    }
}
