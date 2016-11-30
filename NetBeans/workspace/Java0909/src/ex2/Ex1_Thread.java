package ex2;

public class Ex1_Thread extends Thread{
    // 스레드에게 시킬 일을 정의 (run메서드)
    @Override
    public void run(){
        System.out.println("Thread 동작!");
        for(int i=0; i<5; i++){
            System.out.println("Current Thread : " + getName());
        }
//        try{
//            throw new InterruptedException();
//        }catch(InterruptedException ex){
//            ex.printStackTrace(); // 예외 발생 메세지에 main이 없다!(별도의 스택)
//        }
    }
    public static void main(String[] args) {
        System.out.println("메인 메서드 시작");
        Ex1_Thread ref = new Ex1_Thread();
//        ref.run(); // Thread에게 일을 시킨 메서드가 아님
        ref.start(); // 스레드에게 일을 시키기 위한 메서드
        System.out.println("메인 메서드 종료!");
        // ref.start(); // 안됨! 스레드는 생명주기를 가지고 있기 때문.
        // 한 번 시작 -> 실행 -> 종료 되면 다시 재사용 될 수 없다.
    }
}
