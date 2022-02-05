public class Ifstatemnt {
    public static void main(String[] args) {
        boolean isBluethoothEnabled = true;
        int fileSended = 3;

        if (isBluethoothEnabled == true){
            fileSended++;
            System.out.println("Archivo Enviado");
            int i = 0;
            i++;
        }else{
            fileSended--;
            System.out.println("Por favor enciende");
        }
        System.out.println(isBluethoothEnabled);
        System.out.println(fileSended);
    }
}
