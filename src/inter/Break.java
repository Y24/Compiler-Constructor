package inter;

public class Break extends Stmt {
    private Stmt stmt;
    public Break(){
        if (Stmt.Enclosing==Stmt.Null)error("unenclosed break");
        stmt=Stmt.Enclosing;
    }

    @Override
    public void gen(int a, int b) {
        emit("goto L"+stmt.after);
    }
}
