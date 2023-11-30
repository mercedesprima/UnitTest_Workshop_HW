import java.util.List;

//a. Рассчитывает среднее значение каждого списка.
//        b. Сравнивает эти средние значения и выводит соответствующее сообщение:
//        - ""Первый список имеет большее среднее значение"", если среднее значение первого списка больше.
//        - ""Второй список имеет большее среднее значение"", если среднее значение второго списка больше.
//        - ""Средние значения равны"", если средние значения списков равны.
public class CompareAvgs {
    public String compareLists(List<Integer> list1, List<Integer> list2) {
        double avgList1 = calculateAvg(list1);
        double avgList2 = calculateAvg(list2);

        if (avgList1 > avgList2) {
            return "Первый список имеет большее среднее значение";
        } else if (avgList2 > avgList1) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }

    private double calculateAvg(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (int num : list) {
            sum += num;
        }

        return (double) sum / list.size();
    }
}
