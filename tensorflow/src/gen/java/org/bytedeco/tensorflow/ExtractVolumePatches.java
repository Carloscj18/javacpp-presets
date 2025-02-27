// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Extract {@code patches} from {@code input} and put them in the "depth" output dimension. 3D extension of {@code extract_image_patches}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: 5-D Tensor with shape {@code [batch, in_planes, in_rows, in_cols, depth]}.
 *  * ksizes: The size of the sliding window for each dimension of {@code input}.
 *  * strides: 1-D of length 5. How far the centers of two consecutive patches are in
 *  {@code input}. Must be: {@code [1, stride_planes, stride_rows, stride_cols, 1]}.
 *  * padding: The type of padding algorithm to use.
 * 
 *  We specify the size-related attributes as:
 * 
 *  <pre>{@code python
 *        ksizes = [1, ksize_planes, ksize_rows, ksize_cols, 1]
 *        strides = [1, stride_planes, strides_rows, strides_cols, 1]
 *  }</pre>
 * 
 *  Returns:
 *  * {@code Output}: 5-D Tensor with shape {@code [batch, out_planes, out_rows, out_cols,
 *  ksize_planes * ksize_rows * ksize_cols * depth]} containing patches
 *  with size {@code ksize_planes x ksize_rows x ksize_cols x depth} vectorized
 *  in the "depth" dimension. Note {@code out_planes}, {@code out_rows} and {@code out_cols}
 *  are the dimensions of the output patches. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ExtractVolumePatches extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ExtractVolumePatches(Pointer p) { super(p); }

  public ExtractVolumePatches(@Const @ByRef Scope scope, @ByVal Input input, @ArraySlice IntPointer ksizes, @ArraySlice IntPointer strides, @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input, ksizes, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ArraySlice IntPointer ksizes, @ArraySlice IntPointer strides, @StringPiece BytePointer padding);
  public ExtractVolumePatches(@Const @ByRef Scope scope, @ByVal Input input, @ArraySlice IntBuffer ksizes, @ArraySlice IntBuffer strides, @StringPiece String padding) { super((Pointer)null); allocate(scope, input, ksizes, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ArraySlice IntBuffer ksizes, @ArraySlice IntBuffer strides, @StringPiece String padding);
  public ExtractVolumePatches(@Const @ByRef Scope scope, @ByVal Input input, @ArraySlice int[] ksizes, @ArraySlice int[] strides, @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input, ksizes, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ArraySlice int[] ksizes, @ArraySlice int[] strides, @StringPiece BytePointer padding);
  public ExtractVolumePatches(@Const @ByRef Scope scope, @ByVal Input input, @ArraySlice IntPointer ksizes, @ArraySlice IntPointer strides, @StringPiece String padding) { super((Pointer)null); allocate(scope, input, ksizes, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ArraySlice IntPointer ksizes, @ArraySlice IntPointer strides, @StringPiece String padding);
  public ExtractVolumePatches(@Const @ByRef Scope scope, @ByVal Input input, @ArraySlice IntBuffer ksizes, @ArraySlice IntBuffer strides, @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input, ksizes, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ArraySlice IntBuffer ksizes, @ArraySlice IntBuffer strides, @StringPiece BytePointer padding);
  public ExtractVolumePatches(@Const @ByRef Scope scope, @ByVal Input input, @ArraySlice int[] ksizes, @ArraySlice int[] strides, @StringPiece String padding) { super((Pointer)null); allocate(scope, input, ksizes, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ArraySlice int[] ksizes, @ArraySlice int[] strides, @StringPiece String padding);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native ExtractVolumePatches operation(Operation setter);
  public native @ByRef Output patches(); public native ExtractVolumePatches patches(Output setter);
}
