
public class MTrd extends Thread {
public void run() {
	for (int i = 0; i < 5; i++){
		System.out.println(getName()+"Run"+i);
		
	}
}
public static void main(String[] args) {
	MTrd mt1 = new MTrd();
	mt1.start();
	MTrd mt2 = new MTrd();
	mt2.start();
	
}
}
