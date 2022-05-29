public class ExtendedThread extends Thread {

    @Override
    public void run() {
        String currentThreadName = Thread.currentThread().getName();
        System.out.println("Thread Name : " + currentThreadName);
    }
}
