import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class starPattern {

    public static void main(String[] args) {
        int i, j;
//        int j;
        for (i = 1; i <= 5; i++) {

            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }

        int rows = 5;

        // Using IntStream and lambda expression to iterate and print the star pattern
        IntStream.rangeClosed(1, rows)
                .forEach(k -> {
                    IntStream.rangeClosed(1, k)
                            .forEach(z -> System.out.print("*"));
                    System.out.println();
                });

        int col = 5;
        IntStream.rangeClosed(1, col)
                .forEach(l -> {
                    IntStream.rangeClosed(1, l).forEach(m -> System.out.print("*"));
                    System.out.println();
                });


        for (i = 1; i <= 5; i++) {

            for (j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }

        int k;

        for (i = 1; i <= 5; i++) {

            for (j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("+ ");
            }
            System.out.println("\n");
        }

        IntStream.rangeClosed(1 - rows, rows - 1)
                .map(Math::abs)
                .forEach(l -> {
                    String spaces = " ".repeat(rows - l);
                    String stars = "*".repeat(2 * l + 1);
                    System.out.println(spaces + stars);
                });


        String originalString = "Hello, World!";

//        String reversedString = originalString.transform(
//                StringBuilder::new,
//                StringBuilder::appendCodePoint,
//                StringBuilder::reverse
//        ).toString();

//        System.out.println(reversedString);


        int n = 10; // Change the value of n to print more or fewer numbers in the series

        int firstNumber = 0;
        int secondNumber = 1;

        System.out.print("Fibonacci Series of " + n + " numbers: ");

        for (int z = 1; z <= n; z++) {
            System.out.print(firstNumber + " ");

            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }

        List<Integer> checkNumIsOddOrEven = new ArrayList<>();
        checkNumIsOddOrEven.add(123);
        checkNumIsOddOrEven.add(456);
        checkNumIsOddOrEven.add(789);
        checkNumIsOddOrEven.add(478);
        checkNumIsOddOrEven.add(321);
        checkNumIsOddOrEven.add(756);
        checkNumIsOddOrEven.add(396);


    for(int o =0; o< checkNumIsOddOrEven.size();o++){
        if(checkNumIsOddOrEven.get(o) % 2 ==0){
            System.out.println(checkNumIsOddOrEven.get(o));        }

    }
//Print the numbers from 1 to 10.
    for(int z= 0; z<=10; z++){
        System.out.println(z);
    }
    //Calculate the sum of numbers from 1 to 100.
        int result = 0;
        for(int sum=1; sum<=100;sum++){
             result = result+sum;

        }
        System.out.println(result);

        //Print the even numbers from 1 to 20.

        for(int w=1;w<=20;w++){
            if(w % 2  == 0){
                System.out.println(w);
            }
        }
        //Calculate the factorial of a number.
        int num = 5;
        int factorial = 1;

        for(int u =1;u<=num;u++){
            factorial*= u;
        }
        System.out.println(factorial);

        //Print the multiplication table of a number.
        int table=5;

        for(int m=1;m<=10;m++){
            int tableresult = m * table;
            System.out.println(m + "* " + table + "=" + tableresult);
        }

       // Print the characters of a string.

        String characters = "Hello world";
        for(int y = 0;y<characters.length();y++){
            char ch =characters.charAt(y);
            System.out.println(ch);
        }

        //Print the elements of an array.

         int[] elements= {1,2,3,4,5,6,7,8};
        for(int f=0;f<elements.length;f++){
            System.out.println(elements[f]);
        }

        //Calculate the sum of elements in an array.
        int sumOfElements = 0;
        for(int s = 0 ;s<=elements.length;s++){
            sumOfElements = sumOfElements+ s;

        }
        System.out.println(sumOfElements);

        //Count the number of vowels in a string.
        int count = 0;
        for(int v = 0; v <  characters.length();v++){
            char chr =  Character.toLowerCase(characters.charAt(v));
            if(chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u'){
                count++;
            }

        }
        System.out.println(count);

        for(int a =0;a<elements.length/2;a++){
            int temp = elements[a];
            elements[a] = elements[elements.length -1 -a];
            elements[elements.length-1-a] = temp;
        }
        System.out.println("Reversed array:" + Arrays.toString(elements));


        //Print the odd numbers from 1 to 50.
        for(int y = 0; y<=50; y++){
            if(y%2 != 0){
                System.out.println("Odd numbers from 1 to 50" +" "+ "=" + y);
            }


        }


        //Calculate the product of numbers from 1 to 10.
        int product = 1;
        for(int q = 1; q<=10; q++){
            product = product*q;
        }
        System.out.println(product+"product numbers in to 1 to 10");

        //Check if a number is prime.
        int[] prime = {1,2,3,4,5,6,7,8,9};
         List<Integer> numbers = new ArrayList<>();


         for( int c =0; c < prime.length;c++){
              int number = prime[c];
             boolean isPrime = true;


         if(number <= 1) {
             isPrime = false;

            }else {
             for(int z = 2; z<= Math.sqrt(number);z++){
                 if(number % z == 0){
                     isPrime= false;
                     break;
                 }
             }
         }
         if(isPrime){
             numbers.add(number);
         }

         }
        System.out.println("prime numbers in the array" + numbers);

         //Find the maximum element in an array.

        int[] maximum = {1,2,3,4,5,6,7,8,9,10,25};
        int array1 = maximum[0];

        for(int max =1;max< maximum.length;max++){
            if(maximum[max] > array1){
                array1 = maximum[max];
            }

        }
        System.out.println("Maximum element" + array1);


        //Print the alternate characters of a string.

        String alternateWord = "Hello world";

        for(int alt=0; alt<alternateWord.length();alt= alt+2){
            char ch = alternateWord.charAt(alt);
            System.out.print(ch);
        }
        //Print the elements of a 2D array.

        int [] [] array2d ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for(int twod =0; twod < array2d.length; twod++){
            for(int two2d =0; two2d < array2d[twod].length;two2d++){
                System.out.println(array2d[twod][two2d]+" ");
            }
            System.out.println();

            //Calculate the average of elements in an array.
        }

    }



}
