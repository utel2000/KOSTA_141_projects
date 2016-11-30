package ex3;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
// �ٽ� ����Ʈ: ���� �ڵ�� ������ ���� ������ �߿��ϴ�.
// 1. ������ 2. DI(setter) 3. init-method 4. ȣ�� �޼���(execute) 5. destroy-method ����
public class LifeAnnoService implements LifeInter {
	// @PostConstruct�� ������ bean���� init-method�� �ش�
	// @PreDestroy�� ������ bean���� destroy-method�� �ش�.
	// @Autowired�� �ڵ� �� ����
	private String msg;
	public LifeAnnoService() {
		service.LogFactory.getLogFactory().getLog("LifeAnnoService ������", msg);
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
