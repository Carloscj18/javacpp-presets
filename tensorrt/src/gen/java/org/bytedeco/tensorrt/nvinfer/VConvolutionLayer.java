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


@Namespace("nvinfer1::apiv") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class VConvolutionLayer extends VRoot {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VConvolutionLayer(Pointer p) { super(p); }

    public native @NoException(true) void setKernelSize(@ByVal DimsHW kernelSize);
    public native @ByVal @NoException(true) DimsHW getKernelSize();
    public native @NoException(true) void setNbOutputMaps(int nbOutputMaps);
    public native @NoException(true) int getNbOutputMaps();
    public native @NoException(true) void setStride(@ByVal DimsHW stride);
    public native @ByVal @NoException(true) DimsHW getStride();
    public native @NoException(true) void setPadding(@ByVal DimsHW padding);
    public native @ByVal @NoException(true) DimsHW getPadding();
    public native @NoException(true) void setNbGroups(int nbGroups);
    public native @NoException(true) int getNbGroups();
    public native @NoException(true) void setKernelWeights(@ByVal Weights weights);
    public native @ByVal @NoException(true) Weights getKernelWeights();
    public native @NoException(true) void setBiasWeights(@ByVal Weights weights);
    public native @ByVal @NoException(true) Weights getBiasWeights();
    public native @NoException(true) void setDilation(@ByVal DimsHW dilation);
    public native @ByVal @NoException(true) DimsHW getDilation();
    public native @NoException(true) void setPrePadding(@ByVal @Cast("nvinfer1::Dims*") Dims32 padding);
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getPrePadding();
    public native @NoException(true) void setPostPadding(@ByVal @Cast("nvinfer1::Dims*") Dims32 padding);
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getPostPadding();
    public native @NoException(true) void setPaddingMode(PaddingMode paddingMode);
    public native @NoException(true) void setPaddingMode(@Cast("nvinfer1::PaddingMode") int paddingMode);
    public native @NoException(true) PaddingMode getPaddingMode();
    public native @NoException(true) void setKernelSizeNd(@ByVal @Cast("nvinfer1::Dims*") Dims32 kernelSize);
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getKernelSizeNd();
    public native @NoException(true) void setStrideNd(@ByVal @Cast("nvinfer1::Dims*") Dims32 stride);
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getStrideNd();
    public native @NoException(true) void setPaddingNd(@ByVal @Cast("nvinfer1::Dims*") Dims32 padding);
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getPaddingNd();
    public native @NoException(true) void setDilationNd(@ByVal @Cast("nvinfer1::Dims*") Dims32 dilation);
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getDilationNd();
}
