import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import conta.Cliente;
import conta.PessoaFisica;

public class App {
  public static List<Cliente> listaClientes = new ArrayList<>();
  public static Cliente clienteLogado;
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

  public static void menuADM() {
    int opcaoADM = 0;
    while (opcaoADM != 5) {
      opcaoADM = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - CADASTRAR CLIENTE\n" + "2 - ABRIR CONTA\n"
          + "3 - IMPRIMIR TODAS AS CONTAS\n" + "4 - DESLOGAR\n" + "5 - SAIR"));
      if (opcaoADM == 4) {
        login();
        break;
      }
      if (opcaoADM == 5) {
        sair();
        break;
      }
      switch (opcaoADM) {
      case 1: {
        cadastrarCliente();
        break;
      }
      case 2: {
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
    String id, senha;
    id = JOptionPane.showInputDialog("DIGITE SEU LOGIN:");
    senha = JOptionPane.showInputDialog("DIGITE SUA SENHA:");

    if ("admin".equals(id) && "admin".equals(senha)) {
      menuADM();
    } else if (verificarCliente(id, senha)) {
      menuUsuario();
    } else {
      JOptionPane.showMessageDialog(null, "LOGIN OU SENHA ESTÃO INCORRETOS", "ERRO", JOptionPane.ERROR_MESSAGE);
      tentaNovamente();
    }
  }

  // =============================================================######### FUNÇÃO
  // DE ADM ==========================================
  public static void abrirConta() {
    // hevelin
    PessoaFisica kleber = new PessoaFisica("nome", "cpf", "43124214", "421412", "123", "123");
    listaClientes.add(kleber);
    System.out.println(listaClientes.get(0).getName());

  }

  public static void cadastrarCliente() {
    // marcos
    abrirConta();
  }

  public static Boolean verificarCliente(String id, String senha) {
    // lista[1,2,3] 3
    for (int index = 0; index < listaClientes.size(); index++) {
      if (listaClientes.get(index).getLogin() == id && listaClientes.get(index).getSenha() == senha) {
        clienteLogado = listaClientes.get(index);
        return true;
      }
    }
    return false;
  }
  // =============================================================######### FUNÇÃO
  // DE CLIENTE ==========================================

  public static void sacar() {
    // clienteLogado.
    // hevelin
    JOptionPane.showMessageDialog(null, "saque bem sucessedido");
  }

  public static void depositar() {
    // pabricio
  }

  public static void transferir() {
    // kleber
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
