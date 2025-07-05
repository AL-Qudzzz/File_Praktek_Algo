class Data {
    int value;

    Data(int value) {
        this.value = value;
    }
}

public class Pointer2 {
    public static void main(String[] args) {
        Data a = new Data(10);      // a adalah referensi ke objek Data
        Data b = a;                 // b juga menunjuk ke objek yang sama dengan a

        System.out.println("Sebelum perubahan:");
        System.out.println("a.value = " + a.value);
        System.out.println("b.value = " + b.value);

        b.value = 20;               // ubah value melalui referensi b

        System.out.println("\nSetelah perubahan melalui b:");
        System.out.println("a.value = " + a.value); // akan berubah juga
        System.out.println("b.value = " + b.value);
    }
}
