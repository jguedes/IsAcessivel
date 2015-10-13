/*******************************************************************************
 * Copyright 2005, 2006, 2007, 2008 Acessibilidade Brasil
 * Este arquivo � parte do programa ASES - Avaliador e Simulador para AcessibilidadE de S�tios
 * O ASES � um software livre; voc� pode redistribui-lo e/ou modifica-lo dentro dos termos da Licen�a P�blica Geral GNU como
 * publicada pela Funda��o do Software Livre (FSF); na vers�o 2 da Licen�a, ou (na sua opni�o) qualquer vers�o posterior.
 * Este programa � distribuido na esperan�a que possa ser  util, mas SEM NENHUMA GARANTIA; sem uma garantia implicita de ADEQUA��O a qualquer  MERCADO ou APLICA��O EM PARTICULAR. Veja a Licen�a P�blica Geral GNU para maiores detalhes.
 * Voc� deve ter recebido uma c�pia da Licen�a P�blica Geral GNU, sob o t�tulo "LICENCA.txt", junto com este programa, se n�o, escreva para a Funda��o do Software Livre(FSF) Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 *******************************************************************************/

/*******************************************************************************
 * Copyright (c) 2005, 2006, 2007 Acessibilidade Brasil.
 * 
 * This file is part of ASES.
 *
 * ASES is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 * A copy of the license can be found at 
 * http://www.gnu.org/copyleft/lesser.txt.
 *******************************************************************************/

package ases;

import java.util.ArrayList;
import java.util.HashMap;

import br.org.acessobrasil.ases.regras.Regra;

/**
 * Contem algoritmos para as Regras EMAG
 * 
 * @author Renato Tomaz Nati
 * @since 27/07/2007
 * @version 1.0
 */
public class RegrasHardCodedEmag extends SuperRegrasHardCoded implements InterfRegrasHardCoded {
	final int NUMERO_DE_GENERICOS = 18;
	// private String[] regrasGenericas = new String[NUMERO_DE_GENERICOS];

	/**
	 * Guarda as regras e seu c�digo
	 */
	private static HashMap<String, Regra> mapRegra = new HashMap<String, Regra>();

	public RegrasHardCodedEmag() {
		// getGenericos();
	}

	/**
	 * M�todo que retorna os avisos Gen�ricos EMAG
	 * 
	 * @author Renato Tomaz Nati
	 * @return String[] formato: gl.cp@regrax@prioridade@***@...
	 * @since 27/07/2007
	 * @version 1.0
	 */

