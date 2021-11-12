
import conta.Cliente;
import conta.Conta;



/**
 *
 * @author hevelin
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //cadstro o cliente
        Cliente primeiroCliente = new  Cliente("Carlos", "785.695.216-32");
         Cliente SegundoCliente = new  Cliente("Maria", "685.545.656-56");
        
        // Na hora de criar uma conta deve se adicionar CC para conta corrente e CP para conta poupança

      //Instancia a class
        Conta conta01 = new Conta();
         Conta conta02= new Conta();
        
         //cadstro a conta com os dados do cliente
        conta01.criarConta(primeiroCliente, "CC");
        conta02.criarConta(SegundoCliente, "CC");
        
        //DESPOISTAR
        conta01.depsitar(1000);
        
        //mostrar conta depois do deposito 
        conta01.mostrarConta();
        conta02.mostrarConta();
        
       
        
    }
    
}
