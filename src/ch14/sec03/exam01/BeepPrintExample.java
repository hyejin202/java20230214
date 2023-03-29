package ch14.sec03.exam01;

import java.awt.*;

public class BeepPrintExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();   //띵 소리남
			try { Thread.sleep(500); } catch(Exception e) {}     //sleep(long millisecond) : 현재 실행되고 있는 스레드 millisecond만큼 잠깐 멈춤
		}
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500); } catch(Exception e) {}
		}
	}
}
//하나의 스레드에서 실행되고 있어 소리가 나고 글자가 출력됨
//멀티스레드 - 소리와 글자 출력이 동시에 진행