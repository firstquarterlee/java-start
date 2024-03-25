package array;

public class Array1Ref1 {
    public static void main(String[] args) {
        int[] students; //배열 변수 선언
        students = new int[5]; //배열 생성 //5개 int를 담을 수 있는 배열을 만든거임
        //new 는 새로 생성한다는 뜻
        //int[5]는 int형 변수 5개를 다룰 수 있는 배열을 새로 만든다는 뜻이다.

        System.out.println(students);

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        //변수 값 사용
        System.out.println("학생1 점수: " + students[0]);
        System.out.println("학생2 점수: " + students[1]);
        System.out.println("학생3 점수: " + students[2]);
        System.out.println("학생4 점수: " + students[3]);
        System.out.println("학생5 점수: " + students[4]);
    }
}
