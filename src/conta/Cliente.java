
package conta;

/**
 *
 * @author hevelin
 */
public class Cliente {
    
   private String name;
   private String cpf;
   private String email;
    private String address;
   
   

    public Cliente(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
       
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    
}
