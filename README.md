# Lambda
람다식과 친숙해 지기위한 나만의 노오력!


1. Consumer 인터페이스
- accept() 추상메소드를 사용
- 파라미터를 받아서 사용만 하고 리턴값은 없다.

<br>

2. Supplier 인터페이스
- getXXX() 추상메소드를 사용
- 파라미터는 존재하지 않고, 무언가를 리턴해주기만 한다.(객체, boolean 등)

<br>

3. Function 인터페이스
- apply() 추상메소드를 사용
- 파라미터를 받아, 다른타입으로 return 한다.(같은 타입을 받아 같은타입으로 리턴하는 identity function 기능도 제공한다.)

<br>

4. Predicate 인터페이스
- test() 추상메소드를 사용
- T 라는 파라미터를 받아, boolean 값을 return 해준다.