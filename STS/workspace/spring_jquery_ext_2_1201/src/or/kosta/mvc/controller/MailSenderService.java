package or.kosta.mvc.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
@Service
public class MailSenderService {
	@Autowired
	private JavaMailSender mailSender;

//	public void setMailMessage(SimpleMailMessage mailMessage){
//	this.mailMessage = mailMessage;
//	}

	public void sendEmailForCustomer(String title, String email, String msg){
	//메시지 사본생성
//	SimpleMailMessage message = new SimpleMailMessage(mailMessage);
//
//	message.setTo(email);
//
//	String text = message.getText();
//	text = StringUtils.replace(text,"%NAME%","길동");
//	text = StringUtils.replace(text,"%AGE%","29");
//	message.setText(text);

	/* SimpleMailMessage를 빈으로 등록하지 않은경우.	*/
	SimpleMailMessage message = new SimpleMailMessage();


	message.setTo(email);
	message.setSubject(title);
	message.setFrom("naturalbooks121@gmail.com");

	String text = message.getText();
	text = StringUtils.replace(text,"%TITLE%",title);
	text = StringUtils.replace(text,"%MSG%",msg);
	message.setText(text);


	mailSender.send(message);
	}
}
