// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/discovery/discovery.proto

package org.thethingsnetwork.api.discovery;

/**
 * Protobuf type {@code discovery.GetByAppEUIRequest}
 */
public  final class GetByAppEUIRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:discovery.GetByAppEUIRequest)
    GetByAppEUIRequestOrBuilder {
  // Use GetByAppEUIRequest.newBuilder() to construct.
  private GetByAppEUIRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetByAppEUIRequest() {
    appEui_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetByAppEUIRequest(
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
          case 250: {

            appEui_ = input.readBytes();
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
    return org.thethingsnetwork.api.discovery.DiscoveryProto.internal_static_discovery_GetByAppEUIRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.thethingsnetwork.api.discovery.DiscoveryProto.internal_static_discovery_GetByAppEUIRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.thethingsnetwork.api.discovery.GetByAppEUIRequest.class, org.thethingsnetwork.api.discovery.GetByAppEUIRequest.Builder.class);
  }

  public static final int APP_EUI_FIELD_NUMBER = 31;
  private com.google.protobuf.ByteString appEui_;
  /**
   * <pre>
   * compatible with Metadata message
   * </pre>
   *
   * <code>bytes app_eui = 31 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI", (.gogoproto.customname) = "AppEUI"];</code>
   */
  public com.google.protobuf.ByteString getAppEui() {
    return appEui_;
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
    if (!appEui_.isEmpty()) {
      output.writeBytes(31, appEui_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!appEui_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(31, appEui_);
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
    if (!(obj instanceof org.thethingsnetwork.api.discovery.GetByAppEUIRequest)) {
      return super.equals(obj);
    }
    org.thethingsnetwork.api.discovery.GetByAppEUIRequest other = (org.thethingsnetwork.api.discovery.GetByAppEUIRequest) obj;

    boolean result = true;
    result = result && getAppEui()
        .equals(other.getAppEui());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + APP_EUI_FIELD_NUMBER;
    hash = (53 * hash) + getAppEui().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.thethingsnetwork.api.discovery.GetByAppEUIRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.discovery.GetByAppEUIRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.discovery.GetByAppEUIRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.discovery.GetByAppEUIRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.discovery.GetByAppEUIRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.discovery.GetByAppEUIRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.discovery.GetByAppEUIRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.discovery.GetByAppEUIRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.discovery.GetByAppEUIRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.discovery.GetByAppEUIRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.discovery.GetByAppEUIRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.discovery.GetByAppEUIRequest parseFrom(
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
  public static Builder newBuilder(org.thethingsnetwork.api.discovery.GetByAppEUIRequest prototype) {
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
   * Protobuf type {@code discovery.GetByAppEUIRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:discovery.GetByAppEUIRequest)
      org.thethingsnetwork.api.discovery.GetByAppEUIRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.thethingsnetwork.api.discovery.DiscoveryProto.internal_static_discovery_GetByAppEUIRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.thethingsnetwork.api.discovery.DiscoveryProto.internal_static_discovery_GetByAppEUIRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.thethingsnetwork.api.discovery.GetByAppEUIRequest.class, org.thethingsnetwork.api.discovery.GetByAppEUIRequest.Builder.class);
    }

    // Construct using org.thethingsnetwork.api.discovery.GetByAppEUIRequest.newBuilder()
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
      appEui_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.thethingsnetwork.api.discovery.DiscoveryProto.internal_static_discovery_GetByAppEUIRequest_descriptor;
    }

    public org.thethingsnetwork.api.discovery.GetByAppEUIRequest getDefaultInstanceForType() {
      return org.thethingsnetwork.api.discovery.GetByAppEUIRequest.getDefaultInstance();
    }

    public org.thethingsnetwork.api.discovery.GetByAppEUIRequest build() {
      org.thethingsnetwork.api.discovery.GetByAppEUIRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.thethingsnetwork.api.discovery.GetByAppEUIRequest buildPartial() {
      org.thethingsnetwork.api.discovery.GetByAppEUIRequest result = new org.thethingsnetwork.api.discovery.GetByAppEUIRequest(this);
      result.appEui_ = appEui_;
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
      if (other instanceof org.thethingsnetwork.api.discovery.GetByAppEUIRequest) {
        return mergeFrom((org.thethingsnetwork.api.discovery.GetByAppEUIRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.thethingsnetwork.api.discovery.GetByAppEUIRequest other) {
      if (other == org.thethingsnetwork.api.discovery.GetByAppEUIRequest.getDefaultInstance()) return this;
      if (other.getAppEui() != com.google.protobuf.ByteString.EMPTY) {
        setAppEui(other.getAppEui());
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
      org.thethingsnetwork.api.discovery.GetByAppEUIRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.thethingsnetwork.api.discovery.GetByAppEUIRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString appEui_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * compatible with Metadata message
     * </pre>
     *
     * <code>bytes app_eui = 31 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI", (.gogoproto.customname) = "AppEUI"];</code>
     */
    public com.google.protobuf.ByteString getAppEui() {
      return appEui_;
    }
    /**
     * <pre>
     * compatible with Metadata message
     * </pre>
     *
     * <code>bytes app_eui = 31 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI", (.gogoproto.customname) = "AppEUI"];</code>
     */
    public Builder setAppEui(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      appEui_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * compatible with Metadata message
     * </pre>
     *
     * <code>bytes app_eui = 31 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI", (.gogoproto.customname) = "AppEUI"];</code>
     */
    public Builder clearAppEui() {
      
      appEui_ = getDefaultInstance().getAppEui();
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


    // @@protoc_insertion_point(builder_scope:discovery.GetByAppEUIRequest)
  }

  // @@protoc_insertion_point(class_scope:discovery.GetByAppEUIRequest)
  private static final org.thethingsnetwork.api.discovery.GetByAppEUIRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.thethingsnetwork.api.discovery.GetByAppEUIRequest();
  }

  public static org.thethingsnetwork.api.discovery.GetByAppEUIRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetByAppEUIRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetByAppEUIRequest>() {
    public GetByAppEUIRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetByAppEUIRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetByAppEUIRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetByAppEUIRequest> getParserForType() {
    return PARSER;
  }

  public org.thethingsnetwork.api.discovery.GetByAppEUIRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

