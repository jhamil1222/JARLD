package com.company;

import java.security.SecureRandom;


public class mul {
    /**Esta clase hace una multiplicacion de matrices
     * por ende esta clase sera usada en la libreria de redes neuronales que
     * se hara desde 0 claro que esta libreria esta escrita en español pero
     * las funciones por razones de performance y hype se abrebiaron pos data este clase me llevo 2 dias por mi
     * propia cuenta de haber sabido que habia en internet algunos ejemplos me ubiera ahorrado el tiempo
     * pos data no reimbentes la rueda solo usa la que ya tienes pero si puedes mejorarala
     * pos data cada clase es independiente del archivo por ello al compilar este archivo se separa en 5 clases que seran
     * la respectiva operacion siendo la principal la multiplicacion matricial
     * @author JhamilRoldanLopez
     * @version 0.0.1 Beta
     *
     * */
    public static double [][]resulto;
    /**pos data para todo la columna es la fila y la fila es la columna un toque de complejidad extra */
    /*una nota mia si tienes problemas con las matrices por favor solo establecelas de la siguiente forma{{}} es para
    * mantener una buena sintaxis pos data solo funcionara con doubles [][] pero ponet creativo un ejemplo {{1,2}}*{{0,1},{1,2}}*/
    public static double [][]result(double[][] prim,double [][] sec){
        int columnas =prim.length, filas=sec[0].length,gato= sec.length;
        /*System.out.println(columnas);*/
        double [][]resultado=new double [columnas][filas];
        int i=0,j=0;
        //solo una fila
        int cal=0,cil=0;
        double pol=0;
        while(j<columnas){
            i=0;
            while(i<filas){
                cal=0;
                while(cal<gato){
                    //se multiplica por el numero de filas y suma pero solo un resultado matricial

                    pol+=prim[j][cal]*sec[cal][i];
                    cal++;

                }
                //se pone un resultado de la suma y multplicacion
                resultado[j][i]=pol;
                pol=0;
                /*System.out.println(resultado[j][i]);
                System.out.println(j+"gatito"+i);*/
                i++;
            }j++;
        }
        resulto=resultado;
    return resultado;
    }

    public static double[][] result(double solo, double [] matriz ){
        int fila=0;
        double []mov=new double[matriz.length];
        for(double pan : matriz){
            mov[fila]=solo*pan;
            if(fila<mov.length-1){
                fila++;}
        }
        double [][] pili={mov};
        resulto=pili;
        return pili;
    }
    public static double[] result1F(double solo, double [] matriz ){
        int fila=0;
        double []mov=new double[matriz.length];
        for(double pan : matriz){
            mov[fila]=solo*pan;
            if(fila<mov.length-1){
                fila++;}

        }
        double[][] pan={mov};
        resulto=pan;
        return mov;
    }

    public static double[][] result(double solo, double [][]matriz ){
        /**multiplicacion de matrices por uno solo*/
        int columna=0;
        int fila=0;
        double [][]mov=new double[matriz.length][matriz[0].length];
        for(double []poit: matriz){
            fila=0;
        for(double pan : poit){
            mov[columna][fila]=solo*pan;
            //System.out.println(mov[columna][fila]+" columna "+columna+" fila "+fila);
            if(fila<mov.length-1){
            fila++;}
        }
           if(columna<mov[0].length-1){
            columna++;}
        }
        //System.out.println(mov[columna][fila]);
        resulto=mov;
        return mov;
    }

    /**como en esta version incluyo fucniones estaticos ya no es nesesario esta funcion a pesar
     * de su utilidad pero por si acaso estara aqui pero como digo mejor eliminarla da mas
     * peso al archivo**/
    public void getimpRe(){
        try {
        int a=0;
        boolean pil=false;
        for(double [] poli:this.resulto){
            for(double py:poli){
                if(a==poli.length-1){
                    a=-1;
                    pil=true;
                }
                System.out.print(py+" "+((pil)?"\n":""));

                pil=false;


                a++;
            }
        }
        }catch(NullPointerException ex){
            System.out.println("error no estableciste ninguna multplicacion con matrices por ello "+ex);
        }
    }
    public static void impMat (double [][] mat){
        int pol=0,corre=0,oi=0;
        boolean pil=false,coli=false;
        for(double [] poli:mat){
          oi=0;
            for(double py:poli){

                if(pol==0){
                    coli=true;
                }

                System.out.print(((coli)?"array[":"")+py+" ");
                if(oi==poli.length-1){
                    System.out.print("]\n");

                }

                    coli=false;



                pil=false;


                oi++;
                pol++;

            }
            if(corre< mat.length-1){
                System.out.print("     [");
            }
            corre++;
        }

    }

}
class matT extends mul{
    /**esta clase esta en un mismo archivo por razones de complejidad pero no te preocupes si no entiendes
     * java lo entenderas cuanto tiempo mas estes con el, al principio duele pero con el tiempo te acostumbras
     * pero el dolor sesara,te gustara y queras mas
     * @author JhamilRoldanLopez
     * @version 0.0.1*/
    static double [][]pancito;
    @Override
    public void getimpRe(){
        /**
         * impresion de la matriz transpuesta
         */
        super.resulto=pancito;
        super.getimpRe();
    }

