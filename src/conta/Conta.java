
package conta;

import java.util.Random;

/**
 *
 * @author hevelin
 */
public class Conta {
    private double saldo;
    private float limite;
    private Cliente titular;
    private int numConta;
    protected String tipo;
    private boolean status;

    // Criando o gerador de numeros aleatórios
    Random generator = new Random();

    // construtor
    public Conta() {
        this.status = false;
        this.saldo = 0;
    }

    public void mostrarConta() {
        System.out.println("Número: " + this.numConta);
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Cliente: " + titular.getName());
        System.out.println("#########################################################");
    }

    // Cria umm conta e retona seu status true
    public void criarConta(Cliente titular, String tipo) {
       this.titular = titular;
       this.saldo = 50;
       this.saldo = 500;
       this.numConta = generator.nextInt(1000);
       this.status = true;
    }

    // Fecha uma conta
    public void fecharConta() {
        if (this.saldo > 0) {
            System.out.println("Essa conta não pode ser fechada! Sua conta ainda tem saldo.");
        } else if (this.saldo < 0) {
            System.out.println("Essa conta não pode ser fechada! Conta com saldo negativo");
        } else {
            this.status = false;
            System.out.println("Conta fechada com sucesso!");
        }
    }

    // despositar um valor
    public void depositar(double valor) {
        if (this.status == true) {
            this.saldo= this.saldo + valor;
        } else {
            System.out.println("Conta invalida, impossível depositar!");
        }
    }

    // sacar um valor
    public void sacar(double valor) {
        if (valor == 0) {
            System.out.println("Por favor insira um valor!");

        } else if (valor > this.saldo) {
            System.out.println("Essa operação não pode ser relizada! Valor inerido é maio que o saldo atual");
        } else if (this.status == true) {
            this.saldo = this.saldo - valor;
            System.out.println("Operação realizada com sucesso.");
        }

    }

    public void transfere(Conta destino, double valor) {

        if (valor > this.saldo) {
            System.out.println("Essa operação não pode ser relizada! Valor inerido é maio que o saldo atual");
        } else {
            this.sacar(valor);
            destino.depositar(valor);
        }

        System.out.println("Transferência relaizada com sucesso!");

    }
    
     public Random getGenerator() {
        return generator;
    }

//     get e set

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   
    public void setGenerator(Random generator) {
        this.generator = generator;
    }

    public boolean getStatus() {
        return status;
    }

    private void setStatus(boolean status) {
        this.status = status;
    }

    

}
