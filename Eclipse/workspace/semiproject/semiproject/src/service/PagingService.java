package service;

// ���� �� ��� ������ ���� ......
public class PagingService {
	private String pagingCode;

	public String getPagingCode() {
		return pagingCode;
	}

	public void setPagingCode(String pagingCode) {
		this.pagingCode = pagingCode;
	}

	public PagingService(int totalRecord, int nowPage, int numPerPage, int numPerBlock, String url) {
		// totalRecord : �� ������ ���� ����
		// nowPage : ���� ������
		// numPerPage : ������ �ټ� ����
		// numPerBlock : ������ ��� ����
		// url : �������̵� ���

		// ��ü ������ �� ��ü ��� �� ���ϱ�
		// �ѵ����Ϳ��� ������ �ټ��� ������ ��ü �������� ������
		// ��) ( 2 ) = 10/5
		// ( 2.1 ) = 13/10
		int totalPage = (int) Math.ceil((double) totalRecord / numPerPage);
		System.out.println("�� ������ : " + totalPage);
		// ��ü ��ϰ� ����
		int totalBlock = (int) Math.ceil((double) totalPage / numPerBlock);
		System.out.println("�� �� ���� : " + totalBlock);

		// 0.1.....1 | 1.1 .....2
		// ���� ��ϰ� ����
		// - ���� ������ ������ ������ ���� ���� ������ ���� ��ϰ��� ���ؾ� ��.
		int nowBlock = (int) Math.ceil((double) nowPage / numPerBlock);

		// ����, ���� , ����
		StringBuffer prev = new StringBuffer();
		StringBuffer next = new StringBuffer();
		StringBuffer paging = new StringBuffer();
		// ���������� ���ϱ�
		if (nowBlock > 1) { // nowBlock���� 1���� ũ�ٸ� ���������� ��ũ�� ����
			prev.append("<li> <a href='").append(url);
			prev.append("?nowPage=");
			prev.append((nowBlock - 2) * numPerBlock + 1);
			prev.append("'>��</a> </li>");
		} else {
			prev.append("<li class='disabled'><a href=''> �� </a> </li>");
		}
		// ������ ���
		for (int i = 0; i < numPerBlock; i++) {	

			int printPage = ((nowBlock - 1) * numPerBlock) + i + 1;
			if (printPage == nowPage) {
				paging.append("<li class='active'><a href=''>");
				paging.append(printPage);
				paging.append("</a></li>");
			} else {
				// ���� �������� �ƴ� ��� �������� ���� �θ� ��!
				paging.append("<li> <a href='");
				paging.append(url);
				paging.append("?nowPage=");
				paging.append(printPage).append("'>");
				paging.append(printPage);
				paging.append("</a> </li>");
			}
			if (printPage == totalPage) {
				break;
			}
		} // for�� ����
			// ���� ������ ����
		if (totalBlock > nowBlock) {
			next.append("<li> <a href='").append(url);
			next.append("?nowPage=");
			next.append(nowBlock * numPerBlock + 1);
			next.append("'>��").append("</a> </li>");

		} else {
			next.append("<li class='disabled'><a href=''> �� </a></li>");
		}
		// �ϼ��� �������� ����ʵ忡 ����!
		pagingCode = prev.toString() + paging.toString() + next.toString();
	}
}
