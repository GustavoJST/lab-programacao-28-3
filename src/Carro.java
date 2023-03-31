public class Carro {
    public String marca;
    public String modelo;
    public int ano;

    Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    void acelerar() {
        System.out.printf("\n %s %s está acelerando.\n", this.marca, this.modelo);
    }

    void frear() {
        System.out.printf("\n %s %s está freando.\n", this.marca, this.modelo);
    }
}
