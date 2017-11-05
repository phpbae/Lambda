package standard;


import util.Member;

import java.util.function.Function;

public class FunctionEx {

    public static void callFunctionFunctionalInterface() {

        //String 을 받아서, Interger 를 return
        Function<String, Integer> toInt = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        };
        System.out.println(toInt.apply("100"));

        Function mapping = (strObj)->{return new Member((String)strObj, 20);};
        Member member = (Member) mapping.apply("전설의이름");
        System.out.println(member.getName());

        //같은타입을 받아, 같은 타입을 뱉는 Identity function
        Function function = Function.identity();
        System.out.println(function.apply("999"));


    }
}
