package net.lypant.javokus.model.blocks;

import static net.lypant.javokus.model.blocks.Transformation.State.*;
import net.lypant.javokus.model.blocks.Transformation.*;

public class BlockTransformation implements Transformation
{
    private State state = NORMAL_0;

    public State getState()
    {
        return state;
    }

    public void setState(State state)
    {
        this.state = state;
    }

    public void rotate()
    {
        switch(state)
        {
            case NORMAL_0:      {setState(NORMAL_90);       break;}
            case NORMAL_90:     {setState(NORMAL_180);      break;}
            case NORMAL_180:    {setState(NORMAL_270);      break;}
            case NORMAL_270:    {setState(NORMAL_0);        break;}
            case MIRRORED_0:    {setState(MIRRORED_270);    break;}
            case MIRRORED_90:   {setState(MIRRORED_0);      break;}
            case MIRRORED_180:  {setState(MIRRORED_90);     break;}
            case MIRRORED_270:  {setState(MIRRORED_180);    break;}
            default: {assert false : "Unhandled state: " + state; break;}
        }
    }

    public void mirror()
    {
        switch(state)
        {
            case NORMAL_0:      {setState(MIRRORED_0);      break;}
            case NORMAL_90:     {setState(MIRRORED_90);     break;}
            case NORMAL_180:    {setState(MIRRORED_180);    break;}
            case NORMAL_270:    {setState(MIRRORED_270);    break;}
            case MIRRORED_0:    {setState(NORMAL_0);        break;}
            case MIRRORED_90:   {setState(NORMAL_90);       break;}
            case MIRRORED_180:  {setState(NORMAL_180);      break;}
            case MIRRORED_270:  {setState(NORMAL_270);      break;}
            default: {assert false: "Unhandled state: " + state; break;}
        }
    }
}

