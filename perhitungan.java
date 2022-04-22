package src.interfeces;

public class perhitungan implements contohinterfece{
    private int a;   
    private int b;   
    private int hasil;

    public perhitungan(int _a, int _b, int _hasil){
        this.a = _a;
        this.b = _b;
        _hasil = 0;
        this.hasil = _hasil;
        PrintJudulClass("Print judul dalam class perhitungan");
    }
private void PrintJudulClass(String string) {
    }


    @Override
    public void printjudul() {
        // TODO Auto-generated method stub
        System.out.println("judul menggunakan interface");
        
    }

    @Override
    public void hitungtambah() {
        // TODO Auto-generated method stub
        this.hasil = this.a + this.b;
        
    }

    @Override
    public void hitungkali() {
        // TODO Auto-generated method stub
        this.hasil = this.a * this.b;
        
    }
    public int hitungan(int i, int j) {
        return 0;
    }
}