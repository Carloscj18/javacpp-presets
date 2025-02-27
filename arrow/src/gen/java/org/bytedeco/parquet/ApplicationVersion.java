// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


@Namespace("parquet") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class ApplicationVersion extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ApplicationVersion(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ApplicationVersion(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ApplicationVersion position(long position) {
        return (ApplicationVersion)super.position(position);
    }
    @Override public ApplicationVersion getPointer(long i) {
        return new ApplicationVersion((Pointer)this).offsetAddress(i);
    }

  // Known Versions with Issues
  public static native @Const @ByRef ApplicationVersion PARQUET_251_FIXED_VERSION();
  public static native @Const @ByRef ApplicationVersion PARQUET_816_FIXED_VERSION();
  public static native @Const @ByRef ApplicationVersion PARQUET_CPP_FIXED_STATS_VERSION();
  public static native @Const @ByRef ApplicationVersion PARQUET_MR_FIXED_STATS_VERSION();

  // Application that wrote the file. e.g. "IMPALA"
  public native @StdString String application_(); public native ApplicationVersion application_(String setter);
  // Build name
  public native @StdString String build_(); public native ApplicationVersion build_(String setter);

  // Version of the application that wrote the file, expressed as
  // (<major>.<minor>.<patch>). Unmatched parts default to 0.
  // "1.2.3"    => {1, 2, 3}
  // "1.2"      => {1, 2, 0}
  // "1.2-cdh5" => {1, 2, 0}
    @Name("version.major") public native int version_major(); public native ApplicationVersion version_major(int setter);
    @Name("version.minor") public native int version_minor(); public native ApplicationVersion version_minor(int setter);
    @Name("version.patch") public native int version_patch(); public native ApplicationVersion version_patch(int setter);
    @Name("version.unknown") public native @StdString String version_unknown(); public native ApplicationVersion version_unknown(String setter);
    @Name("version.pre_release") public native @StdString String version_pre_release(); public native ApplicationVersion version_pre_release(String setter);
    @Name("version.build_info") public native @StdString String version_build_info(); public native ApplicationVersion version_build_info(String setter);

  public ApplicationVersion() { super((Pointer)null); allocate(); }
  private native void allocate();
  public ApplicationVersion(@StdString String created_by) { super((Pointer)null); allocate(created_by); }
  private native void allocate(@StdString String created_by);
  public ApplicationVersion(@StdString BytePointer created_by) { super((Pointer)null); allocate(created_by); }
  private native void allocate(@StdString BytePointer created_by);
  public ApplicationVersion(@StdString String application, int major, int minor, int patch) { super((Pointer)null); allocate(application, major, minor, patch); }
  private native void allocate(@StdString String application, int major, int minor, int patch);
  public ApplicationVersion(@StdString BytePointer application, int major, int minor, int patch) { super((Pointer)null); allocate(application, major, minor, patch); }
  private native void allocate(@StdString BytePointer application, int major, int minor, int patch);

  // Returns true if version is strictly less than other_version
  public native @Cast("bool") boolean VersionLt(@Const @ByRef ApplicationVersion other_version);

  // Returns true if version is strictly equal with other_version
  public native @Cast("bool") boolean VersionEq(@Const @ByRef ApplicationVersion other_version);

  // Checks if the Version has the correct statistics for a given column
  public native @Cast("bool") boolean HasCorrectStatistics(org.bytedeco.parquet.Type.type primitive, @ByRef EncodedStatistics statistics,
                              org.bytedeco.parquet.SortOrder.type sort_order/*=parquet::SortOrder::SIGNED*/);
  public native @Cast("bool") boolean HasCorrectStatistics(org.bytedeco.parquet.Type.type primitive, @ByRef EncodedStatistics statistics);
  public native @Cast("bool") boolean HasCorrectStatistics(@Cast("parquet::Type::type") int primitive, @ByRef EncodedStatistics statistics,
                              @Cast("parquet::SortOrder::type") int sort_order/*=parquet::SortOrder::SIGNED*/);
  public native @Cast("bool") boolean HasCorrectStatistics(@Cast("parquet::Type::type") int primitive, @ByRef EncodedStatistics statistics);
}
