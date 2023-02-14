import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    @Test
    public void test() {
        PosterManager manager = new PosterManager();
        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        String[] expected = {"Film I", "Film II", "Film III"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }
}
