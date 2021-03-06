/* This file was generated by SableCC (http://www.sablecc.org/). */

package wolf.node;

import wolf.analysis.*;

@SuppressWarnings("nls")
public final class AMoreSigArgs extends PSigArgs
{
    private PSigArgs _sigArgs_;
    private PSigArgRest _sigArgRest_;

    public AMoreSigArgs()
    {
        // Constructor
    }

    public AMoreSigArgs(
        @SuppressWarnings("hiding") PSigArgs _sigArgs_,
        @SuppressWarnings("hiding") PSigArgRest _sigArgRest_)
    {
        // Constructor
        setSigArgs(_sigArgs_);

        setSigArgRest(_sigArgRest_);

    }

    @Override
    public Object clone()
    {
        return new AMoreSigArgs(
            cloneNode(this._sigArgs_),
            cloneNode(this._sigArgRest_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMoreSigArgs(this);
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

    public PSigArgRest getSigArgRest()
    {
        return this._sigArgRest_;
    }

    public void setSigArgRest(PSigArgRest node)
    {
        if(this._sigArgRest_ != null)
        {
            this._sigArgRest_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._sigArgRest_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._sigArgs_)
            + toString(this._sigArgRest_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._sigArgs_ == child)
        {
            this._sigArgs_ = null;
            return;
        }

        if(this._sigArgRest_ == child)
        {
            this._sigArgRest_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._sigArgs_ == oldChild)
        {
            setSigArgs((PSigArgs) newChild);
            return;
        }

        if(this._sigArgRest_ == oldChild)
        {
            setSigArgRest((PSigArgRest) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
