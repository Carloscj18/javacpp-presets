// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


/** A snapshot of a variable at a certain version. A {@code SavedVariable} stores
 *  enough information to reconstruct a variable from a certain point in time. */
@Namespace("torch::autograd") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SavedVariable extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SavedVariable(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SavedVariable(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SavedVariable position(long position) {
        return (SavedVariable)super.position(position);
    }
    @Override public SavedVariable getPointer(long i) {
        return new SavedVariable((Pointer)this).offsetAddress(i);
    }

  public SavedVariable() { super((Pointer)null); allocate(); }
  private native void allocate();
  public SavedVariable(@Cast("const torch::autograd::Variable*") @ByRef Tensor variable, @Cast("bool") boolean is_output, @Cast("bool") boolean is_inplace_on_view/*=false*/) { super((Pointer)null); allocate(variable, is_output, is_inplace_on_view); }
  private native void allocate(@Cast("const torch::autograd::Variable*") @ByRef Tensor variable, @Cast("bool") boolean is_output, @Cast("bool") boolean is_inplace_on_view/*=false*/);
  public SavedVariable(@Cast("const torch::autograd::Variable*") @ByRef Tensor variable, @Cast("bool") boolean is_output) { super((Pointer)null); allocate(variable, is_output); }
  private native void allocate(@Cast("const torch::autograd::Variable*") @ByRef Tensor variable, @Cast("bool") boolean is_output);
  public SavedVariable(@Const @ByRef TensorOptional variable, @Cast("bool") boolean is_output, @Cast("bool") boolean is_inplace_on_view/*=false*/) { super((Pointer)null); allocate(variable, is_output, is_inplace_on_view); }
  private native void allocate(@Const @ByRef TensorOptional variable, @Cast("bool") boolean is_output, @Cast("bool") boolean is_inplace_on_view/*=false*/);
  public SavedVariable(@Const @ByRef TensorOptional variable, @Cast("bool") boolean is_output) { super((Pointer)null); allocate(variable, is_output); }
  private native void allocate(@Const @ByRef TensorOptional variable, @Cast("bool") boolean is_output);
  public SavedVariable(@ByRef(true) SavedVariable arg0) { super((Pointer)null); allocate(arg0); }
  private native void allocate(@ByRef(true) SavedVariable arg0);
  public native @ByRef @Name("operator =") SavedVariable put(@ByRef(true) SavedVariable arg0);

  /** Reconstructs the saved variable. Pass {@code saved_for} as the gradient
   *  function if constructing the {@code SavedVariable} with it would have caused a
   *  circular reference. */
  public native @ByVal @Cast("torch::autograd::Variable*") Tensor unpack(@SharedPtr Node saved_for/*=nullptr*/);
  public native @ByVal @Cast("torch::autograd::Variable*") Tensor unpack();

  public native void register_hooks(@UniquePtr SavedVariableHooks hooks);

  public native void reset_data();
}
