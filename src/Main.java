//this is my first project
/* 据说这可以多行注释
        *看来真的可以哎，都忘得差不多了，好尴尬
        */

//import java.util.Random;

//import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException
    {
        System.out.println("Hello World!");
        System.out.println("\n");

        char c;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        do{
            c=(char) br.read();
            System.out.println(c);
        }while(c!='q');


/*
        //将数组倒序打印输出
        int[] test= {1,2,4,5,7,9,11,15};
        int size= test.length;
        int[] result=new int[size];
        for (int i=0, j=size-1;i<size;i++,j--){
            result[j]=test[i];
        }
        System.out.println("length of result is "+ result.length+ "the numbers are listed below:");
        System.out.println("the last value of array test is "+ test[size-1]);
        System.out.println("the first value of array result is "+ result[0]);
        for (int numbers:result){
            System.out.print(numbers+" ");
        }

        Date today=new Date();
        SimpleDateFormat dt=new SimpleDateFormat(" E yyyy.MM.dd HH:mm:ss a zzz");
        System.out.println(dt.format(today));
        System.out.printf("HH:MM format: %tR%n ",today);

        System.out.println(new Date());

        System.out.print(new Date().toString());

*/


       /* float testNumber=7.8f;
        System.out.println(Math.ceil(testNumber));
        System.out.println(Math.floor(testNumber));
        System.out.println(Math.round(testNumber));
        System.out.println(Math.rint(testNumber));
*/
/*        Integer i1 = 100;
        Integer i2=100;
        Integer i3=200;
        Integer i4=200;

        if(i1==i2){
            System.out.println("==，两者地址相同");
        }
        else{
         System.out.print("==，两者地址不同");
        }
        if(i3.equals(i4)){
            System.out.println("equals 两者内容相同" );
            System.out.println("i3 = "+ i3);
        }
        else{
            System.out.println("equals，两者地址不同" );
        }
        if(i3==i4){
            System.out.println("==， 两者地址相同" );
        }
        else{
            System.out.println("==，两者地址不同" );
        }*/


/*        Random r1 = new Random(10);

        Random r2 = new Random(10);

        for(int i = 0;i < 5;i++){

            System.out.println(r1.nextInt());

            System.out.println(r2.nextInt());

        }*/

/*        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + " ");
            }
            System.out.println();
        }*/
    }

}
