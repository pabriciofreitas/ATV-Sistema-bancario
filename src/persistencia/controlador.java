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

  validarCPF(){}

  validarCNPJ(){}

}
