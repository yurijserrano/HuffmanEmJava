/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package huffman;

/**
 *
 * @author Yuri Serrano
 */
public class No {
    private char caracter;
    private int frequencia;
    private No prox;  
    // atributos para arvore
    private No esq, dir;

    // cria No da Lista
    public No(char caracter, int frequencia ){
        this.caracter = caracter;
        this.frequencia = frequencia;
    }
    // cria No da arvore
    public No(){
        this.caracter = '*';
        this.frequencia = 0;
        
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public No getEsq() {
        return esq;
    }

    public No getDir() {
        return dir;
    }

    public void setEsq(No esq) {
        this.esq = esq;
    }

    public void setDir(No dir) {
        this.dir = dir;
    }
    
    public char getCaracter() {
        return caracter;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public No getProx() {
        return prox;
    }
    public void setProx( No prox) {
        this.prox = prox;
    }
    public String toString(){
        return "["+this.caracter+","+this.frequencia+"]";
    }
}
