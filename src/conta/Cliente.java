
package conta;

/**
 *
 * @author hevelin
 */
public class Cliente {

    private String name;
    private int CPF;
    private String email;
    private String endereco;

    // criando construtor
    public Cliente(String name, int CPF, String email, String endereco) {
        this.name = name;
        this.CPF = CPF;
        this.email = email;
        this.endereco = endereco;
    }

    public boolean VerificarCPF() {
        return false;

    }

    public String getName() {
        return name;
    }

    public int getCPF() {
        return CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
