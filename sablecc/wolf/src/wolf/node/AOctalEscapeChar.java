/* This file was generated by SableCC (http://www.sablecc.org/). */

package wolf.node;

import wolf.analysis.*;

@SuppressWarnings("nls")
public final class AOctalEscapeChar extends PEscapeChar
{
    private TEscapeOctalChar _escapeOctalChar_;

    public AOctalEscapeChar()
    {
        // Constructor
    }

    public AOctalEscapeChar(
        @SuppressWarnings("hiding") TEscapeOctalChar _escapeOctalChar_)
    {
        // Constructor
        setEscapeOctalChar(_escapeOctalChar_);

    }

    @Override
    public Object clone()
    {
        return new AOctalEscapeChar(
            cloneNode(this._escapeOctalChar_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOctalEscapeChar(this);
    }

    public TEscapeOctalChar getEscapeOctalChar()
    {
        return this._escapeOctalChar_;
    }

    public void setEscapeOctalChar(TEscapeOctalChar node)
    {
        if(this._escapeOctalChar_ != null)
        {
            this._escapeOctalChar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._escapeOctalChar_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._escapeOctalChar_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._escapeOctalChar_ == child)
        {
            this._escapeOctalChar_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._escapeOctalChar_ == oldChild)
        {
            setEscapeOctalChar((TEscapeOctalChar) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
