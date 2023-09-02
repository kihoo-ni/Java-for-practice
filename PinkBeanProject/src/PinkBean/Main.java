package PinkBean;

import java.awt.Color;
import java.awt.Font;
import java.util.Enumeration;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.plaf.FontUIResource;

public class Main {

	// 라벨 변수 선언
	static JLabel lbl, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, imgLbl, imgLbl2, imgLbl3;
	static ImageIcon hpImg, apImg, userImg;
	static JButton btn1, btn2, btn3;
	static JFrame frm;

	// 슬라임과 인간 객체 생성(힐러핑크빈과 공격핑크빈으로 나뉨)
	static HealPinkBean hp1 = new HealPinkBean("힐러핑크빈");
	static AttackPinkBean ap1 = new AttackPinkBean("어택커핑크빈");
	static Human h = new Human("USER");

	public static void main(String[] args) {

		// 일부 글꼴 적용
		Font font1 = new Font("한컴 고딕", Font.BOLD, 40);
		Font font2 = new Font("한컴 고딕", Font.BOLD, 22);
		Font font3 = new Font("HY견고딕", Font.ITALIC, 18);
		Font font4 = new Font("한컴 고딕", Font.BOLD, 18);
		Font font5 = new Font("HY견고딕", Font.PLAIN, 23);

		// 프레임 생성
		frm = new JFrame();

		// 프레임 제목 설정
		frm.setTitle("JavaProject");

		// 프레임 크기 설정
		frm.setSize(900, 900);

		// 프레임을 화면 가운데에 배치(NULL값 주면 중앙으로 배치)
		frm.setLocationRelativeTo(null);

		// 프레임을 닫았을 때 메모리에서 제거되도록 설정
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 레이아웃 설정
		frm.getContentPane().setLayout(null);

		// 버튼 설정
		btn1 = new JButton(hp1.name);
		btn2 = new JButton(ap1.name);
		btn3 = new JButton(h.name);

		// 버튼 위치와 크기 설정
		btn1.setBounds(100, 500, 160, 50);
		btn2.setBounds(620, 500, 160, 50);
		btn3.setBounds(360, 500, 160, 50);
		btn1.setFont(font2);
		btn2.setFont(font2);
		btn3.setFont(font2);

		// 프레임에다가 버튼 추가
		frm.getContentPane().add(btn1);
		frm.getContentPane().add(btn2);
		frm.getContentPane().add(btn3);

		// 라벨1(맨위 제목) 설정
		lbl = new JLabel();
		lbl.setBounds(100, 20, 700, 80);
		lbl.setText("핑크빈을 잡고 승급을 통과하자!");
		lbl.setHorizontalAlignment(JLabel.CENTER); // 수평 가운데 정렬
		lbl.setFont(font1);
		frm.getContentPane().add(lbl);

		// 라벨2(사용자 HP) 설정
		lbl2 = new JLabel();
		lbl2.setBounds(380, 550, 180, 50);
		lbl2.setText(h.name + " HP" + "[" + h.hp + "]");
		lbl2.setFont(font4);
		frm.getContentPane().add(lbl2);

		// 라벨3(힐러 핑크빈 HP) 설정
		lbl3 = new JLabel();
		lbl3.setBounds(100, 550, 180, 50);
		lbl3.setText(hp1.name + " HP[" + hp1.hp + "]");
		lbl3.setFont(font4);
		frm.getContentPane().add(lbl3);

		// 라벨4(어택커 핑크빈 HP) 설정
		lbl4 = new JLabel();
		lbl4.setBounds(620, 550, 180, 50);
		lbl4.setText(ap1.name + " HP[" + ap1.hp + "]");
		lbl4.setFont(font4);
		frm.getContentPane().add(lbl4);

		// 라벨5(용사 공격창) 설정
		lbl5 = new JLabel();
		lbl5.setBorder(new LineBorder(Color.black));
		lbl5.setBounds(80, 670, 700, 50);
		lbl5.setText("USER:");
		lbl5.setHorizontalAlignment(JLabel.CENTER);
		lbl5.setFont(font3);
		frm.getContentPane().add(lbl5);

		// 라벨6(핑크빈 공격, 방어창) 설정
		lbl6 = new JLabel();
		lbl6.setBorder(new LineBorder(Color.black));
		lbl6.setBounds(80, 730, 700, 50);
		lbl6.setText("MONSTER:");
		lbl6.setHorizontalAlignment(JLabel.CENTER);
		lbl6.setFont(font3);
		frm.getContentPane().add(lbl6);

		// 라벨7(시간제한) 설정
		lbl7 = new JLabel();
		lbl7.setBorder(new LineBorder(Color.red));
		lbl7.setBounds(340, 600, 200, 50);
		lbl7.setText("남은 시간: ");
		lbl7.setForeground(Color.red);
		lbl7.setHorizontalAlignment(JLabel.CENTER);
		lbl7.setFont(font5);
		frm.getContentPane().add(lbl7);

		// 버튼이 눌렸을 때
		btn1.addActionListener(event -> {
			battle(hp1);
		});
		btn2.addActionListener(event -> {
			battle(ap1);
		});
		btn3.addActionListener(event -> {
			h.selfHeal();
		});

		// 이미지 라벨(힐러핑크빈) 생성
		imgLbl = new JLabel();

		// 라벨에 넣을 아이콘 생성
		hpImg = new ImageIcon(Main.class.getResource("/PinkBean/img/hppinkbean4.gif"));

		// 라벨에 아이콘 설정
		imgLbl.setIcon(hpImg);

		// 기타 설정
		imgLbl.setBounds(10, 100, 300, 300);
		imgLbl.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(imgLbl);

		// 이미지 라벨2(어택커핑크빈) 생성
		imgLbl2 = new JLabel();
		apImg = new ImageIcon(Main.class.getResource("/PinkBean/img/attackpinkbean.gif"));

		// 라벨2에 아이콘 설정
		imgLbl2.setIcon(apImg);

		// 기타 설정
		imgLbl2.setBounds(500, 100, 400, 400);
		imgLbl2.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(imgLbl2);

		// 이미지 라벨3(user) 생성
		imgLbl3 = new JLabel();
		userImg = new ImageIcon(Main.class.getResource("/PinkBean/img/arc3.gif"));

		// 라벨2에 아이콘 설정
		imgLbl3.setIcon(userImg);

		// 기타 설정
		imgLbl3.setBounds(220, 130, 350, 300);
		imgLbl3.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(imgLbl3);

		// 프레임이 보이도록 설정(맨마지막에 오는 것이 좋음)
		frm.setVisible(true);

		PinkTimer gt = new PinkTimer();
		gt.start();
	}

