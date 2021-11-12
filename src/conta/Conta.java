
package conta;
import java.util.Random;

/**
 *
 * @author hevelin
 */
public class Conta {
    private double  saldo;
    private float limite;
    private Cliente titular;;
    private int numConta;
    protected String tipo;
    private boolean status;
    
    
    
     // Criando o gerador de numeros aleatórios
        Random generator = new Random();
    
    //construtor
    public Conta() {
       setStatus(false);
       setSaldo(0);
    }
    
    public void mostrarConta(){
        System.out.println("Número: " + this.getNumConta());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Cliente: " + titular.getName());
        System.out.println("#########################################################");
    }
    
    //Cria umm conta e retona seu status true
    public void criarConta(Cliente titular,String tipo){
       setTitular(titular);
       setSaldo(50);
       setLimite(500);
       setNumConta(generator.nextInt(1000));
        setStatus(true);
    }
    
    //Fecha uma conta
    public void fecharConta(){
       if(this.saldo > 0){
           System.out.println("Essa conta não pode ser fechada! Sua conta ainda tem saldo.");
       }
       else if(this.saldo < 0){
           System.out.println("Essa conta não pode ser fechada! Conta com saldo negativo");
       }
       else{
           setStatus(false);
           System.out.println("Conta fechada com sucesso!");
       }
    }
    
    //despositar um valor
    public void depsitar(double valor){
        if (this.status == true){
            setSaldo(getSaldo() + valor);
        }
        else{
            System.out.println("Conta invalida, impossível depositar!");
        }
    }
    
    
    //sacar um valor
     public void sacar(double valor){
        if (valor == 0){
            System.out.println("Por favor insira um valor!");
            
        }
        else if( valor > this.saldo ){
            System.out.println("Essa operação não pode ser relizada! Valor inerido é maio que o saldo atual");
        }
        else if (this.status == true){
            setSaldo(getSaldo() - valor);
            System.out.println("Operação realizada com sucesso.");
        }
        
     }
     
     public void transfere(Conta destino, double valor) {
         
            if( valor > getSaldo() ){
                System.out.println("Essa operação não pode ser relizada! Valor inerido é maio que o saldo atual");
            }else{
                this.sacar(valor);
                destino.depositar(valor);
            }
            
          System.out.println("Transferência relaizada com sucesso!");
        
       
        }
       
      

  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

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

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Random getGenerator() {
        return generator;
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

    private void depositar(double valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
    
}
