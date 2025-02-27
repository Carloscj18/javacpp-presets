// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/** \class IConstantLayer
 * 
 *  \brief Layer that represents a constant value.
 *  \note This layer does not support boolean types.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @NoOffset @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IConstantLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IConstantLayer(Pointer p) { super(p); }

    /**
     *  \brief Set the weights for the layer.
     * 
     *  If weights.type is DataType::kINT32, the output is a tensor of 32-bit indices.
     *  Otherwise the output is a tensor of real values and the output type will be
     *  follow TensorRT's normal precision rules.
     * 
     *  @see getWeights()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setWeights(@ByVal Weights weights);

    /**
     *  \brief Get the weights for the layer.
     * 
     *  @see setWeights
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @ByVal @NoException(true) Weights getWeights();

    /**
     *  \brief Set the dimensions for the layer.
     * 
     *  @param dimensions The dimensions of the layer
     * 
     *  @see setDimensions
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void setDimensions(@ByVal @Cast("nvinfer1::Dims*") Dims32 dimensions);

    /**
     *  \brief Get the dimensions for the layer.
     * 
     *  @return the dimensions for the layer
     * 
     *  @see getDimensions
     *  */
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getDimensions();
}
