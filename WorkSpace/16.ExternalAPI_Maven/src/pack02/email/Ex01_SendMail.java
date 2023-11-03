package pack02.email;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Properties;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class Ex01_SendMail {
	Properties properties; // properties <= 파일을 읽어오기 위한 객체

	public Ex01_SendMail() {
		properties = new Properties();
		try {
			properties.load(Ex01_SendMail.class.getResourceAsStream("emailinfo.properties"));
			System.out.println(properties.getProperty("email.id"));
			System.out.println(properties.getProperty("email.pw"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Ex01_SendMail es = new Ex01_SendMail();
		try {
			es.sendSimple();
		} catch (EmailException e) {
			e.printStackTrace();
		}

		try {
			es.attachMail();
		} catch (MalformedURLException e) {

			e.printStackTrace();
		} catch (EmailException e) {

			e.printStackTrace();
		} catch (URISyntaxException e) {

			e.printStackTrace();
		}
		
		
		
		try {
			es.htmlMail();
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	public void htmlMail() throws EmailException {
		// 파일 또는 url로 있는 이미지 등을 이메일 첨부
		EmailAttachment attach = new EmailAttachment();
		attach.setPath("puppy.png");

		HtmlEmail email = new HtmlEmail();
		email.setHostName("smtp.naver.com");
		email.setSmtpPort(465);
		email.setAuthenticator(
				new DefaultAuthenticator(properties.getProperty("email.id"), properties.getProperty("email.pw")));
		email.setSSLOnConnect(true);
		// 인코딩====================================== 한글깨짐 방지
		email.setCharset("utf-8");
		email.setDebug(true);
		// ==========================================

		email.setFrom(properties.getProperty("email.id"), "Hee");
		email.addTo(properties.getProperty("email.id"), "나2");
		email.addTo("youngmoon525@naver.com", "선생님");
		email.setSubject("제목");
		// email.setMsg("내용");
		StringBuffer msg = new StringBuffer();
		msg.append("<html>"); //append: 원래 있던거에서 추가해 붙이다
		msg.append("<body>");
		msg.append("<a href='www.naver.com'>안녕<a>");
		msg.append("<h3>라면을 끓이는 순서</h3><hr>");
		msg.append("<ol type=\"A\">");
		msg.append("<li>물을 끓인다.</li>");
		msg.append("<li>라면과 스프를 넣는다.</li>");
		msg.append("<li>파를 썰어 넣는다.</li>");
		msg.append("<li>5분 후 먹는다.</li>");
		msg.append("</ol>");
		
		
		
		msg.append("</body>");
		msg.append("</html>");

		email.setHtmlMsg(msg.toString()); // 기존은 setMsg(x) -> setHtmlMsg

		email.attach(attach);
		attach = new EmailAttachment(); // 기존에 컴퓨터에서 추가한 파일을 비우고 다시 만들기.
		try {
			attach.setURL(new URL("https://www.apache.org/events/current-event-125x125.png"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		email.attach(attach);

		email.send();
	}

	
	
	public void sendSimple() throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.naver.com");
		email.setSmtpPort(465);
		email.setAuthenticator(
				new DefaultAuthenticator(properties.getProperty("email.id"), properties.getProperty("email.pw")));
		email.setSSLOnConnect(true);
		// 인코딩====================================== 한글깨짐 방지
		email.setCharset("utf-8");
		email.setDebug(true);
		// ==========================================

		email.setFrom(properties.getProperty("email.id"), "나1");
		email.addTo(properties.getProperty("email.id"), "나2");
		email.addTo("youngmoon525@naver.com", "선생님");
		email.setSubject("제목");
		email.setMsg("내용");
		email.send();
	}

	public void attachMail() throws EmailException, URISyntaxException, MalformedURLException {
		// Create the attachment
		EmailAttachment attachment = new EmailAttachment();
		attachment.setPath("puppy.png");

		MultiPartEmail email = new MultiPartEmail();
		email.setHostName("smtp.naver.com");
		email.setSmtpPort(465);
		email.setAuthenticator(
				new DefaultAuthenticator(properties.getProperty("email.id"), properties.getProperty("email.pw")));
		email.setSSLOnConnect(true);
		// 인코딩====================================== 한글깨짐 방지
		email.setCharset("utf-8");
		email.setDebug(true);
		// ==========================================

		email.setFrom(properties.getProperty("email.id"), "나1");
		email.addTo(properties.getProperty("email.id"), "나2");
		email.addTo("youngmoon525@naver.com", "선생님");
		email.setSubject("제목");

		email.setMsg("내용");
		// add the attachment
		email.attach(attachment);
		// URL로 있는 이미지 넣기
		EmailAttachment file = new EmailAttachment();
		file.setURL(new URL("https://www.apache.org/events/current-event-125x125.png"));
		email.attach(file);

		// send the email
		email.send();
	}

}
