// Copyright (c) Lawrence Livermore National Security, LLC and other VisIt
// Project developers.  See the top-level LICENSE file for dates and other
// details.  No copyright assignment is required to contribute to VisIt.

package llnl.visit.plots;

import llnl.visit.AttributeSubject;
import llnl.visit.CommunicationBuffer;
import llnl.visit.Plugin;
import llnl.visit.ColorAttribute;
import llnl.visit.ColorAttributeList;
import java.util.Vector;

// ****************************************************************************
// Class: SubsetAttributes
//
// Purpose:
//    This class contains the plot attributes for the subset boundary plot.
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   omitted
//
// Modifications:
//
// ****************************************************************************

public class SubsetAttributes extends AttributeSubject implements Plugin
{
    private static int SubsetAttributes_numAdditionalAtts = 20;

    // Enum values
    public final static int SUBSET_TYPE_DOMAIN = 0;
    public final static int SUBSET_TYPE_GROUP = 1;
    public final static int SUBSET_TYPE_ENUMSCALAR = 2;
    public final static int SUBSET_TYPE_MESH = 3;
    public final static int SUBSET_TYPE_UNKNOWN = 4;

    public final static int COLORINGMETHOD_COLORBYSINGLECOLOR = 0;
    public final static int COLORINGMETHOD_COLORBYMULTIPLECOLORS = 1;
    public final static int COLORINGMETHOD_COLORBYCOLORTABLE = 2;


    public SubsetAttributes()
    {
        super(SubsetAttributes_numAdditionalAtts);

        colorType = COLORINGMETHOD_COLORBYMULTIPLECOLORS;
        colorTableName = new String("Default");
        invertColorTable = false;
        legendFlag = true;
        customLegendTitleEnabled = false;
        customLegendTitle = new String("");
        lineWidth = 0;
        singleColor = new ColorAttribute();
        multiColor = new ColorAttributeList();
        subsetNames = new Vector();
        subsetType = SUBSET_TYPE_UNKNOWN;
        opacity = 1;
        wireframe = false;
        drawInternal = false;
        smoothingLevel = 0;
        pointSize = 0.05;
        pointType = 6;
        pointSizeVarEnabled = false;
        pointSizeVar = new String("default");
        pointSizePixels = 2;
    }

    public SubsetAttributes(int nMoreFields)
    {
        super(SubsetAttributes_numAdditionalAtts + nMoreFields);

        colorType = COLORINGMETHOD_COLORBYMULTIPLECOLORS;
        colorTableName = new String("Default");
        invertColorTable = false;
        legendFlag = true;
        customLegendTitleEnabled = false;
        customLegendTitle = new String("");
        lineWidth = 0;
        singleColor = new ColorAttribute();
        multiColor = new ColorAttributeList();
        subsetNames = new Vector();
        subsetType = SUBSET_TYPE_UNKNOWN;
        opacity = 1;
        wireframe = false;
        drawInternal = false;
        smoothingLevel = 0;
        pointSize = 0.05;
        pointType = 6;
        pointSizeVarEnabled = false;
        pointSizeVar = new String("default");
        pointSizePixels = 2;
    }

    public SubsetAttributes(SubsetAttributes obj)
    {
        super(obj);

        int i;

        colorType = obj.colorType;
        colorTableName = new String(obj.colorTableName);
        invertColorTable = obj.invertColorTable;
        legendFlag = obj.legendFlag;
        customLegendTitleEnabled = obj.customLegendTitleEnabled;
        customLegendTitle = new String(obj.customLegendTitle);
        lineWidth = obj.lineWidth;
        singleColor = new ColorAttribute(obj.singleColor);
        multiColor = new ColorAttributeList(obj.multiColor);
        subsetNames = new Vector(obj.subsetNames.size());
        for(i = 0; i < obj.subsetNames.size(); ++i)
            subsetNames.addElement(new String((String)obj.subsetNames.elementAt(i)));

        subsetType = obj.subsetType;
        opacity = obj.opacity;
        wireframe = obj.wireframe;
        drawInternal = obj.drawInternal;
        smoothingLevel = obj.smoothingLevel;
        pointSize = obj.pointSize;
        pointType = obj.pointType;
        pointSizeVarEnabled = obj.pointSizeVarEnabled;
        pointSizeVar = new String(obj.pointSizeVar);
        pointSizePixels = obj.pointSizePixels;

        SelectAll();
    }

