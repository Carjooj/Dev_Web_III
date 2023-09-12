package com.fatec.sigvs.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.sigvs.model.Catalogo;
import com.fatec.sigvs.model.IImagemRepository;
import com.fatec.sigvs.model.IProdutoRepository;
import com.fatec.sigvs.model.Imagem;
import com.fatec.sigvs.model.Produto;

@Service
public class ProdutoServico implements IProdutoServico {
	@Autowired
	IProdutoRepository repositoryP;
	@Autowired
	IImagemRepository repositoryI;

	@Override
	public List<Catalogo> consultaCatalogo() {
		Catalogo c = null;
		List<Catalogo> lista = new ArrayList<>();
		List<Produto> listaP = repositoryP.findAll();
		List<Imagem> listaI = repositoryI.findAll();
		for (Produto p : listaP) {
			for (Imagem i : listaI) {
				if (p.getId().equals(i.getId())) {
					c = new Catalogo(p.getId(), p.getDescricao(), p.getCategoria(), p.getCusto(),
							p.getQuantidadeNoEstoque(), i.getArquivo());
					lista.add(c);
				}
			}
		}
		return lista;
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
