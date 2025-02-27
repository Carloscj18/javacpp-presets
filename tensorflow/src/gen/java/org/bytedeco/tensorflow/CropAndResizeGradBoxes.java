// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes the gradient of the crop_and_resize op wrt the input boxes tensor.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * grads: A 4-D tensor of shape {@code [num_boxes, crop_height, crop_width, depth]}.
 *  * image: A 4-D tensor of shape {@code [batch, image_height, image_width, depth]}.
 *  Both {@code image_height} and {@code image_width} need to be positive.
 *  * boxes: A 2-D tensor of shape {@code [num_boxes, 4]}. The {@code i}-th row of the tensor
 *  specifies the coordinates of a box in the {@code box_ind[i]} image and is specified
 *  in normalized coordinates {@code [y1, x1, y2, x2]}. A normalized coordinate value of
 *  {@code y} is mapped to the image coordinate at {@code y * (image_height - 1)}, so as the
 *  {@code [0, 1]} interval of normalized image height is mapped to
 *  {@code [0, image_height - 1] in image height coordinates. We do allow y1 > y2, in
 *  which case the sampled crop is an up-down flipped version of the original
 *  image. The width dimension is treated similarly. Normalized coordinates
 *  outside the }[0, 1]{@code  range are allowed, in which case we use
 *  }extrapolation_value{@code  to extrapolate the input image values.
 *  * box_ind: A 1-D tensor of shape }[num_boxes]{@code  with int32 values in }[0, batch){@code .
 *  The value of }box_ind[i]{@code  specifies the image that the }i{@code -th box refers to.
 * 
 *  Optional attributes (see }Attrs{@code ):
 *  * method: A string specifying the interpolation method. Only 'bilinear' is
 *  supported for now.
 * 
 *  Returns:
 *  * }Output{@code : A 2-D tensor of shape }[num_boxes, 4]{@code . */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class CropAndResizeGradBoxes extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CropAndResizeGradBoxes(Pointer p) { super(p); }

  /** Optional attribute setters for CropAndResizeGradBoxes */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
      @Override public Attrs getPointer(long i) {
          return new Attrs((Pointer)this).offsetAddress(i);
      }
  
    /** A string specifying the interpolation method. Only 'bilinear' is
     *  supported for now.
     * 
     *  Defaults to "bilinear" */
    public native @ByVal Attrs Method(@StringPiece BytePointer x);
    public native @ByVal Attrs Method(@StringPiece String x);

    public native @StringPiece BytePointer method_(); public native Attrs method_(BytePointer setter);
  }
  public CropAndResizeGradBoxes(@Const @ByRef Scope scope, @ByVal Input grads, @ByVal Input image, @ByVal Input boxes, @ByVal Input box_ind) { super((Pointer)null); allocate(scope, grads, image, boxes, box_ind); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input grads, @ByVal Input image, @ByVal Input boxes, @ByVal Input box_ind);
  public CropAndResizeGradBoxes(@Const @ByRef Scope scope, @ByVal Input grads, @ByVal Input image, @ByVal Input boxes, @ByVal Input box_ind, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, grads, image, boxes, box_ind, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input grads, @ByVal Input image, @ByVal Input boxes, @ByVal Input box_ind, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Method(@StringPiece BytePointer x);
  public static native @ByVal Attrs Method(@StringPiece String x);

  public native @ByRef Operation operation(); public native CropAndResizeGradBoxes operation(Operation setter);
  public native @ByRef Output output(); public native CropAndResizeGradBoxes output(Output setter);
}
