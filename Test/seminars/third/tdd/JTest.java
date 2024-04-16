package seminars.third.tdd;

import org.junit.jupiter.api.Test;
import seminars.third.tdd.OddNumber;

public class JTest {
    @Test
    public void odd(){
        OddNumber oddNumber = new OddNumber();
        assert !oddNumber.evenOddNumber(1);
    }
    @Test
    public void even(){
        OddNumber oddNumber = new OddNumber();
        assert oddNumber.evenOddNumber(2);
    }



}
