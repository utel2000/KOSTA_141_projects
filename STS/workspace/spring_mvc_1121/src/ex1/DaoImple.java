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
		.append("��浿\n")
		.append("----------\n");
		return sb.toString();
	}

	@Override
	public void third() {
		//������ ��Ȳ�� ���
		String[] ar = {"�޼���1","�޼���2","�޼���3","�޼���4","�޼���5"};
		for(int i=0; i<=ar.length; i++){
			System.out.println("�����Ͻ� ������"+ar[i]);
		}
	}
	
}
