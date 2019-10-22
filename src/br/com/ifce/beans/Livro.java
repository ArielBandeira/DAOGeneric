package br.com.ifce.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Livro {
  
  @Id
  @GeneratedValue
  private Long id;
  private String titulo;
  private Double preco;
  
  public Livro() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public Double getPreco() {
    return preco;
  }

  public void setPreco(Double preco) {
    this.preco = preco;
  }
  
  @Override
  public String toString() {
    return this.id + " | " + this.titulo;
  }
}
