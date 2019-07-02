// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HelloWorld.proto

package com.codenotfound.grpc.helloworld;

/**
 * Protobuf type {@code com.codenotfound.grpc.helloworld.Request}
 */
public  final class Request extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.codenotfound.grpc.helloworld.Request)
    RequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Request.newBuilder() to construct.
  private Request(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Request() {
    a_ = 0L;
    b_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Request(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            a_ = input.readInt64();
            break;
          }
          case 16: {

            b_ = input.readInt64();
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
    return com.codenotfound.grpc.helloworld.HelloWorld.internal_static_com_codenotfound_grpc_helloworld_Request_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.codenotfound.grpc.helloworld.HelloWorld.internal_static_com_codenotfound_grpc_helloworld_Request_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.codenotfound.grpc.helloworld.Request.class, com.codenotfound.grpc.helloworld.Request.Builder.class);
  }

  public static final int A_FIELD_NUMBER = 1;
  private long a_;
  /**
   * <code>int64 a = 1;</code>
   */
  public long getA() {
    return a_;
  }

  public static final int B_FIELD_NUMBER = 2;
  private long b_;
  /**
   * <code>int64 b = 2;</code>
   */
  public long getB() {
    return b_;
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
    if (a_ != 0L) {
      output.writeInt64(1, a_);
    }
    if (b_ != 0L) {
      output.writeInt64(2, b_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (a_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, a_);
    }
    if (b_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, b_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.codenotfound.grpc.helloworld.Request)) {
      return super.equals(obj);
    }
    com.codenotfound.grpc.helloworld.Request other = (com.codenotfound.grpc.helloworld.Request) obj;

    boolean result = true;
    result = result && (getA()
        == other.getA());
    result = result && (getB()
        == other.getB());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + A_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getA());
    hash = (37 * hash) + B_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getB());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.codenotfound.grpc.helloworld.Request parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.codenotfound.grpc.helloworld.Request parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.codenotfound.grpc.helloworld.Request parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.codenotfound.grpc.helloworld.Request parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.codenotfound.grpc.helloworld.Request parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.codenotfound.grpc.helloworld.Request parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.codenotfound.grpc.helloworld.Request parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.codenotfound.grpc.helloworld.Request parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.codenotfound.grpc.helloworld.Request parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.codenotfound.grpc.helloworld.Request parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.codenotfound.grpc.helloworld.Request parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.codenotfound.grpc.helloworld.Request parseFrom(
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
  public static Builder newBuilder(com.codenotfound.grpc.helloworld.Request prototype) {
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
   * Protobuf type {@code com.codenotfound.grpc.helloworld.Request}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.codenotfound.grpc.helloworld.Request)
      com.codenotfound.grpc.helloworld.RequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.codenotfound.grpc.helloworld.HelloWorld.internal_static_com_codenotfound_grpc_helloworld_Request_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.codenotfound.grpc.helloworld.HelloWorld.internal_static_com_codenotfound_grpc_helloworld_Request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.codenotfound.grpc.helloworld.Request.class, com.codenotfound.grpc.helloworld.Request.Builder.class);
    }

    // Construct using com.codenotfound.grpc.helloworld.Request.newBuilder()
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
      a_ = 0L;

      b_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.codenotfound.grpc.helloworld.HelloWorld.internal_static_com_codenotfound_grpc_helloworld_Request_descriptor;
    }

    public com.codenotfound.grpc.helloworld.Request getDefaultInstanceForType() {
      return com.codenotfound.grpc.helloworld.Request.getDefaultInstance();
    }

    public com.codenotfound.grpc.helloworld.Request build() {
      com.codenotfound.grpc.helloworld.Request result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.codenotfound.grpc.helloworld.Request buildPartial() {
      com.codenotfound.grpc.helloworld.Request result = new com.codenotfound.grpc.helloworld.Request(this);
      result.a_ = a_;
      result.b_ = b_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.codenotfound.grpc.helloworld.Request) {
        return mergeFrom((com.codenotfound.grpc.helloworld.Request)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.codenotfound.grpc.helloworld.Request other) {
      if (other == com.codenotfound.grpc.helloworld.Request.getDefaultInstance()) return this;
      if (other.getA() != 0L) {
        setA(other.getA());
      }
      if (other.getB() != 0L) {
        setB(other.getB());
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
      com.codenotfound.grpc.helloworld.Request parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.codenotfound.grpc.helloworld.Request) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long a_ ;
    /**
     * <code>int64 a = 1;</code>
     */
    public long getA() {
      return a_;
    }
    /**
     * <code>int64 a = 1;</code>
     */
    public Builder setA(long value) {
      
      a_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 a = 1;</code>
     */
    public Builder clearA() {
      
      a_ = 0L;
      onChanged();
      return this;
    }

    private long b_ ;
    /**
     * <code>int64 b = 2;</code>
     */
    public long getB() {
      return b_;
    }
    /**
     * <code>int64 b = 2;</code>
     */
    public Builder setB(long value) {
      
      b_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 b = 2;</code>
     */
    public Builder clearB() {
      
      b_ = 0L;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.codenotfound.grpc.helloworld.Request)
  }

  // @@protoc_insertion_point(class_scope:com.codenotfound.grpc.helloworld.Request)
  private static final com.codenotfound.grpc.helloworld.Request DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.codenotfound.grpc.helloworld.Request();
  }

  public static com.codenotfound.grpc.helloworld.Request getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Request>
      PARSER = new com.google.protobuf.AbstractParser<Request>() {
    public Request parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Request(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Request> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Request> getParserForType() {
    return PARSER;
  }

  public com.codenotfound.grpc.helloworld.Request getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

