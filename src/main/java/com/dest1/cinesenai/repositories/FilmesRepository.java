package com.dest1.cinesenai.repositories;

import com.dest1.cinesenai.entities.Filmes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmesRepository extends JpaRepository<Filmes, Integer> {
}
