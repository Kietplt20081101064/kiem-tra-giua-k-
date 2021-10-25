public class Apple {
    private String id;
    public Apple(String id) {
        this.id = id;
    }

    private int khoiLuong;
    private String mauSac;

    public Apple() {
    }

    public Apple(String id, int khoiLuong, String mauSac) {
        this.id = id;
        this.khoiLuong = khoiLuong;
        this.mauSac = mauSac;
    }

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public int getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(int khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }


    public String toString() {
        return "Apple{" + "id=" + id + ", khoiLuong=" + khoiLuong + ", mauSac=" + mauSac + '}';
    }
   return  
}