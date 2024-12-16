public class Visitor extends Person{    //主题公园游客

    private String ticketType;  //票类型
    private String ticketDate;  //票日期  格式：2024-12-10

    public Visitor() {
    }

    public Visitor(String name, char gender, int age, String ticketType, String ticketDate) {
        super(name, gender, age);
        this.ticketType = ticketType;
        this.ticketDate = ticketDate;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getTicketDate() {
        return ticketDate;
    }

    public void setTicketDate(String ticketDate) {
        this.ticketDate = ticketDate;
    }

    @Override
    public String toString() {
        return "Visitor:"+ super.toString() + "\t" + ticketType + "\t" + ticketDate;
    }
}
