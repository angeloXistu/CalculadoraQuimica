package ufms.calculadora.extensoes.calculoBalanceamento;

import java.util.ArrayList;
import java.util.List;

import ufms.calculadora.extensoes.calculadoraAlgebrica.Variavel;
import ufms.calculadora.modelo.Solucao;

public class IndiceMetodoAlgebrico {

	private Integer id;
	private Variavel variavel;
	private Solucao solucao;
	private static List<String> listaIndentificadoresVariaveis;
	
	public IndiceMetodoAlgebrico(Integer id, Integer valorCompanheiro, Solucao solucao){
		this.id = id;
		this.variavel = new Variavel();
		this.variavel.setId(getIndentificadoresVariaveis().get(id));
		this.variavel.setValorCompanheiro(valorCompanheiro);
		
		this.solucao = solucao;
	}
	
	public IndiceMetodoAlgebrico(Integer id){
		this.id = id;
		this.variavel = new Variavel();
		this.variavel.setId(getIndentificadoresVariaveis().get(id));
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Variavel getVariavel() {
		return variavel;
	}
	public void setVariavel(Variavel variavel) {
		this.variavel = variavel;
	}
	
	public Solucao getSolucao() {
		return solucao;
	}

	public void setSolucao(Solucao solucao) {
		this.solucao = solucao;
	}

	private static List<String> getIndentificadoresVariaveis(){
		
		if(listaIndentificadoresVariaveis == null){
			 listaIndentificadoresVariaveis = new ArrayList<String>();
		}
		
		listaIndentificadoresVariaveis.add("A");
		listaIndentificadoresVariaveis.add("B");
		listaIndentificadoresVariaveis.add("C");
		listaIndentificadoresVariaveis.add("D");
		
		
		return listaIndentificadoresVariaveis;
	}
}
