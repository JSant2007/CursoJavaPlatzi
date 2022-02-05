public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        //devuelve entero hacia arriba
        System.out.println(Math.ceil(x));
        //devuelve entero hacia abajo
        System.out.println(Math.floor(x));

        //devuelve un numero elevado a otro
        System.out.println(Math.pow(x,y));

        //Devuelve el numero mayor
        System.out.println(Math.max(x,y));

        //Devuelve la raiz cuadrada
        System.out.println(Math.sqrt(y));

        //Area de un circulo
        //pi * r2
        System.out.println(Math.PI * Math.pow(y,2));

        //area de una esfera
        //4*pi*r2
        System.out.println(4 * Math.PI * Math.pow(y,2));

        //Volumen de una esfera
        //(4/3)*pi*r3
        System.out.println((4/3) * Math.PI * Math.pow(y,3));
    }
}
