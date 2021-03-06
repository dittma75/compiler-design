/* This file was generated by SableCC (http://www.sablecc.org/). */

package wolf.node;

import wolf.analysis.*;

@SuppressWarnings("nls")
public final class TAppend extends Token
{
    public TAppend()
    {
        super.setText("$");
    }

    public TAppend(int line, int pos)
    {
        super.setText("$");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TAppend(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTAppend(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TAppend text.");
    }
}
