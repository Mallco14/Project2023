
public class Main {
    public static void main(String[] args) {
        //1
        var suma_numeros = sumatoria(5,6,8);
        System.out.println(suma_numeros);
        //2
        coche nw = new coche();
        nw.SumaPuertas();
        System.out.println(nw.numeroDePuertas);

    }
//CASO 1
    public static int sumatoria(int a,int b, int c){
        int sumando = a + b+ c;
        return sumando;
    }
}
//CASO 2

class coche {
    public int numeroDePuertas = 0;

    public void SumaPuertas(){
        this.numeroDePuertas++;
    }
}
