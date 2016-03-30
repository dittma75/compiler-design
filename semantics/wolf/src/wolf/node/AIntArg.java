/* This file was generated by SableCC (http://www.sablecc.org/). */

package wolf.node;

import wolf.analysis.*;

@SuppressWarnings("nls")
public final class AIntArg extends PArg
{
    private TIntNumber _intNumber_;

    public AIntArg()
    {
        // Constructor
    }

    public AIntArg(
        @SuppressWarnings("hiding") TIntNumber _intNumber_)
    {
        // Constructor
        setIntNumber(_intNumber_);

    }

    @Override
    public Object clone()
    {
        return new AIntArg(
            cloneNode(this._intNumber_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIntArg(this);
    }

    public TIntNumber getIntNumber()
    {
        return this._intNumber_;
    }

    public void setIntNumber(TIntNumber node)
    {
        if(this._intNumber_ != null)
        {
            this._intNumber_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._intNumber_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._intNumber_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._intNumber_ == child)
        {
            this._intNumber_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._intNumber_ == oldChild)
        {
            setIntNumber((TIntNumber) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
