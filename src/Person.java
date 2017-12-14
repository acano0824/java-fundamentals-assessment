public class Person {
    public static void main(String[] args) {


    }

    protected String firstName;
    protected String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
       try {
           this.firstName = firstName;
        }
       catch(Exception e){
           throw new IllegalArgumentException("Error. Please input a name: ");
       }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        try {
            this.lastName = lastName;
        }
        catch(Exception e){
            throw new IllegalArgumentException("Error. Please input a name: ");
        }
    }



}
