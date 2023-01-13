public class User {
    private String name;
    private String email;
    private String password;

    public User() {
        
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public User signIn(String name, String email) {
        return new User(name, email);
    }

    public User signUp(String name, String email, String password) {
        return new User(name, email, password);
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
