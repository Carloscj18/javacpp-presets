// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Kernel data structure for implementations of
 *  HashAggregateFunction. The four necessary components of an aggregation
 *  kernel are the init, consume, merge, and finalize functions.
 * 
 *  * init: creates a new KernelState for a kernel.
 *  * resize: ensure that the KernelState can accommodate the specified number of groups.
 *  * consume: processes an ExecBatch (which includes the argument as well
 *    as an array of group identifiers) and updates the KernelState found in the
 *    KernelContext.
 *  * merge: combines one KernelState with another.
 *  * finalize: produces the end result of the aggregation using the
 *    KernelState in the KernelContext. */
@Namespace("arrow::compute") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class HashAggregateKernel extends Kernel {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HashAggregateKernel(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public HashAggregateKernel(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public HashAggregateKernel position(long position) {
        return (HashAggregateKernel)super.position(position);
    }
    @Override public HashAggregateKernel getPointer(long i) {
        return new HashAggregateKernel((Pointer)this).offsetAddress(i);
    }

  public HashAggregateKernel() { super((Pointer)null); allocate(); }
  private native void allocate();

  public HashAggregateKernel(@SharedPtr @Cast({"", "std::shared_ptr<arrow::compute::KernelSignature>"}) KernelSignature sig, @ByVal @Cast("arrow::compute::KernelInit*") Pointer init,
                        @ByVal @Cast("arrow::compute::HashAggregateResize*") Pointer resize, @ByVal @Cast("arrow::compute::HashAggregateConsume*") Pointer consume,
                        @ByVal @Cast("arrow::compute::HashAggregateMerge*") Pointer merge, @ByVal @Cast("arrow::compute::HashAggregateFinalize*") Pointer _finalize) { super((Pointer)null); allocate(sig, init, resize, consume, merge, _finalize); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::compute::KernelSignature>"}) KernelSignature sig, @ByVal @Cast("arrow::compute::KernelInit*") Pointer init,
                        @ByVal @Cast("arrow::compute::HashAggregateResize*") Pointer resize, @ByVal @Cast("arrow::compute::HashAggregateConsume*") Pointer consume,
                        @ByVal @Cast("arrow::compute::HashAggregateMerge*") Pointer merge, @ByVal @Cast("arrow::compute::HashAggregateFinalize*") Pointer _finalize);

  public HashAggregateKernel(@StdVector InputType in_types, @ByVal OutputType out_type,
                        @ByVal @Cast("arrow::compute::KernelInit*") Pointer init, @ByVal @Cast("arrow::compute::HashAggregateConsume*") Pointer consume,
                        @ByVal @Cast("arrow::compute::HashAggregateResize*") Pointer resize, @ByVal @Cast("arrow::compute::HashAggregateMerge*") Pointer merge,
                        @ByVal @Cast("arrow::compute::HashAggregateFinalize*") Pointer _finalize) { super((Pointer)null); allocate(in_types, out_type, init, consume, resize, merge, _finalize); }
  private native void allocate(@StdVector InputType in_types, @ByVal OutputType out_type,
                        @ByVal @Cast("arrow::compute::KernelInit*") Pointer init, @ByVal @Cast("arrow::compute::HashAggregateConsume*") Pointer consume,
                        @ByVal @Cast("arrow::compute::HashAggregateResize*") Pointer resize, @ByVal @Cast("arrow::compute::HashAggregateMerge*") Pointer merge,
                        @ByVal @Cast("arrow::compute::HashAggregateFinalize*") Pointer _finalize);

  public native @ByRef @Cast("arrow::compute::HashAggregateResize*") Pointer resize(); public native HashAggregateKernel resize(Pointer setter);
  public native @ByRef @Cast("arrow::compute::HashAggregateConsume*") Pointer consume(); public native HashAggregateKernel consume(Pointer setter);
  public native @ByRef @Cast("arrow::compute::HashAggregateMerge*") Pointer merge(); public native HashAggregateKernel merge(Pointer setter);
  public native @ByRef @Cast("arrow::compute::HashAggregateFinalize*") @Name("finalize") Pointer _finalize(); public native HashAggregateKernel _finalize(Pointer setter);
}