    public static double [][]matTi(double[][] pis)
    {/**llame a esta funcion para tener una matriz transpuesta */

        double [][]tra=new double [pis[0].length][pis.length];

        int n=0;
        int a=0;


        //modificacion severa de pis XD 2020
        for(int o=0;o<pis.length;o++){
            for(int j=pis[o].length-1;j>=0;j--)
            {
                tra[j][o]=pis[o][j];

            }

        }

        	/*
		123
		456
		677

		146
		257
		367
		*/

     pancito=tra;
        return tra;
    }

}
//error muy raro en los metodos corregir
class randMat extends mul{
    /**matrices randomicas justas para el desarrollo de machine learning */
    /**aqui ya agregue bien las filas y columnas que mas da total funciona*/
    static double[][] polilla;
    @Override
    public void getimpRe(){
        /**
         * impresion de la matriz randomica
         */
        super.resulto=polilla;
        super.getimpRe();
    }

    static SecureRandom poy=new SecureRandom();
    public static double [][]random(/**numero de filas de la matriz */int filas, /**numero de columnas */int columnas){
        //filas+=1;columnas+=1;
        int columna=0;
        int fila=0;
        double solo=0;
        //System.out.println("filas"+filas+"columnas"+columnas);

        double [][] matriz=new double[filas][columnas];
        double [][]mov=new double[matriz.length][matriz[0].length];
        for(double []poit: matriz){
            fila=0;
            for(double pan : poit){
                solo=poy.nextDouble();
                mov[columna][fila]=solo;
                //System.out.println(mov[columna][fila]+" columna "+columna+" fila "+fila);
                //aqui modifique algo

                    fila++;
            }

            //aqui igual

                columna++;}

        polilla=mov;
        return mov;
    }
    public static double [][]random(/**numero de filas de la matriz */int filas, /**numero de columnas */int columnas,double comienzo, boolean comprobar){
        int columna=0;
        int fila=0;
        double solo=0;

        double [][] matriz=new double[filas][columnas];
        double [][]mov=new double[matriz.length][matriz[0].length];
        for(double []poit: matriz){
            fila=0;
            for(double pan : poit) {
                solo = poy.nextDouble();
                mov[columna][fila] = comienzo + solo;
                if (comprobar) {
                    //System.out.println(mov[columna][fila] + " columna " + columna + " fila " + fila);
                }

                    fila++;

            }

                columna++;}

        polilla=mov;
        return mov;
    }
    public static  double [][]random(/**numero de filas de la matriz */int filas, /**numero de columnas */int columnas,double limite){
        int columna=0;
        int fila=0;
        double solo=0;

        double [][] matriz=new double[filas][columnas];
        double [][]mov=new double[matriz.length][matriz[0].length];
        for(double []poit: matriz){
            fila=0;
            for(double pan : poit){
                solo=poy.nextDouble();
                mov[columna][fila]=(solo%limite);
                //System.out.println(mov[columna][fila]+" columna "+columna+" fila "+fila);

                    fila++;
            }

                columna++;}

        polilla=mov;
        return mov;
    }
    public static double [][]random(/**numero de filas de la matriz */int filas, /**numero de columnas */int columnas,double empiezo,double limite){
        int columna=0;
        int fila=0;
        double solo=0;

        double [][] matriz=new double[filas][columnas];
        double [][]mov=new double[matriz.length][matriz[0].length];
        for(double []poit: matriz){
            fila=0;
            for(double pan : poit){
                solo=poy.nextDouble();
                mov[columna][fila]=empiezo+solo%(limite-empiezo);
                //System.out.println(mov[columna][fila]+" columna "+columna+" fila "+fila);

                    fila++;
            }

                columna++;
        }
        polilla=mov;
        return mov;
    }
    public static double [][]random(/**numero de filas de la matriz */int filas, /**numero de columnas */int columnas,double comienzo, boolean entero,boolean soloFalso){
        int columna=0;
        int fila=0;
        double solo=0;

        double [][] matriz=new double[filas][columnas];
        double [][]mov=new double[matriz.length][matriz[0].length];
        for(double []poit: matriz){
            fila=0;
            for(double pan : poit) {
                solo = poy.nextInt();
                mov[columna][fila] = comienzo + solo;
                //if(comprobar){System.out.println(mov[columna][fila]+" columna "+columna+" fila "+fila);}

                fila++;
            }


                columna++;}

        polilla=mov;
        return mov;
    }
    public static double [][]random(/**numero de filas de la matriz */int filas, /**numero de columnas */int columnas,double limite, boolean entero,int falsopositivo){
        int columna=0;
        int fila=0;
        double solo=0;

        double [][] matriz=new double[filas][columnas];
        double [][]mov=new double[matriz.length][matriz[0].length];
        for(double []poit: matriz){
            fila=0;
            for(double pan : poit){
                solo=poy.nextInt();
                mov[columna][fila]=solo%limite;
                //System.out.println(mov[columna][fila]+" columna "+columna+" fila "+fila);
                    fila++;
            }

                columna++;
        }
        polilla=mov;
        return mov;
    }
    public static double [][]random(/**numero de filas de la matriz */int filas, /**numero de columnas */int columnas,double empiezo,double limite,boolean enteroSignado){
        int columna=0;
        int fila=0;
        double solo=0;

        double [][] matriz=new double[filas][columnas];
        double [][]mov=new double[matriz.length][matriz[0].length];
        for(double []poit: matriz){
            fila=0;
            for(double pan : poit){
                solo=poy.nextInt();
                if(!enteroSignado){
                solo=Math.abs(solo);
                }
                mov[columna][fila]=solo%(limite-empiezo+1)+empiezo;
                //System.out.println(mov[columna][fila]+" columna "+columna+" fila "+fila);
                //System.out.println(solo);
                    fila++;}

                columna++;}

        polilla=mov;
        return mov;
    }


}
class entero {
    static int [][]resulto;
    public static void getimpRe(){
        try {
            int a=0;
            boolean pil=false;
            for(int [] poli:resulto){
                for(int py:poli){
                    if(a==poli.length-1){
                        a=-1;
                        pil=true;
                    }
                    System.out.print(py+" "+((pil)?"\n":""));

                    pil=false;


                    a++;
                }
            }
        }catch(NullPointerException ex){
            System.out.println("error no estableciste ninguna multplicacion con matrices por ello "+ex);
        }
    }

