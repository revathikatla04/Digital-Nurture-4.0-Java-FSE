class MyThread extends Thread {
    private String msg;
    public MyThread(String msg) {
        this.msg = msg;
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(msg);
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1 running");
        MyThread t2 = new MyThread("Thread 2 running");
        t1.start();
        t2.start();
    }
}
