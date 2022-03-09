package sk.stuba.fei.uim.oop.Zvierata;

public abstract class Zviera {
    protected String meno;

    public abstract void zvukZvierata();

    public void pohladkat() {
        System.out.println(this.meno + " bol pohladkany");
        this.zvukZvierata();
    }
}
