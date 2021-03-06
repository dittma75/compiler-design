/* This file was generated by SableCC (http://www.sablecc.org/). */

package wolf.node;

import wolf.analysis.*;

@SuppressWarnings("nls")
public final class ALogicalNotNativeUnaryOp extends PNativeUnaryOp
{
    private TLogicalNot _logicalNot_;

    public ALogicalNotNativeUnaryOp()
    {
        // Constructor
    }

    public ALogicalNotNativeUnaryOp(
        @SuppressWarnings("hiding") TLogicalNot _logicalNot_)
    {
        // Constructor
        setLogicalNot(_logicalNot_);

    }

    @Override
    public Object clone()
    {
        return new ALogicalNotNativeUnaryOp(
            cloneNode(this._logicalNot_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALogicalNotNativeUnaryOp(this);
    }

    public TLogicalNot getLogicalNot()
    {
        return this._logicalNot_;
    }

    public void setLogicalNot(TLogicalNot node)
    {
        if(this._logicalNot_ != null)
        {
            this._logicalNot_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._logicalNot_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._logicalNot_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._logicalNot_ == child)
        {
            this._logicalNot_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._logicalNot_ == oldChild)
        {
            setLogicalNot((TLogicalNot) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
