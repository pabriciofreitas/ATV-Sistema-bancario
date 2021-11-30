import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import conta.Conta;
import conta.PessoaFisica;
import conta.PessoaJuridica;

public class App {

  public static List<PessoaFisica> listaPessoaFisica = new ArrayList<>();
  public static List<PessoaJuridica> listaPessoaJuridica = new ArrayList<>();
  public static Conta ContaPessoaLogada;
  public static Conta ContaPessoaTransferir;
  // PessoaFisica kleber = new PessoaFisica("nome", "cpf", "43124214", "421412",
  // "1234", "123");

  public static void tentaNovamente() {
    int y = JOptionPane.showConfirmDialog(null, " DESEJA TENTAR NOVAMENTE ? ", "  ", JOptionPane.YES_NO_OPTION);
    if (y == JOptionPane.NO_OPTION) {
      JOptionPane.showMessageDialog(null, "PROGRAMA ENCERRADO");
    } else {
      login();
    }

  }

  public static void tentaNovamenteTipo() {
    int y = JOptionPane.showConfirmDialog(null, " DESEJA TENTAR NOVAMENTE ? ", "  ", JOptionPane.YES_NO_OPTION);
    if (y == JOptionPane.NO_OPTION) {
      JOptionPane.showMessageDialog(null, "VOLTANDO AO MENU...");
    } else {
      abrirConta();
    }

  }

  public static void sair() {
    int x = JOptionPane.showConfirmDialog(null, " DESEJA REALMENTE SAIR ? ", "  ", JOptionPane.YES_NO_OPTION);
    if (x == JOptionPane.YES_OPTION) {
      JOptionPane.showMessageDialog(null, "PROGRAMA ENCERRADO");
    } else {
      login();
    }
  }

  public static void menuUsuario() {
    int opcaoUsuario = 0;
    while (opcaoUsuario != 6) {
      opcaoUsuario = Integer.parseInt(JOptionPane.showInputDialog(null,
          "1 - SACAR\n" + "2 - DEPOSITAR\n" + "3 - TRANSFERIR\n" + "4 - EXTRATO\n" + "5 - DESLOGAR \n" + "6 - SAIR\n"));
      if (opcaoUsuario == 5) {
        login();
        break;
      }
      if (opcaoUsuario == 6) {
        sair();
        break;
      }
      switch (opcaoUsuario) {
        case 1: {
          sacar();
          break;
        }
        case 2: {
          depositar();
          break;
        }
        case 3: {
          transferir();
          break;
        }
        case 4: {
          extrato();
          break;
        }
        // case 5: {
        // login();
        // break;
        // }
        // case 6: {
        // sair();
        // break;
        // }
        default: {
          JOptionPane.showMessageDialog(null, "OPÇÃO INVALIDA TENTE NOVAMENTE OU DIGITE 6 PARA SAIR");
        }
      }
    }
  }

  public static void imprimir() {
    int t = listaPessoaFisica.size();
    int t1 = listaPessoaJuridica.size();

    for (int i = 0; i < t1; i++) {
      System.out.println("Juridica  " + listaPessoaJuridica.get(i).getConta().getNumConta());
    }
    for (int i = 0; i < t; i++) {
      System.out.println("Fisica  " + listaPessoaFisica.get(i).getConta().getNumConta());
    }
  }

  public static void menuADM() {
    int opcaoADM = 0;
    while (opcaoADM != 5) {
      opcaoADM = Integer
          .parseInt(JOptionPane.showInputDialog(null, "1 - ABRIR CONTA\n" + "2 - DESLOGAR\n" + "3 - SAIR"));
      if (opcaoADM == 2) {
        login();
        break;
      }
      if (opcaoADM == 3) {
        sair();
        break;
      }
      switch (opcaoADM) {
        case 1: {
          abrirConta();
          break;
        }
        case 3: {
          // imprimirContas();
          break;
        }
        // case 4: {
        // login();
        // break;
        // }
        // case 5: {
        // sair();
        // break;
        // }
        default: {
          JOptionPane.showMessageDialog(null, "OPÇÃO INVALIDA TENTE NOVAMENTE OU DIGITE 5 PARA SAIR");
        }
      }
    }

  }

  public static void login() {

    String credencial = JOptionPane.showInputDialog("DIGITE SEU CPF:");
    String senha = JOptionPane.showInputDialog("DIGITE SUA SENHA:");

    if ("1".equals(credencial) && "1".equals(senha)) {
      menuADM();
    } else if (verificarClienteCPF(credencial, senha) || verificarClienteCNPJ(credencial, senha)) {
      menuUsuario();
    } else {
      JOptionPane.showMessageDialog(null, "LOGIN OU SENHA ESTÃO INCORRETOS", "ERRO", JOptionPane.ERROR_MESSAGE);
      tentaNovamente();
    }
  }