    public int Offset()
    {
        return super.Offset() + super.GetNumAdditionalAttributes();
    }

    public int GetNumAdditionalAttributes()
    {
        return SubsetAttributes_numAdditionalAtts;
    }

    public boolean equals(SubsetAttributes obj)
    {
        int i;

        // Compare the elements in the subsetNames vector.
        boolean subsetNames_equal = (obj.subsetNames.size() == subsetNames.size());
        for(i = 0; (i < subsetNames.size()) && subsetNames_equal; ++i)
        {
            // Make references to String from Object.
            String subsetNames1 = (String)subsetNames.elementAt(i);
            String subsetNames2 = (String)obj.subsetNames.elementAt(i);
            subsetNames_equal = subsetNames1.equals(subsetNames2);
        }
        // Create the return value
        return ((colorType == obj.colorType) &&
                (colorTableName.equals(obj.colorTableName)) &&
                (invertColorTable == obj.invertColorTable) &&
                (legendFlag == obj.legendFlag) &&
                (customLegendTitleEnabled == obj.customLegendTitleEnabled) &&
                (customLegendTitle.equals(obj.customLegendTitle)) &&
                (lineWidth == obj.lineWidth) &&
                (singleColor == obj.singleColor) &&
                (multiColor.equals(obj.multiColor)) &&
                subsetNames_equal &&
                (subsetType == obj.subsetType) &&
                (opacity == obj.opacity) &&
                (wireframe == obj.wireframe) &&
                (drawInternal == obj.drawInternal) &&
                (smoothingLevel == obj.smoothingLevel) &&
                (pointSize == obj.pointSize) &&
                (pointType == obj.pointType) &&
                (pointSizeVarEnabled == obj.pointSizeVarEnabled) &&
                (pointSizeVar.equals(obj.pointSizeVar)) &&
                (pointSizePixels == obj.pointSizePixels));
    }

    public String GetName() { return "Subset"; }
    public String GetVersion() { return "1.0"; }

    // Property setting methods
    public void SetColorType(int colorType_)
    {
        colorType = colorType_;
        Select(0);
    }

    public void SetColorTableName(String colorTableName_)
    {
        colorTableName = colorTableName_;
        Select(1);
    }

    public void SetInvertColorTable(boolean invertColorTable_)
    {
        invertColorTable = invertColorTable_;
        Select(2);
    }

    public void SetLegendFlag(boolean legendFlag_)
    {
        legendFlag = legendFlag_;
        Select(3);
    }

    public void SetCustomLegendTitleEnabled(boolean customLegendTitleEnabled_)
    {
        customLegendTitleEnabled = customLegendTitleEnabled_;
        Select(4);
    }

    public void SetCustomLegendTitle(String customLegendTitle_)
    {
        customLegendTitle = customLegendTitle_;
        Select(5);
    }

    public void SetLineWidth(int lineWidth_)
    {
        lineWidth = lineWidth_;
        Select(6);
    }

    public void SetSingleColor(ColorAttribute singleColor_)
    {
        singleColor = singleColor_;
        Select(7);
    }

    public void SetMultiColor(ColorAttributeList multiColor_)
    {
        multiColor = multiColor_;
        Select(8);
    }

    public void SetSubsetNames(Vector subsetNames_)
    {
        subsetNames = subsetNames_;
        Select(9);
    }

    public void SetSubsetType(int subsetType_)
    {
        subsetType = subsetType_;
        Select(10);
    }

    public void SetOpacity(double opacity_)
    {
        opacity = opacity_;
        Select(11);
    }

    public void SetWireframe(boolean wireframe_)
    {
        wireframe = wireframe_;
        Select(12);
    }

    public void SetDrawInternal(boolean drawInternal_)
    {
        drawInternal = drawInternal_;
        Select(13);
    }

    public void SetSmoothingLevel(int smoothingLevel_)
    {
        smoothingLevel = smoothingLevel_;
        Select(14);
    }

    public void SetPointSize(double pointSize_)
    {
        pointSize = pointSize_;
        Select(15);
    }

    public void SetPointType(int pointType_)
    {
        pointType = pointType_;
        Select(16);
    }

