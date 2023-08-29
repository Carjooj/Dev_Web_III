package com.fatec.sigvs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.sigvs.model.IProdutoRepository;
import com.fatec.sigvs.model.Produto;

@Service
public class ProdutoServico implements IProdutoServico {
	@Autowired
	IProdutoRepository repository;
	@Override
	public List<Produto> consultaCatalogo() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Produto> consultaPorDescricao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Produto> cadastrar(Produto produto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Produto> consultarPorId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Produto> atualizar(Long id, Produto produto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		
	}
	
}
