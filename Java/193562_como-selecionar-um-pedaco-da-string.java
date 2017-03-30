//http://pt.stackoverflow.com/questions/193562/como-selecionar-um-peda%C3%A7o-da-string-java

public class Teste {
    public static void main(String[] args) {
        String x = "@646646&";
        int indexArroba = x.indexOf("@");
        int indexEComercial = x.indexOf("&");
        String resultado = x.substring(indexArroba + 1, indexEComercial);
        System.out.println(resultado);
    }
}