    public void SetPointSizeVarEnabled(boolean pointSizeVarEnabled_)
    {
        pointSizeVarEnabled = pointSizeVarEnabled_;
        Select(17);
    }

    public void SetPointSizeVar(String pointSizeVar_)
    {
        pointSizeVar = pointSizeVar_;
        Select(18);
    }

    public void SetPointSizePixels(int pointSizePixels_)
    {
        pointSizePixels = pointSizePixels_;
        Select(19);
    }

    // Property getting methods
    public int                GetColorType() { return colorType; }
    public String             GetColorTableName() { return colorTableName; }
    public boolean            GetInvertColorTable() { return invertColorTable; }
    public boolean            GetLegendFlag() { return legendFlag; }
    public boolean            GetCustomLegendTitleEnabled() { return customLegendTitleEnabled; }
    public String             GetCustomLegendTitle() { return customLegendTitle; }
    public int                GetLineWidth() { return lineWidth; }
    public ColorAttribute     GetSingleColor() { return singleColor; }
    public ColorAttributeList GetMultiColor() { return multiColor; }
    public Vector             GetSubsetNames() { return subsetNames; }
    public int                GetSubsetType() { return subsetType; }
    public double             GetOpacity() { return opacity; }
    public boolean            GetWireframe() { return wireframe; }
    public boolean            GetDrawInternal() { return drawInternal; }
    public int                GetSmoothingLevel() { return smoothingLevel; }
    public double             GetPointSize() { return pointSize; }
    public int GetPointType() { return pointType; }
    public boolean            GetPointSizeVarEnabled() { return pointSizeVarEnabled; }
    public String             GetPointSizeVar() { return pointSizeVar; }
    public int                GetPointSizePixels() { return pointSizePixels; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteInt(colorType);
        if(WriteSelect(1, buf))
            buf.WriteString(colorTableName);
        if(WriteSelect(2, buf))
            buf.WriteBool(invertColorTable);
        if(WriteSelect(3, buf))
            buf.WriteBool(legendFlag);
        if(WriteSelect(4, buf))
            buf.WriteBool(customLegendTitleEnabled);
        if(WriteSelect(5, buf))
            buf.WriteString(customLegendTitle);
        if(WriteSelect(6, buf))
            buf.WriteInt(lineWidth);
        if(WriteSelect(7, buf))
            singleColor.Write(buf);
        if(WriteSelect(8, buf))
            multiColor.Write(buf);
        if(WriteSelect(9, buf))
            buf.WriteStringVector(subsetNames);
        if(WriteSelect(10, buf))
            buf.WriteInt(subsetType);
        if(WriteSelect(11, buf))
            buf.WriteDouble(opacity);
        if(WriteSelect(12, buf))
            buf.WriteBool(wireframe);
        if(WriteSelect(13, buf))
            buf.WriteBool(drawInternal);
        if(WriteSelect(14, buf))
            buf.WriteInt(smoothingLevel);
        if(WriteSelect(15, buf))
            buf.WriteDouble(pointSize);
        if(WriteSelect(16, buf))
            buf.WriteInt(pointType);
        if(WriteSelect(17, buf))
            buf.WriteBool(pointSizeVarEnabled);
        if(WriteSelect(18, buf))
            buf.WriteString(pointSizeVar);
        if(WriteSelect(19, buf))
            buf.WriteInt(pointSizePixels);
    }

    public void ReadAtts(int index, CommunicationBuffer buf)
    {
        switch(index)
        {
        case 0:
            SetColorType(buf.ReadInt());
            break;
        case 1:
            SetColorTableName(buf.ReadString());
            break;
        case 2:
            SetInvertColorTable(buf.ReadBool());
            break;
        case 3:
            SetLegendFlag(buf.ReadBool());
            break;
        case 4:
            SetCustomLegendTitleEnabled(buf.ReadBool());
            break;
        case 5:
            SetCustomLegendTitle(buf.ReadString());
            break;
        case 6:
            SetLineWidth(buf.ReadInt());
            break;
        case 7:
            singleColor.Read(buf);
            Select(7);
            break;
        case 8:
            multiColor.Read(buf);
            Select(8);
            break;
        case 9:
            SetSubsetNames(buf.ReadStringVector());
            break;
        case 10:
            SetSubsetType(buf.ReadInt());
            break;
        case 11:
            SetOpacity(buf.ReadDouble());
            break;
        case 12:
            SetWireframe(buf.ReadBool());
            break;
        case 13:
            SetDrawInternal(buf.ReadBool());
            break;
        case 14:
            SetSmoothingLevel(buf.ReadInt());
            break;
        case 15:
            SetPointSize(buf.ReadDouble());
            break;
        case 16:
            SetPointType(buf.ReadInt());
            break;
        case 17:
            SetPointSizeVarEnabled(buf.ReadBool());
            break;
        case 18:
            SetPointSizeVar(buf.ReadString());
            break;
        case 19:
            SetPointSizePixels(buf.ReadInt());
            break;
        }
    }

