package com.bobmowzie.mowziesmobs.client.model.tools;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

@SideOnly(Side.CLIENT)
public class MowzieModelRenderer extends ModelRenderer
{
    public float initRotateAngleX;
    public float initRotateAngleY;
    public float initRotateAngleZ;

    public float initRotationPointX;
    public float initRotationPointY;
    public float initRotationPointZ;

    protected int textureOffsetX;
    protected int textureOffsetY;

    public MowzieModelRenderer(ModelBase modelBase, String name)
    {
        super(modelBase, name);
    }

    public MowzieModelRenderer(ModelBase modelBase, int x, int y)
    {
        super(modelBase, x, y);
    }

    public MowzieModelRenderer(ModelBase modelBase)
    {
        super(modelBase);
    }

    public void setInitValuesToCurrentPose()
    {
        initRotateAngleX = rotateAngleX;
        initRotateAngleY = rotateAngleY;
        initRotateAngleZ = rotateAngleZ;

        initRotationPointX = rotationPointX;
        initRotationPointY = rotationPointY;
        initRotationPointZ = rotationPointZ;
    }

    public void setCurrentPoseToInitValues()
    {
        rotateAngleX = initRotateAngleX;
        rotateAngleY = initRotateAngleY;
        rotateAngleZ = initRotateAngleZ;

        rotationPointX = initRotationPointX;
        rotationPointY = initRotationPointY;
        rotationPointZ = initRotationPointZ;
    }

    public void setRotationAngles(float x, float y, float z)
    {
        rotateAngleX = x;
        rotateAngleY = y;
        rotateAngleZ = z;
    }

    /**
     * Resets all rotation points.
     */
    public void resetAllRotationPoints()
    {
        rotationPointX = initRotationPointX;
        rotationPointY = initRotationPointY;
        rotationPointZ = initRotationPointZ;
    }

    /**
     * Resets X rotation point.
     */
    public void resetXRotationPoints()
    {
        rotationPointX = initRotationPointX;
    }

    /**
     * Resets Y rotation point.
     */
    public void resetYRotationPoints()
    {
        rotationPointY = initRotationPointY;
    }

    /**
     * Resets Z rotation point.
     */
    public void resetZRotationPoints()
    {
        rotationPointZ = initRotationPointZ;
    }

    /**
     * Resets all rotations.
     */
    public void resetAllRotations()
    {
        rotateAngleX = initRotateAngleX;
        rotateAngleY = initRotateAngleY;
        rotateAngleZ = initRotateAngleZ;
    }

    /**
     * Resets X rotation.
     */
    public void resetXRotations()
    {
        rotateAngleX = initRotateAngleX;
    }

    /**
     * Resets Y rotation.
     */
    public void resetYRotations()
    {
        rotateAngleY = initRotateAngleY;
    }

    /**
     * Resets Z rotation.
     */
    public void resetZRotations()
    {
        rotateAngleZ = initRotateAngleZ;
    }

    /**
     * Copies the rotation point coordinates.
     */
    public void copyAllRotationPoints(MowzieModelRenderer target)
    {
        rotationPointX = target.rotationPointX;
        rotationPointY = target.rotationPointY;
        rotationPointZ = target.rotationPointZ;
    }

    /**
     * Copies X rotation point.
     */
    public void copyXRotationPoint(MowzieModelRenderer target)
    {
        rotationPointX = target.rotationPointX;
    }

    /**
     * Copies Y rotation point.
     */
    public void copyYRotationPoint(MowzieModelRenderer target)
    {
        rotationPointY = target.rotationPointY;
    }

    /**
     * Copies Z rotation point.
     */
    public void copyZRotationPoint(MowzieModelRenderer target)
    {
        rotationPointZ = target.rotationPointZ;
    }

    @Override
    public ModelRenderer setTextureOffset(int textureOffsetX, int textureOffsetY) {
    	this.textureOffsetX = textureOffsetX;
    	this.textureOffsetY = textureOffsetY;
    	return super.setTextureOffset(textureOffsetX, textureOffsetY);
    }

    public void add3DTexture(float posX, float posY, float posZ, int width, int height)
    {
    	cubeList.add(new Model3DTexture(this, textureOffsetX, textureOffsetY, posX, posY, posZ, width, height));
    }
}