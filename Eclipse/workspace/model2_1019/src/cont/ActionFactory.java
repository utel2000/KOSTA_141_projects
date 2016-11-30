package cont;

import model.Action;
import model.HelloAction;
import model.SBoardAddAction;
import model.SBoardFormAction;
import model.SBoardListAction;

// �����尡 ����ϴ� ���̹Ƿ� '�̱���' �������� �������� �Ѵ�.
public class ActionFactory {
	private static ActionFactory factory;

	public synchronized static ActionFactory getFactory() {
		if (factory == null) {
			factory = new ActionFactory();
		}
		return factory;
	}
	public Action getAction(String cmd){
		Action act = null;
		if(cmd.equals("index")) {
			
		} else if(cmd.equals("hello")){
			act = new HelloAction();
		} else if(cmd.equals("sform")){
			act = new SBoardFormAction();
		} else if(cmd.equals("sadd")){
			act = new SBoardAddAction();
		} else if(cmd.equals("slist")){
			act = new SBoardListAction();
		}
		return act;
	}
}