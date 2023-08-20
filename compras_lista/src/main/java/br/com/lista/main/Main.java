package br.com.lista.main;

import br.com.lista.dao.ObjetoDAO;
import br.com.lista.model.Objeto;

public class Main {

	public static void main(String[] args) {
		ObjetoDAO objdao = new ObjetoDAO();
		Objeto obj1 = new Objeto();
		Objeto obj2 = new Objeto();
		Objeto obj3 = new Objeto();
		Objeto obj4 = new Objeto();
		Objeto obj5 = new Objeto();
		Objeto obj6 = new Objeto();
		Objeto obj7 = new Objeto();
		Objeto obj8 = new Objeto();
		Objeto obj9 = new Objeto();
		Objeto obj10 = new Objeto();
		
		
		obj1.setNome("feijao");
		obj2.setNome("arroz");
		obj3.setNome("farinha");
		obj4.setNome("carne");
		obj5.setNome("macarrao");
		obj6.setNome("frango");
		obj7.setNome("Batata");
		obj8.setNome("Peito de frango");
		obj9.setNome("Cenoura");
		obj10.setNome("milho");
		
		/* objdao.saveAcabou(obj1);
		objdao.saveAcabou(obj2);
		objdao.saveAcabou(obj3);
		objdao.saveAcabou(obj4);
		objdao.saveAcabou(obj5);
		objdao.saveAcabou(obj6);
		objdao.saveAcabou(obj7);*/
		
	/*	objdao.saveQuase(obj8);
		objdao.saveQuase(obj9);*/
	
		
		//objdao.updateAcabou("2", obj10);
		
		//System.out.println(objdao.getListaAcabou());		
		
		objdao.deleteAcabou("8");
		

	}

}
