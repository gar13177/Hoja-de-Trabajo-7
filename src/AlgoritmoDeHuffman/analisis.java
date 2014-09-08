package hoja7;

public class analisis {
	public String Revision (String [] letras , String [] equivalencia ,String linea ){
		String temp = " ";
		String temp1 = " ";
		String linea_final = "";
		int indice = 0;//lleva la cuenta de que parte se va analizando
		boolean siguiente = true;
		
		while(siguiente = true ){
			for (int x = 0 ; x < equivalencia.length ; x ++ ){
				temp = equivalencia[x];//se agarra el primer codigo
				temp1 = linea.substring(indice,indice + temp.length()-1);//se toma un pedazo de string
				
				//si el codigo es el correcto
				if( temp == temp1){
					linea_final = linea_final + letras[x];
					x = equivalencia.length;
					indice = indice + letras[x].length();
				}		
			}
                        if(indice >= linea.length()){
                            siguiente = false;
                        }
                }
		return linea_final;
	}	
}
