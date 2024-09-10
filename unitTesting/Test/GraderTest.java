import classStuff.Grader;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    void ninetyNineShouldReturnF(){
        var grader = new Grader();
        assertEquals('A',grader.determineLetterGrade(99));
    }

    @Test
    void eightShouldReturnB(){
        var grader = new Grader();
        assertEquals('B',grader.determineLetterGrade(80));
    }

    @Test
    void ninetyShouldReturnA(){
        var grader = new Grader();
        assertEquals('A',grader.determineLetterGrade(90));
    }

    @Test
    void seventyShouldReturnC(){
        var grader = new Grader();
        assertEquals('C',grader.determineLetterGrade(70));
    }

    @Test
    void sixtyShouldReturnD(){
        var grader = new Grader();
        assertEquals('D',grader.determineLetterGrade(60));
    }

    @Test
    void zeroShouldReturnF(){
        var grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(0));
    }

    @Test
    void negativeShouldReturnIllegalArgumentException(){
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class,
                () -> {
            grader.determineLetterGrade(-1);
                });
    }

}