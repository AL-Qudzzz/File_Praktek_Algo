# Algoritma dan Struktur Data

Repositori ini berisi berbagai contoh kode Java untuk materi Algoritma dan Struktur Data, mulai dari array, pencarian, sorting, stack, queue, linked list, hingga penggunaan record di Java.

## Struktur Folder

```
src/
├── ArrayLoop.java
├── ArrayLoopMulti.java
├── ArrayNumber.java
├── contohfunction.java
├── DoWhileExample.java
├── EmptyListException.java
├── InsertionJavaTest.java
├── InsertionSort.java
├── List.java
├── Main.java
├── MergeSort.java
├── MergeSortTest.java
├── methodfunction.java
├── PersonRecord.java
├── Pointer1.java
├── Pointer2.java
├── Queue.java
├── QueueTest.java
├── RecordDemo.java
├── RecordExample.java
├── Searching.java
├── SelectionSort.java
├── SelectionSortTest.java
├── SimpleStackArray.java
├── StackArrayExample.java
├── StackInherite.java
├── StackInheriteTest.java
├── Ucapin.java
└── com/
```

## Penjelasan File Utama

- **ArrayLoop.java, ArrayLoopMulti.java, ArrayNumber.java**  
  Contoh penggunaan array satu dan dua dimensi serta perulangan pada array.

- **Searching.java**  
  Contoh pencarian linear pada array.

- **SelectionSort.java, SelectionSortTest.java**  
  Implementasi dan pengujian algoritma selection sort.

- **InsertionSort.java, InsertionJavaTest.java**  
  Implementasi dan pengujian algoritma insertion sort.

- **MergeSort.java, MergeSortTest.java**  
  Implementasi dan pengujian algoritma merge sort.

- **StackInherite.java, StackInheriteTest.java**  
  Implementasi stack berbasis linked list (inherit dari List).

- **SimpleStackArray.java, StackArrayExample.java**  
  Implementasi stack menggunakan array.

- **Queue.java, QueueTest.java**  
  Implementasi queue berbasis linked list.

- **List.java, EmptyListException.java**  
  Implementasi dasar linked list dan exception untuk list kosong.

- **Pointer1.java, Pointer2.java**  
  Contoh konsep reference/pointer di Java.

- **RecordDemo.java, RecordExample.java, PersonRecord.java**  
  Contoh penggunaan fitur record pada Java.

- **contohfunction.java, methodfunction.java, Ucapin.java, DoWhileExample.java**  
  Contoh fungsi/metode, penggunaan do-while, dan pemanggilan fungsi sederhana.

- **com/**  
  Folder ini dapat berisi package tambahan, misal: `com.deitel.jhtp6.ch17` untuk kode dari buku Deitel.

## Cara Menjalankan

1. **Compile semua file Java:**
   ```sh
   javac src/*.java
   ```

2. **Jalankan file utama yang diinginkan, contoh:**
   ```sh
   java -cp src Main
   java -cp src SelectionSortTest
   java -cp src StackInheriteTest
   java -cp src QueueTest
   ```

   Untuk file yang menggunakan package (misal di dalam `com/`), gunakan:
   ```sh
   java -cp src com.deitel.jhtp6.ch17.ListTest
   ```

## Catatan

- Pastikan struktur folder dan package sudah sesuai jika ingin menjalankan kode yang menggunakan package.
- Semua kode dapat dijalankan secara mandiri sesuai dengan kebutuhan materi Algoritma dan Struktur Data.

---

**Selamat belajar Algoritma dan Struktur Data dengan Java!**
