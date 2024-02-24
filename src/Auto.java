
package auto;
import java.util.*;



public class Auto {
    Scanner sc = new Scanner(System.in);


    String Marca;
    int Modelo;
    int Motor;
    int NumeroPuertas;
    int CantidadAsientos;
    int VelocidadMaxima;
    int VelocidadActual = 0;
    enum tipoCol{blanco, negro,rojo, naranja, amarillo, verde, azul, violeta}
    tipoCol tipoColor;

    enum tipoAut{subcompacto, compacto, familiar, ejecutivo, SUV}
    tipoAut tipoAuto;

    enum tipoCombu{ gasolina, bioetanol, diésel, biodiésel, gasnatural}
    tipoCombu tipoCombustible;

    int Multa=0;
    double Valormulta = 200000;

    public Auto(String Marca, int Modelo, int Motor, int NumeroPuertas, int CantidadAsientos, int VelocidadMaxima, tipoCol tipoColor, tipoAut tipoAuto, tipoCombu tipoCombustible) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Motor = Motor;
        this.NumeroPuertas = NumeroPuertas;
        this.CantidadAsientos = CantidadAsientos;
        this.VelocidadMaxima = VelocidadMaxima;
        this.tipoColor = tipoColor;
        this.tipoAuto = tipoAuto;
        this.tipoCombustible = tipoCombustible;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getModelo() {
        return Modelo;
    }

    public void setModelo(int Modelo) {
        this.Modelo = Modelo;
    }

    public int getMotor() {
        return Motor;
    }

    public void setMotor(int Motor) {
        this.Motor = Motor;
    }

    public int getNumeroPuertas() {
        return NumeroPuertas;
    }

    public void setNumeroPuertas(int NumeroPuertas) {
        this.NumeroPuertas = NumeroPuertas;
    }

    public int getCantidadAsientos() {
        return CantidadAsientos;
    }

    public void setCantidadAsientos(int CantidadAsientos) {
        this.CantidadAsientos = CantidadAsientos;
    }

    public int getVelocidadMaxima() {
        return VelocidadMaxima;
    }

    public void setVelocidadMaxima(int VelocidadMaxima) {
        this.VelocidadMaxima = VelocidadMaxima;
    }

    public int getVelocidadActual() {
        return VelocidadActual;
    }

    public void setVelocidadActual(int VelocidadActual) {
        this.VelocidadActual = VelocidadActual;
    }

    public tipoCol getTipoColor() {
        return tipoColor;
    }

    public void setTipoColor(tipoCol tipoColor) {
        this.tipoColor = tipoColor;
    }

    public tipoAut getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(tipoAut tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    public tipoCombu getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(tipoCombu tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }




    void Acelerar(int incrementarvelocidad){
        if(VelocidadActual + incrementarvelocidad <= VelocidadMaxima && VelocidadActual + incrementarvelocidad > 200 ){
            VelocidadActual += incrementarvelocidad;
            Multa++;

            System.out.println("Multa por exeso de Velocidad "+VelocidadActual +" Km/h");

        }else{System.out.println("Auto limitado a 250 km/h");}

    }



    void Desacelerar(int disminuirvelocidad){
        if ((VelocidadActual - disminuirvelocidad)>0){
            VelocidadActual -= disminuirvelocidad;
        }else{System.out.println("No se puede acelerar de forma negativa ");
        }
    }


    void frenar(){
        VelocidadActual = 0;
    }

    void Multa(){
        System.out.println("Tiene "+Multa+" Multas por exceso de velocidad");
        Multa *= Valormulta;
        System.out.println("El valor de la multa es de "+Multa);
    }

    double CalcuTiempollegada(double Distancia){
        return Distancia/VelocidadActual;
    }

    void Tiempollegada(double Distancia){

        double Tiempo = CalcuTiempollegada(Distancia);
        System.out.println("A una distancia de " +Distancia + " km, "+"A una velocidad de "+VelocidadActual+", Su tiempo de llegada es de " + Tiempo + " horas");
    }



    void imprimir(){
        System.out.println("Estes es Mi Auto");
        System.out.println("Marca "+Marca);
        System.out.println("Modelo "+Modelo);
        System.out.println("Cilindros "+Motor);
        System.out.println("Num Puertas "+NumeroPuertas);
        System.out.println("Num Asientos "+CantidadAsientos);
        System.out.println("Top Speed "+VelocidadMaxima);
        System.out.println("Color "+tipoCol.azul);
        System.out.println("Tipo auto "+tipoAut.familiar);
        System.out.println("Tipo Combustible "+tipoCombu.gasolina);


    }
}