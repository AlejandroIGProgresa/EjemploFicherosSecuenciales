import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        listarFicherosPedidos();


    }

    private static void listarFicherosDirActual() {
        String dirActual = ".";
        File file = new File(dirActual);
        String[] archivos = file.list();

        System.out.printf("Ficheros en el directorio %s: %d", file.getName(), archivos.length);

        for (String fichero: archivos
             ) {
            File temp = new File(file, fichero);
            System.out.printf("Nombre: %s - FILE %B - DIR: %b%n",temp.getName(), temp.isFile(), temp.isDirectory());
        }
    }

    private static void listarFicherosPedidos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un fichero");
        String dirActual = sc.nextLine();
        try{

            File file = new File(dirActual);
            String[] archivos = file.list();

            System.out.printf("Ficheros en el directorio %s: %d", file.getName(), archivos.length);

            for (String fichero: archivos
            ) {
                File temp = new File(file, fichero);
                System.out.printf("Nombre: %s - FILE %B - DIR: %b%n",temp.getName(), temp.isFile(), temp.isDirectory());
            }
        }
        catch (Exception e){
            System.out.println("No existe este fichero");
        }
    }
}