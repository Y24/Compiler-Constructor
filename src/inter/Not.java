package inter;

import lexer.Token;

public class Not extends Logical {
    public Not(Token tok, Expr x2){
        super(tok,x2,x2);
    }

    @Override
    public void jumping(int t, int f) {
        expr2.jumping(t, f);
    }

    @Override
    public String toString() {
        return op.toString()+" "+expr2.toString();
    }
}
