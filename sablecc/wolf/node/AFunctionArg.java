/* This file was generated by SableCC (http://www.sablecc.org/). */

package wolf.node;

import wolf.analysis.*;

@SuppressWarnings("nls")
public final class AFunctionArg extends PArg
{
    private PFunction _function_;

    public AFunctionArg()
    {
        // Constructor
    }

    public AFunctionArg(
        @SuppressWarnings("hiding") PFunction _function_)
    {
        // Constructor
        setFunction(_function_);

    }

    @Override
    public Object clone()
    {
        return new AFunctionArg(
            cloneNode(this._function_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFunctionArg(this);
    }

    public PFunction getFunction()
    {
        return this._function_;
    }

    public void setFunction(PFunction node)
    {
        if(this._function_ != null)
        {
            this._function_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._function_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._function_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._function_ == child)
        {
            this._function_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._function_ == oldChild)
        {
            setFunction((PFunction) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