    public static int[] int1(double [] matriz ){
        int fila=0;
        int []mov=new int[matriz.length];
        for(double pan : matriz){
            mov[fila]=(int)pan;

                fila++;

        }

         resulto=new int[][]{mov};
        return mov;
    }

    public static int[][] int1(double [][]matriz ){
        /**matriz de filas y columnas enteras*/
        int columna=0;
        int fila=0;
        int [][]mov=new int[matriz.length][matriz[0].length];
        for(double []poit: matriz){
            fila=0;
            for(double pan : poit){
                mov[columna][fila]=(int)pan;
                //System.out.println(mov[columna][fila]+" columna "+columna+" fila "+fila);

                    fila++;
            }
            if(columna<mov[0].length){
                columna++;}
        }
        //System.out.println(mov[columna][fila]);
        resulto=mov;
        return mov;
    }

}



class unos extends mul{
     static double  [][] pancito;
    public void getimpRe(){
        /**
         * impresion de la matriz randomica
         */
        super.resulto=pancito;
        super.getimpRe();
    }
    public static double[][] insert(double [][] matriz,int Numcol){
        if(Numcol>=matriz[0].length){
            throw new ArrayIndexOutOfBoundsException("error el numero de columnas sobrepasa al de la matris en " +( Numcol - matriz[0].length+1)+"\n por favor ajusta el valor al valor que desees pero que no sobrepase el valor real que es "+(matriz[0].length-1));
        }
        for(int fil=0; fil< matriz.length; fil++){
            matriz[fil][Numcol]=1;
        }
        pancito=matriz;
        return matriz;
    }
}