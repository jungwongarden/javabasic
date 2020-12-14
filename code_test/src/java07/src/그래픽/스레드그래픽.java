package 그래픽;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import 스레드.그림;
import 스레드.카운터;
import 스레드.타이머;


public class 스레드그래픽 extends JFrame {
//상속을 받은 경우, 자식클래스에서는 부모클래스가 제공하는 일반 메서드를
//마음대로 호출해서 쓸 수 있다.
	JLabel counter, img, timer; //전역변수
	
	public 스레드그래픽() {
		getContentPane().setBackground(Color.GREEN);
		setTitle("그래픽 스레드 시작");
		setSize(1000, 350);
		
		counter = new JLabel("카운터");
		counter.setFont(new Font("굴림", Font.BOLD, 60));
		getContentPane().add(counter, BorderLayout.WEST);
		
		img = new JLabel("이미지");
		img.setFont(new Font("굴림", Font.BOLD, 30));
		getContentPane().add(img, BorderLayout.EAST);
		
		timer = new JLabel("타이머");
		timer.setFont(new Font("굴림", Font.BOLD, 60));
		getContentPane().add(timer, BorderLayout.SOUTH);
		
		//자동import=> 마우스를 가져다댄다, f2, ctrl+shift+O(영문오)
		카운터2 t1 = new 카운터2();
		타이머2 t2 = new 타이머2();
		그림2 t3 = new 그림2();
		
		t1.start();
		t2.start();
		t3.start();		
		
		setVisible(true);		
	}
	
	//클래스간 공유할 전역변수가 있는 경우, class내에 class를 끼워서 사용함.
	//inner class(내부 클래스)
	public class 카운터2 extends Thread {

		@Override
		public void run() {
			for (int i = 500; i > 0; i--) {
				counter.setText("카운트: " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println("cpu에게 스레드 잠재우기 요청 에러!!");
				}
			}
		}
	}
	
	public class 타이머2 extends Thread {

		@Override
		public void run() {
			for (int i = 500; i > 0; i--) {
				Date date = new Date();
				timer.setText("시각: " + date);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("cpu에게 스레드 잠재우기 요청 에러!!");
				}
			}
		}
	}

	public class 그림2 extends Thread {

		@Override
		public void run() {
			String[] list = { "1.png", "2.png", "3.png", "4.png", "5.png" };
			for (int i = 0; i < list.length ; i++) {
				ImageIcon icon = new ImageIcon(list[i]);
				img.setIcon(icon);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					System.out.println("cpu에게 스레드 잠재우기 요청 에러!!");
				}
			}
		}
	}

	
	public static void main(String[] args) {
		스레드그래픽 name = new 스레드그래픽();
		
	}

}
