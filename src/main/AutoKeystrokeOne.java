package main;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class AutoKeystrokeOne {
	public static void main(String[] args) throws Exception {		
		int delaySeconds = 180;
		int keyCodeToPress = KeyEvent.VK_1;
		System.out.println("��ʼ�Զ��û�1�������û����3���ӣ�");
		int count = 0;
		Robot robot = new Robot();
		while(true){
			for(int i = 0; i < delaySeconds; i++){
				robot.delay(1000);
			}
			robot.keyPress(keyCodeToPress);
			robot.keyRelease(keyCodeToPress);
			count++;
			System.out.println("���û�P�� " + count + " �Ρ�");
			System.out.println("�����밴Ctrl+C��Ȼ������Y���س���");
		}
	}
}