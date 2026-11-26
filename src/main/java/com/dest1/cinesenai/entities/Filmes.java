package com.dest1.cinesenai.entities;

import com.dest1.cinesenai.entities.enums.Classificacao;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Filmes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Titulo;
    private String genero;
    private String sinopse;
    private String foto;
    private Classificacao classificacao;

    public Filmes() {
    }

    public Filmes(String titulo, String genero, String sinopse, String foto, Classificacao classificacao) {
        Titulo = titulo;
        this.genero = genero;
        this.sinopse = sinopse;
        this.foto = foto;
        this.classificacao = classificacao;
    }

    public Filmes(int id, String titulo, String genero, String sinopse, String foto, Classificacao classificacao) {
        this.id = id;
        Titulo = titulo;
        this.genero = genero;
        this.sinopse = sinopse;
        this.foto = foto;
        this.classificacao = classificacao;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
