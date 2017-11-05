package standard;


import util.Member;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerEx {

    public static void callConsumerFunctionalInterface() {

        //파라미터를 받아서, return 값은 없고, 사용만합니다 ^^
        Consumer consumer = o -> {
            System.out.println(o.toString());
        };
        consumer.accept(new Member());

        BiConsumer biConsumer = (o, o2) -> {
            System.out.println(o);
            System.out.println(o2);
        };

        biConsumer.accept("StringObj1", "StringObj2");

        Consumer<String> toPrint = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        toPrint.accept("우아아앙!");

    }

}
