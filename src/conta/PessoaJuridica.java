package conta;

public class PessoaJuridica extends Cliente {
    private String razaoSocial;
    private String CNPJ;

    public PessoaJuridica(String endereco, String numeroTelefonico, String CNPJ, String razaoSocial) {
        super(endereco, numeroTelefonico);
        this.setRazaoSocial(razaoSocial);
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

}