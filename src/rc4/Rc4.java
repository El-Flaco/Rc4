/*
 * Implementación del algoritmo RC4
 * con Strings
 */
package rc4;

/**
 *
 * @author ThElFlacox
 */
public class Rc4 {
    private int i;
    private int j;
    private int[] S;
    private String key;
    
    public Rc4(String k){
       this.i = 0;
       this.j = 0;
       this.S = new int[256];
       this.key = k;
       for(int n=0;n<256;n++){
           this.S[n] = n;
       }
    }
    
    /*'Mezcla' la S-box segun la clave*/
    public void ksa(){
        j = 0;
        int k;
        for(i=0; i<256; i++){
            k = key.charAt(i % key.length());
            j = (j + S[i] + k) % 256;
            swap(i,j);
        }
        this.i = 0;
        this.j = 0;
    }
    
    /*Retorna el valor que tiene el vector en la posición t*/
    public int prga(){
        int t;
        i = (i+1) % 256;
        j = (j + S[i]) % 256;
        swap(i,j);
        t = (S[i]+S[j]) % 256;
        return S[t];
    }
    
    /* Intercambia el valor de la posicion i con el valor de la posicion j,
     * de la S-box
     */
    public void swap(int i, int j){
        int aux = S[i];
        S[i] = S[j];
        S[j] = aux;
    }
    
    /*Decodifica el mensaje cifrado*/
    public String decode(String c){
        String s = "";
        String aux[] = new String[c.length()/2];
        /* Divide el string c en pares de caracteres,
         * cada par va a ser un número en hexadecimal
         */
        for(int n=0, v=0;v < aux.length; v++,n+=2){
            aux[v]=c.substring(n, n+2);
        }
        int r;
        for(int n=0; n<=c.length()-2; n+=2){
            /* ^ es el operador XOR*/
            r = Integer.parseInt(c.substring(n, n+2),16) ^ this.prga();
            s = s.concat(Character.toString((char)r));
        }
        return s;
    }    
}