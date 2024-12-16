package ContactManagementSystem;

public class Contact {

    private String name;
    private String phoneNumber;
    private String email;


    // Constructor
    Contact(String name, String phoneNumber, String email){

        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;

    }


    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
// toString Method to display the Contact Details

    public String toString(){
        return "Name: "+name + "PhoneNumber: " + phoneNumber+"Email: " + email;

    }

}
