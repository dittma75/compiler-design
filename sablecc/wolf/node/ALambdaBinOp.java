/* This file was generated by SableCC (http://www.sablecc.org/). */

package wolf.node;

import wolf.analysis.*;

@SuppressWarnings("nls")
public final class ALambdaBinOp extends PBinOp
{
    private PLambda _lambda_;

    public ALambdaBinOp()
    {
        // Constructor
    }

    public ALambdaBinOp(
        @SuppressWarnings("hiding") PLambda _lambda_)
    {
        // Constructor
        setLambda(_lambda_);

    }

    @Override
    public Object clone()
    {
        return new ALambdaBinOp(
            cloneNode(this._lambda_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALambdaBinOp(this);
    }

    public PLambda getLambda()
    {
        return this._lambda_;
    }

    public void setLambda(PLambda node)
    {
        if(this._lambda_ != null)
        {
            this._lambda_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lambda_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lambda_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lambda_ == child)
        {
            this._lambda_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lambda_ == oldChild)
        {
            setLambda((PLambda) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