	public static void battle(PinkBean p) {
		// 핑크빈이 살아있을때만 공격
		int randomNum = (int) (Math.random() * 4);

		JLabel targetPinkbean; // 핑크빈 그림을 담을 변수

		if (randomNum == 0) {
			lbl6.setText("MONSTER: 용사의 공격따위...가소롭군 가볍게 피해주지!");

			if (p == hp1) {
				targetPinkbean = imgLbl; // 핑크빈 원본사진 넣음
			} else {
				targetPinkbean = imgLbl2;
			}
			// 대상 핑크빈을 우측으로 80만큼 이동시킨다.
			targetPinkbean.setBounds(targetPinkbean.getX() + 120, 50, 400, 400);

			Timer timer1 = new Timer();
			TimerTask task1 = new TimerTask() {

				@Override
				public void run() {
					// 0.5초 뒤에 수행할 코드
					targetPinkbean.setBounds(targetPinkbean.getX() - 120, 50, 400, 400);
				}
			};

			timer1.schedule(task1, 500);

		} else if (randomNum == 1) {
			h.attack(p);
		} else if (randomNum == 2) {
			if (p instanceof HealPinkBean) {
				randomNum = (int) (Math.random() * 3);
				if (randomNum == 0) {
					HealPinkBean hp = (HealPinkBean) p;
					hp.heal(p);
				} else {
					p.attack(h);
				}
			}
		} else if (randomNum == 3) {
			if (p instanceof AttackPinkBean) {
				randomNum = (int) (Math.random() * 3);
				if (randomNum == 0) {
					AttackPinkBean ap = (AttackPinkBean) p;

					// 핑크빈 필살기
					ap.attack2(h);
				} else {
					// 핑크빈 일반공격
					p.attack(h);
				}
			}
		}

		// 핑크빈이 모두 죽으면 게임 클리어
		if (hp1.hp < 1 && ap1.hp < 1) {
			JOptionPane.showMessageDialog(null, "핑크빈이 모두 죽었다! 승급통과!");
			System.exit(0);
		}

	}
	
}
class PinkTimer extends Thread{
	@Override
	public void run() {
		for(int i=60; i>=1; i--){
			
			Main.lbl7.setText("남은 시간: "+String.valueOf(i)+"초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		JOptionPane.showMessageDialog(null, "제한시간내에 미션 실패 마을로 복귀합니다.");
		System.exit(0);
	}
}
