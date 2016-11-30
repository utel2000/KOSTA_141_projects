package ex1;

public class DaoImple implements DaoInter {
	@Override
	public void first() {
//		long start = System.currentTimeMillis();
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i + " ");
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		System.out.println("End");
//		long end = System.currentTimeMillis();
		
	}
	@Override
	public String second() {
		StringBuffer sb = new StringBuffer();
		sb.append("----------\n")
		.append("김길동\n")
		.append("----------\n");
		return sb.toString();
	}

	@Override
	public void third() {
		//예외의 상황에 사용
		String[] ar = {"메세지1","메세지2","메세지3","메세지4","메세지5"};
		for(int i=0; i<=ar.length; i++){
			System.out.println("비지니스 로직의"+ar[i]);
		}
	}
	
}
