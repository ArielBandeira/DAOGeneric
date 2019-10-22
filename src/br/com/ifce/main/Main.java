package br.com.ifce.main;

import java.util.List;

import br.com.ifce.beans.Editora;
import br.com.ifce.beans.Livro;
import br.com.ifce.dao.DaoException;
import br.com.ifce.dao.EditoraDAO;
import br.com.ifce.dao.LivroDAO;

public class Main {

  public static void main(String[] args) throws DaoException {
    LivroDAO livrodao = new LivroDAO();
    EditoraDAO editoradao = new EditoraDAO();
    
    Editora e = new Editora();
    e.setNome("Globo");
    e.setEmail("globo@globo.com");
    editoradao.save(e);
    
    // Criar livro
    Livro l = new Livro();
    l.setTitulo("Meu novo livro 4.0!");
    l.setPreco(10.0);
    livrodao.save(l);
       
    // Busca pelo ID
    Livro encontrado = livrodao.find(2L);
    System.out.println(encontrado);
    
    // Remover
    livrodao.remove(encontrado);
    
    // Atualizar
    encontrado.setPreco(100.0);
    livrodao.update(l);
    
    // Listagem
    List<Livro> resultado = livrodao.all();
    System.out.println(resultado);

  }

}
