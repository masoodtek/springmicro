package com.mas.UserRegisteration.utils;

import java.io.BufferedReader;
import java.io.FileReader;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.mas.UserRegisteration.model.UserEntity;

@Component
public class EmailUtil {

	@Autowired
	private JavaMailSender javaMailSender;

	public void sendEmail(UserEntity userEntity,Integer id) {

		String msguser = userEntity.getUserEmail();
		MimeMessage msg = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(msg);

		try {
			helper.setTo(msguser);
			helper.setSubject("registeration");
			helper.setText(emailTemplet(userEntity,id), true);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		javaMailSender.send(msg);

	}

	public String emailTemplet(UserEntity userEntity,Integer id) {
		String mailbody = null;
		try {
			FileReader fr=null;
			if(id==1) {
				fr = new FileReader("changeemail.text");
			}else {
				fr = new FileReader("email.text");
			}
			
			BufferedReader bf = new BufferedReader(fr);
			String line = bf.readLine();
			StringBuffer sb = new StringBuffer();
			while (line != null) {
				sb.append(line);
				line = bf.readLine();
			}
			mailbody = sb.toString();
			mailbody = mailbody.replace("{name}", userEntity.getUserName());
			mailbody = mailbody.replace("{last}", userEntity.getUserLastName());
			mailbody = mailbody.replace("{email}", userEntity.getUserEmail());
			mailbody = mailbody.replace("{pazzword}", userEntity.getUserPazzword());
			bf.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return mailbody;

	}
}