	@Override
	public String[] getGenericos() {

		int cont = 0;

		// array que conter� respectivamente: gl, cp
		String glCpPrio[] = new String[3];

		// mapa que conter� respectivamente: o glcp e a String txtRegra
		String[] regras = new String[NUMERO_DE_GENERICOS];

		// adiciona a primeira regra
		glCpPrio[0] = "1";
		glCpPrio[1] = "2";
		glCpPrio[2] = "1";
		regras[cont] = glCpPrio[0] + "." + glCpPrio[1] + "@" + TokenLang.REGRA_15 + "@" + glCpPrio[2];

		cont++;

		// adiciona a segunda regra

		glCpPrio[0] = "3";
		glCpPrio[1] = "2";
		glCpPrio[2] = "3";
		regras[cont] = glCpPrio[0] + "." + glCpPrio[1] + "@" + TokenLang.REGRA_16 + "@" + glCpPrio[2];

		cont++;

		glCpPrio[0] = "3";
		glCpPrio[1] = "5";
		glCpPrio[2] = "3";
		regras[cont] = glCpPrio[0] + "." + glCpPrio[1] + "@" + TokenLang.REGRA_47 + "@" + glCpPrio[2];

		cont++;

		glCpPrio[0] = "1";
		glCpPrio[1] = "24";
		glCpPrio[2] = "1";
		regras[cont] = glCpPrio[0] + "." + glCpPrio[1] + "@" + TokenLang.REGRA_48 + "@" + glCpPrio[2];

		cont++;

		glCpPrio[0] = "2";
		glCpPrio[1] = "11";
		glCpPrio[2] = "2";
		regras[cont] = glCpPrio[0] + "." + glCpPrio[1] + "@" + TokenLang.REGRA_51 + "@" + glCpPrio[2];

		cont++;

		glCpPrio[0] = "3";
		glCpPrio[1] = "14";
		glCpPrio[2] = "3";
		regras[cont] = glCpPrio[0] + "." + glCpPrio[1] + "@" + TokenLang.REGRA_54 + "@" + glCpPrio[2];

		cont++;

		glCpPrio[0] = "2";
		glCpPrio[1] = "17";
		glCpPrio[2] = "2";
		regras[cont] = glCpPrio[0] + "." + glCpPrio[1] + "@" + TokenLang.REGRA_55 + "@" + glCpPrio[2];

		cont++;

		glCpPrio[0] = "1";
		glCpPrio[1] = "10";
		glCpPrio[2] = "1";
		regras[cont] = glCpPrio[0] + "." + glCpPrio[1] + "@" + TokenLang.REGRA_56 + "@" + glCpPrio[2];

		cont++;

		glCpPrio[0] = "3";
		glCpPrio[1] = "6";
		glCpPrio[2] = "3";
		regras[cont] = glCpPrio[0] + "." + glCpPrio[1] + "@" + TokenLang.REGRA_57 + "@" + glCpPrio[2];

		cont++;

		glCpPrio[0] = "3";
		glCpPrio[1] = "9";
		glCpPrio[2] = "3";
		regras[cont] = glCpPrio[0] + "." + glCpPrio[1] + "@" + TokenLang.REGRA_60 + "@" + glCpPrio[2];

		cont++;

		glCpPrio[0] = "1";
		glCpPrio[1] = "3";
		glCpPrio[2] = "1";
		regras[cont] = glCpPrio[0] + "." + glCpPrio[1] + "@" + TokenLang.REGRA_62 + "@" + glCpPrio[2];

		cont++;

		glCpPrio[0] = "1";
		glCpPrio[1] = "9";
		glCpPrio[2] = "1";
		regras[cont] = glCpPrio[0] + "." + glCpPrio[1] + "@" + TokenLang.REGRA_63 + "@" + glCpPrio[2];

		cont++;

		glCpPrio[0] = "3";
		glCpPrio[1] = "11";
		glCpPrio[2] = "3";
		regras[cont] = glCpPrio[0] + "." + glCpPrio[1] + "@" + TokenLang.REGRA_64 + "@" + glCpPrio[2];

		cont++;

		glCpPrio[0] = "2";
		glCpPrio[1] = "9";
		glCpPrio[2] = "2";
		regras[cont] = glCpPrio[0] + "." + glCpPrio[1] + "@" + TokenLang.REGRA_65 + "@" + glCpPrio[2];

		cont++;

		glCpPrio[0] = "1";
		glCpPrio[1] = "21";
		glCpPrio[2] = "1";
		regras[cont] = glCpPrio[0] + "." + glCpPrio[1] + "@" + TokenLang.REGRA_67 + "@" + glCpPrio[2];

		cont++;

		glCpPrio[0] = "1";
		glCpPrio[1] = "4";
		glCpPrio[2] = "1";
		regras[cont] = glCpPrio[0] + "." + glCpPrio[1] + "@" + TokenLang.REGRA_6 + "@" + glCpPrio[2];

		cont++;

		glCpPrio[0] = "1";
		glCpPrio[1] = "5";
		glCpPrio[2] = "1";
		regras[cont] = glCpPrio[0] + "." + glCpPrio[1] + "@" + TokenLang.REGRA_7 + "@" + glCpPrio[2];

		// regrasGenericas = (String[]) regras.clone();
		// +2 prioridade1
		// +1 prioridade 3
		return regras;

	}

