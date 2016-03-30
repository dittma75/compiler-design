/* This file was generated by SableCC (http://www.sablecc.org/). */

package wolf.node;

import wolf.analysis.*;

@SuppressWarnings("nls")
public final class ASigArgRest extends PSigArgRest
{
    private TComma _comma_;
    private PSigArgs _sigArgs_;

    public ASigArgRest()
    {
        // Constructor
    }

    public ASigArgRest(
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PSigArgs _sigArgs_)
    {
        // Constructor
        setComma(_comma_);

        setSigArgs(_sigArgs_);

    }

    @Override
    public Object clone()
    {
        return new ASigArgRest(
            cloneNode(this._comma_),
            cloneNode(this._sigArgs_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASigArgRest(this);
    }

    public TComma getComma()
    {
        return this._comma_;
    }

    public void setComma(TComma node)
    {
        if(this._comma_ != null)
        {
            this._comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comma_ = node;
    }

    public PSigArgs getSigArgs()
    {
        return this._sigArgs_;
    }

    public void setSigArgs(PSigArgs node)
    {
        if(this._sigArgs_ != null)
        {
            this._sigArgs_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._sigArgs_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._comma_)
            + toString(this._sigArgs_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

        if(this._sigArgs_ == child)
        {
            this._sigArgs_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(this._sigArgs_ == oldChild)
        {
            setSigArgs((PSigArgs) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
