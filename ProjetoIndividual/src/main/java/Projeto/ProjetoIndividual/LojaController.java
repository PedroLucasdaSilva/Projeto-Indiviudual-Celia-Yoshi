package Projeto.ProjetoIndividual;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/loja")
public class LojaController {

    private List<Lucro> vendas =new ArrayList<>();
    //Lucravel l = new Lucravel();

    @GetMapping("/listar")
    public List<Lucro> getVendas(){
        //return l.getVendas();
        return vendas;
    }

    @PostMapping("/registrar/filme")
    public void registrarVendasFilmes(@RequestBody Filme f){
        //l.addLucro(f);
        vendas.add(f);
    }

    @PostMapping("/registrar/jogo")
    public void registrarVendasJogos(@RequestBody Jogo j){
        //l.addLucro(j);
        vendas.add(j);
    }

    @GetMapping("/listar/{id}")
    public Lucro getLucro(@PathVariable int id){
        //return l.getVendas().get(id-1);
        return vendas.get(id-1);
    }

    @DeleteMapping("/deletar/{id}")
    public void deleteLucro(@PathVariable int id){
        //l.getVendas().remove(id-1);
        vendas.remove(id-1);
    }

}
