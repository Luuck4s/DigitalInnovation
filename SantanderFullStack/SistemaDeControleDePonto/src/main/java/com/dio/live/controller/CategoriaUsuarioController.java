package com.dio.live.controller;


import com.dio.live.model.CategoriaUsuario;
import com.dio.live.service.CategoriaUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/categoria")
public class CategoriaUsuarioController {

    @Autowired
    CategoriaUsuarioService categoriaUsuarioService;

    @PostMapping
    public CategoriaUsuario createCategoria(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioService.saveCategoria(categoriaUsuario);
    }

    @GetMapping
    public List<CategoriaUsuario> getCategoriaList(){
        return categoriaUsuarioService.findAll();
    }

    @GetMapping("/{idCategoria}")
    public ResponseEntity<CategoriaUsuario> getJornadaByID(@PathVariable("idCategoria") Long idCategoria) throws Exception {
        return ResponseEntity.ok(categoriaUsuarioService.getById(idCategoria).orElseThrow(() -> new NoSuchElementException("Not Found!")));
    }

    @PutMapping
    public CategoriaUsuario updateJornada(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioService.updateCategoria(categoriaUsuario);
    }

    @DeleteMapping("/{idCategoria}")
    public void deleteCategoria(@PathVariable("idCategoria") Long idCategoria){
        categoriaUsuarioService.deleteCategoria(idCategoria);
    }

}
