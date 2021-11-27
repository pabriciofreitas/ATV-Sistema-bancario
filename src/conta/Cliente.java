package conta;

public class Cliente {
    // private String name;
    private String endereco;
    private String numeroTelefone;
    private Conta conta = new Conta();

    public Cliente(String endereco, String numeroTelefone) {
        this.endereco = endereco;
        this.numeroTelefone = numeroTelefone;
        this.conta = conta;
    }

    public Conta getConta() {
        return this.conta;
    }
    // private String address;
    // private String telCel;

    // public String getLogin() {
    // return this.login;
    // }

    // public void setLogin(String login) {
    // this.login = login;
    // }

    // public String getSenha() {
    // return this.senha;
    // }

    // public void setSenha(String senha) {
    // this.senha = senha;
    // }

    // // }
    // public String getName() {
    // return this.name;
    // }

    // public void setName(String name) {
    // this.name = name;
    // }

    // public String getDatansc() {
    // return datansc;
    // }

    // // public void setDatansc(String datensc) {
    // // this.datansc = datansc;
    // // }

    // public String getEmail() {
    // return email;
    // }

    // public void setEmail(String email) {
    // this.email = email;
    // }

    // public String getAddress() {
    // return address;
    // }

    // public void setAddress(String address) {
    // this.address = address;
    // }

    // public String getTelCel() {
    // return telCel;
    // }

    // public void setTelCel(String telCel) {
    // this.telCel = telCel;
    // }

    // public String getLogin() {
    // return login;
    // }

    // public void setLogin(String login) {
    // this.login = login;
    // }

    // public String getSenha() {
    // return senha;
    // }

    // public void setSenha(String senha) {
    // this.senha = senha;
    // }

}
