/* This file was generated by SableCC (http://www.sablecc.org/). */

package three_point_one.node;

import three_point_one.analysis.*;

@SuppressWarnings("nls")
public final class AAddE extends PE
{
    private PE _e_;
    private TPlus _plus_;
    private PTerm _term_;

    public AAddE()
    {
        // Constructor
    }

    public AAddE(
        @SuppressWarnings("hiding") PE _e_,
        @SuppressWarnings("hiding") TPlus _plus_,
        @SuppressWarnings("hiding") PTerm _term_)
    {
        // Constructor
        setE(_e_);

        setPlus(_plus_);

        setTerm(_term_);

    }

    @Override
    public Object clone()
    {
        return new AAddE(
            cloneNode(this._e_),
            cloneNode(this._plus_),
            cloneNode(this._term_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAddE(this);
    }

    public PE getE()
    {
        return this._e_;
    }

    public void setE(PE node)
    {
        if(this._e_ != null)
        {
            this._e_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._e_ = node;
    }

    public TPlus getPlus()
    {
        return this._plus_;
    }

    public void setPlus(TPlus node)
    {
        if(this._plus_ != null)
        {
            this._plus_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._plus_ = node;
    }

    public PTerm getTerm()
    {
        return this._term_;
    }

    public void setTerm(PTerm node)
    {
        if(this._term_ != null)
        {
            this._term_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._term_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._e_)
            + toString(this._plus_)
            + toString(this._term_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._e_ == child)
        {
            this._e_ = null;
            return;
        }

        if(this._plus_ == child)
        {
            this._plus_ = null;
            return;
        }

        if(this._term_ == child)
        {
            this._term_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._e_ == oldChild)
        {
            setE((PE) newChild);
            return;
        }

        if(this._plus_ == oldChild)
        {
            setPlus((TPlus) newChild);
            return;
        }

        if(this._term_ == oldChild)
        {
            setTerm((PTerm) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
