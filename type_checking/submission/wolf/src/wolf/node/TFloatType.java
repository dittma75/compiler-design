/* This file was generated by SableCC (http://www.sablecc.org/). */

package wolf.node;

import wolf.analysis.*;

@SuppressWarnings("nls")
public final class TFloatType extends Token
{
    public TFloatType()
    {
        super.setText("float");
    }

    public TFloatType(int line, int pos)
    {
        super.setText("float");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFloatType(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFloatType(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFloatType text.");
    }
}
