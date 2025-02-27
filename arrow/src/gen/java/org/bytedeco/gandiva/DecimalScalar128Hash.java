// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.gandiva;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.gandiva.*;
  // namespace gandiva
@Name("std::hash<gandiva::DecimalScalar128>") @Properties(inherit = org.bytedeco.arrow.presets.gandiva.class)
public class DecimalScalar128Hash extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public DecimalScalar128Hash() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DecimalScalar128Hash(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DecimalScalar128Hash(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DecimalScalar128Hash position(long position) {
        return (DecimalScalar128Hash)super.position(position);
    }
    @Override public DecimalScalar128Hash getPointer(long i) {
        return new DecimalScalar128Hash((Pointer)this).offsetAddress(i);
    }

  public native @Cast("std::size_t") @Name("operator ()") @NoException(true) long apply(@Const @ByRef DecimalScalar128 s);
}
