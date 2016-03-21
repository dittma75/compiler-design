/* This file was generated by SableCC (http://www.sablecc.org/). */

package three_point_one.node;

import three_point_one.analysis.*;

@SuppressWarnings("nls")
public final class AESeqE extends PE
{
    private TLParen _lParen_;
    private PS _s_;
    private TComma _comma_;
    private PE _e_;
    private TRParen _rParen_;

    public AESeqE()
    {
        // Constructor
    }

    public AESeqE(
        @SuppressWarnings("hiding") TLParen _lParen_,
        @SuppressWarnings("hiding") PS _s_,
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PE _e_,
        @SuppressWarnings("hiding") TRParen _rParen_)
    {
        // Constructor
        setLParen(_lParen_);

        setS(_s_);

        setComma(_comma_);

        setE(_e_);

        setRParen(_rParen_);

    }

    @Override
    public Object clone()
    {
        return new AESeqE(
            cloneNode(this._lParen_),
            cloneNode(this._s_),
            cloneNode(this._comma_),
            cloneNode(this._e_),
            cloneNode(this._rParen_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAESeqE(this);
    }

    public TLParen getLParen()
    {
        return this._lParen_;
    }

    public void setLParen(TLParen node)
    {
        if(this._lParen_ != null)
        {
            this._lParen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lParen_ = node;
    }

    public PS getS()
    {
        return this._s_;
    }

    public void setS(PS node)
    {
        if(this._s_ != null)
        {
            this._s_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._s_ = node;
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

    public TRParen getRParen()
    {
        return this._rParen_;
    }

    public void setRParen(TRParen node)
    {
        if(this._rParen_ != null)
        {
            this._rParen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rParen_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lParen_)
            + toString(this._s_)
            + toString(this._comma_)
            + toString(this._e_)
            + toString(this._rParen_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lParen_ == child)
        {
            this._lParen_ = null;
            return;
        }

        if(this._s_ == child)
        {
            this._s_ = null;
            return;
        }

        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

        if(this._e_ == child)
        {
            this._e_ = null;
            return;
        }

        if(this._rParen_ == child)
        {
            this._rParen_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lParen_ == oldChild)
        {
            setLParen((TLParen) newChild);
            return;
        }

        if(this._s_ == oldChild)
        {
            setS((PS) newChild);
            return;
        }

        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(this._e_ == oldChild)
        {
            setE((PE) newChild);
            return;
        }

        if(this._rParen_ == oldChild)
        {
            setRParen((TRParen) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}