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
public class MainCompiler {
    
    public int Compilador(String caminho, String linguagem) throws IOException
    {
        Runtime rt = Runtime.getRuntime();
        
        String comando;
        
        if(linguagem.equals("C")) comando = String.format("gcc %s -o temp -lm", caminho);
        else if(linguagem.equals("C++")) comando = String.format("g++ %s -o temp", caminho);
        else comando = "";
        
        Process p = rt.exec(comando);
        int val=0;
        try {
            val = p.waitFor();
        } catch (InterruptedException ex) {
            Logger.getLogger(MainCompiler.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(val == 0)
        {
            return 0; //deu certo a compilação
        }
        return 1; //deu errado a compilação
    }
 
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
        
        try {
            Runtime.getRuntime().exec(new String[] { "bash", "-c", comando}).waitFor(); //ele roda o comando em um terminal bash e espera que o comando seja finalizado
        } catch (InterruptedException ex) {
            Logger.getLogger(MainCompiler.class.getName()).log(Level.SEVERE, null, ex);
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
        
        if(flag1==tamanho) return 0; //YES
        else if(flag1+flag2 == tamanho) return 1; //YES - PRESENTATION ERROR
        else return 2; //NO - WRONG ANSWER
        
    }
     
}
