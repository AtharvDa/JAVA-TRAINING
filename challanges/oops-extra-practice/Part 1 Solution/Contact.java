
public class Contact {
    
    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    public Contact(String name, String phoneNumber, String birthDate, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age = age;
    }

    public Contact(Contact c) {
        this.name = c.name;
        this.phoneNumber = c.phoneNumber;
        this.birthDate = c.birthDate;
        this.age = c.age;
    }
   
}
