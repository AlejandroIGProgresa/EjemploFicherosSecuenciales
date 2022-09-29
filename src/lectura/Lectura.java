package lectura;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Lectura {

    public static void main(String[] args) {
        // Fichero de destino
        File f = new File("Lectura.txt");
        ArrayList<String> lineas = new ArrayList<>();

        try {
            FileReader fr = new FileReader(f);
            BufferedReader bf = new BufferedReader(fr);

            String linea = null;
            while ((linea = bf.readLine()) != null){
                lineas.add(linea);
            }

            if (lineas.size() > 0){
                System.out.printf("El fichero tiene %d lineas, dime la línea a mostrar%n", lineas.size());
                Scanner sc = new Scanner(System.in);
                int numLinea = sc.nextInt();
                try {
                    System.out.println(lineas.get(numLinea - 1));
                }
                catch (IndexOutOfBoundsException e){
                    System.out.println("Esa línea no existe");
                }
                finally {
                    bf.close();
                    fr.close();
                }
            }
            else {
                System.out.println("El fichero está vacío");
            }
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe");
        } catch (IOException e) {
            System.out.println("No tengo permisos para leer");
        }

    }
}
