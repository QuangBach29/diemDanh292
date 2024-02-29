public class hinhTron {
    private double banKinh = 5;
    private String color = "red";

    public hinhTron() {
    }

    public hinhTron(double banKinh, String color) {
        this.banKinh = banKinh;
        this.color = color;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double dienTich(){
        return banKinh*banKinh*Math.PI;
    }

    public String toString(){
        return "ban kinh hinh tron : " +getBanKinh() +" , mau : "+getColor()+" , dien tich : "+dienTich();
    }
}
