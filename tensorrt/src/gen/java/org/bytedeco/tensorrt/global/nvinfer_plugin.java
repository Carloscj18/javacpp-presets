// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.global;

import org.bytedeco.tensorrt.nvinfer_plugin.*;

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
import org.bytedeco.tensorrt.nvinfer.*;
import static org.bytedeco.tensorrt.global.nvinfer.*;

public class nvinfer_plugin extends org.bytedeco.tensorrt.presets.nvinfer_plugin {
    static { Loader.load(); }

// Parsed from NvInferPlugin.h

/*
 * Copyright 1993-2021 NVIDIA Corporation.  All rights reserved.
 *
 * NOTICE TO LICENSEE:
 *
 * This source code and/or documentation ("Licensed Deliverables") are
 * subject to NVIDIA intellectual property rights under U.S. and
 * international Copyright laws.
 *
 * These Licensed Deliverables contained herein is PROPRIETARY and
 * CONFIDENTIAL to NVIDIA and is being provided under the terms and
 * conditions of a form of NVIDIA software license agreement by and
 * between NVIDIA and Licensee ("License Agreement") or electronically
 * accepted by Licensee.  Notwithstanding any terms or conditions to
 * the contrary in the License Agreement, reproduction or disclosure
 * of the Licensed Deliverables to any third party without the express
 * written consent of NVIDIA is prohibited.
 *
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, NVIDIA MAKES NO REPRESENTATION ABOUT THE
 * SUITABILITY OF THESE LICENSED DELIVERABLES FOR ANY PURPOSE.  IT IS
 * PROVIDED "AS IS" WITHOUT EXPRESS OR IMPLIED WARRANTY OF ANY KIND.
 * NVIDIA DISCLAIMS ALL WARRANTIES WITH REGARD TO THESE LICENSED
 * DELIVERABLES, INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY,
 * NONINFRINGEMENT, AND FITNESS FOR A PARTICULAR PURPOSE.
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, IN NO EVENT SHALL NVIDIA BE LIABLE FOR ANY
 * SPECIAL, INDIRECT, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, OR ANY
 * DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS,
 * WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS
 * ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE
 * OF THESE LICENSED DELIVERABLES.
 *
 * U.S. Government End Users.  These Licensed Deliverables are a
 * "commercial item" as that term is defined at 48 C.F.R. 2.101 (OCT
 * 1995), consisting of "commercial computer software" and "commercial
 * computer software documentation" as such terms are used in 48
 * C.F.R. 12.212 (SEPT 1995) and is provided to the U.S. Government
 * only as a commercial end item.  Consistent with 48 C.F.R.12.212 and
 * 48 C.F.R. 227.7202-1 through 227.7202-4 (JUNE 1995), all
 * U.S. Government End Users acquire the Licensed Deliverables with
 * only those rights set forth herein.
 *
 * Any use of the Licensed Deliverables in individual and commercial
 * software must include, in the user documentation and internal
 * comments to the code, the above Disclaimer and U.S. Government End
 * Users Notice.
 */

// #ifndef NV_INFER_PLUGIN_H
// #define NV_INFER_PLUGIN_H

// #include "NvInfer.h"

//!
//!
//!
// #include "NvInferPluginUtils.h"
/**
 *  \file NvInferPlugin.h
 * 
 *  This is the API for the Nvidia provided TensorRT plugins.
 *  */
    /**
     *  \brief Create a plugin layer that fuses the RPN and ROI pooling using user-defined parameters.
     *  Registered plugin type "RPROI_TRT". Registered plugin version "1".
     *  @param featureStride Feature stride.
     *  @param preNmsTop Number of proposals to keep before applying NMS.
     *  @param nmsMaxOut Number of remaining proposals after applying NMS.
     *  @param iouThreshold IoU threshold.
     *  @param minBoxSize Minimum allowed bounding box size before scaling.
     *  @param spatialScale Spatial scale between the input image and the last feature map.
     *  @param pooling Spatial dimensions of pooled ROIs.
     *  @param anchorRatios Aspect ratios for generating anchor windows.
     *  @param anchorScales Scales for generating anchor windows.
     * 
     *  @return Returns a FasterRCNN fused RPN+ROI pooling plugin. Returns nullptr on invalid inputs.
     *  */
    
    
    //!
    //!
    public static native IPluginV2 createRPNROIPlugin(int featureStride, int preNmsTop, int nmsMaxOut,
            float iouThreshold, float minBoxSize, float spatialScale, @ByVal DimsHW pooling,
            @ByVal Weights anchorRatios, @ByVal Weights anchorScales);

