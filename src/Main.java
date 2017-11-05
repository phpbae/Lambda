import signiture.CalculationFunction;
import signiture.ExFunction;
import signiture.ExFunction2;
import standard.ConsumerEx;
import standard.FunctionEx;
import standard.PredicateEx;
import standard.SupplierEx;
import util.AddClass;
import util.Member;

public class Main {

    public static void main(String[] args) {


        CalculationFunction addFunction = (num1, num2) -> {
            return num1 + num2;
        };
        CalculationFunction subtractFunction = (num1, num2) -> {
            return num1 - num2;
        };
        CalculationFunction devideFunction = (num1, num2) -> {
            return num1 / num2;
        };
        CalculationFunction multiplyFunction = (num1, num2) -> {
            return num1 * num2;
        };

        //이런식도 가능
        CalculationFunction addFunction2 = (num1, num2) -> {return new AddClass(num1, num2).add();};

        //특정 객체의 메소드 참조로 구현해서 아래와 같이도 표현 가능.
        AddClass addClass = new AddClass();
        CalculationFunction addFunction3 = addClass::add2; //add는 에러가 난다. 왜? 그건 시그니처 메소드와 관련이 있다 ~_~;;
        //시그니처 메소드를 보면 int 타입을 2개 받는게 되어있는데, 메소드 참조를 할때, 컴파일러는 int를 받고 int를 뱉는 이조건에 일치해야 에러를 뱉지 않음.

        System.out.println(processAdd(addFunction, 2, 2));
        System.out.println(processAdd(subtractFunction, 2, 3));
        System.out.println(processAdd(devideFunction, 6, 2));
        System.out.println(processAdd(multiplyFunction, 2, 9));

        System.out.println(processAdd(addFunction2, 3,3));
        System.out.println(processAdd(addFunction3, 4, 4));


        //생성자 참조를 이용하는 방식.
        ExFunction createMemberFunction = Member::new;
        System.out.println(createMemberFunction.getMemberObject());
        Member member = new Member();
        createMemberFunction = member::createObj;
        System.out.println(createMemberFunction.getMemberObject());

        //앗 생성자가 파라미터가 있는데 우짬?
        //그럼 시그니쳐 메소드가 2개의 파라미터를 받고 Member 객체를 뱉는 메소드라는걸 명시
        ExFunction2 createMemberFunction2 = Member::new;
        System.out.println(createMemberFunction2.getMemeber("전설",100).getName());


        System.out.println("------------------------------------------------------------------");
        //자바에서 제공하는 함수형 인터페이스
        //1. Consumer
        ConsumerEx.callConsumerFunctionalInterface();

        System.out.println("------------------------------------------------------------------");
        //자바에서 제공하는 함수형 인터페이스
        //2. Supplier
        SupplierEx.callSupplierFunctionalInterface();

        System.out.println("------------------------------------------------------------------");
        //자바에서 제공하는 함수형 인터페이스
        //3. Function
        FunctionEx.callFunctionFunctionalInterface();

        System.out.println("------------------------------------------------------------------");
        //자바에서 제공하는 함수형 인터페이스
        //4. Predicate
        PredicateEx.callPredicateFunctionalInterface();

    }


    public static int processAdd(CalculationFunction function, int num1, int num2){
        return function.executeCalculation(num1,num2);
    }

}
