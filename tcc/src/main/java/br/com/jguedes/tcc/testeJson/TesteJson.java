package br.com.jguedes.tcc.testeJson;

import java.util.LinkedList;
import java.util.List;

import org.primefaces.json.JSONException;
import org.primefaces.json.JSONObject;

import com.google.gson.Gson;

public class TesteJson {

	public static void main(String[] args) {
		switch (0) {
		case 1:
			testeJSonPrimefaces();

			break;
		case 2:
			testeJSon_GSON();
			break;
		default:
			testeJSonPrimefaces();
			testeJSon_GSON();
			break;
		}

	}

	/**
	 * 
	 */
	private static void testeJSon_GSON() {
		System.out.println("testeJSon_GSON...............");
		P p = new P("joao", 38);

		p.getAmigos().add(new P("josé", 20));
		p.getAmigos().add(new P("maria", 24));
		p.getAmigos().add(new P("rita", 40));

		P q = new P("quesia", 40);

		q.getAmigos().add(new P("josé", 20));
		q.getAmigos().add(new P("maria", 24));
		q.getAmigos().add(new P("rita", 40));

		List<P> c = new LinkedList<P>();

		c.add(p);
		c.add(q);
		// c.add(p.getAmigos().get(0));
		// c.add(p.getAmigos().get(1));

		Gson g = new Gson();

		String n = g.toJson(p, P.class);

		P r = g.fromJson(n, P.class);

		System.out.format(n);
	}

	/**
	 * @param p
	 * @return
	 */
	private static void testeJSonPrimefaces() {
		System.out.println("testeJSonPrimefaces...............");

		P p = new P("joao", 38);

		p.getAmigos().add(new P("josé", 20));
		p.getAmigos().add(new P("maria", 24));
		p.getAmigos().add(new P("rita", 40));

		P q = new P("quesia", 40);

		q.getAmigos().add(new P("josé", 20));
		q.getAmigos().add(new P("maria", 24));
		q.getAmigos().add(new P("rita", 40));

		List<P> c = new LinkedList<P>();

		c.add(p);
		c.add(q);

		JSONObject j = null, k = null;

		// k = new JSONObject(c);

		k = new JSONObject(p);

		j = new JSONObject();

		try {
			j.put("cadastrados", k);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.println(j.toString());
		System.out.println(k.toString());
	}
}
