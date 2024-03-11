
package _03_Classes;

/**
 *
 * @author Daniela Zambrano
 */
public class Client {
    private String ID;
    private String name;
    private String lastName;
    private String email;
    private String genre;
    private String phone;

    public Client(String ID, String name, String lastName, String email, String genre, String phone) {
        this.ID = ID;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.genre = genre;
        this.phone = phone;
    }

    
    public Client(String name, String lastName, String email, String genre, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.genre = genre;
        this.phone = phone;
    }
    
    
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}
