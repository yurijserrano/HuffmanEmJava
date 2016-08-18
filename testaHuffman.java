/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package huffman;

/**
 *
 * @author Yuri Serrano
 */
public class testaHuffman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista = new Lista();
        
        lista.insere(new No('a',45));
        lista.insere(new No('b',13));
        lista.insere(new No('c',12));
        lista.insere(new No('d',16));
        lista.insere(new No('e',9));
        lista.insere(new No('f',5));
        System.out.println("Lista:"+lista);
        
        arvoreHuffman huffman = new arvoreHuffman();
        
        huffman.ConstroiArvore(lista);
        
        System.out.println("----------------------------------------------------");
        
        System.out.println("Arvore:\n"+huffman);
        //huffman.codigos();
        
        
    }
}
