public class Person {
    private String f_name;
    private String l_name;
    private String phoneNumber;
    private int zipcode;
    private String relation;

    public Person(String f_name, String l_name, String phoneNumber, int zipcode, String relation)
    {
        this.f_name=f_name;
        this.l_name=l_name;
        this.phoneNumber=phoneNumber;
        this.zipcode=zipcode;
        this.relation=relation;
    }

    public String getF_name() {
        return f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getZipcode() {
        return zipcode;
    }

    public String getRelation() {
        return relation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "first name='" + f_name + '\'' +
                ", last name='" + l_name + '\'' +
                ", phone no='" + phoneNumber + '\'' +
                ", zipcode=" + zipcode +
                ", relation='" + relation + '\'' +
                '}';
    }

}
