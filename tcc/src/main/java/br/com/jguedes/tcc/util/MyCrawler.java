package br.com.jguedes.tcc.util;

import java.io.File;
import java.util.regex.Pattern;

import ases.ProcessarErro;
import ases.RelatorioDaUrl;
import br.com.jguedes.tcc.model.User;
import br.com.jguedes.tcc.model.criterioavaliacao.CriterioAvaliacao;
import edu.uci.ics.crawler4j.crawler.Page;
import edu.uci.ics.crawler4j.crawler.WebCrawler;
import edu.uci.ics.crawler4j.parser.HtmlParseData;
import edu.uci.ics.crawler4j.url.WebURL;

public class MyCrawler extends WebCrawler {

	private final static Pattern FILTERS = Pattern.compile(".*(\\.(css|js|gif|jpg" + "|png|mp3|mp3|zip|gz))$");

	@SuppressWarnings("unused")
	private static int controle = 0;

	/**
	 * This method receives two parameters. The first parameter is the page in
	 * which we have discovered this new url and the second parameter is the new
	 * url. You should implement this function to specify whether the given url
	 * should be crawled or not (based on your crawling logic). In this example,
	 * we are instructing the crawler to ignore urls that have css, js, git, ...
	 * extensions and to only accept urls that start with
	 * "http://www.ics.uci.edu/". In this case, we didn't need the referringPage
	 * parameter to make the decision.
	 */
	@Override
	public boolean shouldVisit(Page referringPage, WebURL url) {

		String[] aux = getMyController().getConfig().getCrawlStorageFolder().split(File.separator);

		String userContextoID = aux[aux.length - 1];

		User userLogado = UsersLogados.get(userContextoID);

		CriterioAvaliacao criterio = userLogado.getContexto().getCriterio();

		if (url.getURL().indexOf(criterio.getUrl()) != 0) {
			return false;
		}

		if (FILTERS.matcher(url.getURL()).matches()) {
			return false;
		}

		if (!criterio.profundidadeEstaAdequada(url.getURL())) {

			return false;

		}
		//
		// String conteudo = "\t" + url.getParentUrl() + "\n\tTAG: " +
		// url.getTag() + "\n\tURL: " + url.getURL()
		// +
		// "\n------------------------------------------------------------------------------------------------------------------------------------------";
		//
		// G_Log.loggerInNewLine(folder + "urlParaVisitar.crowler", conteudo);

		return true;

	}

	@Override
	public void visit(Page page) {

		// if (controle > 5) {
		// this.myController.shutdown();
		// }
		//
		// controle++;

		String[] aux = getMyController().getConfig().getCrawlStorageFolder().split(File.separator);

		String userContextoID = aux[aux.length - 1];

		User userLogado = UsersLogados.get(userContextoID);

		ContextoDeAvaliacao contexto = userLogado.getContexto();

		CriterioAvaliacao criterio = contexto.getCriterio();

		if (page.getParseData() instanceof HtmlParseData) {

			HtmlParseData htmlParseData = (HtmlParseData) page.getParseData();

			String html = htmlParseData.getHtml();

			RelatorioDaUrl r = new RelatorioDaUrl();

			// RelatorioDaUrl.elementosOriginais();

			RelatorioDaUrl.elementosReduzidos();

			RelatorioDaUrl.desconsideraConteudo = true;

			r.setUrl(page.getWebURL().getURL());

			r.setPadraoAcessibilidade(criterio.getPadraoAcessibilidade());

			r.setNomeProjeto(criterio.getUrl().replaceAll("http://", ""));

			r.profundidade = criterio.getProfundidade();

			r.setConteudo(html, contexto.getFolderTemp());

			ProcessarErro p = new ProcessarErro(r, contexto);

			p.parseWAI();

			r.deleteArquivosSoComHTML(contexto.getFolderTemp());

			contexto.incrementaTotLinks();

			contexto.gravaLink(contexto.getTotLinks() + ": " + page.getWebURL().getURL());

		}

	}

}
