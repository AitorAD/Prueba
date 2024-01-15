import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Punt p1 = new Punt(1,12,14);
        Punt p2 = new Punt(2,24,57);
        Punt p3 = new Punt(3,15,68);


        Area a1 = new Area(1,p1,p2,p3);
        Linia l1 = new Linia(2,p1,p3);

        ArrayList<Punt> arrayPuntos = new ArrayList<>();

        arrayPuntos.add(p1);
        arrayPuntos.add(p2);
        arrayPuntos.add(p3);


        Area a2 = new Area(2, arrayPuntos);
    }
}
