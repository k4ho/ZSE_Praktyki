public static void main(String[] args) {


        // zadanie 1

        System.out.println("zadanie 1 \t");
        for (int number1 = 0; number1 < 20; number1 += 2) {
        System.out.println(number1);
        }

        //zadanie 2
        System.out.println("zadanie 2\t");
        for (int number2 = 30; number2 > 0; number2 -= 3) {
        System.out.println(number2);
        }
        //zadanie 3
        System.out.println("zadanie 3\t");
        for (int i = 1; i < 11; i++){
        System.out.println(i + " przejście pętli");
        for(int j = 1; j < 11; j++){
        System.out.println("[i:"+ i + "]"+"[j:"+ j +"]\t" + i +" * " + j + " = " + i * j +"\t");
        if ((i*j)%2==0){
        System.out.println("liczba jest parzysta");
        }
        else{
        System.out.println("Liczba jest nieparzysta");
        }
        }
        }
        //zadanie 4
        System.out.println("Zadanie 4 \t");
        for (int number3 =-40; number3 <= 40;number3++){
        if (number3 % 4 == 0){
        System.out.println(number3);
        }
        }
        //zadanie 5
        System.out.println("zadanie 5 \t");

        }
        }