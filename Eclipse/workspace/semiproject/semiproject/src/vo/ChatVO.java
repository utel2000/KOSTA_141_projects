package vo;
/*
 이름        널        유형           
--------- -------- ------------ 
CHAT_NUM  NOT NULL NUMBER       
CHAT_USR  NOT NULL VARCHAR2(50) 
CHAT_CONT NOT NULL CLOB         
CHAT_DATE NOT NULL DATE    
 * */
public class ChatVO {
	
	private int chat_num;
	private String chat_usr, chat_cont, chat_date;
	public int getChat_num() {
		return chat_num;
	}
	public void setChat_num(int chat_num) {
		this.chat_num = chat_num;
	}
	public String getChat_usr() {
		return chat_usr;
	}
	public void setChat_usr(String chat_usr) {
		this.chat_usr = chat_usr;
	}
	public String getChat_cont() {
		return chat_cont;
	}
	public void setChat_cont(String chat_cont) {
		this.chat_cont = chat_cont;
	}
	public String getChat_date() {
		return chat_date;
	}
	public void setChat_date(String chat_date) {
		this.chat_date = chat_date;
	}	
}
