// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Concrete type class for fixed-size binary data */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class FixedSizeBinaryType extends FixedWidthType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FixedSizeBinaryType(Pointer p) { super(p); }
    public ParametricType asParametricType() { return asParametricType(this); }
    @Namespace public static native @Name("static_cast<arrow::ParametricType*>") ParametricType asParametricType(FixedSizeBinaryType pointer);

  @MemberGetter public static native @Cast("const arrow::Type::type") int type_id();
  public static final int type_id = type_id();
  @MemberGetter public static native @Cast("const bool") boolean is_utf8();
  public static final boolean is_utf8 = is_utf8();

  public static native String type_name();

  public FixedSizeBinaryType(int byte_width) { super((Pointer)null); allocate(byte_width); }
  private native void allocate(int byte_width);
  public FixedSizeBinaryType(int byte_width, @Cast("arrow::Type::type") int override_type_id) { super((Pointer)null); allocate(byte_width, override_type_id); }
  private native void allocate(int byte_width, @Cast("arrow::Type::type") int override_type_id);

  public native @StdString String ToString();
  public native @StdString String name();

  public native @ByVal DataTypeLayout layout();

  public native int byte_width();
  public native int bit_width();

  // Validating constructor
  public static native @ByVal DataTypeResult Make(int byte_width);
}
