package com.fatec.produto.persistencia;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fatec.produto.model.IProdutoRepository;
import com.fatec.produto.model.Produto;
@SpringBootTest
class TIP_REQ01CadastrarProdutoTests {
	@Autowired
	IProdutoRepository repositorio;

	@Test
	void ct01_cadastrar_produto_com_sucesso() {
		Produto produto = new Produto("Eletrobomba 110V para Maquina de Lavar e Lava Louças", "maquina de lavar", 51.66, 12);
		Produto resultado_esperado = produto;
		Produto resultado_obtido = repositorio.save(produto);
		assertTrue(resultado_esperado.equals(resultado_obtido));
	}

}
