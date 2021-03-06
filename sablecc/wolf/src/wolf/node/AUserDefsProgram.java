/* This file was generated by SableCC (http://www.sablecc.org/). */

package wolf.node;

import wolf.analysis.*;

@SuppressWarnings("nls")
public final class AUserDefsProgram extends PProgram
{
    private PDefList _defList_;
    private PFunction _function_;

    public AUserDefsProgram()
    {
        // Constructor
    }

    public AUserDefsProgram(
        @SuppressWarnings("hiding") PDefList _defList_,
        @SuppressWarnings("hiding") PFunction _function_)
    {
        // Constructor
        setDefList(_defList_);

        setFunction(_function_);

    }

    @Override
    public Object clone()
    {
        return new AUserDefsProgram(
            cloneNode(this._defList_),
            cloneNode(this._function_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUserDefsProgram(this);
    }

    public PDefList getDefList()
    {
        return this._defList_;
    }

    public void setDefList(PDefList node)
    {
        if(this._defList_ != null)
        {
            this._defList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._defList_ = node;
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
            + toString(this._defList_)
            + toString(this._function_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._defList_ == child)
        {
            this._defList_ = null;
            return;
        }

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
        if(this._defList_ == oldChild)
        {
            setDefList((PDefList) newChild);
            return;
        }

        if(this._function_ == oldChild)
        {
            setFunction((PFunction) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
