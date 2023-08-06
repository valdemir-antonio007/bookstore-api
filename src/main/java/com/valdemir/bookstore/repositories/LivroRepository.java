package com.valdemir.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valdemir.bookstore.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {

}
