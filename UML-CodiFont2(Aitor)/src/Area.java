import java.util.ArrayList;

public class Area {
    private int id;
    private Punt p1;
    private Punt p2;
    private Punt p3;

    public Area(int id, Punt p1, Punt p2, Punt p3) {
        this.id = id;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Area(int id, Linia l1, Punt p3) {
        this.id = id;
        this.p1 = l1.getP1();
        this.p2 = l1.getP2();
        this.p3 = p3;
    }

    public Area(int id, ArrayList<Punt> listaPuntos) {
        this.id = id;
        this.p1 = listaPuntos.get(0);
        this.p2 = listaPuntos.get(1);
        this.p3 = listaPuntos.get(2);
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

    public Punt getP3() {
        return p3;
    }

    public void setP3(Punt p3) {
        this.p3 = p3;
    }
}
