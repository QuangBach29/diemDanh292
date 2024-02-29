public class hinhTru extends hinhTron{
    private double chieuCao = 10;

    public hinhTru() {
    }

    public hinhTru(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public hinhTru(double banKinh, String color, double chieuCao) {
        super(banKinh, color);
        this.chieuCao = chieuCao;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public double theTich(){
        return 2*getBanKinh()*Math.PI;
    }

    public String toString(){
        return "Hinh tru co chieu cao : " + getChieuCao() + " , the tich : "+theTich()+" va thuoc tinh cua "+super.toString();
    }
}
