public class Pet {

    public static final int MALE = 0;
    public static final int FEMALE = 1;
    public static final int SPAYED = 2;
    public static final int NEUTERED = 3;
    private String petName;
    private String ownerName;
    private String color;
    private int sex;

    private String[] sexFlags = {"MALE", "FEMALE", "SPAYED", "NEUTERED"};

    public Pet(String name, String ownerName, String color) {
        this.petName = name;
        this.ownerName = ownerName;
        this.color = color;
    }

    public String getPetName() {
        return petName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getColor() {
        return color;
    }

    public String getSex() {
        return sexFlags[sex];
    }
    public boolean checkValidDate(int month, int day, int year) {
        if (year < 1000 || year > 9999)
            return false;
        if (month <= 0 || month > 12)
            return false;
        return day > 0 && day <= 31;
    }
    @Override
    public String toString() {
        return String.format("%s owned by %s \n" +
                "Color: %s \n" +
                "Sex: %s", petName, ownerName, color, getSex());
    }
}
