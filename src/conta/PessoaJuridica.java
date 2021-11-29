package conta;

public class PessoaJuridica extends Cliente {
    private String razaoSocial;
    private String CNPJ;

    public PessoaJuridica(String endereco, String numeroTelefonico, String CNPJ, String razaoSocial) {
        super(endereco, numeroTelefonico);
        this.setRazaoSocial(razaoSocial);
        this.setCNPJ(CNPJ);
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String cNPJ) {
        this.CNPJ = cNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

}