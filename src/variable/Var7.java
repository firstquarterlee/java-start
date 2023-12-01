package variable;

public class Var7 {
    public static void main(String[] args) {
        int a = 100; //정수
        //int타입, int형식, int형 등으로 부른다. 특별히 구분하지 않고 섞어서 부르기 때문에 모두 같은 말로 이해하면 된다.
        double b = 10.5; //실수
        boolean c = true; //불리언(boolean) true, false 입력 가능
        char d = 'A'; //문자 하나, ex) 'A', '가'
        String e = "Hello Java"; //문자열, 문자열을 다루기 위한 특별한 타입

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        //리터럴 : 코드에서 개발자가 직접 적은 100, 10.5, true, 'A', "Hello Java"와 같은
        //고정된 값을 프로그래밍 용어로 리터럴(literal)이라 한다.
        //변수의 값은 변할 수 있지만 리터럴은 개발자가 직접 입력한 고정된 값이다. 따라서 리터럴 자체는 변하지 않는다.
        //참고 : 리터럴(literal)이라는 단어의 어원이 문자 또는 글자를 의미한다.
    }
}
