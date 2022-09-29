package Escritura;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escritura {
    public static void main(String[] args) {
        File destino = new File("Escritura");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(destino));
            for (int i = 0; i < 1000; i++) {
                bw.write("Esta es la línea: " + (i+1));
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
