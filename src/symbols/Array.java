package symbols;

import lexer.Tag;

public class Array extends Type {
    public Type of;
    private int size;
    public Array(int sz,Type p){
        super("[]", Tag.INDEX,sz*p.width);size=sz;of=p;
    }

    @Override
    public String toString() {
        return "["+size+"]"+of.toString();
    }
}