	/**
	 * Retorna o texto da regra Ex: 2.19
	 * 
	 * @param codigo
	 *            c�digo da regra (2.19)
	 * @return Texto da regra
	 */
	@Override
	public String getTextoRegra(String codigo) {
		carregaRegras();
		return mapRegra.get(codigo).getTexto();
	}

	/**
	 * Retorna a prioridade da regra Ex: 2.19
	 * 
	 * @param codigo
	 *            c�digo da regra (2.19)
	 * @return Prioridade da regra 1 2 ou 3
	 */
	@Override
	public int getPrioridadeRegra(String codigo) {
		carregaRegras();
		Regra regra = mapRegra.get(codigo);
		if (regra == null) {
			// System.out.print("Regra " +codigo +" n�o encontrada");
			return 0;
		} else {
			return regra.getPrioridade();
		}
	}

	public ArrayList<String> getArrCod() {
		carregaRegras();
		return new ArrayList<String>(mapRegra.keySet());
	}

	/**
	 * Carrega as regras
	 *
	 */
	public void carregaRegras() {
		// evita o carregamento mais de uma vez
		if (mapRegra.size() > 0) {
			return;
		}
		// 2.15 label

		mapRegra.put("1.1", new Regra(1,
				"Identificar o principal idioma utilizado nos documentos. O idioma do documento deve ser especificado na express�o HTML."));
		mapRegra.put("1.2", new Regra(1,
				"Identificar claramente quaisquer mudan�as de idioma no texto de um documento, bem como nos equivalentes textuais (por ex., legendas de imagens). Use o atributo \"lang\" para identificar claramente as altera��es do idioma no texto."));
		mapRegra.put("1.3", new Regra(1,
				"Fornecer meios para ignorar e explicar inser��es de arte ASCII com v�rias linhas, tais como links de �ncora ou p�ginas alternativas."));
		mapRegra.put("1.4", new Regra(1,
				"Assegurar que todas as informa��es veiculadas com cor estejam tamb�m dispon�veis sem cor."));
		// Geral por enquanto
		// Contraste
		mapRegra.put("1.5", new Regra(1,
				"Assegurar que a combina��o de cores entre o fundo e o primeiro plano seja suficientemente contrastante para poder ser vista por pessoas com cromodefici�ncias, bem como pelas que utilizam monitores de v�deo monocrom�ticos."));

		mapRegra.put("1.6", new Regra(1,
				"Organizar os documentos de tal forma que possam ser lidos sem recurso � folhas de estilo. Por exemplo, se um documento em HTML for reproduzido sem as folhas de estilo que lhe est�o associadas, deve continuar a ser poss�vel l�-lo."));
		mapRegra.put("1.7", new Regra(1,
				"N�o usar concep��es que possam provocar intermit�ncia da tela, at� que os leitores de tela ou navegadores do usu�rio possibilitem o seu controle."));
		mapRegra.put("1.8", new Regra(1,
				"Criar uma seq��ncia l�gica de tabula��o para percorrer links, controles de formul�rios e objetos."));
		mapRegra.put("1.9", new Regra(1,
				"Utilizar a linguagem mais clara e simples poss�vel, logicamente, adequada ao conte�do do s�tio."));
		mapRegra.put("1.10", new Regra(1,
				"Utilizar os mecanismos de navega��o de maneira coerente, consistente e sistem�tica. Por exemplo, organizar itens do menu por tema, se��es ou classes, etc."));
		mapRegra.put("1.11", new Regra(1,
				"Fornecer um equivalente textual a cada imagem (isso abrange: representa��es gr�ficas do texto, incluindo s�mbolos, GIFs animados, imagens utilizadas como sinalizadores de pontos de enumera��o, espa�adores e bot�es gr�ficos), para tanto, utiliza-se o atributo \"alt\" ou \"longdesc\" em cada imagem."));
		mapRegra.put("1.12", new Regra(1,
				"Fornecer links de texto redundantes relativos a cada regi�o ativa de um mapa de imagem armazenado tanto no cliente quanto no servidor. N�o esquecendo de adicionar texto equivalente � imagem mostrada, no caso o \"alt\" ou \"longdesc\"."));
		mapRegra.put("1.13", new Regra(1,
				"Fornecer resumos das tabelas utilizando o atributo \"summary\", caso seja criada uma tabela para dados. Se a tabela foi criada para efeito de design, deixar o \"summary\" em branco."));
		mapRegra.put("1.14", new Regra(1,
				"Em tabelas de dados com dois ou mais n�veis l�gicos de cabe�alhos, sejam de linha ou de coluna, utilizar marca��es para associar as c�lulas de dados �s c�lulas de cabe�alho. Organize tabelas complexas de forma que possa identificar facilmente suas divis�es."));
		mapRegra.put("1.15", new Regra(1,
				"Assegurar que os equivalentes de conte�do dos frames (din�mico ou n�o) sejam atualizados sempre que esse conte�do mudar. A origem do frame sempre deve estar ligada a um arquivo HTML."));
		mapRegra.put("1.16", new Regra(1,
				"Assegurar a acessibilidade do conte�do de frames, fornecendo uma p�gina alternativa atrav�s do elemento \"noframes\"."));
		mapRegra.put("1.17",
				new Regra(1, "Dar a cada frame um t�tulo que facilite a identifica��o dos frames e sua navega��o."));
		mapRegra.put("1.18", new Regra(1,
				"Descrever a finalidade dos frames e o modo como se relacionam entre si, se isso n�o for �bvio a partir unicamente dos t�tulos, forne�a uma descri��o mais detalhada."));
		mapRegra.put("1.19", new Regra(1,
				"Assegure a acessibilidade de objetos programados, tais como programas interpret�veis e applets, garantindo que a resposta a eventos seja independente do dispositivo de entrada e que qualquer elemento dotado de interface pr�pria possa funcionar com qualquer leitor de tela ou navegador que o usu�rio utilize. Evite colocar scripts que estejam vinculados a links, se isso n�o for poss�vel, fornecer informa��es equivalentes em uma p�gina alternativa acess�vel."));
		mapRegra.put("1.20", new Regra(1,
				"Assegurar que todas as p�ginas possam ser utilizadas mesmo que os programas interpret�veis, os applets ou outros objetos programados tenham sido desativados ou n�o sejam suportados. Sempre que tiver script associe logo a seguir o elemento \"noscript\"."));
		mapRegra.put("1.21", new Regra(1,
				"Fornecer equivalentes textuais para sons (reproduzidos ou n�o com intera��o do usu�rio), arquivos de �udio independentes, trilhas �udio de v�deo e trechos de v�deo."));
		mapRegra.put("1.22", new Regra(1,
				"Em apresenta��es multim�dia baseadas em tempo (filme ou anima��o), fornecer ou sincronizar alternativas textuais equivalentes (legendas ou descri��es sonoras dos trechos visuais)."));
		mapRegra.put("1.23", new Regra(1,
				"Evitar p�ginas contendo movimento, at� que os agentes do usu�rio possibilitem o controle e a imobiliza��o do conte�do."));
		mapRegra.put("1.24", new Regra(1,
				"N�o sendo poss�vel criar uma p�gina acess�vel, crie uma p�gina alternativa, juntamente com uma justificativa apropriada, que utilize tecnologias em conformidade com este documento - acess�vel, que contenha informa��es (ou funcionalidade) equivalentes e seja atualizada t�o freq�entemente quanto a p�gina original, considerada inacess�vel."));
		mapRegra.put("2.1", new Regra(2,
				"Criar documentos pass�veis de valida��o por gram�ticas formais publicadas. Declarando o tipo de documento (atributo \"doctype\") no topo do c�digo fonte de cada p�gina do s�tio. Assim seu s�tio informar� aos servidores, navegadores e validadores que o c�digo est� dentro das regras da linguagem utilizada."));
		mapRegra.put("2.2", new Regra(2,
				"Utilizar unidades relativas, e n�o absolutas, nos valores dos atributos de tabelas, textos, etc. Em CSS n�o use valores absolutos como \"pt\" ou \"px\" e sim valores relativos como o \"em\", \"ex\" ou em porcentagem."));
		mapRegra.put("2.3", new Regra(2,
				"Marcar corretamente listas e pontos de enumera��o em listas ordenadas. Use corretamente a estrutura e os itens das listas. Evite o uso destes elementos para formatar par�grafos."));
		mapRegra.put("2.4", new Regra(2,
				"N�o criar p�ginas com atualiza��o autom�tica peri�dica, at� que os leitores de tela ou navegadores possibilitem o controle da atualiza��o para o usu�rio. N�o utilize a tag meta \"refresh\" ou dispositivos semelhantes para atualiza��o da p�gina. Caso a p�gina seja continuamente atualizada, informe ao usu�rio que ele deve \"recarregar\" a p�gina de tempos em tempos."));
		mapRegra.put("2.5", new Regra(2,
				"N�o utilizar marca��es para redirecionar as p�ginas automaticamente, at� que os leitores de tela ou navegadores do usu�rio possibilitem interromper o processo."));
		mapRegra.put("2.6", new Regra(2,
				"N�o provocar o aparecimento de janelas de sobreposi��o, janelas popup ou outras quaisquer, assim como nenhuma modifica��o do conte�do sem que o usu�rio seja informado disso. N�o � recomend�vel para o usu�rio, que links abram em uma nova janela. Se o usu�rio utiliza um navegador com tela cheia n�o poder� voltar para a p�gina anterior, tamb�m o hist�rico e a possibilidade de ir e voltar a p�ginas visitadas ficam comprometidos. Caso voc� tenha uma real necessidade que sua p�gina abra uma outra janela, informe ao usu�rio."));
		mapRegra.put("2.7", new Regra(2,
				"Sempre que existir uma linguagem de marca��o apropriada, utilizar marca��es em vez de imagens para transmitir informa��es, um exemplo � a linguagem MathML que permite a cria��o de f�rmulas matem�ticas somente utilizando-se das tags apropriadas."));
		mapRegra.put("2.8", new Regra(2,
				"Utilizar o elemento \"blockquote\" para marcar cita��es quando existentes. N�o use \"blockquote\", \"ul\", \"dl\" & \"dt\", \"table\" e outros elementos para criar efeitos visuais nos par�grafos. Caso a inten��o seja organizar a estrutura ou a disposi��o de textos no s�tio, utilize folhas de estilo."));
		mapRegra.put("2.9", new Regra(2,
				"Criar um estilo de apresenta��o coerente e sistem�tico, ao longo das diferentes p�ginas, como exemplo, mantendo um padr�o de desenho, agrupando os itens do menu de forma coerente. Mantenha os bot�es principais de navega��o no mesmo local em cada p�gina. Isso ajudar� ao usu�rio a localizar-se rapidamente, e saber o destino de cada bot�o levar�. Mantenha para o s�tio uma paleta de cores, estilos de texto e diagrama��o consistente. Identifique as regi�es da p�gina, navega��o e fim de p�gina de forma clara."));
		mapRegra.put("2.10", new Regra(2,
				"Utilize elementos de cabe�alho de forma l�gica, organizando o conte�do de acordo com uma hierarquia."));
		mapRegra.put("2.11", new Regra(2,
				"Sempre que necess�rio, divida grandes blocos de informa��o em grupos mais f�ceis de gerenciar. As op��es de menu devem ser dispostas de forma consistente na mesma ordem relativa no grupo de op��es. Se as op��es num painel de menu est�o ordenadas \"arquivo, editar, inserir, imprimir\", essas op��es devem aparecer naquela mesma ordem quando aquele grupo for apresentado novamente (ou quando um outro painel contendo aquele mesmo grupo de op��es seja apresentado)."));
		mapRegra.put("2.12", new Regra(2,
				"N�o utilizar tabelas para efeitos de disposi��o em p�gina, prefira o uso de folhas de estilo para a diagrama��o das p�ginas. Sendo utilizadas tabelas construa de forma que a disposi��o continue a fazer sentido depois de ser linearizada. Em �ltimo caso, forne�a um equivalente alternativo (que pode ser uma vers�o linearizada)."));
		mapRegra.put("2.13", new Regra(2,
				"Se for utilizada uma tabela para efeitos de disposi��o em p�gina, n�o utilizar qualquer marca��o estrutural para efeitos de formata��o visual. N�o use comandos destinados a indicar cabe�alhos de tabela como o \"th\" para formatar par�grafos ou fazer t�tulos em \"bold\"."));
		mapRegra.put("2.14", new Regra(2,
				"Incluir caracteres pr�-definidos de preenchimento nas caixas de edi��o e nas �reas de texto, at� que os navegadores tratem corretamente os controles vazios."));
		mapRegra.put("2.15", new Regra(2,
				"Usar o elemento \"label\" juntamente com o atributo \"id\" para associar os r�tulos aos respectivos controles dos formul�rios. Assim, os leitores de tela associar�o os elementos do formul�rio de forma correta. Usando o comando \"label\" as pessoas que usam leitores de tela n�o ter�o problemas ao ler o formul�rio. Caso haja grupos de informa��o, controles, etc, a estes devem estar devidamente diferenciados, seja por meio de espa�amento, localiza��o ou elementos gr�ficos."));
		mapRegra.put("2.16", new Regra(2,
				"Assegurar o correto posicionamento de todos os controles de formul�rios que tenham r�tulos implicitamente associados, at� que os leitores de tela ou navegadores do suportem associa��es expl�citas entre r�tulos e controles de formul�rios."));
		mapRegra.put("2.17", new Regra(2,
				"Forne�a informa��es sobre como o s�tio est� estruturado, atrav�s de um mapa ou de sum�rio. Crie o mapa de forma textual, associando aos t�tulos das p�ginas para n�o causar confus�o aos usu�rios que utilizarem leitores de tela."));
		mapRegra.put("2.18", new Regra(2,
				"Assegure a acessibilidade de objetos programados, tais como programas interpret�veis e applets, garantindo que a resposta a eventos seja independente do dispositivo de entrada e que qualquer elemento dotado de interface pr�pria possa funcionar com qualquer leitor de tela ou navegador que o usu�rio utilize. Evite colocar scripts que estejam vinculados a links. Se isso n�o for poss�vel, forne�a informa��es equivalentes em uma p�gina alternativa acess�vel."));
		mapRegra.put("2.19", new Regra(2,
				"Em programas interpret�veis, especificar respostas a eventos, preferindo as rotinas dependentes de dispositivos (mouse, teclado, etc)."));
		mapRegra.put("3.1", new Regra(3, "N�o usar elementos considerados ultrapassados pelo W3C."));
		mapRegra.put("3.2", new Regra(3,
				"Especificar por extenso cada abreviatura ou sigla, quando da sua primeira ocorr�ncia em um documento, utilizando os atributos \"abbr\" e \"acronym\". Utilize o atributo \"abbr\" dentro de um elemento \"th\" quando voc� tiver cabe�alhos muito longos, para que os leitores de tela lerem apenas o seu conte�do e n�o o texto do cabe�alho na �ntegra."));
		mapRegra.put("3.3", new Regra(3,
				"Fornecer atalhos por teclado que apontem para links importantes (incluindo os contidos em mapas de imagem armazenados no cliente), para in�cio da �rea principal de conte�do da p�gina, controles de formul�rios, e grupo de controles de formul�rios."));
		mapRegra.put("3.4", new Regra(3,
				"Inserir, entre links adjacentes, caracteres que n�o funcionem como link e sejam pass�veis de impress�o (como um espa�o), at� que os leitores de tela ou navegadores (incluindo as tecnologias de apoio) reproduzam clara e distintamente os links adjacentes."));
		mapRegra.put("3.5", new Regra(3,
				"Sempre que poss�vel, fornecer informa��es que possibilitem aos usu�rios receber os documentos de acordo com as suas prefer�ncias (por ex., por idioma ou por tipo de conte�do)."));
		mapRegra.put("3.6", new Regra(3,
				"Fornecer barras de navega��o para auxiliar os menus de navega��o. Utilizar elemento que contextualizem a localiza��o do usu�rio, como barras de caminho e \"Sua Localiza��o\" nas p�ginas do documento."));
		mapRegra.put("3.7", new Regra(3,
				"Agrupar links relacionados entre si, identificando o grupo (em benef�cio do navegador ou leitor de tela do usu�rio) e, at� que o navegador ou leitor de tela do usu�rio se encarregue de tal fun��o, fornecer um modo de contornar determinado grupo."));
		mapRegra.put("3.8", new Regra(3,
				"Se forem oferecidas fun��es de pesquisa, ativar diferentes tipos de pesquisa de modo a corresponderem a diferentes n�veis de compet�ncia e �s prefer�ncias dos usu�rios. Sendo poss�vel, quando a pesquisa n�o encontrar a palavra, sugerir palavras semelhantes."));
		mapRegra.put("3.9", new Regra(3,
				"Use palavras relevantes no in�cio de cabe�alhos, par�grafos, e listas para identificar o assunto tratado."));
		mapRegra.put("3.10", new Regra(3,
				"Fornecer informa��es sobre documentos compostos por v�rias p�ginas (isto �, cole��es de documentos). Caso seja necess�rio, utilize ferramentas de compacta��o de arquivo, tais como ZIP, TAR, GZIP ou ARJ. Informe o tamanho do arquivo e o tempo estimado para baixar por meio de um modem comum. Forne�a documentos em formatos alternativos, pass�veis de leitura pelos leitores de tela."));
		mapRegra.put("3.11", new Regra(3,
				"Complementar o texto com apresenta��es gr�ficas ou sonoras, sempre que puderem facilitar a compreens�o da p�gina."));
		mapRegra.put("3.12", new Regra(3,
				"Identificar claramente o destino de cada link, bot�o ou elemento que submeta uma a��o. Prefira utilizar textos mais claros e objetivos, mostrando o verdadeiro sentido e o destino do link. Evite usar frases como \"Clique aqui\"."));
		mapRegra.put("3.13", new Regra(3,
				"Informar previamente ao usu�rio o destino e resultado da a��o, quando houver campos e elementos do formul�rio, como, por exemplo, caixas de sele��o, que submetem automaticamente o conte�do ao se efetuar uma determinada sele��o. Nestes casos, ao inv�s da sele��o submeter automaticamente o formul�rio, � recomend�vel que se vincule ao elemento um bot�o para efetuar a a��o."));
		mapRegra.put("3.14", new Regra(3,
				"Forne�a metadados para acrescentar informa��es sem�nticas e descritivas do s�tio, que sejam �teis para os mecanismos de busca."));

		// Regras especificas da ACBR
		mapRegra.put("4.1",
				new Regra(3, "N�o fa�a atalhos \"accesskey\" que entrem em conflito com o Internet Explorer."));
	}

	@Override
	public int getCodWcagEmag() {
		return 2;
	}
}
