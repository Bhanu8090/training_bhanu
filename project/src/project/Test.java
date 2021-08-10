package project;


public class Test {
    //synchronous - one after another - process
    public static void main(String[] args) throws Exception {
        A a = new A();        
        a.start();
        
        B b = new B();
        Thread th = new Thread(b);
        th.start();
    }

 

}

//multi level inheritance
class A extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("----a---" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                
            }
        }
    }
}

 

class B implements Runnable{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.err.println("----b---" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                
            }
        }
    }
}

 

class C{
    
}


