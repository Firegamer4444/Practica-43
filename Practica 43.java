import java.util.Scanner;

class main{
    public void introducir_datos(){
        try{
        Scanner scanner = new Scanner(System.in);
        System.out.print("introduce el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("introduce la edad: ");
        int edad = scanner.nextInt();
        if (edad >= 0){
            System.out.print("introduce la altura: ");
            float altura = scanner.nextLine();
        }
        else{
            System.out.print("Has introducido una edad negativa \nIntrodusca los datos de nuevo");
            introducir_datos();
        }
        } 
        catch (NumberFormatException e){
            System.out.print("Has introducido algun dato mal \nIntrodusca los datos de nuevo");
            introducir_datos();
        }
        finally {
        System.out.println("Has introducido los datos correctamente");
        System.out.println("nombre: " + nombre);
        }
    }

    public static void main(String[] args) {

    }
}