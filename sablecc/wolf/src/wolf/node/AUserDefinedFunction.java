/* This file was generated by SableCC (http://www.sablecc.org/). */

package wolf.node;

import wolf.analysis.*;

@SuppressWarnings("nls")
public final class AUserDefinedFunction extends PFunction
{
    private PUserFunc _userFunc_;
    private PArgList _argList_;

    public AUserDefinedFunction()
    {
        // Constructor
    }

    public AUserDefinedFunction(
        @SuppressWarnings("hiding") PUserFunc _userFunc_,
        @SuppressWarnings("hiding") PArgList _argList_)
    {
        // Constructor
        setUserFunc(_userFunc_);

        setArgList(_argList_);

    }

    @Override
    public Object clone()
    {
        return new AUserDefinedFunction(
            cloneNode(this._userFunc_),
            cloneNode(this._argList_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUserDefinedFunction(this);
    }

    public PUserFunc getUserFunc()
    {
        return this._userFunc_;
    }

    public void setUserFunc(PUserFunc node)
    {
        if(this._userFunc_ != null)
        {
            this._userFunc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._userFunc_ = node;
    }

    public PArgList getArgList()
    {
        return this._argList_;
    }

    public void setArgList(PArgList node)
    {
        if(this._argList_ != null)
        {
            this._argList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._argList_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._userFunc_)
            + toString(this._argList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._userFunc_ == child)
        {
            this._userFunc_ = null;
            return;
        }

        if(this._argList_ == child)
        {
            this._argList_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._userFunc_ == oldChild)
        {
            setUserFunc((PUserFunc) newChild);
            return;
        }

        if(this._argList_ == oldChild)
        {
            setArgList((PArgList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
