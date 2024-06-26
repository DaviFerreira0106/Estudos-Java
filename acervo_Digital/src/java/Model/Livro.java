/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author daviferreira
 */
public class Livro {

    // Atributos
    private int id;
    private String titulo;
    private double preco;
    private String autor;
    private String genero;
    private String editora;
    private String idioma;
    private String classificacaoIndicativa;
    private int anoPublicacao;
    private int numeroPaginas;
    private String imagem;

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public void setClassificacaoIndicativa(String classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getImagem() {
        return this.imagem;
    }
    
    public static LivroBuilder getBuilder(){
        return new LivroBuilder();
    }

    public static class LivroBuilder {

        private Livro liv = new Livro();

        public LivroBuilder comId(int id) {
            liv.id = id;
            return this;
        }

        public LivroBuilder comTitulo(String titulo) {
            liv.titulo = titulo;
            return this;
        }

        public LivroBuilder comPreco(double preco) {
            liv.preco = preco;
            return this;
        }

        public LivroBuilder comAutor(String autor) {
            liv.autor = autor;
            return this;
        }

        public LivroBuilder comGenero(String genero) {
            liv.genero = genero;
            return this;
        }

        public LivroBuilder comEditora(String editora) {
            liv.editora = editora;
            return this;
        }

        public LivroBuilder comIdioma(String idioma) {
            liv.idioma = idioma;
            return this;
        }

        public LivroBuilder comClassificacaoIndicativa(String Classificacao_Indicativa) {
            liv.classificacaoIndicativa = Classificacao_Indicativa;
            return this;
        }

        public LivroBuilder comAnoPublicacao(int Ano_Publicacao) {
            liv.anoPublicacao = Ano_Publicacao;
            return this;
        }

        public LivroBuilder comNumeroPaginas(int Numero_Paginas) {
            liv.numeroPaginas = Numero_Paginas;
            return this;
        }

        public LivroBuilder comImagem(String imagem) {
            liv.imagem = imagem;
            return this;
        }

        public Livro constroi() {
            return liv;
        }

    }
}
