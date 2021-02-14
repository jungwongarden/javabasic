package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 음식주문프로그램 {
	//main메서드는 프로그램을 처음시작할 때 자동으로 실행하는 메서드
	//처음시작할 때 객체생성하지않아도 자동으로 실행이 되어야하기 때문에
	//main메서드는 static될 수밖에 없다.
	//static메서드안에서 사용하는 전역변수는 반드시
	//객체생성하지 않아도 접근이 가능한 static변수여야 한다.
	private static JTextField t1;
	static int count; //전역변수는 자동초기화, 0으로 초기화
	final static int PRICE = 5000;
	//final을 써주면, 변경불가능한 변수값을 지정, 상수지정!
	//final을 이용해서 상수로 지정하면 변수명을 모두 대문자로 써주면 좋다.!
	
	public static void main(String[] args) {
		//JFrame제공되는 제공되는 생성자 중 선택해서 객체생성 가능
		//제공되지 않는 입력값을 넣어서는 객체생성 불가능.
		//JFrame()생성자 메서드는 입력값을 다르게 하면, 여러개 만들수있다.
		//메서드이름을 입력값이 다르다면 똑같이 만들어써도 된다.
		//하나의 동일한 메서드 이름으로 다양한 입력형태를 가지는 메서드를 만들 수 있다.
		//=> 다형성(overloading, 오버로딩)
		JFrame f = new JFrame("나의 음식 주문 프로그램");
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(773, 637);
		f.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setForeground(Color.BLUE);
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		t1.setBounds(505, 29, 213, 49);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\uAC1C\uC218:");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 17));
		lblNewLabel.setBounds(428, 29, 66, 43);
		f.getContentPane().add(lblNewLabel);
		
		JLabel t2 = new JLabel("");
		t2.setIcon(new ImageIcon("D:\\java-ws\\java06\\005.png"));
		t2.setBounds(54, 100, 618, 392);
		f.getContentPane().add(t2);
		
		JLabel t3 = new JLabel("\uACB0\uC81C\uAE08\uC561 \uB4E4\uC5B4\uAC00\uB294 \uBD80\uBD84");
		t3.setForeground(Color.RED);
		t3.setFont(new Font("굴림", Font.BOLD, 30));
		t3.setBounds(69, 521, 591, 56);
		f.getContentPane().add(t3);
		
		JButton btnNewButton = new JButton("\uC9EC\uBF55");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++; //증감연산자
				t1.setText(count + "개");
				t3.setText("결제금액은 " + count * PRICE + "원");
			}
		});
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton.setBounds(36, 10, 110, 79);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC6B0\uB3D9");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++; //증감연산자
				t1.setText(count + "개");
				t3.setText("결제금액은 " + count * PRICE + "원");
				ImageIcon icon = new ImageIcon("006.png");
				t2.setIcon(icon);
			}
		});
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton_1.setBounds(168, 10, 110, 79);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("\uC9DC\uC7A5");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++; //증감연산자
				t1.setText(count + "개");
				t3.setText("결제금액은 " + count * PRICE + "원");
				ImageIcon icon = new ImageIcon("005.png");
				t2.setIcon(icon);
			}
		});
		btnNewButton_1_1.setBackground(Color.CYAN);
		btnNewButton_1_1.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton_1_1.setBounds(306, 10, 110, 79);
		f.getContentPane().add(btnNewButton_1_1);
		f.setVisible(true);
	}
}
