package algvis.ds.dynamicarray;

import java.awt.Color;

import algvis.core.DataStructure;
import algvis.core.Node;
import algvis.core.RelativeNode;
import algvis.ui.view.View;

public class DynamicArrayCoin extends RelativeNode {
    public DynamicArrayCoin(DataStructure D, Node relative, int sepx,
        int sepy) {
        super(D, relative, 47, sepx, sepy, 0);
    }

    @Override
    public String toString() {
        return "$";
    }

    @Override
    protected void drawBg(View v) {
        v.setColor(getBgColor());
        v.fillCircle(x, y, 8);
        v.setColor(Color.BLACK); // fgcolor);
        v.drawCircle(x, y, 8);
        if (marked) {
            v.drawCircle(x, y, 8 + 2);
        }
    }
}
