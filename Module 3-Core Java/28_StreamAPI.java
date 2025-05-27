import java.util.*;
import java.util.stream.Collectors;

public class StreamEven {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> even = nums.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());
        even.forEach(System.out::println);
    }
}
