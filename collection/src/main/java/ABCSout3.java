import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author 陈辰强
 * @Date 2020/3/21 11:50
 */
public class ABCSout3 {


    static class MyRunnable implements Runnable {

        private ReentrantLock reentrantLock;
        private Condition condition;
        private Condition nextCondition;


        public MyRunnable(ReentrantLock reentrantLock, Condition condition, Condition nextCondition) {
            this.reentrantLock = reentrantLock;
            this.condition = condition;
            this.nextCondition = nextCondition;
        }

        @Override
        public void run() {
            reentrantLock.lock();
            try {

                for (int i = 0; i < 2; i++) {
                    System.out.println(Thread.currentThread().getName());
                    nextCondition.signal();
                    condition.await();
                    System.out.println("唤醒走完" + Thread.currentThread().getName());
                }
                nextCondition.signal();

            } catch (Exception e) {

            } finally {
                reentrantLock.unlock();
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock(true);

        Condition conditionA = reentrantLock.newCondition();
        Condition conditionB = reentrantLock.newCondition();
        Condition conditionC = reentrantLock.newCondition();
        Condition conditionD = reentrantLock.newCondition();
        Condition conditionE = reentrantLock.newCondition();
        Condition conditionF = reentrantLock.newCondition();

        Thread a = new Thread(new MyRunnable(reentrantLock, conditionA, conditionB), "A");
        Thread b = new Thread(new MyRunnable(reentrantLock, conditionB, conditionC), "B");
        Thread c = new Thread(new MyRunnable(reentrantLock, conditionC, conditionD), "C");
        Thread d = new Thread(new MyRunnable(reentrantLock, conditionD, conditionE), "D");
        Thread e = new Thread(new MyRunnable(reentrantLock, conditionE, conditionF), "E");
        Thread f = new Thread(new MyRunnable(reentrantLock, conditionF, conditionA), "F");


        a.start();
//        Thread.sleep(1);
        b.start();
//        Thread.sleep(1);
        c.start();
//        Thread.sleep(1);
        d.start();
//        Thread.sleep(1);
        e.start();
//        Thread.sleep(1);
        f.start();


    }

}
