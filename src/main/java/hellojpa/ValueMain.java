package hellojpa;

public class ValueMain {
    public static void main(String[] args) {

        Integer c = new Integer(10);
        Integer d = c;

        // c와 d는 공유 가능한 객체이지만 변경은 안됨.
        // c는 객체를 가지고 있는 인스턴스임. 그걸 d에 넣으면 c 값을 바꾸면 d값도 바뀜.
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        int a = 10;
        int b = a;

         a = 20;

         // a 와 b는 서로 공유가 되지 않은 상태.
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
