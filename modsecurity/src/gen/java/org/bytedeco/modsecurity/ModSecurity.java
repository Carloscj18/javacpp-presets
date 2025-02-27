// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.modsecurity;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.modsecurity.global.modsecurity.*;

// #endif


/** \ingroup ModSecurity_CPP_API */
@Namespace("modsecurity") @NoOffset @Properties(inherit = org.bytedeco.modsecurity.presets.modsecurity.class)
public class ModSecurity extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ModSecurity(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ModSecurity(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ModSecurity position(long position) {
        return (ModSecurity)super.position(position);
    }
    @Override public ModSecurity getPointer(long i) {
        return new ModSecurity((Pointer)this).offsetAddress(i);
    }

    public ModSecurity() { super((Pointer)null); allocate(); }
    private native void allocate();

    
    

    public native @StdString BytePointer whoAmI();
    public native void setConnectorInformation(@StdString BytePointer connector);
    public native void setConnectorInformation(@StdString String connector);
    public native void setServerLogCb(ModSecLogCb cb);
    /**
     *
     * properties   Properties to inform ModSecurity what kind of infornation
     *              is expected be returned.
     *
     */
    public native void setServerLogCb(ModSecLogCb cb, int properties);

    public native void serverLog(Pointer data, @SharedPtr RuleMessage rm);

    public native @StdString BytePointer getConnectorInformation();

    public static native int processContentOffset(@Cast("const char*") BytePointer content, @Cast("size_t") long len,
            @Cast("const char*") BytePointer matchString, @StdString @Cast({"char*", "std::string*"}) BytePointer json, @Cast("const char**") PointerPointer err);
    public static native int processContentOffset(@Cast("const char*") BytePointer content, @Cast("size_t") long len,
            @Cast("const char*") BytePointer matchString, @StdString @Cast({"char*", "std::string*"}) BytePointer json, @Cast("const char**") @ByPtrPtr BytePointer err);
    public static native int processContentOffset(String content, @Cast("size_t") long len,
            String matchString, @StdString @Cast({"char*", "std::string*"}) BytePointer json, @Cast("const char**") @ByPtrPtr ByteBuffer err);
    public static native int processContentOffset(@Cast("const char*") BytePointer content, @Cast("size_t") long len,
            @Cast("const char*") BytePointer matchString, @StdString @Cast({"char*", "std::string*"}) BytePointer json, @Cast("const char**") @ByPtrPtr byte[] err);
    public static native int processContentOffset(String content, @Cast("size_t") long len,
            String matchString, @StdString @Cast({"char*", "std::string*"}) BytePointer json, @Cast("const char**") @ByPtrPtr BytePointer err);
    public static native int processContentOffset(@Cast("const char*") BytePointer content, @Cast("size_t") long len,
            @Cast("const char*") BytePointer matchString, @StdString @Cast({"char*", "std::string*"}) BytePointer json, @Cast("const char**") @ByPtrPtr ByteBuffer err);
    public static native int processContentOffset(String content, @Cast("size_t") long len,
            String matchString, @StdString @Cast({"char*", "std::string*"}) BytePointer json, @Cast("const char**") @ByPtrPtr byte[] err);

    public native Collection m_global_collection(); public native ModSecurity m_global_collection(Collection setter);
    public native Collection m_resource_collection(); public native ModSecurity m_resource_collection(Collection setter);
    public native Collection m_ip_collection(); public native ModSecurity m_ip_collection(Collection setter);
    public native Collection m_session_collection(); public native ModSecurity m_session_collection(Collection setter);
    public native Collection m_user_collection(); public native ModSecurity m_user_collection(Collection setter);
}
