package util;
public class LogFactory {
	private StringBuffer log = new StringBuffer();
	public void getLogHeader(String fileName) {
		log.append("----------\n")
		.append("<").append(fileName).append(">");
		System.out.println(log);
		log.delete(0, log.length());
	}
	public void getLogHeader(String fileName, String methodName) {
		log.append("----------\n")
		.append("<").append(fileName).append("> - ").append(methodName);
		System.out.println(log);
		log.delete(0, log.length());
	}
	public void getLog(String varName, boolean var) {
		log.append("[Log] ").append(varName).append(": ").append(var).append("\n");
		System.out.print(log);
		log.delete(0, log.length());
	}
	public void getLog(String varName, char var) {
		log.append("[Log] ").append(varName).append(": ").append(var).append("\n");
		System.out.print(log);
		log.delete(0, log.length());
	}
	public void getLog(String varName, int var) {
		log.append("[Log] ").append(varName).append(": ").append(var).append("\n");
		System.out.print(log);
		log.delete(0, log.length());
	}
	public void getLog(String varName, long var) {
		log.append("[Log] ").append(varName).append(": ").append(var).append("\n");
		System.out.print(log);
		log.delete(0, log.length());
	}
	public void getLog(String varName, float var) {
		log.append("[Log] ").append(varName).append(": ").append(var).append("\n");
		System.out.print(log);
		log.delete(0, log.length());
	}
	public void getLog(String varName, double var) {
		log.append("[Log] ").append(varName).append(": ").append(var).append("\n");
		System.out.print(log);
		log.delete(0, log.length());
	}
	public void getLog(String varName, String var) {
		log.append("[Log] ").append(varName).append(": ").append(var).append("\n");
		System.out.print(log);
		log.delete(0, log.length());
	}
}
