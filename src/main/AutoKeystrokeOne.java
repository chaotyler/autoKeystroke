package main;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class AutoKeystrokeOne {
	public static void main(String[] args) throws Exception {		
		int delaySeconds = 180;
		int keyCodeToPress = KeyEvent.VK_1;
		System.out.println("开始自动敲击1，两次敲击间隔3分钟：");
		int count = 0;
		Robot robot = new Robot();
		while(true){
			for(int i = 0; i < delaySeconds; i++){
				robot.delay(1000);
			}
			robot.keyPress(keyCodeToPress);
			robot.keyRelease(keyCodeToPress);
			count++;
			System.out.println("已敲击P： " + count + " 次。");
			System.out.println("结束请按Ctrl+C，然后输入Y，回车。");
		}
	}
}