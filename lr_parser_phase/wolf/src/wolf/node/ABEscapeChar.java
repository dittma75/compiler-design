/* This file was generated by SableCC (http://www.sablecc.org/). */

package wolf.node;

import wolf.analysis.*;

@SuppressWarnings("nls")
public final class ABEscapeChar extends PEscapeChar
{
    private TEscapeBackspace _escapeBackspace_;

    public ABEscapeChar()
    {
        // Constructor
    }

    public ABEscapeChar(
        @SuppressWarnings("hiding") TEscapeBackspace _escapeBackspace_)
    {
        // Constructor
        setEscapeBackspace(_escapeBackspace_);

    }

    @Override
    public Object clone()
    {
        return new ABEscapeChar(
            cloneNode(this._escapeBackspace_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABEscapeChar(this);
    }

    public TEscapeBackspace getEscapeBackspace()
    {
        return this._escapeBackspace_;
    }

    public void setEscapeBackspace(TEscapeBackspace node)
    {
        if(this._escapeBackspace_ != null)
        {
            this._escapeBackspace_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._escapeBackspace_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._escapeBackspace_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._escapeBackspace_ == child)
        {
            this._escapeBackspace_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._escapeBackspace_ == oldChild)
        {
            setEscapeBackspace((TEscapeBackspace) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
