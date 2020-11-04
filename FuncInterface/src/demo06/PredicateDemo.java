package demo06;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        boolean b1 = usePredicate("hello", s -> s.length() > 6);
        System.out.println(b1);
        // negate
        boolean b2 = usePredicate("helloPredicate", s -> s.length() > 6);
        System.out.println(b2);
        // and
        System.out.println(useAndPredicate("helloAnd", s->s.equals("aaa"), s-> s.length() > 3));
        //or
        System.out.println(useOrPredicate("helloOr", s->s.equals("aaa"), s-> s.length() > 3));

    }

//    private static boolean usePredicate(String s, Predicate<String> predicate){
//        return predicate.test(s);
//    }

    private static boolean usePredicate(String s, Predicate<String> predicate){
        return predicate.negate().test(s);
    }

    private static boolean useAndPredicate(String s, Predicate<String> pre1, Predicate<String> pre2){
        return pre1.and(pre2).test(s);
    }

    private static boolean useOrPredicate(String s, Predicate<String> pre1, Predicate<String> pre2){
        return pre1.or(pre2).test(s);
    }
}
