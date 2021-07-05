import static java.lang.System.*;
import java.util.Calendar;

public class Data {
  private int dia, mes, ano;

  /** Inicia esta data com o dia de hoje. */
  public Data() {
    // Aqui usamos a classe Calendar da biblioteca standard para obter a data atual.
    Calendar today = Calendar.getInstance();
    dia = today.get(Calendar.DAY_OF_MONTH);
    mes = today.get(Calendar.MONTH) + 1;
    ano = today.get(Calendar.YEAR);
  }

  /** Inicia a data a partir do dia, mes e ano dados. */
  public Data(int dia, int mes, int ano) {
		
  }
  
  public Data(String d){
	
	String [] parts= d.split("-");
	
	if(parts.length!=3) System.out.print("Erro");
	
	this.dia=Integer.parseInt(parts[2]);
	
	if(!dataValida(dia,mes,ano)) System.out.print("Erro");
  
   }
   
   public int compareTo(Data x){
		
		int dif;
		
		dif=this.ano-x.ano();
		if(dif!=0) return dif;
		
		dif=this.mes-x.mes();
		if(dif!=0) return dif;
		
		dif=this.dia-x.dia();
		if(dif!=0) return dif;
		
		return dif;
   }

  /** Devolve esta data segundo a norma ISO 8601. */
  public String toString() {
    return String.format("%04d-%02d-%02d", ano, mes, dia);
  }

  /** Indica se ano é bissexto. */
  public static boolean bissexto(int ano) {
    return ano%4 == 0 && ano%100 != 0 || ano%400 == 0;
  }

  // Crie métodos para obter o dia, mes e ano da data.
  //...

  /** Dimensões dos meses num ano comum. */
  private static final
  int[] diasMesComum = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	private static final
	String[] nomes={"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto"};
	
  /** Devolve o número de dias do mês dado. */
  public static int diasDoMes(int mes, int ano) {
    int[] dias=diasMesComum;
    
		switch(mes){
			
			case 1:
			mes=diasMesComum[0];
			break;
			
			case 2:
				if(bissexto(ano)){ 
				mes=29;
			}else{
					mes=diasMesComum[1];
					}
			break;
			
			case 3:
			mes=diasMesComum[2];
			break;
			
			case 4:
			mes=diasMesComum[3];
			break;
			
			case 5:
			mes=diasMesComum[4];
			break;
			
			//......		
			
		}	
		
    
    return mes;
  }

  /** Devolve o mes da data por extenso. */
  public String mesExtenso() {
	
	Data d1=new Data();
	String res="";
		
		switch(mes){
			
			case 1:
			res=nomes[0];
			break;
			
			case 2:
			res=nomes[1];
			break;
			
			case 3:
			res=nomes[2];
			break;
			
			//......
			}
		
	
	return res; 
  }


  /** Devolve esta data por extenso. */
  public String extenso() {
	Data d1=new Data();
	String name="";
	
	if(mes==01) name=nomes[0];
	if(mes==02) name=nomes[1];
	if(mes==03) name=nomes[2];
	if(mes==04) name=nomes[3];
	if(mes==05) name=nomes[4];
	if(mes==06) name=nomes[5];
	
	
	String resp=(dia+" de "+name+" de "+ano);
	
	
	
	return resp;
  }

  /** Indica se um terno (dia, mes, ano) forma uma data válida. */
  public static boolean dataValida(int dia, int mes, int ano) {
    boolean rep=true;
    
	
			
			switch(mes){
				case 1:
				if(dia>diasMesComum[0] || dia<1) rep=false;
				break;
				
				case 2:
				if(bissexto(ano) && dia>29 || dia<1) rep=false;
				break;
				
				case 4:
				if(dia>diasMesComum[3] || dia<1) rep=false;
				break;
			}
    
    return rep;
  }
  
  
   


  public void seguinte(){
    
	}
	
	
	public int ano(){
		return ano;
		
		}
	public int mes(){
		
		return mes;
	}	
	public int dia(){
		return dia;
	}

}

