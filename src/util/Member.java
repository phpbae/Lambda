package util;

public class Member {

    String name;
    int age;

    public Member() {

    }

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Member createObj(){
        return new Member();
    }
}
