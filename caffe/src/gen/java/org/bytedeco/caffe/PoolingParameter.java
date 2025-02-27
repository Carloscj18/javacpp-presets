// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.caffe;

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
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;

import static org.bytedeco.caffe.global.caffe.*;

// -------------------------------------------------------------------

@Namespace("caffe") @NoOffset @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class PoolingParameter extends Message {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PoolingParameter(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PoolingParameter(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public PoolingParameter position(long position) {
        return (PoolingParameter)super.position(position);
    }
    @Override public PoolingParameter getPointer(long i) {
        return new PoolingParameter((Pointer)this).offsetAddress(i);
    }

  public PoolingParameter() { super((Pointer)null); allocate(); }
  private native void allocate();

  public PoolingParameter(@Const @ByRef PoolingParameter from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef PoolingParameter from);

  public native @ByRef @Name("operator =") PoolingParameter put(@Const @ByRef PoolingParameter from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Const Descriptor descriptor();
  public static native @Const @ByRef PoolingParameter default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const PoolingParameter internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(PoolingParameter other);
  

  // implements Message ----------------------------------------------

  public native final PoolingParameter New();

  public native final PoolingParameter New(Arena arena);
  public native final void CopyFrom(@Const @ByRef Message from);
  public native final void MergeFrom(@Const @ByRef Message from);
  public native void CopyFrom(@Const @ByRef PoolingParameter from);
  public native void MergeFrom(@Const @ByRef PoolingParameter from);
  public native final void Clear();
  public native @Cast("bool") final boolean IsInitialized();

  public native @Cast("size_t") final long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") final boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native final void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") final BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") final ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") final byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native final int GetCachedSize();

  public native @ByVal final Metadata GetMetadata();

  // nested types ----------------------------------------------------
  @MemberGetter public static native @Cast("const caffe::PoolingParameter::PoolMethod") int MAX();
  public static final int MAX = MAX();
  @MemberGetter public static native @Cast("const caffe::PoolingParameter::PoolMethod") int AVE();
  public static final int AVE = AVE();
  @MemberGetter public static native @Cast("const caffe::PoolingParameter::PoolMethod") int STOCHASTIC();
  public static final int STOCHASTIC = STOCHASTIC();
  public static native @Cast("bool") boolean PoolMethod_IsValid(int value);
  @MemberGetter public static native @Cast("const caffe::PoolingParameter::PoolMethod") int PoolMethod_MIN();
  public static final int PoolMethod_MIN = PoolMethod_MIN();
  @MemberGetter public static native @Cast("const caffe::PoolingParameter::PoolMethod") int PoolMethod_MAX();
  public static final int PoolMethod_MAX = PoolMethod_MAX();
  @MemberGetter public static native int PoolMethod_ARRAYSIZE();
  public static final int PoolMethod_ARRAYSIZE = PoolMethod_ARRAYSIZE();
  public static native @Const EnumDescriptor PoolMethod_descriptor();
  public static native @StdString BytePointer PoolMethod_Name(@Cast("caffe::PoolingParameter::PoolMethod") int value);
  public static native @Cast("bool") boolean PoolMethod_Parse(@StdString BytePointer name,
        @Cast("caffe::PoolingParameter::PoolMethod*") IntPointer value);
  public static native @Cast("bool") boolean PoolMethod_Parse(@StdString String name,
        @Cast("caffe::PoolingParameter::PoolMethod*") IntBuffer value);
  public static native @Cast("bool") boolean PoolMethod_Parse(@StdString BytePointer name,
        @Cast("caffe::PoolingParameter::PoolMethod*") int[] value);
  public static native @Cast("bool") boolean PoolMethod_Parse(@StdString String name,
        @Cast("caffe::PoolingParameter::PoolMethod*") IntPointer value);
  public static native @Cast("bool") boolean PoolMethod_Parse(@StdString BytePointer name,
        @Cast("caffe::PoolingParameter::PoolMethod*") IntBuffer value);
  public static native @Cast("bool") boolean PoolMethod_Parse(@StdString String name,
        @Cast("caffe::PoolingParameter::PoolMethod*") int[] value);
  @MemberGetter public static native @Cast("const caffe::PoolingParameter::Engine") int DEFAULT();
  public static final int DEFAULT = DEFAULT();
  @MemberGetter public static native @Cast("const caffe::PoolingParameter::Engine") int CAFFE();
  public static final int CAFFE = CAFFE();
  @MemberGetter public static native @Cast("const caffe::PoolingParameter::Engine") int CUDNN();
  public static final int CUDNN = CUDNN();
  public static native @Cast("bool") boolean Engine_IsValid(int value);
  @MemberGetter public static native @Cast("const caffe::PoolingParameter::Engine") int Engine_MIN();
  public static final int Engine_MIN = Engine_MIN();
  @MemberGetter public static native @Cast("const caffe::PoolingParameter::Engine") int Engine_MAX();
  public static final int Engine_MAX = Engine_MAX();
  @MemberGetter public static native int Engine_ARRAYSIZE();
  public static final int Engine_ARRAYSIZE = Engine_ARRAYSIZE();
  public static native @Const EnumDescriptor Engine_descriptor();
  public static native @StdString BytePointer Engine_Name(@Cast("caffe::PoolingParameter::Engine") int value);
  public static native @Cast("bool") boolean Engine_Parse(@StdString BytePointer name,
        @Cast("caffe::PoolingParameter::Engine*") IntPointer value);
  public static native @Cast("bool") boolean Engine_Parse(@StdString String name,
        @Cast("caffe::PoolingParameter::Engine*") IntBuffer value);
  public static native @Cast("bool") boolean Engine_Parse(@StdString BytePointer name,
        @Cast("caffe::PoolingParameter::Engine*") int[] value);
  public static native @Cast("bool") boolean Engine_Parse(@StdString String name,
        @Cast("caffe::PoolingParameter::Engine*") IntPointer value);
  public static native @Cast("bool") boolean Engine_Parse(@StdString BytePointer name,
        @Cast("caffe::PoolingParameter::Engine*") IntBuffer value);
  public static native @Cast("bool") boolean Engine_Parse(@StdString String name,
        @Cast("caffe::PoolingParameter::Engine*") int[] value);

  // accessors -------------------------------------------------------

  // optional .caffe.PoolingParameter.PoolMethod pool = 1 [default = MAX];
  public native @Cast("bool") boolean has_pool();
  public native void clear_pool();
  @MemberGetter public static native int kPoolFieldNumber();
  public static final int kPoolFieldNumber = kPoolFieldNumber();
  public native @Cast("caffe::PoolingParameter_PoolMethod") int pool();
  public native void set_pool(@Cast("caffe::PoolingParameter_PoolMethod") int value);

  // optional uint32 kernel_size = 2;
  public native @Cast("bool") boolean has_kernel_size();
  public native void clear_kernel_size();
  @MemberGetter public static native int kKernelSizeFieldNumber();
  public static final int kKernelSizeFieldNumber = kKernelSizeFieldNumber();
  public native @Cast("google::protobuf::uint32") int kernel_size();
  public native void set_kernel_size(@Cast("google::protobuf::uint32") int value);

  // optional uint32 pad = 4 [default = 0];
  public native @Cast("bool") boolean has_pad();
  public native void clear_pad();
  @MemberGetter public static native int kPadFieldNumber();
  public static final int kPadFieldNumber = kPadFieldNumber();
  public native @Cast("google::protobuf::uint32") int pad();
  public native void set_pad(@Cast("google::protobuf::uint32") int value);

  // optional uint32 kernel_h = 5;
  public native @Cast("bool") boolean has_kernel_h();
  public native void clear_kernel_h();
  @MemberGetter public static native int kKernelHFieldNumber();
  public static final int kKernelHFieldNumber = kKernelHFieldNumber();
  public native @Cast("google::protobuf::uint32") int kernel_h();
  public native void set_kernel_h(@Cast("google::protobuf::uint32") int value);

  // optional uint32 kernel_w = 6;
  public native @Cast("bool") boolean has_kernel_w();
  public native void clear_kernel_w();
  @MemberGetter public static native int kKernelWFieldNumber();
  public static final int kKernelWFieldNumber = kKernelWFieldNumber();
  public native @Cast("google::protobuf::uint32") int kernel_w();
  public native void set_kernel_w(@Cast("google::protobuf::uint32") int value);

  // optional uint32 stride_h = 7;
  public native @Cast("bool") boolean has_stride_h();
  public native void clear_stride_h();
  @MemberGetter public static native int kStrideHFieldNumber();
  public static final int kStrideHFieldNumber = kStrideHFieldNumber();
  public native @Cast("google::protobuf::uint32") int stride_h();
  public native void set_stride_h(@Cast("google::protobuf::uint32") int value);

  // optional uint32 stride_w = 8;
  public native @Cast("bool") boolean has_stride_w();
  public native void clear_stride_w();
  @MemberGetter public static native int kStrideWFieldNumber();
  public static final int kStrideWFieldNumber = kStrideWFieldNumber();
  public native @Cast("google::protobuf::uint32") int stride_w();
  public native void set_stride_w(@Cast("google::protobuf::uint32") int value);

  // optional uint32 pad_h = 9 [default = 0];
  public native @Cast("bool") boolean has_pad_h();
  public native void clear_pad_h();
  @MemberGetter public static native int kPadHFieldNumber();
  public static final int kPadHFieldNumber = kPadHFieldNumber();
  public native @Cast("google::protobuf::uint32") int pad_h();
  public native void set_pad_h(@Cast("google::protobuf::uint32") int value);

  // optional uint32 pad_w = 10 [default = 0];
  public native @Cast("bool") boolean has_pad_w();
  public native void clear_pad_w();
  @MemberGetter public static native int kPadWFieldNumber();
  public static final int kPadWFieldNumber = kPadWFieldNumber();
  public native @Cast("google::protobuf::uint32") int pad_w();
  public native void set_pad_w(@Cast("google::protobuf::uint32") int value);

  // optional .caffe.PoolingParameter.Engine engine = 11 [default = DEFAULT];
  public native @Cast("bool") boolean has_engine();
  public native void clear_engine();
  @MemberGetter public static native int kEngineFieldNumber();
  public static final int kEngineFieldNumber = kEngineFieldNumber();
  public native @Cast("caffe::PoolingParameter_Engine") int engine();
  public native void set_engine(@Cast("caffe::PoolingParameter_Engine") int value);

  // optional bool global_pooling = 12 [default = false];
  public native @Cast("bool") boolean has_global_pooling();
  public native void clear_global_pooling();
  @MemberGetter public static native int kGlobalPoolingFieldNumber();
  public static final int kGlobalPoolingFieldNumber = kGlobalPoolingFieldNumber();
  public native @Cast("bool") boolean global_pooling();
  public native void set_global_pooling(@Cast("bool") boolean value);

  // optional uint32 stride = 3 [default = 1];
  public native @Cast("bool") boolean has_stride();
  public native void clear_stride();
  @MemberGetter public static native int kStrideFieldNumber();
  public static final int kStrideFieldNumber = kStrideFieldNumber();
  public native @Cast("google::protobuf::uint32") int stride();
  public native void set_stride(@Cast("google::protobuf::uint32") int value);
}
