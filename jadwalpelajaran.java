public class jadwalpelajaran {
    public static void main(String[] args) {
        String[][] siswa = {
            {"Andi", "Budi", "Citra"},
            {"Dina", "Eko", "Fani"},
            {"Gilang", "Hani", "Ira"},
            {"Joko", "Kiki", "Lina"},
            {"Maya", "Nina", "Oki"}
        };
        String[][] jadwal = {
            {"Matematika", "Bahasa Inggris", "IPA"},
            {"IPS", "Seni", "Olahraga"},
            {"Bahasa Indonesia", "Matematika", "IPA"},
            {"Bahasa Inggris", "Seni", "IPS"},
            {"Agama", "Matematika", "Olahraga"}
        };
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        System.out.println("List Siswa:");
        cetakArray2D(siswa);
        for (int i = 0; i < hari.length; i++) {
            System.out.println("\nHari " + hari[i] + ":");
            cetakArray1D(jadwal[i]);
        }
    }
    static void cetakArray2D(String[][] array) {
        for (String[] baris : array) {
            for (String elemen : baris) {
                System.out.print(elemen + " ");
            }
            System.out.println();
        }
        System.out.println("================");
    }
    static void cetakArray1D(String[] array) {
        for (String elemen : array) {
            System.out.println("- " + elemen);
        }
        System.out.println("================");
    }
}