    /**
     *  \brief The Normalize plugin layer normalizes the input to have L2 norm of 1 with scale learnable.
     *  Registered plugin type "Normalize_TRT". Registered plugin version "1".
     *  @param scales Scale weights that are applied to the output tensor.
     *  @param acrossSpatial Whether to compute the norm over adjacent channels (acrossSpatial is true) or nearby
     *  spatial locations (within channel in which case acrossSpatial is false).
     *  @param channelShared Whether the scale weight(s) is shared across channels.
     *  @param eps Epsilon for not dividing by zero.
     *  */
    
    
    //!
    //!
    public static native IPluginV2 createNormalizePlugin(
            @Const Weights scales, @Cast("bool") boolean acrossSpatial, @Cast("bool") boolean channelShared, float eps);

    /**
     *  \brief The PriorBox plugin layer generates the prior boxes of designated sizes and aspect ratios across all
     *  dimensions (H x W). PriorBoxParameters defines a set of parameters for creating the PriorBox plugin layer.
     *  Registered plugin type "PriorBox_TRT". Registered plugin version "1".
     *  */
    
    
    //!
    //!
    public static native IPluginV2 createPriorBoxPlugin(@ByVal PriorBoxParameters param);

    /**
     *  \brief The Grid Anchor Generator plugin layer generates the prior boxes of
     *  designated sizes and aspect ratios across all dimensions (H x W) for all feature maps.
     *  GridAnchorParameters defines a set of parameters for creating the GridAnchorGenerator plugin layer.
     *  Registered plugin type "GridAnchor_TRT". Registered plugin version "1".
     *  */
    
    
    //!
    //!
    public static native IPluginV2 createAnchorGeneratorPlugin(
            GridAnchorParameters param, int numLayers);

    /**
     *  \brief The DetectionOutput plugin layer generates the detection output based on location and confidence
     *  predictions by doing non maximum suppression. DetectionOutputParameters defines a set of parameters for creating
     *  the DetectionOutput plugin layer. Registered plugin type "NMS_TRT". Registered plugin version "1".
     *  */
    
    
    //!
    //!
    public static native IPluginV2 createNMSPlugin(@ByVal DetectionOutputParameters param);

    /**
     *  \brief The Reorg plugin reshapes input of shape CxHxW into a (C*stride*stride)x(H/stride)x(W/stride) shape, used
     *  in YOLOv2. It does that by taking 1 x stride x stride slices from tensor and flattening them into
     *  (stride x stride) x 1 x 1 shape. Registered plugin type "Reorg_TRT". Registered plugin version "1".
     *  @param stride Strides in H and W, it should divide both H and W. Also stride * stride should be less than or equal to C.
     *  */
    
    
    //!
    //!
    public static native IPluginV2 createReorgPlugin(int stride);

    /**
     *  \brief The Region plugin layer performs region proposal calculation: generate 5 bounding boxes per cell (for
     *  yolo9000, generate 3 bounding boxes per cell). For each box, calculating its probablities of objects detections
     *  from 80 pre-defined classifications (yolo9000 has 9416 pre-defined classifications, and these 9416 items are
     *  organized as work-tree structure). RegionParameters defines a set of parameters for creating the Region plugin
     *  layer. Registered plugin type "Region_TRT". Registered plugin version "1".
     *  */
    
    
    //!
    //!
    //!
    //!
    public static native IPluginV2 createRegionPlugin(@ByVal RegionParameters params);

