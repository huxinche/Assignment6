import java.util.Date;

public class Dog extends Pet implements Boardable {
    private String size;
    private Date boardStart;
    private Date boardEnd;

    public Dog(String name, String ownerName, String color, String size) {
        super(name, ownerName, color);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public void setBoardStart(int month, int day, int year) {
        if (this.checkValidDate(month, day, year)) {
            this.boardStart = new Date(year, month, day);
        }
    }

    @Override
    public void setBoardEnd(int month, int day, int year) {
        if (this.checkValidDate(month, day, year)) {
            this.boardEnd = new Date(year, month, day);
        }
    }

    @Override
    public boolean boarding(int month, int day, int year) {
        Date target = new Date(year, month, day);
        return target.equals(this.boardStart) || target.equals(this.boardEnd);
    }

    @Override
    public String toString() {
        return String.format("DOG: \n" +
                "%s" +
                "Size: %s \n", super.toString(), size);
    }
}
