package action;

import com.opensymphony.xwork2.Action;

import dao.ForumCommentsDao;

public class ForumDeleteCommentAction implements Action{
	// 넘겨받은 댓글 기본키를 조건으로 삭제한다.
	private int c_num; // setter
	// 다시 돌아갈 detail페이지의 기본키
	private int f_num; // setter, getter
	// 포럼 리스트에서의 현재 페이지 값
	private int nowPage; // setter, getter
	@Override
	public String execute() throws Exception {
		// log start
		StringBuffer log = new StringBuffer();
		log.append("----------\n")
		.append("<ForumDeleteCommentAction.java> - public String execute()\n")
		.append("[Log] f_num : ").append(f_num);
		System.out.println(log);
		log.delete(0, log.length());
		// log end
		
		ForumCommentsDao.getDao().deleteComment(c_num);
		return SUCCESS;
	}
	public void setC_num(int c_num) {
		this.c_num = c_num;
	}
	public int getF_num() {
		return f_num;
	}
	public void setF_num(int f_num) {
		this.f_num = f_num;
	}
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
}
