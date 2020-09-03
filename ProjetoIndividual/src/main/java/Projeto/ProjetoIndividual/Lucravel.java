package Projeto.ProjetoIndividual;

import java.util.ArrayList;
import java.util.List;

public class Lucravel {

    private List<Lucro> vendas = new ArrayList<>();

    public void addLucro(Lucro l){
        vendas.add(l);
    }

    public List<Lucro> getVendas(){
        return vendas;
    }
}
