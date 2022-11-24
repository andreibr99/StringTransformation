import org.junit.jupiter.api.Test;

import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class StringTransformationTest {
    @Test
    void stringIsEmpty(){
        var test = new StringTransformation();
        assertNull(test.stringTransformation(""));
    }

    @Test
    void stringHasOnlyHeader(){
        var test = new StringTransformation();
        assertNull(test.stringTransformation("full_name, email, location"));
    }

    @Test
    void stringWithoutDuplicates(){
        var test = new StringTransformation();
        String string = "full_name, email, location\n" +
                "Aron, aron.bla@email.com, California\n" +
                "Aron, aron.bla@email.com, California\n" +
                "Aron, aron.bla@email.com, California\n";
        TreeSet<String> example = new TreeSet<>();
        example.add("A:");
        example.add("Aron, aron.bla@email.com, California");
        assertEquals(example,test.stringTransformation(string));
    }

    @Test
    void groupedStrings(){
        var test = new StringTransformation();
        String string = "full_name, email, location\n" +
                "Aron, aron.bla@email.com, California\n" +
                "Bogdan, vox@example.com, Resita\n" +
                "Cosmin, kox@bla.com, Giurgiu\n" +
                "Crina, ggl@test.com, Letcani\n";
        TreeSet<String> example = new TreeSet<>();
        example.add("A:");
        example.add("Aron, aron.bla@email.com, California");
        example.add("B:");
        example.add("Bogdan, vox@example.com, Resita");
        example.add("C:");
        example.add("Cosmin, kox@bla.com, Giurgiu");
        example.add("Crina, ggl@test.com, Letcani");

        assertEquals(example,test.stringTransformation(string));
    }

}