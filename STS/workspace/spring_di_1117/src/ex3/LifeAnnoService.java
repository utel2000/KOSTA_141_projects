package ex3;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
// 핵심 포인트: 예전 코드와 동일한 실행 순서가 중요하다.
// 1. 생성자 2. DI(setter) 3. init-method 4. 호출 메서드(execute) 5. destroy-method 순서
public class LifeAnnoService implements LifeInter {
	// @PostConstruct는 예전에 bean에서 init-method에 해당
	// @PreDestroy는 예전에 bean에서 destroy-method에 해당.
	// @Autowired는 자동 빈 묶기
	private String msg;
	public LifeAnnoService() {
		service.LogFactory.getLogFactory().getLog("LifeAnnoService 생성자", msg);
	}
	@Autowired
	public void setMsg(String msg) {
		this.msg = msg;
		service.LogFactory.getLogFactory().getLog("setMsg", msg);
	}
	@PostConstruct
	@Override
	public void init() {
		service.LogFactory.getLogFactory().getLog("msg init",msg);
	}
	@PreDestroy
	@Override
	public void destroy() {
		service.LogFactory.getLogFactory().getLog("msg destroy", msg);
	}
	@Override
	public void execute() {
		service.LogFactory.getLogFactory().getLog("execute", msg);
	}
}
