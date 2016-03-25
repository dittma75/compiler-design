/* This file was generated by SableCC (http://www.sablecc.org/). */

package wolf.node;

import wolf.analysis.*;

@SuppressWarnings("nls")
public final class ANativeFunction extends PFunction
{
    private PFuncName _funcName_;
    private PArgList _argList_;

    public ANativeFunction()
    {
        // Constructor
    }

    public ANativeFunction(
        @SuppressWarnings("hiding") PFuncName _funcName_,
        @SuppressWarnings("hiding") PArgList _argList_)
    {
        // Constructor
        setFuncName(_funcName_);

        setArgList(_argList_);

    }

    @Override
    public Object clone()
    {
        return new ANativeFunction(
            cloneNode(this._funcName_),
            cloneNode(this._argList_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANativeFunction(this);
    }

    public PFuncName getFuncName()
    {
        return this._funcName_;
    }

    public void setFuncName(PFuncName node)
    {
        if(this._funcName_ != null)
        {
            this._funcName_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._funcName_ = node;
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
            + toString(this._funcName_)
            + toString(this._argList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._funcName_ == child)
        {
            this._funcName_ = null;
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
        if(this._funcName_ == oldChild)
        {
            setFuncName((PFuncName) newChild);
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
