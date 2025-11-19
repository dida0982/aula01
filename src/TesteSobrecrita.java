class Animal2 {
    public void FazerSom() {
        System.out.println("Som genérico");
    }
}

class Gato extends Animal2 {
    @Override
    public void FazerSom() {
        System.out.println("Miau");
    }
}

public class TesteSobrecrita {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.FazerSom(); // Deve imprimir "Miau"
    }
}
