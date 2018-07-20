package inter;

import lexer.Token;
import symbols.Type;

public class Expr extends Node {
    Token op;
    public Type type;

    Expr(Token tok, Type p) {
        op = tok;
        type = p;
    }
    public Expr gen(){return this;}
    public Expr reduce(){return this;}
    public void jumping(int t,int f){emitjumps(toString(),t,f);}
    void emitjumps(String test, int t, int f){
        if (t!=0&&f!=0){
            emit("if "+test+" goto L"+t);
            emit("goto L"+f);
        }
        else if (t!=0)emit("if "+test+" goto L"+f);
        else if (f!=0)emit("iffalse "+test+" goto L"+f);
    }
    public String toString(){return op.toString();}
}
