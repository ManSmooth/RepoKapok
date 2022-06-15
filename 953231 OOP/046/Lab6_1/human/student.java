package Lab6_1.human;

public class student extends person {
    public enum statusEnum {
        FRESHMAN,
        SOPHOMORE,
        JUNIOR,
        SENIOR
    };

    private final statusEnum status;

    public student(statusEnum s) {
        super();
        status = s;
    }

    public String toString() {
        return String.format("%s student\nname: %s\naddress: %s\nemail: %s\nphone: %s",
                status == statusEnum.FRESHMAN ? "Freshman"
                        : status == statusEnum.SOPHOMORE ? "Sophomore"
                                : status == statusEnum.JUNIOR ? "Junior" : "Senior",
                getName(),
                getAddress(),
                getEmailAddress(),
                getPhone());
    }

    public statusEnum getStatus() {
        return status;
    }
}
