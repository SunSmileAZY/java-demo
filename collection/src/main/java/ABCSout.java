import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author 陈辰强
 * @Date 2020/3/21 11:50
 */
public class ABCSout {


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

                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName());
                    nextCondition.signal();
                    condition.await();
                }

            } catch (Exception e) {

            }finally {
                reentrantLock.unlock();
            }
        }
    }


    public static void main(String[] args) {
        ReentrantLock reentrantLockA = new ReentrantLock(true);
        ReentrantLock reentrantLockB = new ReentrantLock(true);
        ReentrantLock reentrantLockC = new ReentrantLock(true);

        Condition conditionA = reentrantLockA.newCondition();
        Condition conditionB = reentrantLockB.newCondition();
        Condition conditionC = reentrantLockC.newCondition();

        Thread a = new Thread(new MyRunnable(reentrantLockA, conditionA, conditionB), "A");
        Thread b = new Thread(new MyRunnable(reentrantLockB, conditionB, conditionC), "B");
        Thread c = new Thread(new MyRunnable(reentrantLockC, conditionC, conditionA), "C");

        a.start();
        b.start();
        c.start();


    }

}
