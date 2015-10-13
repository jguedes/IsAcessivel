package br.com.jguedes.tcc.model.repository;

import java.io.Serializable;

import ases.LeitorDeTemporarios;
import ases.RelatorioDaUrl;
import br.com.jguedes.tcc.model.criterioavaliacao.Profundidade;
import br.com.jguedes.tcc.model.relatorioresumido.ResumoDeAvaliacao;
import br.com.jguedes.tcc.util.ContextoDeAvaliacao;

public class RelatorioDeURLDAO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2354918650045183201L;

	public RelatorioDeURLDAO() {
	}

	public RelatorioDaUrl getRelatorioDeURL(ResumoDeAvaliacao resumoDeAvaliacaoAtual, ContextoDeAvaliacao contexto) {

		RelatorioDaUrl rel = null;

		if (contexto.getCriterio().getProfundidade().getValue() > Profundidade.PAGINA.getValue()) {

			LeitorDeTemporarios leitorDeTemporarios = new LeitorDeTemporarios();

			rel = leitorDeTemporarios.leiaTemporario(String.valueOf(resumoDeAvaliacaoAtual.getHashid()), contexto);

		} else {

			rel = new RelatorioDaUrl();

			rel.recarregaArquivoRelatorioEmXml2(String.valueOf(resumoDeAvaliacaoAtual.getHashid()), contexto);

		}

		rel.hashCodeString = String.valueOf(resumoDeAvaliacaoAtual.getHashid());

		return rel;

	}

}
