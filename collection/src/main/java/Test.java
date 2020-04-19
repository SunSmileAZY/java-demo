import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;

/**
 * @author anzy
 * @version 1.0
 * @date 2020/1/28 22:20
 **/
public class Test {

    public class TestChild extends Test{

    }

    public Test aa(){

        return null;
    }

    public class aa extends  Test{

        @Override
        public TestChild aa(){
            return null;
        }
    }

    public static void main(String[] args) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("a",null);

        System.out.println(concurrentHashMap);

        HashSet hashSet = new HashSet();
        hashSet.add(1);
    }
}
