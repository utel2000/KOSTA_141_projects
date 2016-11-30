package or.kosta.mvc.dao;
import org.springframework.stereotype.Repository;
@Repository
public class MyTesterBean {
	public MyTesterBean() {
		System.out.println("MyTesterBean");
	}
	// database작업 예시
	public boolean searchLogin(String id) {
		// SqlSessionTemplate로 조회
		if(id.equals("javabook")) {
			return true;
		}
		return false;
	}
	public String testerMsg() {
		return "Database 메세지! Message";
	}
}
