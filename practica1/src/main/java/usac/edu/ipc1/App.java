package usac.edu.ipc1;
import java.util.Scanner;
import java.lang.Math;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner leer = new Scanner(System.in);
        int eleccion = 0;
        int aritmetica = 0;
        int trigonometria = 0;
        int estadistica = 0;
        int calculo = 0;
        while (eleccion != 5) {
        System.out.println( "------ Menu ------\n1. Aritmética\n2. Trigonometría\n3. Estadística\n4. Cálculo\n5. Salir\nSeleccione una opción" );
        eleccion = leer.nextInt();
        if (eleccion == 1) {
            while (aritmetica != 5) {
            int arit1 = 0;
            int arit2 = 0;
            int aritTotal = 0;
            System.out.println("------ Aritmetica ------\n1. Suma\n2. Resta\n3. Multiplicación\n4. División\n5. Regresar");
            System.out.println("Ingresa la operación a realizar");
            aritmetica = leer.nextInt();
            if (aritmetica == 1) {
                System.out.println("Ingresa el primer número a sumar:");
                arit1 = leer.nextInt();
                System.out.println("Ingresa el segundo número a sumar:");
                arit2 = leer.nextInt();
                aritTotal = arit1 + arit2;
                System.out.println("La suma es: "+aritTotal);
            } else if (aritmetica == 2) {
                System.out.println("Ingresa el primer número a restar:");
                arit1 = leer.nextInt();
                System.out.println("Ingresa el segundo número a restar");
                arit2 = leer.nextInt();
                aritTotal = arit1 - arit2;
                System.out.println("La resta es: "+aritTotal);
            } else if (aritmetica == 3) {
                System.out.println("Ingresa el primer número a multiplicar:");
                arit1 = leer.nextInt();
                System.out.println("Ingresa el segundo número a multiplicar:");
                arit2 = leer.nextInt();
                aritTotal = arit1 * arit2;
                System.out.println("La multiplicación es: "+aritTotal);
            } else if (aritmetica == 4) {
                System.out.println("Ingresa el primer número a dividir:");
                arit1 = leer.nextInt();
                while (arit2 == 0) {
                    System.out.println("Ingresa el segundo número a dividir:");
                    arit2 = leer.nextInt();
                    if (arit2 == 0) {
                        System.out.println("Ingresar otro número distinto a 0");
                    }
                }
                double aritTotal2 = Double.valueOf(arit1) / Double.valueOf(arit2);
                System.out.println("La división es: "+aritTotal2);
            } else if (aritmetica == 5) {
                System.out.println("Regresando al menú...");
            } else {
                System.out.println("Opción incorrecta");
            }
            }
        } else if (eleccion == 2) {
            trigonometria = 0;
            while (trigonometria != 4) {
                double trig1 = 0.0;
                double trig2 = 0.0;
                double denominador = 1.0;
                int fact = 0;
                double sum = 0.0;
                double res = 0.0;
                double sen = 0.0;
                double cos = 0.0;
                System.out.println("------ Trigonometría ------\n1. Seno\n2. Coseno\n3.Tangente\n4. Regresar");
                System.out.println("Ingresa la operación a realizar");
                trigonometria = leer.nextInt();
                if (trigonometria != 4) {
                    System.out.println("Ingrese el valor para x:");
                    trig1 = leer.nextInt();
                    System.out.println("Ingrese el valor para i:");
                    trig2 = leer.nextInt();
                    double x = trig1 * (3.14159/180);
                    for (int n = 0; n < trig2; n++){
                        fact = 2*n+1;
                        while (fact != 0) {
                            denominador *= fact; fact--;
                        }
                        res = (Math.pow(-1, n)) / denominador * Math.pow(x, fact);
                        sen = sen + res;
                    }
                    denominador = 1.0;
                    res = 0.0;
                    for (int n = 0; n < trig2; n++){
                        fact = 2*n;
                        while (fact != 0) {
                            denominador *= fact; fact--;
                        }
                        res = (Math.pow(-1, n)) / denominador * (Math.pow(x, fact));
                        cos = cos + res;
                    }
                    sum = sen / cos;
                    if (trigonometria == 1) {
                        System.out.println("El seno es: "+sen);
                    } else if (trigonometria == 2) {
                        System.out.println("El coseno es: "+cos);
                    } else if (trigonometria == 3) {
                        System.out.println("Su tangente es "+sum);
                    }
                } else if (trigonometria == 4) {
                    System.out.println("regresando al menú...");
                } else {
                    System.out.println("Opción incorrecta");
                }
            }
        } else if (eleccion == 3) {
            float desvia = 1.0f;
            while (estadistica != 4) {
                System.out.println("------ Estadística ------\n1. Media\n2. Varianza\n3. Desviación estándar\n4. Regresar");
                System.out.println("Seleccione su opción");
                estadistica = leer.nextInt();
                if (estadistica != 4) {
                    System.out.println("Ingrese la cadena de valores separada por ,  ");
                        String cadena = leer.next();
                        System.out.println("Su cadena es " + cadena);
                        String[] cadenaArray = cadena.split(",");
                        float x = 0.0f;
                        for (int i = 0; i < cadenaArray.length; i++) {
                            x = x + Integer.parseInt(cadenaArray[i]);
                        }
                        float media = x / cadenaArray.length;
                        float sumatoria = 0.0f;
                        for (int i = 0; i < cadenaArray.length; i++) {
                            sumatoria = sumatoria + ((Integer.parseInt(cadenaArray[i]) - media) * (Integer.parseInt(cadenaArray[i]) - media));
                        }
                        float varia = sumatoria/cadenaArray.length;
                        for (int i = 1; i < 10; i++) {
                            desvia = (desvia + varia/desvia) / 2;
                        }
                    if (estadistica == 1) {
                        System.out.println("Su media es "+media);
                    } else if (estadistica == 2) {
                        System.out.println("Su varianza es: "+varia);
                    } else if (estadistica == 3) {
                        System.out.println("Su desviación estándar es: "+desvia);
                    } else {
                        System.out.println("Opción incorrecta");
                    }
                } else {
                    System.out.println("Regresando al menú...");
                }
            }
        } else if (eleccion == 4) {
            //Gauss-Jordan
            while (calculo != 2) {
                System.out.println("------ Cálculo ------\n1. Resolver sistema de ecuaciones lineales de NxN con Gauss Jordan\n2. Regresar");
                System.out.println("Seleccione su opción");
                calculo = leer.nextInt();
                if (calculo == 1) {
                    System.out.println("Ingrese la cantidad de ecuaciones para usar:");
                    int n = leer.nextInt();
                    System.out.println("Ingrese la cantidad de variables que tendrá: ");
                    int m = leer.nextInt();
                    double[][] matriz = new double[n][m];

                    for(int i = 0; i < n; i++) {
                        System.out.println("Ingrese los coeficientes de cada variable");
                        String val = leer.next();
                        String[] string = val.split(",");

                        for(int j = 0; j < m; j++){
                            matriz[i][j] = Double.parseDouble(string[j]);
                        }
                    }

                    for(int p = 0; p < n; p++) {
                        for (int y = 0; y < m; y++){
                            System.out.print(matriz[p][y]+" - ");
                        }
                        System.out.println();
                    }
                    System.out.println("--------------------");


                    double termino;
                    for(int i=0; i<n; i++) {
                        if(matriz[i][i]==0.0) {
                            System.err.println("Error: divisi\242n entre cero.\n");
                            return;
                        }
                        for(int k=0; k<n; k++)
                        if(k!=i) {
                            termino = matriz[k][i] / matriz[i][i];
                            for(int j=0; j<=n; j++)
                            matriz[k][j] -= termino * matriz[i][j];

                            for(int p = 0; p < n; p++) {
                                for (int y = 0; y < m; y++){
                                    System.out.print(matriz[p][y]+" - ");
                                }
                                System.out.println();
                            }
                            System.out.println("--------------------");
                        }
                    }

                    for(int i = 0; i<n; i++){
                        termino = matriz[i][n] / matriz[i][i];
                        matriz[i][n] = termino;
                        matriz[i][i] = 1.0;
                    }

                    
                    for(int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++){
                            System.out.print(matriz[i][j]+" - ");
                        }
                        System.out.println();
                    }

                } else if (calculo == 2){
                    System.out.println("Regresando al menú...");
                } else {
                    System.out.println("Opción incorrecta");
                }
            }
        }
        }

    }
}
