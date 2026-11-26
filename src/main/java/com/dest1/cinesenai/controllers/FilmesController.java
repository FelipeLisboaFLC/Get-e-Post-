package com.dest1.cinesenai.controllers;

import com.dest1.cinesenai.entities.Filmes;
import com.dest1.cinesenai.repositories.FilmesRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("Filmes")
@RestController
public class FilmesController {


    private final FilmesRepository repository;
    public FilmesController(FilmesRepository repository) {
        this.repository = repository;
    }

   @GetMapping
   public List<Filmes> mostrar(){
       return repository.findAll();
   }

    @PostMapping
    public Filmes criar(@RequestBody Filmes f){
    return repository.save(f);
}
}
