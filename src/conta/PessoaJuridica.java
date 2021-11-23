package conta;

public class PessoaJuridica extends Cliente {
    private String cnpj;

    public PessoaJuridica(String name, String datansc, String email, String cnpj, String login, String senha) {
        super(name, datansc, email, login, senha);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}