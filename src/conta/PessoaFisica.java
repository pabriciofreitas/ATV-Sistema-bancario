package conta;

public class PessoaFisica extends Cliente {

    private String cpf;

    public PessoaFisica(String name, String datansc, String email, String cpf, String login, String senha) {
        super(name, datansc, email, login, senha);
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String returnPrint() {
        return this.getName() + this.getDatansc() + this.getEmail();
    }

}
