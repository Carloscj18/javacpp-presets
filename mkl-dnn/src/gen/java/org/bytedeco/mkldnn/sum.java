// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** \}
 <p>
 *  \addtogroup cpp_api_sum Sum
 *  A primitive to sum data.
 * 
 *  @see \ref c_api_sum in \ref c_api
 *  \{ */

@Namespace("mkldnn") @Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class sum extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sum(Pointer p) { super(p); }

    public static class primitive_desc extends mkldnn_primitive_desc_handle {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
    
        public native @ByVal @Cast("std::vector<const_mkldnn_primitive_desc_t>*") mkldnn_primitive_desc_vector cpp_to_c(
                        @ByVal memory_primitive_desc_vector inputs);

        public primitive_desc(@Const @ByRef memory.desc output,
                        @StdVector FloatPointer scales,
                        @ByVal memory_primitive_desc_vector inputs) { super((Pointer)null); allocate(output, scales, inputs); }
        private native void allocate(@Const @ByRef memory.desc output,
                        @StdVector FloatPointer scales,
                        @ByVal memory_primitive_desc_vector inputs);
        public primitive_desc(@Const @ByRef memory.desc output,
                        @StdVector FloatBuffer scales,
                        @ByVal memory_primitive_desc_vector inputs) { super((Pointer)null); allocate(output, scales, inputs); }
        private native void allocate(@Const @ByRef memory.desc output,
                        @StdVector FloatBuffer scales,
                        @ByVal memory_primitive_desc_vector inputs);
        public primitive_desc(@Const @ByRef memory.desc output,
                        @StdVector float[] scales,
                        @ByVal memory_primitive_desc_vector inputs) { super((Pointer)null); allocate(output, scales, inputs); }
        private native void allocate(@Const @ByRef memory.desc output,
                        @StdVector float[] scales,
                        @ByVal memory_primitive_desc_vector inputs);

        public primitive_desc(@StdVector FloatPointer scales,
                        @ByVal memory_primitive_desc_vector inputs) { super((Pointer)null); allocate(scales, inputs); }
        private native void allocate(@StdVector FloatPointer scales,
                        @ByVal memory_primitive_desc_vector inputs);
        public primitive_desc(@StdVector FloatBuffer scales,
                        @ByVal memory_primitive_desc_vector inputs) { super((Pointer)null); allocate(scales, inputs); }
        private native void allocate(@StdVector FloatBuffer scales,
                        @ByVal memory_primitive_desc_vector inputs);
        public primitive_desc(@StdVector float[] scales,
                        @ByVal memory_primitive_desc_vector inputs) { super((Pointer)null); allocate(scales, inputs); }
        private native void allocate(@StdVector float[] scales,
                        @ByVal memory_primitive_desc_vector inputs);

        public native @ByVal memory.primitive_desc dst_primitive_desc();

        public native @ByVal engine get_engine();
    }

    public sum(@Const @ByRef primitive_desc sum_pd,
                @StdVector primitive.at inputs, @Const @ByRef memory output) { super((Pointer)null); allocate(sum_pd, inputs, output); }
    private native void allocate(@Const @ByRef primitive_desc sum_pd,
                @StdVector primitive.at inputs, @Const @ByRef memory output);
}
