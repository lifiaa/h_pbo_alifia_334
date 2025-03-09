interface Makanan {
    void tampilkanMenu();
}

class MakananCepatSaji implements Makanan {
    public void tampilkanMenu() {
        System.out.println("Menu Makanan Cepat Saji:");
        System.out.println("- Burger, Harga: Rp 25.000");
        System.out.println("- Pizza, Harga: Rp 50.000\n");
    }
}

class MakananTradisional implements Makanan {
    public void tampilkanMenu() {
        System.out.println("Menu Makanan Tradisional:");
        System.out.println("- Nasi Goreng, Harga: Rp 20.000");
        System.out.println("- Soto, Harga: Rp 15.000\n");
    }
}

public class pesanMakanan {
    public static void main(String[] args) {
        Makanan cepatSaji = new MakananCepatSaji();
        Makanan tradisional = new MakananTradisional();

        cepatSaji.tampilkanMenu();
        tradisional.tampilkanMenu();
    }
}

