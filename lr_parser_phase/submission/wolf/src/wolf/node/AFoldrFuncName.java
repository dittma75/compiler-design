/* This file was generated by SableCC (http://www.sablecc.org/). */

package wolf.node;

import wolf.analysis.*;

@SuppressWarnings("nls")
public final class AFoldrFuncName extends PFuncName
{
    private TFoldr _foldr_;

    public AFoldrFuncName()
    {
        // Constructor
    }

    public AFoldrFuncName(
        @SuppressWarnings("hiding") TFoldr _foldr_)
    {
        // Constructor
        setFoldr(_foldr_);

    }

    @Override
    public Object clone()
    {
        return new AFoldrFuncName(
            cloneNode(this._foldr_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFoldrFuncName(this);
    }

    public TFoldr getFoldr()
    {
        return this._foldr_;
    }

    public void setFoldr(TFoldr node)
    {
        if(this._foldr_ != null)
        {
            this._foldr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._foldr_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._foldr_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._foldr_ == child)
        {
            this._foldr_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._foldr_ == oldChild)
        {
            setFoldr((TFoldr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
