package java2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Vehiculo {


	    public static class Auto {

	        //variables

	        private int velocidadRecta;
	        private int velocidadCurva;

	        //constructor


	        public Auto() {
	            super();
	            this.velocidadRecta = 0;
	            this.velocidadCurva = 0;
	        }

	        public Auto(int velocidadRecta, int velocidadCurva) {
	            super();
	            this.velocidadRecta = 0;
	            this.velocidadCurva = 0;
	        }

	        public int getVelocidadRecta() {
	            return velocidadRecta;
	        }

	        public void setVelocidadRecta(int velocidadRecta) {
	            this.velocidadRecta = velocidadRecta;
	        }

	        public int getVelocidadCurva() {
	            return velocidadCurva;
	        }

	        public void setVelocidadCurva(int velocidadCurva) {
	            this.velocidadCurva = velocidadCurva;
	        }

	        public int acelerarRecta(){
	            this.velocidadRecta=this.velocidadRecta+5;
	            System.out.println("Velocidad:   "+this.velocidadRecta);
	            return this.velocidadRecta;
	        }
	        public int acelerarCurva(){
	            this.velocidadCurva=this.velocidadCurva+5;
	            System.out.println("Velocidad:   "+this.velocidadCurva);
	            return this.velocidadCurva;
	        }
	        public int frenarRecta(){
	            this.velocidadRecta=this.velocidadRecta-5;
	            System.out.println("Velocidad:   "+this.velocidadRecta);
	            return this.velocidadRecta;
	        }
	        public int frenarCurva(){
	            this.velocidadRecta=this.velocidadRecta-5;
	            System.out.println("Velocidad:   "+this.velocidadRecta);
	            return this.velocidadRecta;
	        }
	        public int mejorarVelocidad(){
	            this.velocidadRecta=this.velocidadRecta+15;
	            this.velocidadCurva=this.velocidadCurva+15;
	            System.out.println("Velocidad en recta:   "+this.velocidadRecta);
	            System.out.println("Velocidad en curva:   "+this.velocidadCurva);
	            return this.velocidadRecta;

	        }
	        public double calculoVelocidadRecta(double valor, double valor2){

	            double resultado;
	            if (valor == 0) {
	                return -1;
	            }
	            resultado = valor/valor2;
	            return resultado;

	        }

	        @Override
	        public String toString() {
	            return "Coche [velocidadRecta=" + velocidadRecta + ", velocidadCurva=" + velocidadCurva + "]";
	        }


	public static void main(String[] args) {



        InputStreamReader Leer = new InputStreamReader(System.in);
        BufferedReader sc = new BufferedReader(Leer);

        int op = 0;
        double tiempo=0;
        double distancia=0;
        double velocidad=0;

        Auto car = new Auto();

        System.out.println("Auto");
        System.out.println("1. Acelerar en recta");
        System.out.println("2. Acelerar en curva");
        System.out.println("3. Frenar en recta");
        System.out.println("4. Frenar en curva");
        System.out.println("5. Mejorar velocidad");
        System.out.println("6. Calcular tiempo en recta");
        System.out.println("7. Salir");
        System.out.println("Elija una opción : ");


        do{

            try {
                op=Integer.parseInt(sc.readLine());
            } catch (NumberFormatException | IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            switch(op){
                case 1:
                    car.acelerarRecta();
                    break;
                case 2:
                    car.acelerarCurva();
                    break;
                case 3:
                    car.frenarRecta();
                    break;
                case 4:
                    car.frenarCurva();
                    break;
                case 5:
                    car.mejorarVelocidad();
                    break;
                case 6:

                    Scanner teclado = new Scanner(System.in);
                    System.out.println("Introduzca velocidad en Km/h : ");
                    String velo = teclado.nextLine();
                    double valor = Double.parseDouble(velo);

                    Scanner ssc = new Scanner(System.in);
                    System.out.println("Introduzca distancia en km : ");
                    String distan = teclado.nextLine();
                    double valor2 = Double.parseDouble(distan);


                    car.calculoVelocidadRecta(valor,valor2);
                    break;

            }

        }while(op<7);

    }

	}

}
