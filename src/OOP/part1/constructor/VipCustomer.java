package OOP.part1.constructor;

public class VipCustomer {
    private String name ;
    private int limit;
    private String emailAddress;

    public VipCustomer() {
        this("default", 100, "default@default.com");
    }

    public VipCustomer(String name, int limit) {
        this(name, limit, "test@test.com");
    }

    public VipCustomer(String name, int limit, String emailAddress) {
        this.name = name;
        this.limit = limit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public int getLimit() {
        return limit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
