import java.lang.reflect.Array;
import java.util.ArrayList;

public class Linia {
    private int id;
    private Punt p1;
    private Punt p2;

    public Linia(int id, Punt p1, Punt p2) {
        this.id = id;
        this.p1 = p1;
        this.p2 = p2;
    }

    public Linia(int id, ArrayList<Punt> listaPuntos) {
        this.id = id;
        this.p1 = listaPuntos.get(0);
        this.p2 = listaPuntos.get(1);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Punt getP1() {
        return p1;
    }

    public void setP1(Punt p1) {
        this.p1 = p1;
    }

    public Punt getP2() {
        return p2;
    }

    public void setP2(Punt p2) {
        this.p2 = p2;
    }
}
