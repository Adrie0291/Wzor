import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class brudnyKodTest {

    @Test
    void sumNumber() {

        int firstNumber = 5;
        int secondNumber = 10;
        int excpected = 15;

        int actual = brudnyKod.sumNumber(firstNumber, secondNumber, "pustka"); // property show siema
        Assertions.assertEquals(excpected, actual);
    }
}
