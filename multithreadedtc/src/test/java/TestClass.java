import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestClass {
    MultithreadedtcSampleTest t ;
    @BeforeAll
    public void setup() {
         t = new MultithreadedtcSampleTest();
    }

    @Test
    public void nothing () {
        t.initialize();
    }
}
