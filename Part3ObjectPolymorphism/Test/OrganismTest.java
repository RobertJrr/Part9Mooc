import exercise1_herds.Organism;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrganismTest {


    @Test
    void setXtoTenConstructor(){
        Organism organism = new Organism(10,10);
        assertEquals(10,organism.getX());
    }
    @Test
    void setYtoTenConstructor(){
        Organism organism = new Organism(10,10);
        assertEquals(10,organism.getY());
    }

    @Test
    void xMovesUpby10NewPosition20(){
        Organism organism = new Organism(10,10);
        organism.move(10,10);
        assertEquals(20,organism.getX());
    }

    @Test
    void yMovesUpby10NewPosition20(){
        Organism organism = new Organism(10,10);
        organism.move(10,10);
        assertEquals(20,organism.getY());
    }


}