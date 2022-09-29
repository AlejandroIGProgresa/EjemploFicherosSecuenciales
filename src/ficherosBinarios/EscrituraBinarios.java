package ficherosBinarios;

import java.io.*;

public class EscrituraBinarios {
    public static void main(String[] args) {
        File file = new File("binarios.dat");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            DataOutputStream dos = new DataOutputStream(fos);
            for (int i = 0; i < 1000; i++) {
                dos.writeInt(200);
            }
            dos.writeChars("Hola mundo");
            dos.writeBoolean(true);
            dos.close();
            fos.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
