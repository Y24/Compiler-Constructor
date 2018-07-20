package inter;

import symbols.Type;

public class If extends Stmt {
    Expr expr;Stmt stmt;
    public If(Expr x,Stmt s){
        expr=x;stmt=s;
        if (expr.type!=Type.Bool)expr.error("boolean required in if");
    }

    @Override
    public void gen(int a, int b) {
        int label=newlabel();
        expr.jumping(0,a);
        emitlabel(label);stmt.gen(label,a);
    }
}
