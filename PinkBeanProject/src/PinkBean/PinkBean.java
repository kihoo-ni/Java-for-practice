package PinkBean;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PinkBean {
	String name;
	int hp = 400;

	// 생성자
	public PinkBean(String n) {
		this.name = n;
	}

	// 공격
	public void attack(Human h) {
	}

	public void attack(Human h, int damage) {
		if (hp > 0) {
			h.hp = h.hp - damage;

			if (h.hp < 1) {
				JOptionPane.showMessageDialog(null, "마을로 귀환합니다.");
				System.exit(0);
			}
			if (damage == 10) {
				
				ImageIcon pinkbeanattack = new ImageIcon(Main.class.getResource("/PinkBean/img/hpattack5.gif"));

				Main.imgLbl.setIcon(pinkbeanattack);
				Timer timer1 = new Timer();
				TimerTask task1 = new TimerTask() {

					@Override
					public void run() {
						// 0.5초 뒤에 수행할 코드
						Main.imgLbl.setIcon(Main.hpImg);
						timer1.cancel();
					}
				};

				timer1.schedule(task1, 1000);
				Main.lbl6.setText("MONSTER: "+name + "의 외침! 10의 데미지를 가함!");
				Main.lbl2.setText(h.name + " HP" + "["+h.hp+"]");
			} else if(damage ==20) {
				ImageIcon pinkbeansattack = new ImageIcon(Main.class.getResource("/PinkBean/img/hpattack5.gif"));

				Main.imgLbl2.setIcon(pinkbeansattack);
				Timer timer1 = new Timer();
				TimerTask task1 = new TimerTask() {

					@Override
					public void run() {
						// 0.5초 뒤에 수행할 코드
						Main.imgLbl2.setIcon(Main.apImg);
						timer1.cancel();
					}
				};

				timer1.schedule(task1, 1000);
				Main.lbl6.setText("MONSTER: "+name + "의 외침! 20의 데미지를 가함!");
				Main.lbl2.setText(h.name + " HP" + "["+h.hp+"]");

			} else if (damage ==40) {
				ImageIcon pinkbeansattack = new ImageIcon(Main.class.getResource("/PinkBean/img/apsattack.gif"));

				Main.imgLbl2.setIcon(pinkbeansattack);
				Timer timer1 = new Timer();
				TimerTask task1 = new TimerTask() {

					@Override
					public void run() {
						// 0.5초 뒤에 수행할 코드
						Main.imgLbl2.setIcon(Main.apImg);
						timer1.cancel();
					}
				};

				timer1.schedule(task1, 1500);
				Main.lbl6.setText("MONSTER: "+name + "의 궁극기 파워호루라기 시전! 40의 데미지를 가함!");
				Main.lbl2.setText(h.name + " HP" + "["+h.hp+"]");

			}
		}
	}

}

class HealPinkBean extends PinkBean {

	HealPinkBean(String n) {
		super(n);
	}

	// 치료
	void heal(PinkBean p) {
		ImageIcon pinkbeanheal = new ImageIcon(Main.class.getResource("/PinkBean/img/hpheal.gif"));

		Main.imgLbl.setIcon(pinkbeanheal);
		Timer timer1 = new Timer();
		TimerTask task1 = new TimerTask() {

			@Override
			public void run() {
				// 0.5초 뒤에 수행할 코드
				Main.imgLbl.setIcon(Main.hpImg);
				timer1.cancel();
			}
		};

		timer1.schedule(task1, 2000);

		if (hp > 0 && p.hp > 0) {
			
			p.hp += 40;
			if (p.hp > 400) {
				p.hp = 400;
			}

			// 핑크빈 체력회복
			Main.lbl6.setText("MONSTER: "+name + "이 울트라파워힐 시전! 40의 HP상승!");
			Main.lbl3.setText(p.name+" HP["+p.hp+"]");

		}
	}

	@Override
	public void attack(Human h) {
		attack(h, 10);
	}

}

class AttackPinkBean extends PinkBean {

	public AttackPinkBean(String n) {
		super(n);
	}

	@Override
	public void attack(Human h) { // 핑크빈 일반공격
		attack(h, 20);
	}

	public void attack2(Human h) { // 핑크빈 필살기
		attack(h, 40);
	}

}
