public class Person {
    private String firstName;
    private String secondName;
    private Integer ticketNum;

    public Person(String f_name, String s_name, int tickets) {
        firstName = f_name;
        secondName = s_name;
        ticketNum = tickets;
    }

    public boolean haveTickets() {
        if (ticketNum > 0)
            return true;
        else
            return false;
    }

    public void dropTicket() {
        ticketNum--;
    }

    public String getName() {
        return firstName + " " + secondName;
    }
}