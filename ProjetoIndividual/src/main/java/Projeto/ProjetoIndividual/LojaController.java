package Projeto.ProjetoIndividual;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/loja")
public class LojaController {

    private List<Lucro> vendas =new ArrayList<>();
    //Lucravel l = new Lucravel();

    @GetMapping
    public ResponseEntity getVendas(){
        //return l.getVendas();
        if (vendas.isEmpty()){
            return ResponseEntity.status(204).build();
        }else{
            return ResponseEntity.ok(vendas);
        }
    }

    @PostMapping("/filme")
    public ResponseEntity registrarVendasFilmes(@RequestBody Filme f){
        //l.addLucro(f);
        vendas.add(f);
        return ResponseEntity.status(201).build();
    }

    @PostMapping("/jogo")
    public ResponseEntity registrarVendasJogos(@RequestBody Jogo j){
        //l.addLucro(j);
        vendas.add(j);
        return ResponseEntity.status(201).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity getLucro(@PathVariable int id){
        //return l.getVendas().get(id-1);
        if(vendas.size()>=id){
            return ResponseEntity.ok(vendas.get(id-1));
        }else{
            return ResponseEntity.status(404).build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteLucro(@PathVariable int id){
        //l.getVendas().remove(id-1);
        if(vendas.size()>=id){
            vendas.remove(id-1);
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.status(404).build();
        }
    }

}
