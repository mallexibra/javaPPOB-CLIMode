import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=============================================================");
        System.out.println("=========                 IBRA SHOP                 =========");
        System.out.println("========= Menjual Pulsa, Paket Data, Token Listrik  =========");
        System.out.println("=============================================================");
        System.out.println("===                                                       ===");
        System.out.println("=== Anda mau membeli Pulsa, Paket Data atau Token Listrik ===");
        System.out.println("=== Tekan : 1 (Untuk membeli Pulsa)                       ===");
        System.out.println("===         2 (Untuk membeli Paket Data)                  ===");
        System.out.println("===         3 (Untuk membeli Token Listrik)               ===");
        System.out.println("===                                                       ===");
        System.out.println("=============================================================");
        System.out.print("Masukkan Pilihan Anda: ");
        int userChoice = scan.nextInt();

        // Pulsa sales
        if(userChoice == 1){
            System.out.print("Masukkan nomor tujuan: ");
            String numberCustomer = scan.next();
            while(numberCustomer.length() <= 11){
                System.out.println("WARNING: Nomor anda masukkan salah!");
                System.out.println("Silahkan ulangi lagi");
                numberCustomer = scan.next();
            }
            System.out.print("Masukkan nominal yang anda inginkan (cth: 5000): ");
            int pulsaNominal = scan.nextInt();
            System.out.println("Nota: Pulsa senilai " + pulsaNominal + " pada nomor " + numberCustomer + " SUKSES TERKIRIM");
            System.out.println("     Silahkan membayar senilai " + (pulsaNominal + 2000) + " rupiah pada admin");
        }else if(userChoice == 2){
            System.out.print("Pilih operator yang anda inginkan: ");
            String operatorPaket = scan.next();
            String operatorPaket2 = operatorPaket.toUpperCase();
            System.out.print("Masukkan nomor tujuan: ");
            String numberCustomer = scan.next();
            while(numberCustomer.length() <= 11){
                System.out.println("WARNING: Nomor anda masukkan salah!");
                System.out.print("Silahkan masukkan nomor lagi: ");
                numberCustomer = scan.next();
            }
            System.out.print("Berapa GB yang anda butuhkan (cth: 2): ");
            int bigData = scan.nextInt();
            if (bigData == 0) {
                System.out.println("Tidak boleh 0!");
                System.out.print("Berapa GB yang anda butuhkan (cth: 2): ");
                bigData = scan.nextInt();
            }
            int totalGB = 0;
            System.out.print("Berapa hari (cth: 5): ");
            int day = scan.nextInt();
            if(operatorPaket2.equals("AXIS")){
                totalGB = bigData * 2000;
            }else if(operatorPaket2.equals("XL")){
                totalGB = bigData * 3000;
            }else if(operatorPaket2.equals("TELKOMSEL")){
                totalGB = bigData * 4000;
            }else if(operatorPaket2.equals("INDOSAT")){
                totalGB = bigData * 5000;
            }else{
                System.out.println("Masukkan operator yang benar!");
                System.out.println("Silahkan Ulangi Lagi!");
                System.exit(1);
            }
            int totalDay = day * totalGB;
            System.out.println("Nota: Paket Data senilai " + bigData + " GB " + day + " Hari pada nomor " + numberCustomer + " SUKSES TERKIRIM");
            System.out.println("      Silahkan membayar senilai " + totalDay + " pada Admin");
        }else if(userChoice == 3){
            System.out.print("Masukkan nomor Token Listrik anda: ");
            int tokenNumber = scan.nextInt();
            System.out.print("Berapa nominal yang anda butuhkan (cth: 20000): ");
            int nominalToken = scan.nextInt();
            if(nominalToken <= 19999){
                System.out.println("Nominal " + nominalToken + " Tidak Tersedia");
                System.out.print("Silahkan masukkan nominal yang benar: ");
                nominalToken = scan.nextInt();
            }
            int totalBuy = nominalToken + 2000;
            int max = 9999;
            int min = 1000;
            int token1 = (int)Math.floor(Math.random()*(max-min+1)+min);
            int token2 = (int)Math.floor(Math.random()*(max-min+1)+min);
            int token3 = (int)Math.floor(Math.random()*(max-min+1)+min);
            int token4 = (int)Math.floor(Math.random()*(max-min+1)+min);
            int token5 = (int)Math.floor(Math.random()*(max-min+1)+min);
            System.out.println("Nota: Pembelian token pada Nomor " + tokenNumber + " senilai " + nominalToken + " rupiah SUKSES TERKIRIM");
            System.out.println("      Berikut nomor token anda: " + token1 + "-" + token2 + "-" + token3 + "-" + token4 + "-" + token5);
            System.out.println("      Silahkan membayar senilai " + totalBuy + " pada Admin");
        }else{
            System.out.println("Anda ini mengada ada saja Tidak ada pilihan " + userChoice + " Itu");
        }
        scan.close();
    }
}