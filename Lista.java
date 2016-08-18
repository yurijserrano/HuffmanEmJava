package huffman;

public class Lista {
    private No ini;// endereço inicial da lista
    private int quantidade;
    
    public Lista(){
        ini  = null;
        quantidade = 0;

    }
    /*
     * insere o elemento em ordem descrescente de frequencia
     */
    public void insere( No novo ){
        No prox=ini, anterior = null;
        while(prox!=null &&  prox.getFrequencia() > novo.getFrequencia()){
            anterior = prox;
            prox = prox.getProx();
        }
        if( anterior == null ) // insere no inicio da lista
            this.ini = novo;
        else
            anterior.setProx(novo);
        
        novo.setProx(prox);
        quantidade++;
    }
    /*
     * Extrai o minimo imaginamos que sempre tera pelo menos um 
     * elemento na lista
     */
    public No ExtraiMinimo(){
        
        No minimo = ini, anterior = null;
        
        while(minimo.getProx()!=null ){
            anterior = minimo;
            minimo = minimo.getProx();
        }
        if( anterior == null )// so tem um elemento na Lista
            ini = null;
        
        else
            anterior.setProx(null);
        
        return minimo;
        
    }
    public int tamanho(){
        return this.quantidade;
    }
    public String toString(){
        String lista="";
        No temp=ini;
        while(temp!=null){
            lista+=temp;
            temp=temp.getProx();
            if(temp != null)
                lista+=",";
        }
        
        return lista;
    }
}
