class Animal {
    public void FazerSom() {
        System.out.println("Som genérico");
    }
}

class Cachorro extends Animal {
    @Override
    public void FazerSom() {
        System.out.println("AU AU");
    }

}

public class TestePolimorfismo {
    public static void main(String[] args) {
        Animal animal = new Cachorro();
        animal.FazerSom();
    }
}
