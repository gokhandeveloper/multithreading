import edu.umd.cs.mtc.MultithreadedTest;

import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MultithreadedtcSampleTest extends MultithreadedTest {
    AtomicInteger ai;
    @Override public void initialize() {
        ai = new AtomicInteger(1);
    }

    public void thread1() {
        while(!ai.compareAndSet(2, 3)) Thread.yield();
    }

    public void thread2() {
        assertTrue(ai.compareAndSet(1, 2));
    }

    @Override public void finish() {
        assertEquals(ai.get(), 3);
    }
}