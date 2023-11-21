public class Main{
    public static void main(String[] args) {
        Autos Auto1 = new Autos("Chevrolet");
        Autos Auto2 = new Autos("Nissan");
        Autos Auto3 = new Autos("Toyota");

        Auto1.setAge(1968);
        Auto2.setAge(2014);
        Auto3.setAge(2023);

        Auto1.setColor("Rojo");
        Auto2.setColor("Blanco");
        Auto3.setColor("Negro");

        Auto1.setFuel("Gasolina");
        Auto2.setFuel("Diesel");
        Auto3.setFuel("Eléctrico");

        Auto1.setModel("Aveo");
        Auto2.setModel("Sylphy");
        Auto2.setModel("Pirus Prime");

        Auto1.setPlate("PRT-4562");
        Auto2.setPlate("GTR-2345");
        Auto3.setPlate("PMF-8674");

        System.out.println("\nAutos y sus especificaciones: \n");
        System.out.println("Auto 1\n\n" + "Marca del auto: " + Auto1.getBrand());
        System.out.print("Placa: " + Auto1.getPlate());
        System.out.print("\nModelo: " + Auto1.getModel());
        System.out.print("\nAño de Fabricación: " + Auto1.getAge());
        System.out.print("\nColor del auto: " + Auto1.getColor());
        System.out.print("\nTipo de combustible: " + Auto1.getFuel());

        System.out.println("\n\nAuto 2\n\n" + "Marca del auto: " + Auto2.getBrand());
        System.out.print("Placa: " + Auto2.getPlate());
        System.out.print("\nModelo: " + Auto2.getModel());
        System.out.print("\nAño de Fabricación: " + Auto2.getAge());
        System.out.print("\nColor del auto: " + Auto2.getColor());
        System.out.print("\nTipo de combustible: " + Auto2.getFuel());

        System.out.println("\n\nAuto 3\n\n" + "Marca del auto: " + Auto3.getBrand());
        System.out.print("Placa: " + Auto3.getPlate());
        System.out.print("\nModelo: " + Auto3.getModel());
        System.out.print("\nAño de Fabricación: " + Auto3.getAge());
        System.out.print("\nColor del auto: " + Auto3.getColor());
        System.out.print("\nTipo de combustible: " + Auto3.getFuel() + "\n");

        int sumAños = 0;
        sumAños = Auto1.getAge() + Auto2.getAge() + Auto3.getAge();

        System.out.println("\nSumatoria de los años de los autos: " + sumAños + "\n");
    }
}