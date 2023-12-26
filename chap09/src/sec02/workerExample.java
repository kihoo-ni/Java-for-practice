package sec02;

public class workerExample {

	public static void main(String[] args) {
		AnonyWorker anony=new AnonyWorker();
		anony.field.start();
		anony.method1();
		anony.method2(
				new Worker() {

					@Override
					public void start() {
						System.out.println("테스트를 합니다.");
					}
					
				}
				
				);
	}

}
