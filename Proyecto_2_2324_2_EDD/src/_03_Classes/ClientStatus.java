
package _03_Classes;

/**
 *
 * @author Daniela Zambrano
 */
public class ClientStatus {
    private Client client;
    private String arrive;

    public ClientStatus(Client client, String arrive) {
        this.client = client;
        this.arrive = arrive;
    }
    
    

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getArrive() {
        return arrive;
    }

    public void setArrive(String arrive) {
        this.arrive = arrive;
    }
    
}
