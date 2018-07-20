package lexer;

public class Real extends Token {
    private final float value;
    Real(float v){super(Tag.REAL);value=v;}

    @Override
    public String toString() {
        return ""+value;
    }
}
