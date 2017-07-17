// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/protocol/lorawan/lorawan.proto

package org.thethingsnetwork.api.protocol.lorawan;

/**
 * Protobuf type {@code lorawan.JoinRequestPayload}
 */
public  final class JoinRequestPayload extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lorawan.JoinRequestPayload)
    JoinRequestPayloadOrBuilder {
  // Use JoinRequestPayload.newBuilder() to construct.
  private JoinRequestPayload(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JoinRequestPayload() {
    appEui_ = com.google.protobuf.ByteString.EMPTY;
    devEui_ = com.google.protobuf.ByteString.EMPTY;
    devNonce_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private JoinRequestPayload(
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

            appEui_ = input.readBytes();
            break;
          }
          case 18: {

            devEui_ = input.readBytes();
            break;
          }
          case 26: {

            devNonce_ = input.readBytes();
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
    return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProtocolProto.internal_static_lorawan_JoinRequestPayload_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProtocolProto.internal_static_lorawan_JoinRequestPayload_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload.class, org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload.Builder.class);
  }

  public static final int APP_EUI_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString appEui_;
  /**
   * <code>bytes app_eui = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI", (.gogoproto.customname) = "AppEUI"];</code>
   */
  public com.google.protobuf.ByteString getAppEui() {
    return appEui_;
  }

  public static final int DEV_EUI_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString devEui_;
  /**
   * <code>bytes dev_eui = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevEUI", (.gogoproto.customname) = "DevEUI"];</code>
   */
  public com.google.protobuf.ByteString getDevEui() {
    return devEui_;
  }

  public static final int DEV_NONCE_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString devNonce_;
  /**
   * <code>bytes dev_nonce = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevNonce"];</code>
   */
  public com.google.protobuf.ByteString getDevNonce() {
    return devNonce_;
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
      output.writeBytes(1, appEui_);
    }
    if (!devEui_.isEmpty()) {
      output.writeBytes(2, devEui_);
    }
    if (!devNonce_.isEmpty()) {
      output.writeBytes(3, devNonce_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!appEui_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, appEui_);
    }
    if (!devEui_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, devEui_);
    }
    if (!devNonce_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, devNonce_);
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
    if (!(obj instanceof org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload)) {
      return super.equals(obj);
    }
    org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload other = (org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload) obj;

    boolean result = true;
    result = result && getAppEui()
        .equals(other.getAppEui());
    result = result && getDevEui()
        .equals(other.getDevEui());
    result = result && getDevNonce()
        .equals(other.getDevNonce());
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
    hash = (37 * hash) + DEV_EUI_FIELD_NUMBER;
    hash = (53 * hash) + getDevEui().hashCode();
    hash = (37 * hash) + DEV_NONCE_FIELD_NUMBER;
    hash = (53 * hash) + getDevNonce().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload parseFrom(
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
  public static Builder newBuilder(org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload prototype) {
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
   * Protobuf type {@code lorawan.JoinRequestPayload}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lorawan.JoinRequestPayload)
      org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayloadOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProtocolProto.internal_static_lorawan_JoinRequestPayload_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProtocolProto.internal_static_lorawan_JoinRequestPayload_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload.class, org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload.Builder.class);
    }

    // Construct using org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload.newBuilder()
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

      devEui_ = com.google.protobuf.ByteString.EMPTY;

      devNonce_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProtocolProto.internal_static_lorawan_JoinRequestPayload_descriptor;
    }

    public org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload getDefaultInstanceForType() {
      return org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload.getDefaultInstance();
    }

    public org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload build() {
      org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload buildPartial() {
      org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload result = new org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload(this);
      result.appEui_ = appEui_;
      result.devEui_ = devEui_;
      result.devNonce_ = devNonce_;
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
      if (other instanceof org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload) {
        return mergeFrom((org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload other) {
      if (other == org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload.getDefaultInstance()) return this;
      if (other.getAppEui() != com.google.protobuf.ByteString.EMPTY) {
        setAppEui(other.getAppEui());
      }
      if (other.getDevEui() != com.google.protobuf.ByteString.EMPTY) {
        setDevEui(other.getDevEui());
      }
      if (other.getDevNonce() != com.google.protobuf.ByteString.EMPTY) {
        setDevNonce(other.getDevNonce());
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
      org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload) e.getUnfinishedMessage();
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
     * <code>bytes app_eui = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI", (.gogoproto.customname) = "AppEUI"];</code>
     */
    public com.google.protobuf.ByteString getAppEui() {
      return appEui_;
    }
    /**
     * <code>bytes app_eui = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI", (.gogoproto.customname) = "AppEUI"];</code>
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
     * <code>bytes app_eui = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI", (.gogoproto.customname) = "AppEUI"];</code>
     */
    public Builder clearAppEui() {
      
      appEui_ = getDefaultInstance().getAppEui();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString devEui_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes dev_eui = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevEUI", (.gogoproto.customname) = "DevEUI"];</code>
     */
    public com.google.protobuf.ByteString getDevEui() {
      return devEui_;
    }
    /**
     * <code>bytes dev_eui = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevEUI", (.gogoproto.customname) = "DevEUI"];</code>
     */
    public Builder setDevEui(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      devEui_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes dev_eui = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevEUI", (.gogoproto.customname) = "DevEUI"];</code>
     */
    public Builder clearDevEui() {
      
      devEui_ = getDefaultInstance().getDevEui();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString devNonce_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes dev_nonce = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevNonce"];</code>
     */
    public com.google.protobuf.ByteString getDevNonce() {
      return devNonce_;
    }
    /**
     * <code>bytes dev_nonce = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevNonce"];</code>
     */
    public Builder setDevNonce(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      devNonce_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes dev_nonce = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevNonce"];</code>
     */
    public Builder clearDevNonce() {
      
      devNonce_ = getDefaultInstance().getDevNonce();
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


    // @@protoc_insertion_point(builder_scope:lorawan.JoinRequestPayload)
  }

  // @@protoc_insertion_point(class_scope:lorawan.JoinRequestPayload)
  private static final org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload();
  }

  public static org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JoinRequestPayload>
      PARSER = new com.google.protobuf.AbstractParser<JoinRequestPayload>() {
    public JoinRequestPayload parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new JoinRequestPayload(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JoinRequestPayload> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JoinRequestPayload> getParserForType() {
    return PARSER;
  }

  public org.thethingsnetwork.api.protocol.lorawan.JoinRequestPayload getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

