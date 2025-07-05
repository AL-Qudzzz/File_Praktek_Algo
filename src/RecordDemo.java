public class RecordDemo {
    public static void main(String[] args) {
        // Membuat beberapa instance dari PersonRecord dengan banyak data
        PersonRecord person1 = new PersonRecord("Budi Santoso", 25, "Jl. Merdeka No. 10, Jakarta", "budi.santoso@email.com", "081234567890");
        PersonRecord person2 = new PersonRecord("Ani Lestari", 30, "Jl. Sudirman No. 5, Bandung", "ani.lestari@email.com", "082345678901");
        PersonRecord person3 = new PersonRecord("Candra Wijaya", 28, "Jl. Thamrin No. 15, Surabaya", "candra.wijaya@email.com", "083456789012");

        // Menampilkan data menggunakan getter yang otomatis dibuat oleh record
        System.out.println("Data Person 1:");
        System.out.println("Nama: " + person1.name());
        System.out.println("Umur: " + person1.age());
        System.out.println("Alamat: " + person1.address());
        System.out.println("Email: " + person1.email());
        System.out.println("Nomor Telepon: " + person1.phoneNumber());
        System.out.println();

        System.out.println("Data Person 2:");
        System.out.println("Nama: " + person2.name());
        System.out.println("Umur: " + person2.age());
        System.out.println("Alamat: " + person2.address());
        System.out.println("Email: " + person2.email());
        System.out.println("Nomor Telepon: " + person2.phoneNumber());
        System.out.println();

        System.out.println("Data Person 3:");
        System.out.println("Nama: " + person3.name());
        System.out.println("Umur: " + person3.age());
        System.out.println("Alamat: " + person3.address());
        System.out.println("Email: " + person3.email());
        System.out.println("Nomor Telepon: " + person3.phoneNumber());
        System.out.println();

        // Menampilkan representasi string dari record menggunakan toString() yang otomatis dibuat
        System.out.println("Detail Lengkap Person 1: " + person1);
        System.out.println("Detail Lengkap Person 2: " + person2);
        System.out.println("Detail Lengkap Person 3: " + person3);
    }
}
