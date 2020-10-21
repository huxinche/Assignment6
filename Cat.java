import java.util.Date;

public class Cat extends Pet implements Boardable {
    private String hairLength;
    private Date boardStart;
    private Date boardEnd;

    public Cat(String name, String ownerName, String color, String hairLength) {
        super(name, ownerName, color);
        this.hairLength = hairLength;
    }

    public String getHairLength() {
        return hairLength;
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
        return String.format("CAT: \n" +
                "%s" +
                "Hair: %s \n", super.toString(), hairLength);
    }
}
