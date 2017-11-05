package standard;

import util.Member;

import java.util.function.Predicate;

public class PredicateEx {


    public static void callPredicateFunctionalInterface(){

        Predicate<Member> memberPredicate = new Predicate<Member>() {
            @Override
            public boolean test(Member member) {
                if(member == null){
                    return false;
                }
                return true;
            }
        };

        System.out.println(memberPredicate.test(null));

        Predicate<Integer> predicate = (a) -> {return a > 0;};

        System.out.println(predicate.test(1));
        System.out.println(predicate.test(-1));

    }

}
