/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlosrorato
 */
public class Judge {

 
    public int comparar(String a, String b) //função que compara, caractere a caractere
    {
        int flag = 0, i = 0;
        try{
        
        for(i = 0; i < a.length(); i++)
        {
            char Ca = a.charAt(i);
            char Cb = b.charAt(i);
            if(Ca == Cb) flag++;
        }
        }catch(StringIndexOutOfBoundsException e){
            return 0;
        }catch(NullPointerException e){
            return 0;
        }
        if(flag >= a.length()) return 1;
        else if(flag >= 0.95*a.length()) return 2;
        else return 0;
       
    }
     
    public int Runner(String input, String output) throws IOException
    {
        int aux = 0;
        int flag1 = 0,flag2 = 0;
        int tamanho = 0;
        
        String comando, resposta, saida;
        
        comando = "./temp < " + input + " > saida.txt";
        /*Tirou o waitfor*/
        //try {
        Process p = Runtime.getRuntime().exec(new String[] { "bash", "-c", comando}); //ele roda o comando em um terminal bash e espera que o comando seja finalizado
        //} catch (InterruptedException ex) {
        //    Logger.getLogger(Judge.class.getName()).log(Level.SEVERE, null, ex);
        //}
        
        int tempo = 0;
        
        while(p.isAlive() && tempo < 50){
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Judge.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            tempo++;
            
        }

        if(tempo == 50){
            p.destroy();
            return 3;//TIME OUT
        }
       
        //leituar dos arquivos
        FileReader saida1 = new FileReader(output);
        BufferedReader lerArq1 = new BufferedReader(saida1);
        FileReader saida2 = new FileReader("saida.txt");
        BufferedReader lerArq2 = new BufferedReader(saida2);
        
        while(lerArq1.ready()){
            resposta = lerArq1.readLine();
            saida = lerArq2.readLine(); 
            aux = comparar(resposta,saida);
            if(aux==1) flag1++;
            else if(aux==2) flag2++;
            
            tamanho++;
        }
        
        saida1.close();
        saida2.close();
        lerArq1.close();
        lerArq2.close();
        
        if(flag1==tamanho) return 0; //YES
        else if(flag1+flag2 == tamanho) return 1; //YES - PRESENTATION ERROR
        else return 2; //NO - WRONG ANSWER
        
    }
     
}
