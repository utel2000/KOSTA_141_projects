package ex1;

public class Ex1_StringBuffer {
    public static void main(String[] args) {
        // 버퍼의 길이가 늘어나는 정도는 기본적인 내용으로만
        // 이해 하고 있으면 된다. 버퍼 단위로 문자열을 저장해두는
        // 것 정도만 이해하고 있으면 된다.
        // 문자 x개를 더 넣으면 'x + 기본 용량(16)'을 기본 용량으로 준다.
        // "new StringBuffer("김길동")으로 하면 sb.capacity()는 19를 출력.
        StringBuffer sb = new StringBuffer("김길동"); 
        System.out.println("용량1 : "+sb.capacity()); // R: 19; 기본: 16
        System.out.println("길이1 : "+sb.length()); // R: 3; 기본: 0
        for(int i=1;i<=17;i++){
            sb.append(i);
        }
        System.out.println("길이2 : "+sb.length()); // R: 28
        System.out.println("용량1 : "+sb.capacity()); // R: 40
    }
}
