public class User extends Person {

    public static void main(String[] args) {

    }

    public User(boolean admin) {
        this.admin = admin;
    }

    public User(String firstName, String lastName, boolean admin) {
        super(firstName, lastName);
        this.admin = admin;
    }

    protected boolean admin;

    public boolean isAdmin() {
        return admin;
    }
}
