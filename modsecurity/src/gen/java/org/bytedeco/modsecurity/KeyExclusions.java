// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.modsecurity;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.modsecurity.global.modsecurity.*;

// #endif

// #ifdef __cplusplus
@Namespace("modsecurity::variables") @Opaque @Properties(inherit = org.bytedeco.modsecurity.presets.modsecurity.class)
public class KeyExclusions extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public KeyExclusions() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public KeyExclusions(Pointer p) { super(p); }
}
