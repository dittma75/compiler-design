/* This file was generated by SableCC (http://www.sablecc.org/). */

package wolf.node;

import wolf.analysis.*;

@SuppressWarnings("nls")
public final class TReturn extends Token
{
    public TReturn(String text)
    {
        setText(text);
    }

    public TReturn(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TReturn(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTReturn(this);
    }
}
