package main;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class AutoKeystrokeMain {
	public static void main(String[] args) throws Exception {
		char keyToPress = 'A';
		int keyCodeToPress = 0;
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("����������������ĸ�����֣�0-9����A-Z��������ַ���ȡ��һ����");
			String inputStr = scanner.nextLine();
			try{
				keyToPress = inputStr.charAt(0);
			}catch(Exception e){
				System.out.println("�������������ԣ�");
				continue;
			}
			keyCodeToPress = KeyEvent.getExtendedKeyCodeForChar(keyToPress);
			if((keyCodeToPress >= 65 && keyCodeToPress <= 90) || (keyCodeToPress >= 48 && keyCodeToPress <= 57)){
				System.out.println("Ҫ�û��İ����ǣ�" + keyToPress);
				break;
			}else{
				System.out.println("�������������ԣ�");
			}
		}
		int delaySeconds = 1;
		while(true){
			System.out.println("�������������û�֮��ļ�����룬ֻ������������С��1����");
			try{
				delaySeconds = Integer.parseInt(scanner.nextLine());
			}catch(Exception e){
				System.out.println("�������������ԣ�");
				continue;
			}
			if(delaySeconds > 0){
				System.out.println("�м�����" + delaySeconds + "�롣");
				break;
			}else{
				System.out.println("�������������ԣ�");
			}
		}
		scanner.close();
		
//		int delaySeconds = 1;
//		int keyCodeToPress = KeyEvent.VK_A;
		System.out.println("��ʼ�Զ��û���");
		int count = 0;
		Robot robot = new Robot();
		while(true){
			for(int i = 0; i < delaySeconds; i++){
				robot.delay(1000);
			}
			robot.keyPress(keyCodeToPress);
			robot.keyRelease(keyCodeToPress);
			count++;
			System.out.println("���û�" + keyToPress + "�� " + count + " �Ρ�");
			System.out.println("�����밴Ctrl+C��Ȼ������Y���س���");
		}
	}
}