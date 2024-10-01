package di_4.spring;

import org.springframework.stereotype.Component;

@Component
public class KakaoTalkMessageSender implements MessageSender {
	
	public KakaoTalkMessageSender() {
		System.out.println("KakaoTalkMessageSender() 생성자 실행됨");
	}

	@Override
	public void send(String from, String to, String title, String content) {
		System.out.println("카카오톡으로 메세지를 발송합니다.");
		System.out.println("보내는 사람: " + from);
		System.out.println("받는 사람: " + to);
		System.out.println("제목: " + title);
		System.out.println("내용: " + content);
	}
}
