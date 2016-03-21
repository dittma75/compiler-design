/* This file was generated by SableCC (http://www.sablecc.org/). */

package three_point_one.analysis;

import java.util.*;
import three_point_one.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPS().apply(this);
        outStart(node);
    }

    public void inACompoundS(ACompoundS node)
    {
        defaultIn(node);
    }

    public void outACompoundS(ACompoundS node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACompoundS(ACompoundS node)
    {
        inACompoundS(node);
        if(node.getSecond() != null)
        {
            node.getSecond().apply(this);
        }
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        if(node.getFirst() != null)
        {
            node.getFirst().apply(this);
        }
        outACompoundS(node);
    }

    public void inAAssignS(AAssignS node)
    {
        defaultIn(node);
    }

    public void outAAssignS(AAssignS node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAssignS(AAssignS node)
    {
        inAAssignS(node);
        if(node.getE() != null)
        {
            node.getE().apply(this);
        }
        if(node.getAssign() != null)
        {
            node.getAssign().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAAssignS(node);
    }

    public void inAPrintS(APrintS node)
    {
        defaultIn(node);
    }

    public void outAPrintS(APrintS node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPrintS(APrintS node)
    {
        inAPrintS(node);
        if(node.getRParen() != null)
        {
            node.getRParen().apply(this);
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getLParen() != null)
        {
            node.getLParen().apply(this);
        }
        if(node.getPrint() != null)
        {
            node.getPrint().apply(this);
        }
        outAPrintS(node);
    }

    public void inAIdE(AIdE node)
    {
        defaultIn(node);
    }

    public void outAIdE(AIdE node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdE(AIdE node)
    {
        inAIdE(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdE(node);
    }

    public void inANumE(ANumE node)
    {
        defaultIn(node);
    }

    public void outANumE(ANumE node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumE(ANumE node)
    {
        inANumE(node);
        if(node.getNum() != null)
        {
            node.getNum().apply(this);
        }
        outANumE(node);
    }

    public void inAAddE(AAddE node)
    {
        defaultIn(node);
    }

    public void outAAddE(AAddE node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAddE(AAddE node)
    {
        inAAddE(node);
        if(node.getSecond() != null)
        {
            node.getSecond().apply(this);
        }
        if(node.getPlus() != null)
        {
            node.getPlus().apply(this);
        }
        if(node.getFirst() != null)
        {
            node.getFirst().apply(this);
        }
        outAAddE(node);
    }

    public void inAESeqE(AESeqE node)
    {
        defaultIn(node);
    }

    public void outAESeqE(AESeqE node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAESeqE(AESeqE node)
    {
        inAESeqE(node);
        if(node.getRParen() != null)
        {
            node.getRParen().apply(this);
        }
        if(node.getE() != null)
        {
            node.getE().apply(this);
        }
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getS() != null)
        {
            node.getS().apply(this);
        }
        if(node.getLParen() != null)
        {
            node.getLParen().apply(this);
        }
        outAESeqE(node);
    }

    public void inAEL(AEL node)
    {
        defaultIn(node);
    }

    public void outAEL(AEL node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEL(AEL node)
    {
        inAEL(node);
        if(node.getE() != null)
        {
            node.getE().apply(this);
        }
        outAEL(node);
    }

    public void inALSeqL(ALSeqL node)
    {
        defaultIn(node);
    }

    public void outALSeqL(ALSeqL node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALSeqL(ALSeqL node)
    {
        inALSeqL(node);
        if(node.getE() != null)
        {
            node.getE().apply(this);
        }
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outALSeqL(node);
    }
}