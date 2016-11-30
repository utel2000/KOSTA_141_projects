package service;

// 정리 한 대로 로직을 이해 ......
public class PagingService {
	private String pagingCode;

	public String getPagingCode() {
		return pagingCode;
	}

	public void setPagingCode(String pagingCode) {
		this.pagingCode = pagingCode;
	}

	public PagingService(int totalRecord, int nowPage, int numPerPage, int numPerBlock, String url) {
		// totalRecord : 총 데이터 수를 저장
		// nowPage : 현재 페이지
		// numPerPage : 페이지 줄수 설정
		// numPerBlock : 페이지 블록 설정
		// url : 페이지이동 경로

		// 전체 페이지 및 전체 블록 값 구하기
		// 총데이터에서 페이지 줄수를 나누면 전체 페이지가 구해짐
		// 예) ( 2 ) = 10/5
		// ( 2.1 ) = 13/10
		int totalPage = (int) Math.ceil((double) totalRecord / numPerPage);
		System.out.println("총 페이지 : " + totalPage);
		// 전체 블록값 연산
		int totalBlock = (int) Math.ceil((double) totalPage / numPerBlock);
		System.out.println("총 블럭 구간 : " + totalBlock);

		// 0.1.....1 | 1.1 .....2
		// 현재 블록값 연산
		// - 현재 페이지 값에서 페이지 제한 수를 나눠서 현재 블록값을 구해야 함.
		int nowBlock = (int) Math.ceil((double) nowPage / numPerBlock);

		// 이전, 다음 , 현재
		StringBuffer prev = new StringBuffer();
		StringBuffer next = new StringBuffer();
		StringBuffer paging = new StringBuffer();
		// 이전페이지 구하기
		if (nowBlock > 1) { // nowBlock값이 1보다 크다면 이전페이지 링크를 구현
			prev.append("<li> <a href='").append(url);
			prev.append("?nowPage=");
			prev.append((nowBlock - 2) * numPerBlock + 1);
			prev.append("'>◀</a> </li>");
		} else {
			prev.append("<li class='disabled'><a href=''> ◁ </a> </li>");
		}
		// 페이지 출력
		for (int i = 0; i < numPerBlock; i++) {	

			int printPage = ((nowBlock - 1) * numPerBlock) + i + 1;
			if (printPage == nowPage) {
				paging.append("<li class='active'><a href=''>");
				paging.append(printPage);
				paging.append("</a></li>");
			} else {
				// 현재 페이지가 아닐 경우 페이지의 차를 두면 됨!
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
		} // for문 종료
			// 다음 페이지 구현
		if (totalBlock > nowBlock) {
			next.append("<li> <a href='").append(url);
			next.append("?nowPage=");
			next.append(nowBlock * numPerBlock + 1);
			next.append("'>▶").append("</a> </li>");

		} else {
			next.append("<li class='disabled'><a href=''> ▷ </a></li>");
		}
		// 완성된 페이지를 멤버필드에 저장!
		pagingCode = prev.toString() + paging.toString() + next.toString();
	}
}
