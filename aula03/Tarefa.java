 public class Tarefa{
	
	private Data inicio,fim;
	private String texto;
	
	public Tarefa(Data ini,Data fim,String texto){
		this.inicio=ini;
		this.fim=fim;
		this.texto=texto;
		
	}
	
	public Data inicio(){
		return inicio;
		
		}
		
	public Data fim(){
		return fim;
		
		}	
	
	public String texto(){
		return texto;
		
		}	
	
	public String toString(){
		String res=this.inicio.toString()+" --- "+this.fim.toString()+": "+this.texto;
		
		return res;
		}  
  }
