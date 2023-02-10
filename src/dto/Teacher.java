package dto;

public class Teacher extends User {
    private String rank;

    public Teacher(String fio, String rank) {
        super(fio);
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
