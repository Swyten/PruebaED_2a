package ProyectoFinal;
public class Nif {

    private int numero;
    private char letra;

    //CONSTANTE: no accesible - compartido por todo - no modificable
    private static final char[] LETRAS
            = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                'C', 'K', 'E'};
    
    /**
     * 
     * @param numero
     * Calcula la letra correspondiente de un número
     * @return 
     * retorna la letra del número que se le ha pasado como parámetro
     */
    private static char calcularLetra(int numero) {
        return LETRAS[numero % 23];
    }
    
    //contructores
    protected Nif() {
        this.numero = 0;
        this.letra = ' ';
    }

    protected Nif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }
    
    //métodos
    @Override
    public String toString() {
        return numero + "-" + letra;
    }
    /**
     * 
     * @param numero 
     * establece un Nif con el numero que se pasa como parámetro
     */
    protected void setNif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nif other = (Nif) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return this.letra == other.letra;
    }
}
