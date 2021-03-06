/* This file was generated by SableCC (http://www.sablecc.org/). */

package wolf.node;

import wolf.analysis.*;

@SuppressWarnings("nls")
public final class AEmptyListList extends PList
{
    private TStartList _startList_;
    private TEndList _endList_;

    public AEmptyListList()
    {
        // Constructor
    }

    public AEmptyListList(
        @SuppressWarnings("hiding") TStartList _startList_,
        @SuppressWarnings("hiding") TEndList _endList_)
    {
        // Constructor
        setStartList(_startList_);

        setEndList(_endList_);

    }

    @Override
    public Object clone()
    {
        return new AEmptyListList(
            cloneNode(this._startList_),
            cloneNode(this._endList_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEmptyListList(this);
    }

    public TStartList getStartList()
    {
        return this._startList_;
    }

    public void setStartList(TStartList node)
    {
        if(this._startList_ != null)
        {
            this._startList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._startList_ = node;
    }

    public TEndList getEndList()
    {
        return this._endList_;
    }

    public void setEndList(TEndList node)
    {
        if(this._endList_ != null)
        {
            this._endList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._endList_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._startList_)
            + toString(this._endList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._startList_ == child)
        {
            this._startList_ = null;
            return;
        }

        if(this._endList_ == child)
        {
            this._endList_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._startList_ == oldChild)
        {
            setStartList((TStartList) newChild);
            return;
        }

        if(this._endList_ == oldChild)
        {
            setEndList((TEndList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
