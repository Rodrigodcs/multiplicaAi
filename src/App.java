public class App {
    public static void main(String[] args) throws Exception {
        int number = 6;

        System.out.println("Tabela de multiplicação de "+number );

        for(int i = 0; i<10;i++){
            System.out.println(i+1+" + "+number+" = "+number*(i+1) );
        }
    }
}
