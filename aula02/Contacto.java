public class Contacto {
  private String nome;
  private String telefone;
  private String eMail;
  
	  public Contacto(String Nome,String Telefone,String Email){
		this.nome=Nome;
		this.telefone=Telefone;
		this.eMail=Email;
		}
		
		public Contacto(String Nome,String Telefone){
			this.nome=Nome;
			this.telefone=Telefone;
			
			}
	
	
			public String nome(){
				return nome;
				}
			public String telefone(){

				return telefone;
				}
			public String eMail(){
				return eMail;
				}	
}


