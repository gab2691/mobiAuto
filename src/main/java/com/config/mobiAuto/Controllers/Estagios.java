package com.config.mobiAuto.Controllers;

import java.util.ArrayList;
import java.util.List;

public class Estagios {
	private Integer ID;
	private Integer estrelas;
	private Integer resultado;
	private Integer total = 0;

	public Integer getEstrelas()
	{
		return estrelas;
	}


	public void setEstrelas(Integer estrelas)
	{
		this.estrelas = estrelas;
	}

	public Integer getResultado()
	{
		return resultado;
	}


	public void setResultado(Integer resultado)
	{
		this.resultado = resultado;
	}

	public Integer getID()
	{
		return ID;
	}

	public void setID(Integer iD)
	{
		ID = iD;
	}

	public Integer getTotal()
	{
		return total;
	}

	public void setTotal(Integer total)
	{
		this.total = total;
	}

	public List<String> resultEstrelas(List<Estagios> estagios) {
		List<String> resultadoEstagios = new ArrayList<>();
		for (Estagios x : estagios) {
			resultadoEstagios.add("Marvin tem *" + x.estrelas + " estrelas no estagio " + x.getID());
			this.total += x.estrelas;
		}
		resultadoEstagios.add("Total de Estrelas " + this.total);
		return resultadoEstagios;
	}

	public static void main(String[] args) {
		List<Estagios> estagios = new ArrayList<>();
		Estagios estagio1 = new Estagios();
		estagio1.setID(1);
		estagio1.setEstrelas(3);
		estagios.add(estagio1);		
		
		Estagios estagio2 = new Estagios();
		estagio2.setID(2);
		estagio2.setEstrelas(1);
		estagios.add(estagio2);

		Estagios estagio3 = new Estagios();
		estagio3.setID(3);
		estagio3.setEstrelas(2);
		estagios.add(estagio3);

		Estagios estagio4 = new Estagios();
		estagio4.setID(4);
		estagio4.setEstrelas(0);
		estagios.add(estagio4);



		List<String> resultEstrelas = estagio1.resultEstrelas(estagios);
		for (String string : resultEstrelas) {
			System.out.println(string);
		}
	}
}
