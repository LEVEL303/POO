public class Generica <T> {
    private T atributo1;
    private T atributo2;
    private T atributo3;

    public Generica(T atributo1, T atributo2, T atributo3) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
    }

    public int quantIguais() {
        if(atributo1.equals(atributo2) && atributo1.eqauls(atributo3)) {
            return 3;
        } else if(!atributo1.eqauls(atributo2) && !atributo1.eqauls(atributo3) && !atributo2.eqauls(atributo3)) {
            return 0;
        } else {
            return 2;
        }

    }

    public void imprimirAtributos() {
        System.out.println("Atributo 1: " + atributo1); 
        System.out.println("Atributo 2: " + atributo2); 
        System.out.println("Atributo 3: " + atributo3); 
    }
}