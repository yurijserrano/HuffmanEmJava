/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package huffman;

/**
 *
 * @author Yuri serrano
 */
public class arvoreHuffman {
    private No raiz;

    public arvoreHuffman() {
        this.raiz = null;
    }
    /*
     * Uma Lista de caracters ordenados em ordem decrescente de frequencia
     */
    public void ConstroiArvore(Lista L){
        int N = L.tamanho(); // quantidade de elementos no Lista
        
        for( int i=0; i< N-1; i++){
            No Z = new No();
            Z.setEsq(L.ExtraiMinimo());
            Z.setDir(L.ExtraiMinimo());
            Z.setFrequencia(Z.getEsq().getFrequencia()+Z.getDir().getFrequencia());
            L.insere(Z);
        }
        raiz = L.ExtraiMinimo();
    }
    public String toString(){
        
        return DesenhaArvore( raiz, 0);
    }
    public String DesenhaArvore( No p, int espacos )
    {
        String desenha="";   
        if ( p != null ){
            desenha+=DesenhaArvore( p.getDir(), espacos + 1 );

            for ( int i = 0 ; i < espacos; i++ )
                desenha+="      ";

            desenha+=p+"\n\n";

            desenha+=DesenhaArvore( p.getEsq(), espacos + 1 );
        }
        return desenha;
    }


    
}
