package PinkBean;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;

public class Human {

	String name;
	int hp = 200;

	public Human(String n) {
		name = n;
	}

	public void attack(PinkBean p) {
		// ��ũ�� �°� Ƣ�� �׸�
		ImageIcon pinkbeanattacked1 = new ImageIcon(Main.class.getResource("/PinkBean/img/pinkbeanback.gif"));
		ImageIcon pinkbeanattacked2 = new ImageIcon(Main.class.getResource("/PinkBean/img/pinkbeanback.gif"));

		if (p == Main.hp1) {
			Main.imgLbl.setIcon(pinkbeanattacked1);
		} else {
			Main.imgLbl2.setIcon(pinkbeanattacked2);
		}
		Timer timer1 = new Timer();
		TimerTask task1 = new TimerTask() {

			@Override
			public void run() {
				// 0.5�� �ڿ� ������ �ڵ�
				Main.imgLbl.setIcon(Main.hpImg);
				Main.imgLbl2.setIcon(Main.apImg);
				timer1.cancel();
			}
		};

		timer1.schedule(task1, 1000);

		p.hp = p.hp - 30;
		if (p.hp < 1) {
			if (p == Main.hp1) {
				Main.frm.remove(Main.imgLbl);
				Main.frm.repaint();
				Main.btn1.setEnabled(false);
				Main.lbl3.setText(p.name + " ����!");
			} else {
				Main.frm.remove(Main.imgLbl2);
				Main.frm.repaint();
				Main.btn2.setEnabled(false);
				Main.lbl4.setText(p.name + " ����!");
			}
		} else {

			Main.lbl5.setText("USER: "+name + "�� �ϰ�! 30�� �������� ����!");
			if (p instanceof HealPinkBean) {
				HealPinkBean hp = (HealPinkBean) p;
				Main.lbl3.setText(hp.name + " HP[" + hp.hp + "]");
			} else {
				if (p instanceof AttackPinkBean) {
					AttackPinkBean ap = (AttackPinkBean) p;
					Main.lbl4.setText(ap.name + " HP[" + ap.hp + "]");
				}
			}
		}
	}
	public void selfHeal() {
		int randomNum = (int) (Math.random() * 3);
		if (hp > 0 && randomNum==0) {
			hp += 10;
			if (hp > 200) {
				hp = 200;
			}

			// ��ũ�� ü��ȸ��
			Main.lbl5.setText("USER: "+name + "�� ��Ű�� �ߵ�! 10�� HP���!");
			Main.lbl2.setText(name+" HP["+hp+"]");

		}
	}
}
