package br.com.leonardohugo.servicex.categoria.service;

import br.com.leonardohugo.servicex.categoria.domain.Categoria;
import br.com.leonardohugo.servicex.categoria.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    private CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public List<Categoria> listarCategorias() {
        return categoriaRepository.findAll();
    }

    public Optional<Categoria> procurarCategoria(Integer id) {
        return categoriaRepository.findById(id);
    }

    public Categoria salvarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public void deletarCategoria(Integer id) {
        Categoria categoria = procurarCategoria(id).get();

        categoriaRepository.delete(categoria);
    }
}
