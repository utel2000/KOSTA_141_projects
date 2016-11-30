package exam;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
public class ExamBeanImple implements ExamBeanInter, BeanFactoryAware {
	private BeanFactory beanFactory;
	private ExamTypeInter eti;
	// 현재 빈이 생성된 후 condition(조건)에 따라서 빈을 선택하도록 구현하고
	@Override
	public void callExecuteBean(String condition) {
			eti = beanFactory.getBean(condition, ExamTypeInter.class);
	}
	// 빈의 메서드를 호출해서 문자열로 돌려주는 메서드
	@Override
	public String getMessageBean() {
		return eti.message();
	}
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		beanFactory = arg0;
	}
	
}
