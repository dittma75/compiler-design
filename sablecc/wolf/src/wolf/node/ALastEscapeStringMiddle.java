/* This file was generated by SableCC (http://www.sablecc.org/). */

package wolf.node;

import wolf.analysis.*;

@SuppressWarnings("nls")
public final class ALastEscapeStringMiddle extends PStringMiddle
{
    private PStringEscapeSeq _stringEscapeSeq_;

    public ALastEscapeStringMiddle()
    {
        // Constructor
    }

    public ALastEscapeStringMiddle(
        @SuppressWarnings("hiding") PStringEscapeSeq _stringEscapeSeq_)
    {
        // Constructor
        setStringEscapeSeq(_stringEscapeSeq_);

    }

    @Override
    public Object clone()
    {
        return new ALastEscapeStringMiddle(
            cloneNode(this._stringEscapeSeq_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALastEscapeStringMiddle(this);
    }

    public PStringEscapeSeq getStringEscapeSeq()
    {
        return this._stringEscapeSeq_;
    }

    public void setStringEscapeSeq(PStringEscapeSeq node)
    {
        if(this._stringEscapeSeq_ != null)
        {
            this._stringEscapeSeq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._stringEscapeSeq_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._stringEscapeSeq_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._stringEscapeSeq_ == child)
        {
            this._stringEscapeSeq_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._stringEscapeSeq_ == oldChild)
        {
            setStringEscapeSeq((PStringEscapeSeq) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
