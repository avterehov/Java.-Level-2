package ru.geekbrains.home_work_1_2_5;

public class Main {

    public static void main(String[] args) {


        processArray1(500000);
        System.out.println();
        processArray2(500000);


    }

    public static void processArray1(int n) {
        System.out.println("Время начала работы первого метода " + System.currentTimeMillis());
        System.out.println("Обрабатываем первый массив:");
        long a = System.currentTimeMillis();
        int halfSize = n;
        float array1[] = new float[n * 2];
        for (float i : array1
        ) {
            array1[(int) i] = 1;
        }
        for (float i : array1)
            array1[(int) i] = (float) (array1[(int) i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        System.out.println( "Первый массив преобразован за " + (System.currentTimeMillis() - a)+ " мсек");


    }


    public static void processArray2(int n) {
        System.out.println("Время начала работы второго метода" + System.currentTimeMillis());
        System.out.println("Обрабатываем второй  массив:");
        int halfSize = n;
        float array2[] = new float[n * 2];
        float array2FirstHalf[] = new float[n];
        float array2SecondHalf[] = new float[n];
        long b = System.currentTimeMillis();

        for (float i : array2
        ) {
            array2[(int) i] = 1;
        }
        System.out.println("Начали разбивать массив через " + (System.currentTimeMillis() - b) + " мсек после начала работы метода");

        long с = System.currentTimeMillis();
        System.arraycopy(array2, 0, array2FirstHalf, 0, halfSize);
        System.arraycopy(array2, halfSize, array2SecondHalf, 0, halfSize);
        System.out.println("Массив разделился на два массива за " + (System.currentTimeMillis()-с));

      Thread t1 =  new Thread(new Runnable() {
           @Override
           public void run() {
               long с = System.currentTimeMillis();
               for (float i : array2FirstHalf){
                   array2FirstHalf[(int) i] = (float)(array2FirstHalf[(int) i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
               }
               System.out.println("Первая половина массива обработалась за " + (System.currentTimeMillis() - с) + " мсек");

           }
       });

       Thread t2 =  new Thread(new Runnable() {
            @Override
            public void run() {
                long с = System.currentTimeMillis();
                for (float i : array2SecondHalf){
                    array2SecondHalf[(int) i] = (float)(array2SecondHalf[(int) i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                System.out.println("Вторая половина массива обработалась за " + (System.currentTimeMillis() - с) + " мсек");
            }
        });

       t1.start();
       t2.start();

       try {
           t1.join();
           t2.join();
       }catch (InterruptedException e){
           e.printStackTrace();
       }

        с = System.currentTimeMillis();
        System.arraycopy(array2FirstHalf, 0, array2, 0, halfSize);
        System.arraycopy(array2SecondHalf, 0, array2, halfSize, halfSize);
        System.out.println("Массив 2 склеен обратно за " + (System.currentTimeMillis() - с) + " мсек");

        System.out.println("Массив 2 преобразован за " + (System.currentTimeMillis() - b) + " мсек");

    }

}
