
class MyTask implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task is running: " + i);
        }
    }
}

public class PredefinedinterfaceDemo {
    public static void main(String[] args) {

        MyTask task = new MyTask();

        Thread t = new Thread(task);

        t.start();

        System.out.println("Main method is running");
    }
}

