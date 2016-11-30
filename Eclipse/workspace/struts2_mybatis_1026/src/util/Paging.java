package util;

public class Paging {
	private String pagingCode; // set/get �߰��ϱ�
	public Paging(int totalRecord, int nowPage, int numPerPage, int numPerBlock, String url) {
		// totalRecord : �� ������ ���� ����
		// nowPage : ���� ������, �׻� ����Ǵ� ���̸� ������ ������ ������ �Ǵ� ��!
		// numPerPage : �������� �� �پ� ������ ������..
		// numPerBlock : ������ [1][2]... ����� �� ���� ������ ��
		// url : ������ �̵���θ� ����
		// ��ü ������ �� �� ��ü ��� �� ���ϱ�
		// ��ü �������� 2������ ������
		// 1.1 -> 2������ 10/6 = 1.111 -> 2 �������� �Ǳ� ���ؼ��� �ø�ó���� ���־�� �Ѵ�.
		// Math.ceil()�� ����ϸ� �ȴ�.
		int totalPage = (int) Math.ceil((double)totalRecord / numPerPage);
		// ���� ��� ���� ���� ��
		// ������ : 1���������� 1 1 1 1 1 -> 6������ 1.1 1.2 1.3
		int totalBlock = (int) Math.ceil((double)totalPage / numPerBlock);
		// ���� ������ ������ ������ ���� ���� ����� ���� ����� ���� ���ؾ� �Ѵ�.
		int nowBlock = (int) Math.ceil((double)nowPage / numPerBlock);
		// ���� �������� ����
		StringBuffer prev = new StringBuffer();
		// ���� ������ ����
		StringBuffer next = new StringBuffer();
		// ������ �� ����
		StringBuffer paging = new StringBuffer();
		// -----------------------------
		// ���� ������ ���ϴ� ����
		if(nowBlock > 1) { // nowBlock�� 1���� ũ�ٸ� ���� �������� ��ũ�� ����
			prev.append("<a href='").append(url).append("?nowPage=")
			.append((nowBlock - 2) * numPerBlock + 1).append("'>��</a>&nbsp;&nbsp;");
		} else {
			prev.append("��&nbsp;&nbsp;");
		}
		// ������ ���
		for(int i=0; i<numPerBlock; i++) {
			// ��µǴ� ������ ��
			int printPage = ((nowBlock-1)*numPerBlock)+i+1;
			if(printPage == nowPage) { // ���� �������� ���
				// [1] [2] 3 [4] [5] ���� �������� ��ũ�� �Ȱɸ���.
				paging.append("<font color='olive'>")
				.append(printPage).append("</font>&nbsp;&nbsp;");
			} else {
				// ���� �������� �ƴ� ��쿡�� �������� ���̸� �θ� �ȴ�.
				paging.append("<a href='").append(url)
				.append("?nowPage=").append(printPage).append("'>")
				.append(printPage).append("</a>&nbsp;&nbsp;");
			}
			// ��ü �������� ���ٸ�, ������ ��¹��� ���� ���;� �Ѵ�.
			if(printPage == totalPage) {
				break;
			}
		} // for�� ����
		// ���� �������� ���� : totalBlock�� nowBlock���� Ŭ ���
		if(totalBlock > nowBlock) {
			next.append("<a href='").append(url)
			.append("?nowPage=").append(nowBlock*numPerBlock+1)
			.append("'>��").append("</a>");
		} else {
			next.append("��");
		}
		// �������� �ϼ� �Ǿ����� ���յ� ������ �ڵ忡 ����
		pagingCode = prev.toString() + paging.toString() + next.toString();
	}
	public String getPagingCode() {
		return pagingCode;
	}
	public void setPagingCode(String pagingCode) {
		this.pagingCode = pagingCode;
	}
}
