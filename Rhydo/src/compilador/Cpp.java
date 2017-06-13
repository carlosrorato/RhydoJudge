/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author acquila
 */
public class Cpp extends Judge {

    public int Compilador(String caminho) throws IOException {
        Runtime rt = Runtime.getRuntime();

        String comando;

        comando = String.format("g++ %s -o temp", caminho);

        Process p = rt.exec(comando);
        int val = 0;
        try {
            val = p.waitFor();
        } catch (InterruptedException ex) {
            Logger.getLogger(Judge.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (val == 0) {
            return 0; //deu certo a compilação
        }
        return 1; //deu errado a compilação
    }
}
