package arbolBinario;

public class Nodo<T> {
	private Nodo<T> hijoIzquierdo;
	private Nodo <T> hijoDerecho;
	private T info;
	
	
	
	public Nodo() {
		super();
		this.info=null;
		this.hijoDerecho=null;
		this.hijoIzquierdo=null;
	}

	public Nodo(Nodo<T> hijoIzquierdo, Nodo<T> hijoDerecho, T info) {
		super();
		this.hijoIzquierdo = hijoIzquierdo;
		this.hijoDerecho = hijoDerecho;
		this.info = info;
	}
	
	public Nodo<T> getHijoIzquierdo() {
		return hijoIzquierdo;
	}
	public void setHijoIzquierdo(Nodo<T> hijoIzquierdo) {
		this.hijoIzquierdo = hijoIzquierdo;
	}
	public Nodo<T> getHijoDerecho() {
		return hijoDerecho;
	}
	public void setHijoDerecho(Nodo<T> hijoDerecho) {
		this.hijoDerecho = hijoDerecho;
	}
	public T getInfo() {
		return info;
	}
	public void setInfo(T info) {
		this.info = info;
	}
	

}
