/* This file was generated by SableCC (http://www.sablecc.org/). */

package wolf.node;

import wolf.analysis.*;

@SuppressWarnings("nls")
public final class ANativeUnaryOp extends PUnaryOp
{
    private PNativeUnaryOp _nativeUnaryOp_;

    public ANativeUnaryOp()
    {
        // Constructor
    }

    public ANativeUnaryOp(
        @SuppressWarnings("hiding") PNativeUnaryOp _nativeUnaryOp_)
    {
        // Constructor
        setNativeUnaryOp(_nativeUnaryOp_);

    }

    @Override
    public Object clone()
    {
        return new ANativeUnaryOp(
            cloneNode(this._nativeUnaryOp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANativeUnaryOp(this);
    }

    public PNativeUnaryOp getNativeUnaryOp()
    {
        return this._nativeUnaryOp_;
    }

    public void setNativeUnaryOp(PNativeUnaryOp node)
    {
        if(this._nativeUnaryOp_ != null)
        {
            this._nativeUnaryOp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._nativeUnaryOp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._nativeUnaryOp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._nativeUnaryOp_ == child)
        {
            this._nativeUnaryOp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._nativeUnaryOp_ == oldChild)
        {
            setNativeUnaryOp((PNativeUnaryOp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
