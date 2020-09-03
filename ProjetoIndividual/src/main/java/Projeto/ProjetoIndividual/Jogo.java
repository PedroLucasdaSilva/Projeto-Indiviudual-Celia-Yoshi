package Projeto.ProjetoIndividual;

public class Jogo implements Lucro{
    private String nome;
    private Double precoCompra;

    public Jogo(String nome, Double precoCompra) {
        this.nome = nome;
        this.precoCompra = precoCompra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(Double precoCompra) {
        this.precoCompra = precoCompra;
    }

    @Override
    public Double getValorLucro() {
        Double precoRevenda=(precoCompra*1.08);
        return (precoRevenda-precoCompra);
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "nome='" + nome + '\'' +
                ", precoCompra=" + precoCompra +
                '}';
    }
}
