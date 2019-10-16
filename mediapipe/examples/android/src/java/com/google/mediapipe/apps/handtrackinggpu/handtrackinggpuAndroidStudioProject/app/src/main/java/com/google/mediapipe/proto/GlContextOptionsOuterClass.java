// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mediapipe/gpu/gl_context_options.proto

package mediapipe;

public final class GlContextOptionsOuterClass {
  private GlContextOptionsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(mediapipe.GlContextOptionsOuterClass.GlContextOptions.ext);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GlContextOptionsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:mediapipe.GlContextOptions)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string gl_context_name = 1;</code>
     */
    boolean hasGlContextName();
    /**
     * <code>optional string gl_context_name = 1;</code>
     */
    java.lang.String getGlContextName();
    /**
     * <code>optional string gl_context_name = 1;</code>
     */
    com.google.protobuf.ByteString
        getGlContextNameBytes();
  }
  /**
   * Protobuf type {@code mediapipe.GlContextOptions}
   */
  public  static final class GlContextOptions extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:mediapipe.GlContextOptions)
      GlContextOptionsOrBuilder {
    // Use GlContextOptions.newBuilder() to construct.
    private GlContextOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GlContextOptions() {
      glContextName_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GlContextOptions(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              glContextName_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return mediapipe.GlContextOptionsOuterClass.internal_static_mediapipe_GlContextOptions_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return mediapipe.GlContextOptionsOuterClass.internal_static_mediapipe_GlContextOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              mediapipe.GlContextOptionsOuterClass.GlContextOptions.class, mediapipe.GlContextOptionsOuterClass.GlContextOptions.Builder.class);
    }

    private int bitField0_;
    public static final int GL_CONTEXT_NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object glContextName_;
    /**
     * <code>optional string gl_context_name = 1;</code>
     */
    public boolean hasGlContextName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string gl_context_name = 1;</code>
     */
    public java.lang.String getGlContextName() {
      java.lang.Object ref = glContextName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          glContextName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string gl_context_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getGlContextNameBytes() {
      java.lang.Object ref = glContextName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        glContextName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, glContextName_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, glContextName_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof mediapipe.GlContextOptionsOuterClass.GlContextOptions)) {
        return super.equals(obj);
      }
      mediapipe.GlContextOptionsOuterClass.GlContextOptions other = (mediapipe.GlContextOptionsOuterClass.GlContextOptions) obj;

      boolean result = true;
      result = result && (hasGlContextName() == other.hasGlContextName());
      if (hasGlContextName()) {
        result = result && getGlContextName()
            .equals(other.getGlContextName());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasGlContextName()) {
        hash = (37 * hash) + GL_CONTEXT_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getGlContextName().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static mediapipe.GlContextOptionsOuterClass.GlContextOptions parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static mediapipe.GlContextOptionsOuterClass.GlContextOptions parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static mediapipe.GlContextOptionsOuterClass.GlContextOptions parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static mediapipe.GlContextOptionsOuterClass.GlContextOptions parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static mediapipe.GlContextOptionsOuterClass.GlContextOptions parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static mediapipe.GlContextOptionsOuterClass.GlContextOptions parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static mediapipe.GlContextOptionsOuterClass.GlContextOptions parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static mediapipe.GlContextOptionsOuterClass.GlContextOptions parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static mediapipe.GlContextOptionsOuterClass.GlContextOptions parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static mediapipe.GlContextOptionsOuterClass.GlContextOptions parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(mediapipe.GlContextOptionsOuterClass.GlContextOptions prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code mediapipe.GlContextOptions}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:mediapipe.GlContextOptions)
        mediapipe.GlContextOptionsOuterClass.GlContextOptionsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return mediapipe.GlContextOptionsOuterClass.internal_static_mediapipe_GlContextOptions_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return mediapipe.GlContextOptionsOuterClass.internal_static_mediapipe_GlContextOptions_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                mediapipe.GlContextOptionsOuterClass.GlContextOptions.class, mediapipe.GlContextOptionsOuterClass.GlContextOptions.Builder.class);
      }

      // Construct using mediapipe.GlContextOptionsOuterClass.GlContextOptions.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        glContextName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return mediapipe.GlContextOptionsOuterClass.internal_static_mediapipe_GlContextOptions_descriptor;
      }

      public mediapipe.GlContextOptionsOuterClass.GlContextOptions getDefaultInstanceForType() {
        return mediapipe.GlContextOptionsOuterClass.GlContextOptions.getDefaultInstance();
      }

      public mediapipe.GlContextOptionsOuterClass.GlContextOptions build() {
        mediapipe.GlContextOptionsOuterClass.GlContextOptions result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public mediapipe.GlContextOptionsOuterClass.GlContextOptions buildPartial() {
        mediapipe.GlContextOptionsOuterClass.GlContextOptions result = new mediapipe.GlContextOptionsOuterClass.GlContextOptions(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.glContextName_ = glContextName_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof mediapipe.GlContextOptionsOuterClass.GlContextOptions) {
          return mergeFrom((mediapipe.GlContextOptionsOuterClass.GlContextOptions)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(mediapipe.GlContextOptionsOuterClass.GlContextOptions other) {
        if (other == mediapipe.GlContextOptionsOuterClass.GlContextOptions.getDefaultInstance()) return this;
        if (other.hasGlContextName()) {
          bitField0_ |= 0x00000001;
          glContextName_ = other.glContextName_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        mediapipe.GlContextOptionsOuterClass.GlContextOptions parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (mediapipe.GlContextOptionsOuterClass.GlContextOptions) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object glContextName_ = "";
      /**
       * <code>optional string gl_context_name = 1;</code>
       */
      public boolean hasGlContextName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string gl_context_name = 1;</code>
       */
      public java.lang.String getGlContextName() {
        java.lang.Object ref = glContextName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            glContextName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string gl_context_name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getGlContextNameBytes() {
        java.lang.Object ref = glContextName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          glContextName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string gl_context_name = 1;</code>
       */
      public Builder setGlContextName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        glContextName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string gl_context_name = 1;</code>
       */
      public Builder clearGlContextName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        glContextName_ = getDefaultInstance().getGlContextName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string gl_context_name = 1;</code>
       */
      public Builder setGlContextNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        glContextName_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:mediapipe.GlContextOptions)
    }

    // @@protoc_insertion_point(class_scope:mediapipe.GlContextOptions)
    private static final mediapipe.GlContextOptionsOuterClass.GlContextOptions DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new mediapipe.GlContextOptionsOuterClass.GlContextOptions();
    }

    public static mediapipe.GlContextOptionsOuterClass.GlContextOptions getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<GlContextOptions>
        PARSER = new com.google.protobuf.AbstractParser<GlContextOptions>() {
      public GlContextOptions parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new GlContextOptions(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GlContextOptions> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GlContextOptions> getParserForType() {
      return PARSER;
    }

    public mediapipe.GlContextOptionsOuterClass.GlContextOptions getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final int EXT_FIELD_NUMBER = 222332034;
    /**
     * <code>extend .mediapipe.CalculatorOptions { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        com.google.mediapipe.proto.CalculatorOptionsProto.CalculatorOptions,
        mediapipe.GlContextOptionsOuterClass.GlContextOptions> ext = com.google.protobuf.GeneratedMessage
            .newMessageScopedGeneratedExtension(
          mediapipe.GlContextOptionsOuterClass.GlContextOptions.getDefaultInstance(),
          0,
          mediapipe.GlContextOptionsOuterClass.GlContextOptions.class,
          mediapipe.GlContextOptionsOuterClass.GlContextOptions.getDefaultInstance());
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mediapipe_GlContextOptions_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mediapipe_GlContextOptions_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&mediapipe/gpu/gl_context_options.proto" +
      "\022\tmediapipe\032$mediapipe/framework/calcula" +
      "tor.proto\"v\n\020GlContextOptions\022\027\n\017gl_cont" +
      "ext_name\030\001 \001(\t2I\n\003ext\022\034.mediapipe.Calcul" +
      "atorOptions\030\202\211\202j \001(\0132\033.mediapipe.GlConte" +
      "xtOptions"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.mediapipe.proto.CalculatorProto.getDescriptor(),
        }, assigner);
    internal_static_mediapipe_GlContextOptions_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mediapipe_GlContextOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mediapipe_GlContextOptions_descriptor,
        new java.lang.String[] { "GlContextName", });
    com.google.mediapipe.proto.CalculatorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
