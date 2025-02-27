// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TF_FileStatistics extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TF_FileStatistics() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TF_FileStatistics(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TF_FileStatistics(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TF_FileStatistics position(long position) {
        return (TF_FileStatistics)super.position(position);
    }
    @Override public TF_FileStatistics getPointer(long i) {
        return new TF_FileStatistics((Pointer)this).offsetAddress(i);
    }

  // The length of the file in bytes.
  public native @Cast("int64_t") long length(); public native TF_FileStatistics length(long setter);
  // The last modified time in nanoseconds.
  public native @Cast("int64_t") long mtime_nsec(); public native TF_FileStatistics mtime_nsec(long setter);
  // Whether the name refers to a directory.
  public native @Cast("bool") boolean is_directory(); public native TF_FileStatistics is_directory(boolean setter);
}