    /**
     *  \brief The BatchedNMS Plugin performs non_max_suppression on the input boxes, per batch, across all classes.
     *  It greedily selects a subset of bounding boxes in descending order of
     *  score. Prunes away boxes that have a high intersection-over-union (IOU)
     *  overlap with previously selected boxes. Bounding boxes are supplied as [y1, x1, y2, x2],
     *  where (y1, x1) and (y2, x2) are the coordinates of any
     *  diagonal pair of box corners and the coordinates can be provided as normalized
     *  (i.e., lying in the interval [0, 1]) or absolute.
     *  The plugin expects two inputs.
     *  Input0 is expected to be 4-D float boxes tensor of shape [batch_size, num_boxes,
     *  q, 4], where q can be either 1 (if shareLocation is true) or num_classes.
     *  Input1 is expected to be a 3-D float scores tensor of shape [batch_size, num_boxes, num_classes]
     *  representing a single score corresponding to each box.
     *  The plugin returns four outputs.
     *  num_detections : A [batch_size] int32 tensor indicating the number of valid
     *  detections per batch item. Can be less than keepTopK. Only the top num_detections[i] entries in
     *  nmsed_boxes[i], nmsed_scores[i] and nmsed_classes[i] are valid.
     *  nmsed_boxes : A [batch_size, max_detections, 4] float32 tensor containing
     *  the co-ordinates of non-max suppressed boxes.
     *  nmsed_scores : A [batch_size, max_detections] float32 tensor containing the
     *  scores for the boxes.
     *  nmsed_classes :  A [batch_size, max_detections] float32 tensor containing the
     *  classes for the boxes.
     * 
     *  Registered plugin type "BatchedNMS_TRT". Registered plugin version "1".
     * 
     *  The batched NMS plugin can require a lot of workspace due to intermediate buffer usage. To get the
     *  estimated workspace size for the plugin for a batch size, use the API {@code plugin->getWorkspaceSize(batchSize)}.
     *  */
    
    
    //!
    //!
    public static native IPluginV2 createBatchedNMSPlugin(@ByVal NMSParameters param);

    /**
     *  \brief The Split Plugin performs a split operation on the input tensor. It
     *  splits the input tensor into several output tensors, each of a length corresponding to output_lengths.
     *  The split occurs along the axis specified by axis.
     *  @param axis The axis to split on.
     *  @param output_lengths The lengths of the output tensors.
     *  @param noutput The number of output tensors.
     *  */
    
    
    //!
    //!
    public static native IPluginV2 createSplitPlugin(int axis, IntPointer output_lengths, int noutput);
    public static native IPluginV2 createSplitPlugin(int axis, IntBuffer output_lengths, int noutput);
    public static native IPluginV2 createSplitPlugin(int axis, int[] output_lengths, int noutput);

    /**
     *  \brief The Instance Normalization Plugin computes the instance normalization of an input tensor.
     *  The instance normalization is calculated as found in the paper https://arxiv.org/abs/1607.08022.
     *  The calculation is y = scale * (x - mean) / sqrt(variance + epsilon) + bias where mean and variance
     *  are computed per instance per channel.
     *  @param epsilon The epsilon value to use to avoid division by zero.
     *  @param scale_weights The input 1-dimensional scale weights of size C to scale.
     *  @param bias_weights The input 1-dimensional bias weights of size C to offset.
     *  */
    
    
    //!
    //!
    public static native IPluginV2 createInstanceNormalizationPlugin(
            float epsilon, @ByVal Weights scale_weights, @ByVal Weights bias_weights);

