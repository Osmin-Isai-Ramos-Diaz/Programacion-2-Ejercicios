/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x37lms;

/**
 *
 * @author osmin
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
//a) Usar un ciclo controlado por centinela para leer 10 números positivos. Calcular e imprimir la suma.
//00 ? +1030  // Cargar 10 en la ubicación 30
//01 +1030    // Sumar 10 al acumulador
//02 +2009    // Cargar el valor del operando (primer número) en el acumulador
//03 +4206    // Restar 6 del operando (0) para verificar si el número es positivo
//04 +3109    // Si es positivo, sumar el número al acumulador
//05 +2009    // Cargar el valor del operando (segundo número) en el acumulador
//06 +4206    // Restar 6 del operando (0) para verificar si el número es positivo
//07 +3109    // Si es positivo, sumar el número al acumulador
//08 +2009    // Cargar el valor del operando (tercer número) en el acumulador
//09 +4206    // Restar 6 del operando (0) para verificar si el número es positivo
//10 +3109    // Si es positivo, sumar el número al acumulador
//11 +2009    // Cargar el valor del operando (cuarto número) en el acumulador
//12 +4206    // Restar 6 del operando (0) para verificar si el número es positivo
//13 +3109    // Si es positivo, sumar el número al acumulador
//14 +2009    // Cargar el valor del operando (quinto número) en el acumulador
//15 +4206    // Restar 6 del operando (0) para verificar si el número es positivo
//16 +3109    // Si es positivo, sumar el número al acumulador
//17 +2009    // Cargar el valor del operando (sexto número) en el acumulador
//18 +4206    // Restar 6 del operando (0) para verificar si el número es positivo
//19 +3109    // Si es positivo, sumar el número al acumulador
//20 +2009    // Cargar el valor del operando (séptimo número) en el acumulador
//21 +4206    // Restar 6 del operando (0) para verificar si el número es positivo
//22 +3109    // Si es positivo, sumar el número al acumulador
//23 +2009    // Cargar el valor del operando (octavo número) en el acumulador
//24 +4206    // Restar 6 del operando (0) para verificar si el número es positivo
//25 +3109    // Si es positivo, sumar el número al acumulador
//26 +2009    // Cargar el valor del operando (noveno número) en el acumulador
//27 +4206    // Restar 6 del operando (0) para verificar si el número es positivo
//28 +3109    // Si es positivo, sumar el número al acumulador
//29 +2009    // Cargar el valor del operando (décimo número) en el acumulador
//30 +4206    // Restar 6 del operando (0) para verificar si el número es positivo
//31 +3109    // Si es positivo, sumar el número al acumulador
//32 +2109    // Almacenar el valor del acumulador en el operando (resultado)
//33 +1111    // Escribir el resultado en la salida
//34 +4300    // Bifurcar a la ubicación 00 (iniciar el ciclo de centinela)

//b) Usar un ciclo controlado por contador para leer siete números, algunos positivos y otros negativos, y 
//calcular e imprimir su promedio.
//00 ? +0000  // Variable de suma
//01 ? +0000  // Variable de contador
//02 ? +0000  // Variable para el número actual
//03 ? +0000  // Variable para el número actual (absoluto)
//04 ? +0000  // Variable para el promedio
//05 ? +0000  // Variable temporal (negativo)
//06 +2004    // Cargar 0 en el acumulador
//07 +2100    // Almacenar el acumulador en la variable de suma
//08 +2005    // Cargar 0 en el acumulador
//09 +2101    // Almacenar el acumulador en la variable de contador
//10 +1002    // Leer un número en la variable número actual
//11 +4205    // Restar 5 del operando (0) para verificar si el número es positivo o negativo
//12 +4118    // Bifurcar a 18 si es negativo
//13 +3100    // Si es positivo, sumar el número actual a la suma
//14 +3101    // Incrementar el contador
//15 +1002    // Leer el siguiente número en la variable número actual
//16 +4205    // Restar 5 del operando (0) para verificar si el número es positivo o negativo
//17 +4118    // Bifurcar a 18 si es negativo
//18 +2102    // Almacenar el número actual en la variable temporal (negativo)
//19 +4300    // Bifurcar a la ubicación 00 (reiniciar el ciclo)
//20 +2000    // Cargar la variable de suma en el acumulador
//21 +4205    // Restar 5 del operando (0) para verificar si el contador es cero
//22 +4119    // Bifurcar a 19 si no es cero
//23 +3201    // Si es cero, dividir la suma entre el contador
//24 +2104    // Almacenar el resultado en la variable de promedio
//25 +1111    // Escribir el promedio en la salida
//26 +4300    // Bifurcar a la ubicación 00 (finalizar el programa)

//c) Leer una serie de números, determinar e imprimir el número más grande. El primer número leído indica
//cuántos números deben procesarse.
//00 ? +0000  // Variable para el número de números a procesar
//01 ? +0000  // Variable para el número actual
//02 ? +0000  // Variable para el número más grande
//03 ? +0000  // Variable temporal (comparación)
//04 +1000    // Leer el número de números a procesar
//05 +2001    // Cargar 0 en el acumulador (contador)
//06 +2102    // Almacenar el acumulador en la variable número más grande
//07 +1001    // Leer el primer número en la variable número actual
//08 +4202    // Restar 2 del operando (0) para verificar si el contador es cero
//09 +4115    // Bifurcar a 15 si no es cero
//10 +3102    // Si el número actual es mayor que el número más grande, almacenarlo en número más grande
//11 +2103    // Almacenar el número actual en la variable temporal (comparación)
//12 +3100    // Si el número más grande es mayor que el número temporal, cargar el número más grande en el acumulador
//13 +4203    // Restar 3 del operando (0) para verificar si el contador es cero
//14 +4117    // Bifurcar a 17 si no es cero
//15 +3201    // Si es cero, escribir el número más grande en la salida
//16 +4300    // Bifurcar a la ubicación 00 (finalizar el programa)
//17 +3102    // Si el número más grande no es mayor que el número temporal, cargar el número temporal en el acumulador
//18 +4203    // Restar 3 del operando (0) para verificar si el contador es cero
//19 +4117    // Bifurcar a 17 si no es cero
//20 +3201    // Si es cero, escribir el número más grande en la salida
//21 +4300    // Bifurcar a la ubicación 00 (finalizar el programa)


