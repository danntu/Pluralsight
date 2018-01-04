package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> p1 = s->s.length()<20;
        Predicate<String> p2 = s->s.length()>10;
        Predicate<String> p3 = p1.and(p2);

        Predicate<String> id = Predicate.isEqual(new Object());

        List<String> strings =
                Arrays.asList("one","two","three","four","five");
        List<String> result =  new ArrayList<>();
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = result::add;
        strings.forEach(c1.andThen(c2));
        System.out.println("size of result = "+result.size());
    }
}
