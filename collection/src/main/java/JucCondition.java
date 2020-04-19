import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 对于有些流程严格，需要精准把控数据走向的情形
 * 我们必须能够绝对的控制线程的交替执行顺序
 */
public class JucCondition {

    public static void main(String[] args) {
        Job job = new Job();
        new Thread(job :: jobc, "C").start();
        new Thread(job :: joba, "A").start();
        new Thread(job :: jobb, "B").start();
    }

}

class Job {

    private volatile int state = 1;
    private Lock lock = new ReentrantLock();
    private Condition conditiona = lock.newCondition();
    private Condition conditionb = lock.newCondition();
    private Condition conditionc = lock.newCondition();

    public void  joba() {
        lock.lock();
        try {
            while (1 != state) {
                conditiona.await();
            }
            System.out.println("joba()");
            state = 2;
            conditionb.signal();
        } catch (InterruptedException e) {
            e.getMessage();
        }
        finally {
            lock.unlock();
        }
    }

    public void  jobb() {
        lock.lock();
        try {
            while (2 != state) {
                conditionb.await();
            }
            System.out.println("jobb()");
            state = 3;
            conditionc.signal();
        } catch (InterruptedException e) {
            e.getMessage();
        }
        finally {
            lock.unlock();
        }
    }

    public void jobc() {
        lock.lock();
        try {
            while (3 != state) {
                conditionc.await();
            }
            System.out.println("jobc()");
            state = 1;
            conditiona.signal();
        } catch (InterruptedException e) {
            e.getMessage();
        }
        finally {
            lock.unlock();
        }
    }

}

