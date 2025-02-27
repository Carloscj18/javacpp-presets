// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


// ----------------------------------------------------------------------

/** \brief Convenience class to incrementally construct/merge schemas.
 * 
 *  This class amortizes the cost of validating field name conflicts by
 *  maintaining the mapping. The caller also controls the conflict resolution
 *  scheme. */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class SchemaBuilder extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SchemaBuilder(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SchemaBuilder(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SchemaBuilder position(long position) {
        return (SchemaBuilder)super.position(position);
    }
    @Override public SchemaBuilder getPointer(long i) {
        return new SchemaBuilder((Pointer)this).offsetAddress(i);
    }

  // Indicate how field conflict(s) should be resolved when building a schema. A
  // conflict arise when a field is added to the builder and one or more field(s)
  // with the same name already exists.
  public enum ConflictPolicy {
    // Ignore the conflict and append the field. This is the default behavior of the
    // Schema constructor and the `arrow::schema` factory function.
    CONFLICT_APPEND(0),
    // Keep the existing field and ignore the newer one.
    CONFLICT_IGNORE(1),
    // Replace the existing field with the newer one.
    CONFLICT_REPLACE(2),
    // Merge the fields. The merging behavior can be controlled by `Field::MergeOptions`
    // specified at construction time. Also see documentation of `Field::MergeWith`.
    CONFLICT_MERGE(3),
    // Refuse the new field and error out.
    CONFLICT_ERROR(4);

      public final int value;
      private ConflictPolicy(int v) { this.value = v; }
      private ConflictPolicy(ConflictPolicy e) { this.value = e.value; }
      public ConflictPolicy intern() { for (ConflictPolicy e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }

  /** \brief Construct an empty SchemaBuilder
   *  {@code field_merge_options} is only effective when {@code conflict_policy} == {@code CONFLICT_MERGE}. */
  public SchemaBuilder(
        ConflictPolicy conflict_policy/*=arrow::SchemaBuilder::CONFLICT_APPEND*/,
        @ByVal(nullValue = "arrow::Field::MergeOptions::Defaults()") Field.MergeOptions field_merge_options) { super((Pointer)null); allocate(conflict_policy, field_merge_options); }
  private native void allocate(
        ConflictPolicy conflict_policy/*=arrow::SchemaBuilder::CONFLICT_APPEND*/,
        @ByVal(nullValue = "arrow::Field::MergeOptions::Defaults()") Field.MergeOptions field_merge_options);
  public SchemaBuilder() { super((Pointer)null); allocate(); }
  private native void allocate();
  public SchemaBuilder(
        @Cast("arrow::SchemaBuilder::ConflictPolicy") int conflict_policy/*=arrow::SchemaBuilder::CONFLICT_APPEND*/,
        @ByVal(nullValue = "arrow::Field::MergeOptions::Defaults()") Field.MergeOptions field_merge_options) { super((Pointer)null); allocate(conflict_policy, field_merge_options); }
  private native void allocate(
        @Cast("arrow::SchemaBuilder::ConflictPolicy") int conflict_policy/*=arrow::SchemaBuilder::CONFLICT_APPEND*/,
        @ByVal(nullValue = "arrow::Field::MergeOptions::Defaults()") Field.MergeOptions field_merge_options);
  /** \brief Construct a SchemaBuilder from a list of fields
   *  {@code field_merge_options} is only effective when {@code conflict_policy} == {@code CONFLICT_MERGE}. */
  public SchemaBuilder(
        @ByVal FieldVector fields,
        ConflictPolicy conflict_policy/*=arrow::SchemaBuilder::CONFLICT_APPEND*/,
        @ByVal(nullValue = "arrow::Field::MergeOptions::Defaults()") Field.MergeOptions field_merge_options) { super((Pointer)null); allocate(fields, conflict_policy, field_merge_options); }
  private native void allocate(
        @ByVal FieldVector fields,
        ConflictPolicy conflict_policy/*=arrow::SchemaBuilder::CONFLICT_APPEND*/,
        @ByVal(nullValue = "arrow::Field::MergeOptions::Defaults()") Field.MergeOptions field_merge_options);
  public SchemaBuilder(
        @ByVal FieldVector fields) { super((Pointer)null); allocate(fields); }
  private native void allocate(
        @ByVal FieldVector fields);
  public SchemaBuilder(
        @ByVal FieldVector fields,
        @Cast("arrow::SchemaBuilder::ConflictPolicy") int conflict_policy/*=arrow::SchemaBuilder::CONFLICT_APPEND*/,
        @ByVal(nullValue = "arrow::Field::MergeOptions::Defaults()") Field.MergeOptions field_merge_options) { super((Pointer)null); allocate(fields, conflict_policy, field_merge_options); }
  private native void allocate(
        @ByVal FieldVector fields,
        @Cast("arrow::SchemaBuilder::ConflictPolicy") int conflict_policy/*=arrow::SchemaBuilder::CONFLICT_APPEND*/,
        @ByVal(nullValue = "arrow::Field::MergeOptions::Defaults()") Field.MergeOptions field_merge_options);
  /** \brief Construct a SchemaBuilder from a schema, preserving the metadata
   *  {@code field_merge_options} is only effective when {@code conflict_policy} == {@code CONFLICT_MERGE}. */
  public SchemaBuilder(
        @Const @SharedPtr @ByRef Schema schema,
        ConflictPolicy conflict_policy/*=arrow::SchemaBuilder::CONFLICT_APPEND*/,
        @ByVal(nullValue = "arrow::Field::MergeOptions::Defaults()") Field.MergeOptions field_merge_options) { super((Pointer)null); allocate(schema, conflict_policy, field_merge_options); }
  private native void allocate(
        @Const @SharedPtr @ByRef Schema schema,
        ConflictPolicy conflict_policy/*=arrow::SchemaBuilder::CONFLICT_APPEND*/,
        @ByVal(nullValue = "arrow::Field::MergeOptions::Defaults()") Field.MergeOptions field_merge_options);
  public SchemaBuilder(
        @Const @SharedPtr @ByRef Schema schema) { super((Pointer)null); allocate(schema); }
  private native void allocate(
        @Const @SharedPtr @ByRef Schema schema);
  public SchemaBuilder(
        @Const @SharedPtr @ByRef Schema schema,
        @Cast("arrow::SchemaBuilder::ConflictPolicy") int conflict_policy/*=arrow::SchemaBuilder::CONFLICT_APPEND*/,
        @ByVal(nullValue = "arrow::Field::MergeOptions::Defaults()") Field.MergeOptions field_merge_options) { super((Pointer)null); allocate(schema, conflict_policy, field_merge_options); }
  private native void allocate(
        @Const @SharedPtr @ByRef Schema schema,
        @Cast("arrow::SchemaBuilder::ConflictPolicy") int conflict_policy/*=arrow::SchemaBuilder::CONFLICT_APPEND*/,
        @ByVal(nullValue = "arrow::Field::MergeOptions::Defaults()") Field.MergeOptions field_merge_options);

  /** \brief Return the conflict resolution method. */
  public native ConflictPolicy policy();

  /** \brief Set the conflict resolution method. */
  
  ///
  public native void SetPolicy(ConflictPolicy resolution);
  public native void SetPolicy(@Cast("arrow::SchemaBuilder::ConflictPolicy") int resolution);

  /** \brief Add a field to the constructed schema.
   * 
   *  @param field [in] to add to the constructed Schema.
   *  @return A failure if encountered. */
  
  ///
  public native @ByVal Status AddField(@SharedPtr @Cast({"", "std::shared_ptr<arrow::Field>"}) Field field);

  /** \brief Add multiple fields to the constructed schema.
   * 
   *  @param fields [in] to add to the constructed Schema.
   *  @return The first failure encountered, if any. */
  
  ///
  public native @ByVal Status AddFields(@Const @ByRef FieldVector fields);

  /** \brief Add fields of a Schema to the constructed Schema.
   * 
   *  @param schema [in] to take fields to add to the constructed Schema.
   *  @return The first failure encountered, if any. */
  
  ///
  public native @ByVal Status AddSchema(@Const @SharedPtr @ByRef Schema schema);

  /** \brief Add fields of multiple Schemas to the constructed Schema.
   * 
   *  @param schemas [in] to take fields to add to the constructed Schema.
   *  @return The first failure encountered, if any. */
  public native @ByVal Status AddSchemas(@Const @ByRef SchemaVector schemas);

  
  ///
  ///
  public native @ByVal Status AddMetadata(@Const @ByRef KeyValueMetadata metadata);

  /** \brief Return the constructed Schema.
   * 
   *  The builder internal state is not affected by invoking this method, i.e.
   *  a single builder can yield multiple incrementally constructed schemas.
   * 
   *  @return the constructed schema. */
  public native @ByVal SchemaResult Finish();

  /** \brief Merge schemas in a unified schema according to policy. */
  public static native @ByVal SchemaResult Merge(
        @Const @ByRef SchemaVector schemas,
        ConflictPolicy policy/*=arrow::SchemaBuilder::CONFLICT_MERGE*/);
  public static native @ByVal SchemaResult Merge(
        @Const @ByRef SchemaVector schemas);
  public static native @ByVal SchemaResult Merge(
        @Const @ByRef SchemaVector schemas,
        @Cast("arrow::SchemaBuilder::ConflictPolicy") int policy/*=arrow::SchemaBuilder::CONFLICT_MERGE*/);

  /** \brief Indicate if schemas are compatible to merge according to policy. */
  public static native @ByVal Status AreCompatible(@Const @ByRef SchemaVector schemas,
                                ConflictPolicy policy/*=arrow::SchemaBuilder::CONFLICT_MERGE*/);
  public static native @ByVal Status AreCompatible(@Const @ByRef SchemaVector schemas);
  public static native @ByVal Status AreCompatible(@Const @ByRef SchemaVector schemas,
                                @Cast("arrow::SchemaBuilder::ConflictPolicy") int policy/*=arrow::SchemaBuilder::CONFLICT_MERGE*/);

  /** \brief Reset internal state with an empty schema (and metadata). */
  public native void Reset();
}
