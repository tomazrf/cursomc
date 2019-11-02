package com.nelioalves.cursomc.services.validation.utils;

public class CPForCNPJValidator {
	
	public static boolean isValidCPF(String cpf) {
		if((cpf == null) || ((cpf.length() != 11)&&(cpf.length() != 14))){
			return false;
		}
		else if(cpf.length() == 11 && !cpf.matches("\\d+")){
			return false;
		}
		else if(cpf.length() == 14 && !cpf.matches("[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}-[0-9]{2}")){
			return false;
		}
		return true;
	}
	
	public static boolean isValidCNPJ(String cnpj) {
		if((cnpj == null) || ((cnpj.length() != 14)&&(cnpj.length() != 18))){
			return false;
		}
		else if(cnpj.length() == 14 && !cnpj.matches("\\d+")){
			return false;
		}
		else if(cnpj.length() == 18 && !cnpj.matches("(^\\d{2}.\\d{3}.\\d{3}/\\d{4}-\\d{2}$)")){
			return false;
		}
		return true;
	}
}
