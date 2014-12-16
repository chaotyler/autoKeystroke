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
			System.out.println("请输入你想点击的字母或数字（0-9或者A-Z），多个字符将取第一个：");
			String inputStr = scanner.nextLine();
			try{
				keyToPress = inputStr.charAt(0);
			}catch(Exception e){
				System.out.println("输入有误，请重试！");
				continue;
			}
			keyCodeToPress = KeyEvent.getExtendedKeyCodeForChar(keyToPress);
			if((keyCodeToPress >= 65 && keyCodeToPress <= 90) || (keyCodeToPress >= 48 && keyCodeToPress <= 57)){
				System.out.println("要敲击的按键是：" + keyToPress);
				break;
			}else{
				System.out.println("输入有误，请重试！");
			}
		}
		int delaySeconds = 1;
		while(true){
			System.out.println("请输入在两次敲击之间的间隔（秒，只能是数字且最小是1）：");
			try{
				delaySeconds = Integer.parseInt(scanner.nextLine());
			}catch(Exception e){
				System.out.println("输入有误，请重试！");
				continue;
			}
			if(delaySeconds > 0){
				System.out.println("中间间隔：" + delaySeconds + "秒。");
				break;
			}else{
				System.out.println("输入有误，请重试！");
			}
		}
		scanner.close();
		
//		int delaySeconds = 1;
//		int keyCodeToPress = KeyEvent.VK_A;
		System.out.println("开始自动敲击：");
		int count = 0;
		Robot robot = new Robot();
		while(true){
			for(int i = 0; i < delaySeconds; i++){
				robot.delay(1000);
			}
			robot.keyPress(keyCodeToPress);
			robot.keyRelease(keyCodeToPress);
			count++;
			System.out.println("已敲击" + keyToPress + "： " + count + " 次。");
			System.out.println("结束请按Ctrl+C，然后输入Y，回车。");
		}
	}
}