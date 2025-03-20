package br.com.oniosouza.desafio_todolist.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.oniosouza.desafio_todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

    
}
