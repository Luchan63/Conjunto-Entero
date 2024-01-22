public class PruebaConjunto {
    public static void main(String[] args) {
        // prueba de la clase conjuntoenteros
        ConjuntoEntero conjunto1 = new ConjuntoEntero();
        conjunto1.InsertarElemento(1);
        conjunto1.InsertarElemento(2);
        conjunto1.InsertarElemento(3);

        ConjuntoEntero conjunto2 = new ConjuntoEntero();
        conjunto2.InsertarElemento(3);
        conjunto2.InsertarElemento(5);
        conjunto2.InsertarElemento(7);

        System.out.println("Conjunto 1: " + conjunto1);
        System.out.println("Conjunto 2: " + conjunto2);

        ConjuntoEntero union = ConjuntoEntero.union(conjunto1,conjunto2);
        System.out.println("Union: " + union);

        ConjuntoEntero interseccion = ConjuntoEntero.interseccion(conjunto1, conjunto2);
        System.out.println("Intersección: " + interseccion);

        ConjuntoEntero conjunto3 = new ConjuntoEntero();
        conjunto3.InsertarElemento(1);
        conjunto3.InsertarElemento(2);
        conjunto3.InsertarElemento(3);

        System.out.println("conjunto 3: " + conjunto3);

        System.out.println("¿conjunto 1 es igual a Conjunto 3? " + conjunto1.esIgualA(conjunto3));

        conjunto1.eliminarElmento(1);

        System.out.println("Nuevo Conjunto 1:  " + conjunto1);

    }
}
