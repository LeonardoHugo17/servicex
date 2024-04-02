package br.com.leonardohugo.servicex.categoria.resource;

import br.com.leonardohugo.servicex.categoria.domain.Categoria;
import br.com.leonardohugo.servicex.categoria.service.CategoriaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

    private CategoriaService categoriaService;

    public CategoriaResource(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping
    public ResponseEntity<List<Categoria>> listarCategorias() {
        return new ResponseEntity<>(categoriaService.listarCategorias(), HttpStatus.OK);
    }

    @GetMapping("/{categoriaId}")
    public ResponseEntity<Categoria> buscarCategoria(@PathVariable("categoriaId") Integer categoriaId) {
        return categoriaService.procurarCategoria(categoriaId)
                .map(categoria -> new ResponseEntity<>(categoria, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


    @PostMapping
    public ResponseEntity<Categoria> criarCategoria(@RequestBody Categoria categoria) {
        return new ResponseEntity<>(categoriaService.salvarCategoria(categoria), HttpStatus.CREATED);
    }

    @DeleteMapping("/{categoriaId}")
    public ResponseEntity<Void> excluirCategoria(@PathVariable("categoriaId") Integer categoriaId) {
        categoriaService.deletarCategoria(categoriaId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("{categoriaId}")
    public ResponseEntity<Categoria> atualizarCategoria(@PathVariable Integer categoriaId,
                                                        @RequestBody Categoria categoria) {

        if(categoriaService.procurarCategoria(categoriaId).isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND)    ;
        }

        categoria.setId(categoriaId);

        return new ResponseEntity<>(categoriaService.salvarCategoria(categoria), HttpStatus.OK);
    }
}