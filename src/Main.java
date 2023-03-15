import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    private static List<Person> generateClients() {
        List<Person> lst = new ArrayList<>();
        lst.add(new Person("Геннадий", "Аркадьевич", 12));
        lst.add(new Person("Юлия", "Московская", 3));
        lst.add(new Person("Дональд", "Августин", 8));
        lst.add(new Person("Дмитрий", "Зайцев", 18));
        lst.add(new Person("Владимир", "Хабаров", 5));
        return lst;
    }

    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());
        while (!queue.isEmpty()) {
            Person ps = queue.poll();
            ps.dropTicket();
            System.out.printf("%s прокатился на атракционе, билетов осталось %d\n", ps.getName(), ps.getTickets());
            if (ps.haveTickets()) {
                queue.add(ps);
            }
        }
    }
}