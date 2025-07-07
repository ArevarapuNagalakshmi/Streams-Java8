package Streams.AdvancedStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WithDigitsInString {//With Digits
        public static void main(String[] args) {
            List<String> l1= Arrays.asList("345","papaya","hello","3456789","hea5vn78vn1","hdl4cmdb4545fv0jbf","help","123","bab6ba","madam");
            System.out.println("Print only the string elements excluding the digits:");
            List<String>l2=l1.stream()
                     .filter(a1->a1.matches(".*[0-9].*"))
                    // .sorted()
                    .collect(Collectors.toList());
            System.out.println(l2);

        }
    }


