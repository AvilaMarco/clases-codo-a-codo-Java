package clase2;

public class Main {
    public static void main(String[] args) {
        String nombre = "marco";
        Gato persa = new Gato("Sarita", "Persa", 1, 14);
        Gato ragdoll = new Gato("Felipe", "Ragdoll", 1, 20);
        Gato siames = new Gato("Kiwi", "Siames", 1, 10);
        Gato[] gatos = {persa, ragdoll, siames};


        for (Gato gato: gatos) {
            System.out.println("Nombre del Gato: " + gato.getNombre());
            System.out.println("Raza del Gato: " + gato.getRaza());
            System.out.println("Promedio de Vida del Gato: " + gato.getPromedioVida() + "\n");
        }

        persa.setEdad(3);
        persa.setNombre("Kale");
        for (Gato gato: gatos) {
            System.out.println("Nombre del Gato: " + gato.getNombre());
            System.out.println("Raza del Gato: " + gato.getRaza());
            System.out.println("Promedio de Vida del Gato: " + gato.getPromedioVida() + "\n");
        }

    }
}
