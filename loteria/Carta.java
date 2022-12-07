package loteria;
public class Carta {
	public String nombre;
	public int id;
	public Carta(String nombre,int id){
		this.nombre=nombre;
		this.id=id;
	}

	public String getNombre() {
		return nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