    public String toString(String indent)
    {
        String str = new String();
        str = str + indent + "colorType = ";
        if(colorType == COLORINGMETHOD_COLORBYSINGLECOLOR)
            str = str + "COLORINGMETHOD_COLORBYSINGLECOLOR";
        if(colorType == COLORINGMETHOD_COLORBYMULTIPLECOLORS)
            str = str + "COLORINGMETHOD_COLORBYMULTIPLECOLORS";
        if(colorType == COLORINGMETHOD_COLORBYCOLORTABLE)
            str = str + "COLORINGMETHOD_COLORBYCOLORTABLE";
        str = str + "\n";
        str = str + stringToString("colorTableName", colorTableName, indent) + "\n";
        str = str + boolToString("invertColorTable", invertColorTable, indent) + "\n";
        str = str + boolToString("legendFlag", legendFlag, indent) + "\n";
        str = str + boolToString("customLegendTitleEnabled", customLegendTitleEnabled, indent) + "\n";
        str = str + stringToString("customLegendTitle", customLegendTitle, indent) + "\n";
        str = str + intToString("lineWidth", lineWidth, indent) + "\n";
        str = str + indent + "singleColor = {" + singleColor.Red() + ", " + singleColor.Green() + ", " + singleColor.Blue() + ", " + singleColor.Alpha() + "}\n";
        str = str + indent + "multiColor = {\n" + multiColor.toString(indent + "    ") + indent + "}\n";
        str = str + stringVectorToString("subsetNames", subsetNames, indent) + "\n";
        str = str + indent + "subsetType = ";
        if(subsetType == SUBSET_TYPE_DOMAIN)
            str = str + "SUBSET_TYPE_DOMAIN";
        if(subsetType == SUBSET_TYPE_GROUP)
            str = str + "SUBSET_TYPE_GROUP";
        if(subsetType == SUBSET_TYPE_ENUMSCALAR)
            str = str + "SUBSET_TYPE_ENUMSCALAR";
        if(subsetType == SUBSET_TYPE_MESH)
            str = str + "SUBSET_TYPE_MESH";
        if(subsetType == SUBSET_TYPE_UNKNOWN)
            str = str + "SUBSET_TYPE_UNKNOWN";
        str = str + "\n";
        str = str + doubleToString("opacity", opacity, indent) + "\n";
        str = str + boolToString("wireframe", wireframe, indent) + "\n";
        str = str + boolToString("drawInternal", drawInternal, indent) + "\n";
        str = str + intToString("smoothingLevel", smoothingLevel, indent) + "\n";
        str = str + doubleToString("pointSize", pointSize, indent) + "\n";
        str = str + intToString("pointType", pointType, indent) + "\n";
        str = str + boolToString("pointSizeVarEnabled", pointSizeVarEnabled, indent) + "\n";
        str = str + stringToString("pointSizeVar", pointSizeVar, indent) + "\n";
        str = str + intToString("pointSizePixels", pointSizePixels, indent) + "\n";
        return str;
    }


    // Attributes
    private int                colorType;
    private String             colorTableName;
    private boolean            invertColorTable;
    private boolean            legendFlag;
    private boolean            customLegendTitleEnabled;
    private String             customLegendTitle;
    private int                lineWidth;
    private ColorAttribute     singleColor;
    private ColorAttributeList multiColor;
    private Vector             subsetNames; // vector of String objects
    private int                subsetType;
    private double             opacity;
    private boolean            wireframe;
    private boolean            drawInternal;
    private int                smoothingLevel;
    private double             pointSize;
    private int pointType;
    private boolean            pointSizeVarEnabled;
    private String             pointSizeVar;
    private int                pointSizePixels;
}

