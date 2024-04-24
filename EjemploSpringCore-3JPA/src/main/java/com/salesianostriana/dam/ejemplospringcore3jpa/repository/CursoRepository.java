package com.salesianostriana.dam.ejemplospringcore3jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.ejemplospringcore3jpa.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

}