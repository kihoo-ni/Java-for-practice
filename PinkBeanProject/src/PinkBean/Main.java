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

	// �� ���� ����
	static JLabel lbl, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, imgLbl, imgLbl2, imgLbl3;
	static ImageIcon hpImg, apImg, userImg;
	static JButton btn1, btn2, btn3;
	static JFrame frm;

	// �����Ӱ� �ΰ� ��ü ����(������ũ��� ������ũ������ ����)
	static HealPinkBean hp1 = new HealPinkBean("������ũ��");
	static AttackPinkBean ap1 = new AttackPinkBean("����Ŀ��ũ��");
	static Human h = new Human("USER");

	public static void main(String[] args) {

		// �Ϻ� �۲� ����
		Font font1 = new Font("���� ���", Font.BOLD, 40);
		Font font2 = new Font("���� ���", Font.BOLD, 22);
		Font font3 = new Font("HY�߰��", Font.ITALIC, 18);
		Font font4 = new Font("���� ���", Font.BOLD, 18);
		Font font5 = new Font("HY�߰��", Font.PLAIN, 23);

		// ������ ����
		frm = new JFrame();

		// ������ ���� ����
		frm.setTitle("JavaProject");

		// ������ ũ�� ����
		frm.setSize(900, 900);

		// �������� ȭ�� ����� ��ġ(NULL�� �ָ� �߾����� ��ġ)
		frm.setLocationRelativeTo(null);

		// �������� �ݾ��� �� �޸𸮿��� ���ŵǵ��� ����
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ���̾ƿ� ����
		frm.getContentPane().setLayout(null);

		// ��ư ����
		btn1 = new JButton(hp1.name);
		btn2 = new JButton(ap1.name);
		btn3 = new JButton(h.name);

		// ��ư ��ġ�� ũ�� ����
		btn1.setBounds(100, 500, 160, 50);
		btn2.setBounds(620, 500, 160, 50);
		btn3.setBounds(360, 500, 160, 50);
		btn1.setFont(font2);
		btn2.setFont(font2);
		btn3.setFont(font2);

		// �����ӿ��ٰ� ��ư �߰�
		frm.getContentPane().add(btn1);
		frm.getContentPane().add(btn2);
		frm.getContentPane().add(btn3);

		// ��1(���� ����) ����
		lbl = new JLabel();
		lbl.setBounds(100, 20, 700, 80);
		lbl.setText("��ũ���� ��� �±��� �������!");
		lbl.setHorizontalAlignment(JLabel.CENTER); // ���� ��� ����
		lbl.setFont(font1);
		frm.getContentPane().add(lbl);

		// ��2(����� HP) ����
		lbl2 = new JLabel();
		lbl2.setBounds(380, 550, 180, 50);
		lbl2.setText(h.name + " HP" + "[" + h.hp + "]");
		lbl2.setFont(font4);
		frm.getContentPane().add(lbl2);

		// ��3(���� ��ũ�� HP) ����
		lbl3 = new JLabel();
		lbl3.setBounds(100, 550, 180, 50);
		lbl3.setText(hp1.name + " HP[" + hp1.hp + "]");
		lbl3.setFont(font4);
		frm.getContentPane().add(lbl3);

		// ��4(����Ŀ ��ũ�� HP) ����
		lbl4 = new JLabel();
		lbl4.setBounds(620, 550, 180, 50);
		lbl4.setText(ap1.name + " HP[" + ap1.hp + "]");
		lbl4.setFont(font4);
		frm.getContentPane().add(lbl4);

		// ��5(��� ����â) ����
		lbl5 = new JLabel();
		lbl5.setBorder(new LineBorder(Color.black));
		lbl5.setBounds(80, 670, 700, 50);
		lbl5.setText("USER:");
		lbl5.setHorizontalAlignment(JLabel.CENTER);
		lbl5.setFont(font3);
		frm.getContentPane().add(lbl5);

		// ��6(��ũ�� ����, ���â) ����
		lbl6 = new JLabel();
		lbl6.setBorder(new LineBorder(Color.black));
		lbl6.setBounds(80, 730, 700, 50);
		lbl6.setText("MONSTER:");
		lbl6.setHorizontalAlignment(JLabel.CENTER);
		lbl6.setFont(font3);
		frm.getContentPane().add(lbl6);

		// ��7(�ð�����) ����
		lbl7 = new JLabel();
		lbl7.setBorder(new LineBorder(Color.red));
		lbl7.setBounds(340, 600, 200, 50);
		lbl7.setText("���� �ð�: ");
		lbl7.setForeground(Color.red);
		lbl7.setHorizontalAlignment(JLabel.CENTER);
		lbl7.setFont(font5);
		frm.getContentPane().add(lbl7);

		// ��ư�� ������ ��
		btn1.addActionListener(event -> {
			battle(hp1);
		});
		btn2.addActionListener(event -> {
			battle(ap1);
		});
		btn3.addActionListener(event -> {
			h.selfHeal();
		});

		// �̹��� ��(������ũ��) ����
		imgLbl = new JLabel();

		// �󺧿� ���� ������ ����
		hpImg = new ImageIcon(Main.class.getResource("/PinkBean/img/hppinkbean4.gif"));

		// �󺧿� ������ ����
		imgLbl.setIcon(hpImg);

		// ��Ÿ ����
		imgLbl.setBounds(10, 100, 300, 300);
		imgLbl.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(imgLbl);

		// �̹��� ��2(����Ŀ��ũ��) ����
		imgLbl2 = new JLabel();
		apImg = new ImageIcon(Main.class.getResource("/PinkBean/img/attackpinkbean.gif"));

		// ��2�� ������ ����
		imgLbl2.setIcon(apImg);

		// ��Ÿ ����
		imgLbl2.setBounds(500, 100, 400, 400);
		imgLbl2.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(imgLbl2);

		// �̹��� ��3(user) ����
		imgLbl3 = new JLabel();
		userImg = new ImageIcon(Main.class.getResource("/PinkBean/img/arc3.gif"));

		// ��2�� ������ ����
		imgLbl3.setIcon(userImg);

		// ��Ÿ ����
		imgLbl3.setBounds(220, 130, 350, 300);
		imgLbl3.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(imgLbl3);

		// �������� ���̵��� ����(�Ǹ������� ���� ���� ����)
		frm.setVisible(true);

		PinkTimer gt = new PinkTimer();
		gt.start();
	}

	public static void battle(PinkBean p) {
		// ��ũ���� ����������� ����
		int randomNum = (int) (Math.random() * 4);

		JLabel targetPinkbean; // ��ũ�� �׸��� ���� ����

		if (randomNum == 0) {
			lbl6.setText("MONSTER: ����� ���ݵ���...���ҷӱ� ������ ��������!");

			if (p == hp1) {
				targetPinkbean = imgLbl; // ��ũ�� �������� ����
			} else {
				targetPinkbean = imgLbl2;
			}
			// ��� ��ũ���� �������� 80��ŭ �̵���Ų��.
			targetPinkbean.setBounds(targetPinkbean.getX() + 120, 50, 400, 400);

			Timer timer1 = new Timer();
			TimerTask task1 = new TimerTask() {

				@Override
				public void run() {
					// 0.5�� �ڿ� ������ �ڵ�
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

					// ��ũ�� �ʻ��
					ap.attack2(h);
				} else {
					// ��ũ�� �Ϲݰ���
					p.attack(h);
				}
			}
		}

		// ��ũ���� ��� ������ ���� Ŭ����
		if (hp1.hp < 1 && ap1.hp < 1) {
			JOptionPane.showMessageDialog(null, "��ũ���� ��� �׾���! �±����!");
			System.exit(0);
		}

	}
	
}
class PinkTimer extends Thread{
	@Override
	public void run() {
		for(int i=60; i>=1; i--){
			
			Main.lbl7.setText("���� �ð�: "+String.valueOf(i)+"��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		JOptionPane.showMessageDialog(null, "���ѽð����� �̼� ���� ������ �����մϴ�.");
		System.exit(0);
	}
}
