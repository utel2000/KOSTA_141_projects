package service;

import vo.ForumSearchPagingVO;
import vo.PagingVO;

public class ForumSearchPaging {
	private String pagingCode; // set/get 추가하기
	public ForumSearchPaging(int totalRecord, int nowPage, int numPerPage, int numPerBlock, String url, ForumSearchPagingVO fspvo) {
		// totalRecord : 총 데이터 수를 저장
		// nowPage : 현재 페이지, 항상 변경되는 값이며 페이지 연산의 기준이 되는 값!
		// numPerPage : 페이지당 몇 줄씩 보여질 것인지..
		// numPerBlock : 페이지 [1][2]... 블록을 몇 개로 제한할 값
		// url : 페이지 이동경로를 저장
		// 전체 페이지 값 및 전체 블록 값 구하기
		// 전체 페이지가 2페이지 있으면
		// 1.1 -> 2페이지 10/6 = 1.111 -> 2 페이지가 되기 위해서는 올림처리를 해주어야 한다.
		// Math.ceil()를 사용하면 된다.
		int totalPage = (int) Math.ceil((double)totalRecord / numPerPage); 
		// 전페 블록 값을 구한 값
		// 연산결과 : 1페이지부터 1 1 1 1 1 -> 6페이지 1.1 1.2 1.3
		int totalBlock = (int) Math.ceil((double)totalPage / numPerBlock);
		// 현재 페이지 값에서 페이지 제한 수를 나누어서 현재 블록의 값을 구해야 한다.
		int nowBlock = (int) Math.ceil((double)nowPage / numPerBlock);
		// 이전 페이지를 구현
		StringBuffer prev = new StringBuffer();
		// 다음 페이지 구현
		StringBuffer next = new StringBuffer();
		// 페이지 값 구현
		StringBuffer paging = new StringBuffer();
		// -----------------------------
		// 이전 페이지 구하는 공식
		if(nowBlock > 1) { // nowBlock이 1보다 크다면 이전 페이지의 링크를 구현
			prev.append("<button type='button' class='btn btn-primary' onclick='forumSearchPage(")
			.append((nowBlock - 2) * numPerBlock + 1)
			.append(")'>이전</button>");
		} else {
			prev.append("<button type='button' class='btn btn-primary' disabled>이전</button>");
		}
		// 페이지 출력
		for(int i=0; i<numPerBlock; i++) {
			// 출력되는 페이지 값
			int printPage = ((nowBlock-1)*numPerBlock)+i+1;
			if(printPage == nowPage) { // 현재 페이지일 경우
				// [1] [2] 3 [4] [5] 현재 페이지가 링크가 안걸린다.
//				paging.append("<font color='olive'>")
//				.append(printPage).append("</font>&nbsp;&nbsp;");
				paging.append("<button type='button' class='btn btn-primary' id='btn_nowPage'>")
				.append(printPage).append("</button>");
				
				
			} else {
				// 현재 페이지가 아닐 경우에는 페이지의 차이를 두면 된다.
				paging.append("<button type='button' class='btn btn-primary' onclick='forumSearchPage(")
				.append(printPage).append(")'>")
				.append(printPage).append("</button>");
			}
			// 전체 페이지와 같다면, 페이지 출력문을 빠져 나와야 한다.
			if(printPage == totalPage) {
				break;
			}
		} // for문 종료
		
		// 다음 페이지를 구현 : totalBlock이 nowBlock보다 클 경우
		if(totalBlock > nowBlock) {
			next.append("<button type='button' class='btn btn-primary' onclick='forumSearchPage(")
			.append(nowBlock*numPerBlock+1)
			.append(")'>다음</button>");
		} else {
			next.append("<button type='button' class='btn btn-primary' disabled>다음</button>"); 
			
		}
		// 페이지가 완성 되었으면 조합된 페이지 코드에 저장
		pagingCode = prev.toString() + paging.toString() + next.toString();
	}
	public String getPagingCode() {
		return pagingCode;
	}
	public void setPagingCode(String pagingCode) {
		this.pagingCode = pagingCode;
	}
}
