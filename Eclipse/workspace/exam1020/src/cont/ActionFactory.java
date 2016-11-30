package cont;

import model.Action;
import model.LoginAction;
import model.LoginFormAction;
import model.LoginIDChkAction;

// 쓰레드가 사용하는 것이므로 '싱글턴' 패턴으로 만들어줘야 한다.
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
			
		} else if (cmd.equals("loginForm")) {
			act = new LoginFormAction();
		} else if (cmd.equals("idchk")) {
			act = new LoginIDChkAction();
		} else if (cmd.equals("login")) {
			act = new LoginAction();
		} else if (cmd.equals("logout")) {
			
		}
		return act;
	}
}
