/* 
 * Copyright 2019 Javier Monterde - javier.monterde.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Javier Monterde - javier.monterde.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        //Variables
        double userValue; //El scanner es double puesto que 30.0 es par.
        int exit = 0;

        //Bucle principal
        while (exit != 1) {
            //Bloque principal
            try {
                //Pedimos el dato al usuario
                System.out.print("Por favor, inserte un número par ...: ");
                userValue = SCN.nextDouble();

                //Si el valor es par...:
                if (userValue % 2 == 0) {
                    //Le mostraremos el valor
                    System.out.printf("Usted insertó ...: %.0f%n", userValue);

                    //Y saldremos del bucle
                    exit = 1;
                } /*Si el valor no es par...: */ else {
                    System.out.printf("%nERROR: Valor impar.%n%n");
                }
            } catch (Exception e) {
                //Si el valor no es un double, mostraremos el siguiente
                //mensaje por pantalla y se repetirá el bucle
                System.out.printf("%nERROR: Valor no válido.%n%n");
            } finally {
                //Limpiamos el búfer
                SCN.nextLine();
            }
        }
    }
}
