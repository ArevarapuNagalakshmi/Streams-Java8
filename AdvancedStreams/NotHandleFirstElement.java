package Streams.AdvancedStreams;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class NotHandleFirstElement {
    public static void main(String[] args) {
        List<String>l1= Arrays.asList("harsha","sai","vamsi krishna","nagalakshmi","sravani","gayathri");
        String l2=l1.stream()
                .filter(a->a.length()>5)
                .findAny().orElseThrow(()->new NoSuchElementException("No value"));
        System.out.println(l2);
    }
}
