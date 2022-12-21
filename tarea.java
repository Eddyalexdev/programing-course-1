public class tarea {
    public static void main(String[] args) {
        int result = suma(1,2,3);
        System.out.println(result);

        Coche miCoche = new Coche();
        miCoche.addDoor();
        System.out.println(miCoche.doors);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    public int doors = 0;

    public void addDoor() {
        this.doors += 1;
    }
}