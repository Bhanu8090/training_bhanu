
public class MyThrdY extends Thread {
public void run(){
	for(int i = 0; i< 12; i++){
		Thread.yield();
		System.out.println("b--" +i);
	}
}
public static void main(String[] args) {
	MyThrdY my1 = new MyThrdY();
	my1.start();
	for(int i = 0; i<12; i++){
		System.out.println("h---"+i);
	}
	
}
}
