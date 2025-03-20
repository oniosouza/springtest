package br.com.oniosouza.desafio_todolist;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.oniosouza.desafio_todolist.entity.Todo;

@SpringBootTest
class DesafioTodolistApplicationTests {

	@Autowired
	private WebTestClient WebTestClient;

	@Test
	void testCreateTodoSucess() {
		var todo = new Todo("todo 1", "desc todo1", false, 1);

	}

	@Test
	void testCreateTodoFailure() {
	}

}
