package ch09_nested_interface;

import ch09_nested_interface.Button.OnClickListener;

public class MessageListener implements OnClickListener {

	@Override
	public void onClick() {
		System.out.println("문자 메시지를 전송합니다.");

	}

}
