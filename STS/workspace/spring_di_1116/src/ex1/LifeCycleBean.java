package ex1;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
public class LifeCycleBean implements LifeCheckable, BeanNameAware, BeanFactoryAware {
	private String mType;
	private String beanName; // 주입받을 객체들을 선언 !
	private BeanFactory beanFactory;
	// 생성자
	public LifeCycleBean() {
		System.out.println("생성자 호출!");
	}
	// Spring에 의해서 호출 될 메서드 init, destroy
	@Override
	public void init() {
		System.out.println("init 메서드 호출!");
	}
	@Override
	public void destroy() {
		System.out.println("destroy 메서드 호출!");
	}
	@Override
	public void execute() {
		System.out.println("execute 메서드 호출!");
		service.LogFactory.getLogFactory().getLogHeader("LifeCycleBean.java", "public void execute()");
		service.LogFactory.getLogFactory().getLog("beanName", beanName);
		// 주입 받은 BeanFactory로 부터 Bean의 주소를 획득.
		OtherBean ob = beanFactory.getBean("other", OtherBean.class);
		service.LogFactory.getLogFactory().getLog("ob.getPrintMsg()", ob.getPrintMsg());
	}
	// DI
	public void setMType(String mType) {
		System.out.println("setter 호출!");
		this.mType = mType;
	}
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		this.beanFactory = arg0;
	}
	@Override
	public void setBeanName(String arg0) {
		this.beanName = arg0;
		
	}
}
