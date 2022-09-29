package ficherosBinarios;

import java.io.*;

public class LeerBinarios {
    public static void main(String[] args) {
        File file = new File("binarios.dat");
        try {
            FileInputStream fis = new FileInputStream(file);
            DataInputStream dis = new DataInputStream(fis);
            while (true){
                int numero = dis.readInt();
                System.out.println("El numero es " + numero);
            }


        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (EOFException e) {
            System.out.println("Lectura terminada");
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
