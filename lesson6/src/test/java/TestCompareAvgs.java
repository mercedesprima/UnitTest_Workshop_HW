import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCompareAvgs {
    @Test
    public void testCompareLists_FirstListGreater() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(1, 2);
        CompareAvgs compareAvgs = new CompareAvgs();
        String result = compareAvgs.compareLists(list1, list2);
        assertEquals("Первый список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareLists_SecondListGreater() {
        List<Integer> list1 = Arrays.asList(1, 2);
        List<Integer> list2 = Arrays.asList(1, 2, 3);
        CompareAvgs compareAvgs = new CompareAvgs();
        String result = compareAvgs.compareLists(list1, list2);
        assertEquals("Второй список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareLists_EqualAverages() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 2, 1);
        CompareAvgs compareAvgs = new CompareAvgs();
        String result = compareAvgs.compareLists(list1, list2);
        assertEquals("Средние значения равны", result);
    }
}
