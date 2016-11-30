package or.kosta.spring.exception;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
// ��� ��û�� ���� ��鿡�� ���ܰ� �߻����� �� ����� ����
// ���ܸ� �ϳ��� �����ϴ� ���
@ControllerAdvice
public class MyExceptionHandler {
	@ExceptionHandler(Exception.class)
	public String myHandlerException(Exception e) {
		// ModelAndView�� ����� ������!
		String returnVal =  "exception";
		if(e instanceof ArrayIndexOutOfBoundsException) {
			returnVal = "arrayException";
		}
		System.out.println("���ܰ� �߻��Ͽ����ϴ�.!");
		return returnVal;
	}
}
