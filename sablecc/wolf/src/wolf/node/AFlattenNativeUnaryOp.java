/* This file was generated by SableCC (http://www.sablecc.org/). */

package wolf.node;

import wolf.analysis.*;

@SuppressWarnings("nls")
public final class AFlattenNativeUnaryOp extends PNativeUnaryOp
{
    private TFlatten _flatten_;

    public AFlattenNativeUnaryOp()
    {
        // Constructor
    }

    public AFlattenNativeUnaryOp(
        @SuppressWarnings("hiding") TFlatten _flatten_)
    {
        // Constructor
        setFlatten(_flatten_);

    }

    @Override
    public Object clone()
    {
        return new AFlattenNativeUnaryOp(
            cloneNode(this._flatten_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFlattenNativeUnaryOp(this);
    }

    public TFlatten getFlatten()
    {
        return this._flatten_;
    }

    public void setFlatten(TFlatten node)
    {
        if(this._flatten_ != null)
        {
            this._flatten_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._flatten_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._flatten_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._flatten_ == child)
        {
            this._flatten_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._flatten_ == oldChild)
        {
            setFlatten((TFlatten) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
