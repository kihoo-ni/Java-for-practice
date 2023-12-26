package sec01;

public class BackgroundChangeListener implements CheckBox.OnSelectListener {
	// 중첩 인터페이스라서 상위클래스.인터페이스명으로 기재
	@Override
	public void onSelect() {
		System.out.println("배경을 변경합니다.");
	}

}
