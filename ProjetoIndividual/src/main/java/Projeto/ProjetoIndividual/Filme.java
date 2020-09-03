package Projeto.ProjetoIndividual;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Filme implements Lucro{
    private String nome;
    private Double precoCompra;
    private Integer diasReservado;

    public Filme(String nome, Double precoCompra, Integer diasReservado) {
        this.nome = nome;
        this.precoCompra = precoCompra;
        this.diasReservado = diasReservado;
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

    public Integer getDiasReservado() {
        return diasReservado;
    }

    public void setDiasReservado(Integer diasReservado) {
        this.diasReservado = diasReservado;
    }

    @Override
    public Double getValorLucro() {
        Double precoReserva=(precoCompra*0.05);
        return (precoReserva*diasReservado);
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", precoCompra=" + precoCompra +
                ", diasReservado=" + diasReservado +
                "}";
    }
}
