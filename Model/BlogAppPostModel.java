package com.api.blogAppApi.Model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name="TB_Post")
public class BlogAppPostModel implements Serializable{
    private static final long serialVersionUID = 1l;
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, length = 70)
    private String autor;
    @Column (nullable = false, length = 70)
    private LocalDate data;
    @Column (nullable = false, length = 70)
    private String titulo;
    @Lob
    @Column (columnDefinition = "text")
    private String texte;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }
}
