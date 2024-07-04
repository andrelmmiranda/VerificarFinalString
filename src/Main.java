public class Main {
    public static void main(String[] args) {

        verificarFinalString("programação", "ão");
        verificarFinalString("olá", "mundo");
        verificarFinalString("", "abc");
    }

    public static void verificarFinalString(String string, String substring){
        if(string.length() < substring.length()){
            System.out.println(false);
        } else{
            int inicio = string.length() - 2;
            int fim = string.length();

            System.out.println(string.substring(inicio, fim).equals(substring));
        }
    }
}