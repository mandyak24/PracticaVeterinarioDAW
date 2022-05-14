package veterinario;

public class Pajaro extends Animal {
	
	private String color;

	public Pajaro(String nombre, int edad, String color) {
		super(nombre, edad);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}
