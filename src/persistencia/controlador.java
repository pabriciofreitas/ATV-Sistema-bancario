/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.ArrayList;
import java.util.List;

import conta.Conta;
import conta.PessoaFisica;
import conta.PessoaJuridica;

/**
 *
 * @author pabri
 */
public class controlador {
  public List<PessoaFisica> listaPessoaFisica = new ArrayList<>();
  public List<PessoaJuridica> listaPessoaJuridica = new ArrayList<>();
  public Conta ContaPessoaLogada;
  public Conta ContaPessoaTransferir;
  public boolean validaUsuario(String credencial,String senha){
      System.out.println(this.listaPessoaJuridica.get(0).getRazaoSocial());
    int t1 = this.listaPessoaJuridica.size();

    for (int i = 0; i < t1; i++) {
      if (this.listaPessoaJuridica.get(i).getConta().getSenha().equals(senha)
          && this.listaPessoaJuridica.get(i).getCNPJ().equals(credencial)) {
        this.ContaPessoaLogada = this.listaPessoaJuridica.get(i).getConta();
        return true;
      }
    }
    
//    int t2 = listaPessoaFisica.size();;
//
//    for (int i = 0; i < t2; i++) {
//      if (listaPessoaFisica.get(i).getConta().getSenha().equals(senha)
//          && listaPessoaFisica.get(i).getCPF().equals(credencial)) {
//        ContaPessoaLogada = listaPessoaFisica.get(i).getConta();
//        return true;
//      }
//    }
//    
    return false;
  }
  
  
  
  
  
 // validarCPF(){}

  //validarCNPJ(){}

}
