import com.sun.xml.internal.ws.commons.xmlutil.Converter;

public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //bono 200
        salary += 200;
        //salary = salary + 200;
        System.out.println(salary);

        //descuento
        salary =- 50;
        //salary = salary - 50
        System.out.println(salary);

        //2 horas extra 30 c/u
        //comida: 45

        salary = salary + (30 * 2) - 45;
        System.out.println(salary);

        //Actualizando Cadenas de texto
        String emplyeeName = "Santi";
        emplyeeName = emplyeeName + ":(";
        System.out.println(emplyeeName);

        emplyeeName = "unu" + emplyeeName;
        System.out.println("Tu nombre es: " + emplyeeName);

    }
}
