// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;


/**
 * Specify properties for StereoDepth
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class StereoDepthProperties extends StereoDepthPropertiesSerializable {
    static { Loader.load(); }
    /** Default native constructor. */
    public StereoDepthProperties() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public StereoDepthProperties(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StereoDepthProperties(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public StereoDepthProperties position(long position) {
        return (StereoDepthProperties)super.position(position);
    }
    @Override public StereoDepthProperties getPointer(long i) {
        return new StereoDepthProperties((Pointer)this).offsetAddress(i);
    }

    @MemberGetter public static native @Cast("const std::int32_t") int AUTO();
    public static final int AUTO = AUTO();

    public static class RectificationMesh extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public RectificationMesh() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public RectificationMesh(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public RectificationMesh(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public RectificationMesh position(long position) {
            return (RectificationMesh)super.position(position);
        }
        @Override public RectificationMesh getPointer(long i) {
            return new RectificationMesh((Pointer)this).offsetAddress(i);
        }
    
        /**
         * Uri which points to the mesh array for 'left' input rectification
         */
        public native @StdString BytePointer meshLeftUri(); public native RectificationMesh meshLeftUri(BytePointer setter);
        /**
         * Uri which points to the mesh array for 'right' input rectification
         */
        public native @StdString BytePointer meshRightUri(); public native RectificationMesh meshRightUri(BytePointer setter);
        /**
         * Mesh array size in bytes, for each of 'left' and 'right' (need to match)
         */
        public native @ByRef @Cast("tl::optional<std::uint32_t>*") IntOptional meshSize(); public native RectificationMesh meshSize(IntOptional setter);
        /**
         * Distance between mesh points, in the horizontal direction
         */
        public native @Cast("uint16_t") short stepWidth(); public native RectificationMesh stepWidth(short setter);
        /**
         * Distance between mesh points, in the vertical direction
         */
        public native @Cast("uint16_t") short stepHeight(); public native RectificationMesh stepHeight(short setter);
    }

    /** Initial stereo config */
    public native @ByRef RawStereoDepthConfig initialConfig(); public native StereoDepthProperties initialConfig(RawStereoDepthConfig setter);

    /**
     * Which camera to align disparity/depth to.
     * When configured (not AUTO), takes precedence over 'depthAlign'
     */
    public native CameraBoardSocket depthAlignCamera(); public native StereoDepthProperties depthAlignCamera(CameraBoardSocket setter);

    public native @Cast("bool") boolean enableRectification(); public native StereoDepthProperties enableRectification(boolean setter);

    /**
     * Fill color for missing data at frame edges - grayscale 0..255, or -1 to replicate pixels
     */
    public native @Cast("std::int32_t") int rectifyEdgeFillColor(); public native StereoDepthProperties rectifyEdgeFillColor(int setter);
    /**
     * Input frame width. Optional (taken from MonoCamera nodes if they exist)
     */
    public native @ByRef @Cast("tl::optional<std::int32_t>*") IntOptional width(); public native StereoDepthProperties width(IntOptional setter);
    /**
     * Input frame height. Optional (taken from MonoCamera nodes if they exist)
     */
    public native @ByRef @Cast("tl::optional<std::int32_t>*") IntOptional height(); public native StereoDepthProperties height(IntOptional setter);
    /**
     * Output disparity/depth width. Currently only used when aligning to RGB
     */
    public native @ByRef @Cast("tl::optional<std::int32_t>*") IntOptional outWidth(); public native StereoDepthProperties outWidth(IntOptional setter);
    /**
     * Output disparity/depth height. Currently only used when aligning to RGB
     */
    public native @ByRef @Cast("tl::optional<std::int32_t>*") IntOptional outHeight(); public native StereoDepthProperties outHeight(IntOptional setter);
    /**
     * Whether to keep aspect ratio of the input (rectified) or not
     */
    public native @Cast("bool") boolean outKeepAspectRatio(); public native StereoDepthProperties outKeepAspectRatio(boolean setter);

    /**
     * Specify a direct warp mesh to be used for rectification,
     * instead of intrinsics + extrinsic matrices
     */
    public native @ByRef RectificationMesh mesh(); public native StereoDepthProperties mesh(RectificationMesh setter);

    /**
     * Whether to enable switching stereo modes at runtime or not.
     * E.g. standard to subpixel, standard+LR-check to subpixel + LR-check.
     * Note: It will allocate resources for worst cases scenario,
     * should be enabled only if dynamic mode switch is required.
     * Default value: false.
     */
    public native @Cast("bool") boolean enableRuntimeStereoModeSwitch(); public native StereoDepthProperties enableRuntimeStereoModeSwitch(boolean setter);

    /** Num frames in output pool */
    public native int numFramesPool(); public native StereoDepthProperties numFramesPool(int setter);

    /**
     * Number of shaves reserved for stereo depth post processing.
     * Post processing can use multiple shaves to increase performance.
     * -1 means auto, resources will be allocated based on enabled filters.
     * 0 means that it will reuse the shave assigned for main stereo algorithm.
     * For optimal performance it's recommended to allocate more than 0,
     * so post processing will run in parallel with main stereo algorithm.
     */
    public native @Cast("std::int32_t") int numPostProcessingShaves(); public native StereoDepthProperties numPostProcessingShaves(int setter);

    /**
     * Number of memory slices reserved for stereo depth post processing.
     * -1 means auto, memory will be allocated based on initial stereo settings and number of shaves.
     * 0 means that it will reuse the memory slices assigned for main stereo algorithm.
     * For optimal performance it's recommended to allocate more than 0,
     * so post processing will run in parallel with main stereo algorithm.
     */
    public native @Cast("std::int32_t") int numPostProcessingMemorySlices(); public native StereoDepthProperties numPostProcessingMemorySlices(int setter);
}
