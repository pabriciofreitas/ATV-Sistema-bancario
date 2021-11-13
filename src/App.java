package menu;

import javax.swing.JOptionPane;


public class Menu {

    public static void novamente(){
        
     int y = JOptionPane.showConfirmDialog(null, " DESEJA TENTAR NOVAMENTE ? ", "  ",  JOptionPane.YES_NO_OPTION);
     if (y == JOptionPane.NO_OPTION){
     JOptionPane.showMessageDialog(null,"PROGRAMA ENCERRADO");
     }else{
     login();
     }
    }
    public static void sair(){
        
     int x = JOptionPane.showConfirmDialog(null, " DESEJA REALMENTE SAIR ? ", "  ",  JOptionPane.YES_NO_OPTION);
     if (x == JOptionPane.YES_OPTION){
     JOptionPane.showMessageDialog(null,"PROGRAMA ENCERRADO");
     }else{
     login();
     }
    }
    
    
    public static void login (){
     int a = 0; 
     int b = 0;
        String id, senha; 
       
       id = JOptionPane.showInputDialog("DIGITE SEU LOGIN:");
       senha = JOptionPane.showInputDialog("DIGITE SUA SENHA:");
       if ("admin".equals(id) && "admin".equals(senha) ){
          a = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - ABRIR CONTA\n" + "2 - IMPRIMIR TODAS AS CONTAS\n" + "3 - SAIR"));
          {  
              if (a == 3){
              sair();
          }}
        }else if ("123".equals(id) && "123".equals(senha)){
          b = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - SACAR\n" + "2 - DEPOSITAR\n" + "3 - TRANSFERIR\n" + "4 - EXTRATO\n" + "5 - SAIR\n"));
        }if(b == 5){
            sair();
        }else{
        JOptionPane.showMessageDialog(null, "LOGIN OU SENHA ESTÃO INCORRETOS", "ERRO", JOptionPane.ERROR_MESSAGE);
        novamente();
       }      
    }
    
  

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    login();
    /*
     * cadstro o cliente Cliente primeiroCliente = new Cliente("Carlos",
     * "785.695.216-32"); Cliente SegundoCliente = new Cliente("Maria",
     * "685.545.656-56");
     * 
     * // Na hora de criar uma conta deve se adicionar CC para conta corrente e CP
     * para // conta poupança
     * 
     * // Instancia a class Conta conta01 = new Conta(); Conta conta02 = new
     * Conta();
     * 
     * // cadstro a conta com os dados do cliente
     * conta01.criarConta(primeiroCliente, "CC"); conta02.criarConta(SegundoCliente,
     * "CC");
     * 
     * // DESPOISTAR conta01.depsitar(1000);
     * 
     * // mostrar conta depois do deposito conta01.mostrarConta();
     * conta02.mostrarConta();
     */
  }

}
