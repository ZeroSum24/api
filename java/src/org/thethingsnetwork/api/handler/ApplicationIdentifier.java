// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/handler/handler.proto

package org.thethingsnetwork.api.handler;

/**
 * Protobuf type {@code handler.ApplicationIdentifier}
 */
public  final class ApplicationIdentifier extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:handler.ApplicationIdentifier)
    ApplicationIdentifierOrBuilder {
  // Use ApplicationIdentifier.newBuilder() to construct.
  private ApplicationIdentifier(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ApplicationIdentifier() {
    appId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ApplicationIdentifier(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            appId_ = s;
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.thethingsnetwork.api.handler.HandlerProto.internal_static_handler_ApplicationIdentifier_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.thethingsnetwork.api.handler.HandlerProto.internal_static_handler_ApplicationIdentifier_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.thethingsnetwork.api.handler.ApplicationIdentifier.class, org.thethingsnetwork.api.handler.ApplicationIdentifier.Builder.class);
  }

  public static final int APP_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object appId_;
  /**
   * <code>string app_id = 1 [(.gogoproto.customname) = "AppID"];</code>
   */
  public java.lang.String getAppId() {
    java.lang.Object ref = appId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      appId_ = s;
      return s;
    }
  }
  /**
   * <code>string app_id = 1 [(.gogoproto.customname) = "AppID"];</code>
   */
  public com.google.protobuf.ByteString
      getAppIdBytes() {
    java.lang.Object ref = appId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      appId_ = b;
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
    if (!getAppIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, appId_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAppIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, appId_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.thethingsnetwork.api.handler.ApplicationIdentifier)) {
      return super.equals(obj);
    }
    org.thethingsnetwork.api.handler.ApplicationIdentifier other = (org.thethingsnetwork.api.handler.ApplicationIdentifier) obj;

    boolean result = true;
    result = result && getAppId()
        .equals(other.getAppId());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + APP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAppId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.thethingsnetwork.api.handler.ApplicationIdentifier parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.handler.ApplicationIdentifier parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.handler.ApplicationIdentifier parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.handler.ApplicationIdentifier parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.handler.ApplicationIdentifier parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.handler.ApplicationIdentifier parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.handler.ApplicationIdentifier parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.handler.ApplicationIdentifier parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.handler.ApplicationIdentifier parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.handler.ApplicationIdentifier parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.handler.ApplicationIdentifier parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.handler.ApplicationIdentifier parseFrom(
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
  public static Builder newBuilder(org.thethingsnetwork.api.handler.ApplicationIdentifier prototype) {
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
   * Protobuf type {@code handler.ApplicationIdentifier}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:handler.ApplicationIdentifier)
      org.thethingsnetwork.api.handler.ApplicationIdentifierOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.thethingsnetwork.api.handler.HandlerProto.internal_static_handler_ApplicationIdentifier_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.thethingsnetwork.api.handler.HandlerProto.internal_static_handler_ApplicationIdentifier_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.thethingsnetwork.api.handler.ApplicationIdentifier.class, org.thethingsnetwork.api.handler.ApplicationIdentifier.Builder.class);
    }

    // Construct using org.thethingsnetwork.api.handler.ApplicationIdentifier.newBuilder()
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
      appId_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.thethingsnetwork.api.handler.HandlerProto.internal_static_handler_ApplicationIdentifier_descriptor;
    }

    public org.thethingsnetwork.api.handler.ApplicationIdentifier getDefaultInstanceForType() {
      return org.thethingsnetwork.api.handler.ApplicationIdentifier.getDefaultInstance();
    }

    public org.thethingsnetwork.api.handler.ApplicationIdentifier build() {
      org.thethingsnetwork.api.handler.ApplicationIdentifier result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.thethingsnetwork.api.handler.ApplicationIdentifier buildPartial() {
      org.thethingsnetwork.api.handler.ApplicationIdentifier result = new org.thethingsnetwork.api.handler.ApplicationIdentifier(this);
      result.appId_ = appId_;
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
      if (other instanceof org.thethingsnetwork.api.handler.ApplicationIdentifier) {
        return mergeFrom((org.thethingsnetwork.api.handler.ApplicationIdentifier)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.thethingsnetwork.api.handler.ApplicationIdentifier other) {
      if (other == org.thethingsnetwork.api.handler.ApplicationIdentifier.getDefaultInstance()) return this;
      if (!other.getAppId().isEmpty()) {
        appId_ = other.appId_;
        onChanged();
      }
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
      org.thethingsnetwork.api.handler.ApplicationIdentifier parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.thethingsnetwork.api.handler.ApplicationIdentifier) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object appId_ = "";
    /**
     * <code>string app_id = 1 [(.gogoproto.customname) = "AppID"];</code>
     */
    public java.lang.String getAppId() {
      java.lang.Object ref = appId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        appId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string app_id = 1 [(.gogoproto.customname) = "AppID"];</code>
     */
    public com.google.protobuf.ByteString
        getAppIdBytes() {
      java.lang.Object ref = appId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        appId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string app_id = 1 [(.gogoproto.customname) = "AppID"];</code>
     */
    public Builder setAppId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      appId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string app_id = 1 [(.gogoproto.customname) = "AppID"];</code>
     */
    public Builder clearAppId() {
      
      appId_ = getDefaultInstance().getAppId();
      onChanged();
      return this;
    }
    /**
     * <code>string app_id = 1 [(.gogoproto.customname) = "AppID"];</code>
     */
    public Builder setAppIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      appId_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:handler.ApplicationIdentifier)
  }

  // @@protoc_insertion_point(class_scope:handler.ApplicationIdentifier)
  private static final org.thethingsnetwork.api.handler.ApplicationIdentifier DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.thethingsnetwork.api.handler.ApplicationIdentifier();
  }

  public static org.thethingsnetwork.api.handler.ApplicationIdentifier getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ApplicationIdentifier>
      PARSER = new com.google.protobuf.AbstractParser<ApplicationIdentifier>() {
    public ApplicationIdentifier parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ApplicationIdentifier(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ApplicationIdentifier> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApplicationIdentifier> getParserForType() {
    return PARSER;
  }

  public org.thethingsnetwork.api.handler.ApplicationIdentifier getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

