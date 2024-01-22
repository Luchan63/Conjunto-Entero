// ejercicio 8.13
public class ConjuntoEntero {
    private boolean[] valores;

    // contrunctor que no recibe argumento
    public ConjuntoEntero()
    {
        valores = new boolean[101]; // el rango es de 0 a 100
    }

    // metodo static para realizar la union de dos conjuntos
    public static ConjuntoEntero union(ConjuntoEntero conjunto1, ConjuntoEntero conjunto2)
    {
        ConjuntoEntero resultado = new ConjuntoEntero();
        for (int i = 0; i < resultado.valores.length; i++)
        {
            resultado.valores[i] = conjunto1.valores[i] || conjunto2.valores[i];
        }
        return resultado;
    }

    // Método para realizar la intersección de dos conjuntos
    public static ConjuntoEntero interseccion(ConjuntoEntero conjunto1, ConjuntoEntero conjunto2) {
        ConjuntoEntero resultado = new ConjuntoEntero();
        for (int i = 0; i < resultado.valores.length; i++) {
            resultado.valores[i] = conjunto1.valores[i] && conjunto2.valores[i];
        }
        return resultado;
    }


    //Metodo para insertarElementos
    public void InsertarElemento(int elemento)
    {
        if (elemento >= 0 && elemento <= 100)
        {
            valores[elemento] = true;
        } else {
            System.out.println("elemento fuera del rango");
        }
    }

    // metodo para eliminar un elemento del conjunto
    public void eliminarElmento(int elemento)
    {
        if (elemento >= 0 && elemento <= 100)
        {
            valores[elemento] = false;
        } else {
            System.out.println(" Elemento fuera del rango");
        }
    }

    // metodo para verificar si dos conjuntos son iguales
    public boolean esIgualA(ConjuntoEntero otroConjunto)
    {
        for (int i = 0; i < valores.length; i++)
        {
            if (valores[i] != otroConjunto.valores[i])
            {
                return false;
            }
        }
        return true;
    }

    // toString
    public String toString()
    {
        String result = "";
        boolean conjuntoVacio = true;

        for (int i = 0; i < valores.length; i++)
        {
            if (valores[i])
            {
                result += i + " ";
                conjuntoVacio = false;
            }
        }
        if (conjuntoVacio)
        {
            return "---"; // conjunto vacio
        } else {
            return result.trim();
        }
    }
}