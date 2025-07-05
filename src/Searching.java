// Fig 16.3: LinearSearchTest.java
// Sequentially search an array for an item.
import java.util.Scanner;
import java.util.Arrays; // Ditambahkan untuk Arrays.toString()
import java.util.Random;   // Ditambahkan untuk menghasilkan data acak di LinearArray

// Kelas LinearArray dasar untuk demonstrasi
// Biasanya, ini akan berada di file terpisah (LinearArray.java)
class LinearArray {
    private int[] data;
    private static final Random generator = new Random();

    // Konstruktor untuk membuat array dengan ukuran tertentu dan mengisinya dengan angka acak
    public LinearArray(int size) {
        data = new int[size];

        // isi array dengan integer acak dari 10-99
        for (int i = 0; i < size; i++) {
            data[i] = 10 + generator.nextInt(90);
        }
    }

    // Lakukan pencarian linear pada data
    public int linearSearch(int searchKey) {
        // loop melalui array secara sekuensial
        for (int index = 0; index < data.length; index++) {
            if (data[index] == searchKey) {
                return index; // kembalikan indeks integer
            }
        }
        return -1; // integer tidak ditemukan
    }

    // Metode untuk menghasilkan representasi String dari array
    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}

public class Searching // Nama kelas sudah sesuai dengan nama file (Searching.java)
{
    public static void main( String args[] )
    {
        // create Scanner object to input data
        Scanner input = new Scanner( System.in );

        int searchInt; // search key
        int position; // location of search key in array

        // create array and output it
        // Implementasi LinearArray sekarang disediakan di atas dalam file ini.
        LinearArray searchArray = new LinearArray( 10 );
        System.out.println( "Array yang dihasilkan: " + searchArray ); // print array

        // get input from user
        System.out.print(
                "Please enter an integer value (-1 to quit): " );
        searchInt = input.nextInt(); // read first int from user

        // repeatedly input an integer; -1 terminates the program
        while ( searchInt != -1 )
        {
            // perform linear search
            position = searchArray.linearSearch( searchInt );

            if ( position == -1 ) // integer was not found
                System.out.println( "The integer " + searchInt +
                        " was not found.\n" );
            else // integer was found
                System.out.println( "The integer " + searchInt +
                        " was found in position " + position + ".\n" );

            // get input from user
            System.out.print(
                    "Please enter an integer value (-1 to quit): " );
            searchInt = input.nextInt(); // read next int from user
        } // end while
        input.close(); // Praktik yang baik untuk menutup Scanner
    } // end main
} // end class Searching