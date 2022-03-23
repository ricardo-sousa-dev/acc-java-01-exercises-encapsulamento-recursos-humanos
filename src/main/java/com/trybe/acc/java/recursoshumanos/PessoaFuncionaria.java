package com.trybe.acc.java.recursoshumanos;

/** Classe que representa uma pessoa funcionária no sistema de recursos humanos. */
public class PessoaFuncionaria {
  private String nomeCompleto;
  private String cpf;
  private String endereco;
  private double salario;

  /** Construtor com parâmetros. */
  public PessoaFuncionaria(String nomeCompleto, String cpf, String endereco, double salario) {
    this.nomeCompleto = nomeCompleto;
    this.cpf = cpf;
    this.endereco = endereco;
    this.salario = salario;
  }

  /** Método que retorna o nomeCompleto da pessoa funcionária. */
  public String getNomeCompleto() {
    return this.nomeCompleto;
  }

  /** Método que retorna o CPF da pessoa funcionária. */
  public String getCpf() {
    return this.cpf;
  }

  /** Método que retorna o endereco da pessoa funcionária. */
  public String getEndereco() {
    return this.endereco;
  }

  /** Método que retorna o salário da pessoa funcionária. */
  public double getSalario() {
    return this.salario;
  }

  /** Método que define o nomeCompleto da pessoa funcionária. */
  public void setNomeCompleto(String nomeCompleto) {
    this.nomeCompleto = nomeCompleto;
  }

  /** Método que define o CPF da pessoa funcionária. */
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  /** Método que define o endereco da pessoa funcionária. */
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  /** Método que define o salário da pessoa funcionária. */
  public void setSalario(double salario) {
    this.salario = salario;
  }

  /** Método que retorna uma representação em String da pessoa funcionária. */
  public String toString() {
    return "Nome Completo: "
        + this.nomeCompleto
        + "\nCPF: "
        + this.cpf
        + "\nEndereço: "
        + this.endereco
        + "\nSalário: "
        + this.salario;
  }
}