    /**
     *  \brief Initialize and register all the existing TensorRT plugins to the Plugin Registry with an optional
     *  namespace. The plugin library author should ensure that this function name is unique to the library. This
     *  function should be called once before accessing the Plugin Registry.
     *  @param logger Logger object to print plugin registration information
     *  @param libNamespace Namespace used to register all the plugins in this library
     *  */
    public static native @Cast("bool") boolean initLibNvInferPlugins(Pointer logger, String libNamespace);
    public static native @Cast("bool") boolean initLibNvInferPlugins(Pointer logger, @Cast("const char*") BytePointer libNamespace); // extern "C"

// #endif // NV_INFER_PLUGIN_H


// Parsed from NvInferPluginUtils.h

/*
 * Copyright 1993-2021 NVIDIA Corporation.  All rights reserved.
 *
 * NOTICE TO LICENSEE:
 *
 * This source code and/or documentation ("Licensed Deliverables") are
 * subject to NVIDIA intellectual property rights under U.S. and
 * international Copyright laws.
 *
 * These Licensed Deliverables contained herein is PROPRIETARY and
 * CONFIDENTIAL to NVIDIA and is being provided under the terms and
 * conditions of a form of NVIDIA software license agreement by and
 * between NVIDIA and Licensee ("License Agreement") or electronically
 * accepted by Licensee.  Notwithstanding any terms or conditions to
 * the contrary in the License Agreement, reproduction or disclosure
 * of the Licensed Deliverables to any third party without the express
 * written consent of NVIDIA is prohibited.
 *
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, NVIDIA MAKES NO REPRESENTATION ABOUT THE
 * SUITABILITY OF THESE LICENSED DELIVERABLES FOR ANY PURPOSE.  IT IS
 * PROVIDED "AS IS" WITHOUT EXPRESS OR IMPLIED WARRANTY OF ANY KIND.
 * NVIDIA DISCLAIMS ALL WARRANTIES WITH REGARD TO THESE LICENSED
 * DELIVERABLES, INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY,
 * NONINFRINGEMENT, AND FITNESS FOR A PARTICULAR PURPOSE.
 * NOTWITHSTANDING ANY TERMS OR CONDITIONS TO THE CONTRARY IN THE
 * LICENSE AGREEMENT, IN NO EVENT SHALL NVIDIA BE LIABLE FOR ANY
 * SPECIAL, INDIRECT, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, OR ANY
 * DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS,
 * WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS
 * ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE
 * OF THESE LICENSED DELIVERABLES.
 *
 * U.S. Government End Users.  These Licensed Deliverables are a
 * "commercial item" as that term is defined at 48 C.F.R. 2.101 (OCT
 * 1995), consisting of "commercial computer software" and "commercial
 * computer software documentation" as such terms are used in 48
 * C.F.R. 12.212 (SEPT 1995) and is provided to the U.S. Government
 * only as a commercial end item.  Consistent with 48 C.F.R.12.212 and
 * 48 C.F.R. 227.7202-1 through 227.7202-4 (JUNE 1995), all
 * U.S. Government End Users acquire the Licensed Deliverables with
 * only those rights set forth herein.
 *
 * Any use of the Licensed Deliverables in individual and commercial
 * software must include, in the user documentation and internal
 * comments to the code, the above Disclaimer and U.S. Government End
 * Users Notice.
 */

// #ifndef NV_INFER_PLUGIN_UTILS_H
// #define NV_INFER_PLUGIN_UTILS_H



//!
//!
//!
// #include "NvInferRuntimeCommon.h"

/**
 *  \file NvInferPluginUtils.h
 * 
 *  This is the API for the Nvidia provided TensorRT plugin utilities.
 *  It lists all the parameters utilized by the TensorRT plugins.
 *  */
// Targeting ../nvinfer_plugin/Quadruple.java


// Targeting ../nvinfer_plugin/PriorBoxParameters.java


// Targeting ../nvinfer_plugin/RPROIParams.java


// Targeting ../nvinfer_plugin/GridAnchorParameters.java



/**
 *  \enum CodeTypeSSD
 *  \brief The type of encoding used for decoding the bounding boxes and loc_data.
 *  */
@Namespace("nvinfer1::plugin") public enum CodeTypeSSD {
    /** Use box corners. */
    CORNER(0),
    /** Use box centers and size. */
    CENTER_SIZE(1),
    /** Use box centers and size. */
    CORNER_SIZE(2),
    /** Use box centers and size but flip x and y coordinates. */
    TF_CENTER(3);

    public final int value;
    private CodeTypeSSD(int v) { this.value = v; }
    private CodeTypeSSD(CodeTypeSSD e) { this.value = e.value; }
    public CodeTypeSSD intern() { for (CodeTypeSSD e : values()) if (e.value == value) return e; return this; }
    @Override public String toString() { return intern().name(); }
}
// Targeting ../nvinfer_plugin/DetectionOutputParameters.java


// Targeting ../nvinfer_plugin/softmaxTree.java


// Targeting ../nvinfer_plugin/RegionParameters.java


// Targeting ../nvinfer_plugin/NMSParameters.java



 // namespace plugin
 // namespace nvinfer1

// #endif // NV_INFER_PLUGIN_UTILS_H


}
