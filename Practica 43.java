import java.util.Scanner;

class main{
    public static void introducir_datos(){
        try{
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nintroduce el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("introduce la edad: ");
        int edad = scanner.nextInt();
        if (edad >= 0){
            System.out.print("introduce la altura: ");
            float altura = scanner.nextFloat();
            System.out.println("Has introducido los datos correctamente");
            System.out.println("nombre: " + nombre);
            System.out.println("edad: " + edad + " años");
            System.out.println("altura: " + altura + " metros");
        }
        else{
            System.out.print("Has introducido una edad negativa \nIntrodusca los datos de nuevo");
            introducir_datos();
        }
        } 
         catch (java.util.InputMismatchException e) {
            System.out.print("Has introducido algun dato mal \nIntrodusca los datos de nuevo");
            introducir_datos();
        }   
        catch (java.util.NoSuchElementException e) {
        System.out.println("\nHas interrumpido el programa");
    }
        
    }

    public static void main(String[] args) {
        introducir_datos();
    }
}