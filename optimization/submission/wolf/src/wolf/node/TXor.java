/* This file was generated by SableCC (http://www.sablecc.org/). */

package wolf.node;

import wolf.analysis.*;

@SuppressWarnings("nls")
public final class TXor extends Token
{
    public TXor()
    {
        super.setText("x");
    }

    public TXor(int line, int pos)
    {
        super.setText("x");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TXor(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTXor(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TXor text.");
    }
}
