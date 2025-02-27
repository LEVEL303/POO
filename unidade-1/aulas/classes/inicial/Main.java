public class Main {
    public static void main(String[] args) {
        Data d1 = Data.criaData(2, 12, 2022);
        Data d2 = Data.criaData(5, 10,5);

        if(d2 != null) {
            d2.mostraData();
        }
    }
}