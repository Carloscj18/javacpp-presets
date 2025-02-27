// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Concrete type class for dense union data
 * 
 *  A dense union is a nested type where each logical value is taken from
 *  a single child, at a specific offset.  A buffer of 8-bit type ids
 *  indicates which child a given logical value is to be taken from,
 *  and a buffer of 32-bit offsets indicates at which physical position
 *  in the given child array the logical value is to be taken from.
 * 
 *  Unlike a sparse union, a dense union allows encoding only the child array
 *  values which are actually referred to by the union array.  This is
 *  counterbalanced by the additional footprint of the offsets buffer, and
 *  the additional indirection cost when looking up values.
 * 
 *  Note that, unlike most other types, unions don't have a top-level validity bitmap. */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class DenseUnionType extends UnionType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DenseUnionType(Pointer p) { super(p); }

  @MemberGetter public static native @Cast("const arrow::Type::type") int type_id();
  public static final int type_id = type_id();

  public static native String type_name();

  public DenseUnionType(@ByVal FieldVector fields,
                   @StdVector BytePointer type_codes) { super((Pointer)null); allocate(fields, type_codes); }
  private native void allocate(@ByVal FieldVector fields,
                   @StdVector BytePointer type_codes);
  public DenseUnionType(@ByVal FieldVector fields,
                   @StdVector ByteBuffer type_codes) { super((Pointer)null); allocate(fields, type_codes); }
  private native void allocate(@ByVal FieldVector fields,
                   @StdVector ByteBuffer type_codes);
  public DenseUnionType(@ByVal FieldVector fields,
                   @StdVector byte[] type_codes) { super((Pointer)null); allocate(fields, type_codes); }
  private native void allocate(@ByVal FieldVector fields,
                   @StdVector byte[] type_codes);

  // A constructor variant that validates input parameters
  public static native @ByVal DataTypeResult Make(
        @ByVal FieldVector fields, @StdVector BytePointer type_codes);
  public static native @ByVal DataTypeResult Make(
        @ByVal FieldVector fields, @StdVector ByteBuffer type_codes);
  public static native @ByVal DataTypeResult Make(
        @ByVal FieldVector fields, @StdVector byte[] type_codes);

  public native @StdString String name();
}
