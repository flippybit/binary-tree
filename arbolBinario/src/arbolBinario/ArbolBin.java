package arbolBinario;

public class ArbolBin<T> {
	private Nodo<T> raiz;

	public ArbolBin() {
		super();
		this.raiz=null;
	}
	public boolean esVacio() {
		/*
		 * 
		 * 
		 * El hijo puta lo compica pero no es mas que un puto if 
		 * 
		 * 
		 * 
		 * if(this.raiz==null)
		 * return true 
		 * 	else
		 * return false 
		 * */
		
		return this.raiz==null;
	}
	public T getRaiz() {
		return raiz.getInfo();
	}
	public void setRaiz(Nodo<T> raiz) {
		this.raiz = raiz;
	}
	
}
