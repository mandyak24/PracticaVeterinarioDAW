package veterinario;
import java.util.ArrayList;

import java.util.Scanner;
public class Principal {

	

	
	public static void main(String[] args) {
		
		Perro perro0=new Perro("Pluto",2,"caniche");
		Perro perro1=new Perro("Lasie",8,"pastor aleman");
		
		Gato gato0=new Gato("Garfield",4,"corto");
		Gato gato1=new Gato("Kitty",9,"largo");
		
		Pajaro pajaro0=new Pajaro("Piolin",1,"verde");
		Pajaro pajaro1=new Pajaro("Fenix",2,"rojo");
		
		ArrayList<Animal> animalesEnfermos = new ArrayList <Animal>();
		
		ArrayList<Animal> animalesSanos=new ArrayList <Animal>();
	
		animalesEnfermos.add(perro0);
		animalesEnfermos.add(gato0);
		animalesEnfermos.add(pajaro0);
		animalesSanos.add(perro1);
		animalesSanos.add(gato1);
		animalesSanos.add(pajaro1);
		
		
		int dia=1;
		Scanner teclado=new Scanner(System.in);
		int numero=0;
		int numeroAnimal=0;
		int numeroAnimal2=0;
		int numeroSalida=0;
		
		
		
		while(numeroSalida!=-1) {
			System.out.println("Estamos en el dia: " + dia);
		
				System.out.println();
				System.out.println("Animales enfermos: ");
				
				for (int i = 0; i < animalesEnfermos.size(); i++) {
					
					System.out.println((i+1) + "-"+ animalesEnfermos.get(i).getNombre());
					
				}
				
				
				System.out.println("Selecciona el animal que se haya curado:");
				numeroAnimal=teclado.nextInt();
				numeroSalida=numeroAnimal;
				if(numeroAnimal!=-1) {
				animalesSanos.add(animalesEnfermos.get(numeroAnimal-1));
				animalesEnfermos.remove(numeroAnimal-1);
				
				System.out.println("Animales Curados:");
				for(int i=0;i<animalesSanos.size();i++) {
					System.out.println(animalesSanos.get(i).getNombre());
					
				}
				
				
				System.out.println("Selecciona el animal que se haya enfermado:");
				numeroAnimal2=teclado.nextInt();
				numeroSalida=numeroAnimal;
				if(numeroAnimal2!=-1) {
				animalesEnfermos.add(animalesSanos.get(numeroAnimal2-1));
				animalesSanos.remove(numeroAnimal2-1);
				
				}

				}
			
			dia++;
			}
		System.out.println("El programa ha finalizado");
	}
	
	}			
	
		

			

