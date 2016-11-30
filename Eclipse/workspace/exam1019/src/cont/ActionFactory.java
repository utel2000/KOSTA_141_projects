package cont;

import model.Action;
import model.GugudanAction;
import model.HelloAction;
import model.TodayAction;

// �����尡 ����ϴ� ���̹Ƿ� '�̱���' �������� �������� �Ѵ�.
public class ActionFactory {
	private static ActionFactory factory;

	public synchronized static ActionFactory getFactory() {
		if (factory == null) {
			factory = new ActionFactory();
		}
		return factory;
	}

	public Action getAction(String cmd) {
		Action act = null;
		if (cmd.equals("index")) {

		} else if (cmd.equals("hello")) {
			act = new HelloAction();
		} else if (cmd.equals("today")) {
			act = new TodayAction();
		} else if (cmd.equals("gugudan")) {
			act = new GugudanAction();
		}
		return act;
	}
}
