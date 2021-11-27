package conta;

public class PessoaFisica extends Cliente {

    private String CPF;
    String nomeTitular;

    public PessoaFisica(String endereco, String numeroTelefone, String CPF, String nomeTitular) {
        super(endereco, numeroTelefone);
        this.CPF = CPF;
        this.nomeTitular = nomeTitular;
    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

}