  // =============================================================######### FUNÇÃO
  // DE ADM ==========================================
  public static void abrirConta() {
    String tipoPessoa = JOptionPane.showInputDialog("Digite:\n [F] para pessoa fisica\n [J] para juridica"); // hevelin
    if ("F".equals(tipoPessoa) || "f".equals(tipoPessoa)) {

      String nomeTitular = JOptionPane.showInputDialog("> Nome: ");
      String CPF;
      do {
        CPF = JOptionPane.showInputDialog("> CPF: ");
      } while (!VerificarCPF(CPF));

      String numeroTelefone = JOptionPane.showInputDialog("> Telefone: ");
      String endereco = JOptionPane.showInputDialog("> Endereço: ");
      String senha = JOptionPane.showInputDialog("> senha: ");
      PessoaFisica newPessoaFisica = new PessoaFisica(endereco, numeroTelefone, CPF, nomeTitular);
      Conta conta = newPessoaFisica.getConta();
      conta.AbrirConta(senha);
      listaPessoaFisica.add(newPessoaFisica);
      listaPessoaFisica.add(newPessoaFisica);
      // System.out.println(listaPessoaFisica.get(0).getNomeTitular());
    } else if ("J".equals(tipoPessoa) || "j".equals(tipoPessoa)) {
      // conta.PessoaJuridica.PessoaJuridica(String endereco, String numeroTelefonico,
      // String CNPJ, String razaoSocial)
      String razaoSocial = JOptionPane.showInputDialog("> Razão Social: ");
      String CNPJ;
      do {
        CNPJ = JOptionPane.showInputDialog("> CNPJ: ");
      } while (!VerificarCNPJ(CNPJ));

      String numeroTelefone = JOptionPane.showInputDialog("> Telefone: ");
      String endereco = JOptionPane.showInputDialog("> Endereço: ");
      String senha = JOptionPane.showInputDialog("> senha: ");

      PessoaJuridica newPessoaJuridica = new PessoaJuridica(endereco, numeroTelefone, CNPJ, razaoSocial);
      Conta conta = newPessoaJuridica.getConta();
      conta.AbrirConta(senha);
      listaPessoaJuridica.add(newPessoaJuridica);

      // System.out.println(listaPessoaJuridica.get(0).getConta().getNumConta());
    } else {
      JOptionPane.showMessageDialog(null, "OPÇÃO INVALIDA", "ERRO", JOptionPane.ERROR_MESSAGE);
      tentaNovamenteTipo();
    }

    //

  }

  public static void cadastrarCliente() {
    // marcos
    abrirConta();
  }

  public static Boolean verificarClienteCNPJ(String CNPJ, String senha) {

    int t1 = listaPessoaJuridica.size();

    for (int i = 0; i < t1; i++) {
      if (listaPessoaJuridica.get(i).getConta().getSenha().equals(senha)
          && listaPessoaJuridica.get(i).getCNPJ().equals(CNPJ)) {
        ContaPessoaLogada = listaPessoaJuridica.get(i).getConta();

        return true;
      }
    }
    return false;
  }

  public static Boolean verificarClienteCPF(String CPF, String senha) {

    int t1 = listaPessoaFisica.size();

    for (int i = 0; i < t1; i++) {
      if (listaPessoaFisica.get(i).getConta().getSenha().equals(senha)
          && listaPessoaFisica.get(i).getCPF().equals(CPF)) {
        ContaPessoaLogada = listaPessoaFisica.get(i).getConta();
        return true;
      }
    }
    return false;
  }

  public static Boolean VerificarCPF(String CPF) {

    int t1 = listaPessoaFisica.size();

    for (int i = 0; i < t1; i++) {
      if (listaPessoaFisica.get(i).getCPF().equals(CPF)) {
        JOptionPane.showMessageDialog(null, "CPF já cadastrado tente novamente", "ERRO", JOptionPane.ERROR_MESSAGE);
        return false;
      }
    }
    return true;
  }

  public static Boolean VerificarCNPJ(String CNPJ) {

    int t1 = listaPessoaJuridica.size();

    for (int i = 0; i < t1; i++) {
      if (listaPessoaJuridica.get(i).getCNPJ().equals(CNPJ)) {
        JOptionPane.showMessageDialog(null, "CNPJ já cadastrado tente novamente", "ERRO", JOptionPane.ERROR_MESSAGE);
        return false;
      }
    }
    return true;
  }
  // =============================================================######### FUNÇÃO
  // DE CLIENTE ==========================================

  public static void sacar() {
    double valorSaque = Double.parseDouble(JOptionPane.showInputDialog(null, "> Valor do saque: "));

    JOptionPane.showMessageDialog(null, ContaPessoaLogada.sacar(valorSaque));
  }

  public static void depositar() {
    double valorDepositar = Double.parseDouble(JOptionPane.showInputDialog(null, "> Valor do deposito: "));

    JOptionPane.showMessageDialog(null, ContaPessoaLogada.depositar(valorDepositar));
  }

  public static void transferir() {
    System.out.println(listaPessoaJuridica.get(0).getConta().getNumConta());
    double valorTransferir = Double.parseDouble(JOptionPane.showInputDialog(null, "> Valor a transferir: "));
    int numcont = Integer.parseInt(JOptionPane.showInputDialog(null, "> numero da conta: "));
    if (verificarClienteConta(numcont) == true){
        System.out.println("Certo");
    }else{
        System.out.println("continua errado");
    }
    
    
  }


  public static Boolean verificarClienteConta(int numcont) {
    int t1 = listaPessoaFisica.size();

    for (int i = 0; i < t1; i++) {
      if (listaPessoaFisica.get(i).getConta().getNumConta() == numcont) {
        ContaPessoaTransferir = listaPessoaFisica.get(i).getConta();
        return true;
      }
    }
    int t2 = listaPessoaJuridica.size();
    for (int i = 0; i < t2; i++) {
      if (listaPessoaJuridica.get(i).getConta().getNumConta()==numcont) {
        ContaPessoaTransferir = listaPessoaJuridica.get(i).getConta();
        return true;
      }
    }

    return false;
  }


  public static void extrato() {
      
      
    // kleber
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
