// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/handler/handler.proto

package org.thethingsnetwork.api.handler;

public final class HandlerProto {
  private HandlerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_handler_DeviceActivationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_handler_DeviceActivationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_handler_StatusRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_handler_StatusRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_handler_Status_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_handler_Status_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_handler_ApplicationIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_handler_ApplicationIdentifier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_handler_Application_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_handler_Application_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_handler_DeviceIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_handler_DeviceIdentifier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_handler_Device_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_handler_Device_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_handler_Device_AttributesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_handler_Device_AttributesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_handler_DeviceList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_handler_DeviceList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_handler_DryDownlinkMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_handler_DryDownlinkMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_handler_DryUplinkMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_handler_DryUplinkMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_handler_SimulatedUplinkMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_handler_SimulatedUplinkMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_handler_LogEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_handler_LogEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_handler_DryUplinkResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_handler_DryUplinkResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_handler_DryDownlinkResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_handler_DryDownlinkResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5github.com/TheThingsNetwork/api/handle" +
      "r/handler.proto\022\007handler\032\033google/protobu" +
      "f/empty.proto\032\034google/api/annotations.pr" +
      "oto\032-github.com/gogo/protobuf/gogoproto/" +
      "gogo.proto\032)github.com/TheThingsNetwork/" +
      "api/api.proto\0323github.com/TheThingsNetwo" +
      "rk/api/broker/broker.proto\0327github.com/T" +
      "heThingsNetwork/api/protocol/protocol.pr" +
      "oto\032=github.com/TheThingsNetwork/api/pro" +
      "tocol/lorawan/device.proto\0321github.com/T" +
      "heThingsNetwork/api/trace/trace.proto\"\344\001" +
      "\n\030DeviceActivationResponse\022\017\n\007payload\030\001 " +
      "\001(\014\022\"\n\007message\030\002 \001(\0132\021.protocol.Message\022" +
      "5\n\017downlink_option\030\013 \001(\0132\026.broker.Downli" +
      "nkOptionB\004\310\336\037\000\022?\n\023activation_metadata\030\027 " +
      "\001(\0132\034.protocol.ActivationMetadataB\004\310\336\037\000\022" +
      "\033\n\005trace\030\037 \001(\0132\014.trace.Trace\"\017\n\rStatusRe" +
      "quest\"\271\001\n\006Status\022&\n\006system\030\001 \001(\0132\020.api.S" +
      "ystemStatsB\004\310\336\037\000\022,\n\tcomponent\030\002 \001(\0132\023.ap" +
      "i.ComponentStatsB\004\310\336\037\000\022\032\n\006uplink\030\013 \001(\0132\n" +
      ".api.Rates\022\034\n\010downlink\030\014 \001(\0132\n.api.Rates" +
      "\022\037\n\013activations\030\r \001(\0132\n.api.Rates\"2\n\025App" +
      "licationIdentifier\022\031\n\006app_id\030\001 \001(\tB\t\342\336\037\005" +
      "AppID\"\255\001\n\013Application\022\031\n\006app_id\030\001 \001(\tB\t\342" +
      "\336\037\005AppID\022\026\n\016payload_format\030\006 \001(\t\022\017\n\007deco" +
      "der\030\002 \001(\t\022\021\n\tconverter\030\003 \001(\t\022\021\n\tvalidato" +
      "r\030\004 \001(\t\022\017\n\007encoder\030\005 \001(\t\022#\n\033register_on_" +
      "join_access_key\030\007 \001(\t\"H\n\020DeviceIdentifie" +
      "r\022\031\n\006app_id\030\001 \001(\tB\t\342\336\037\005AppID\022\031\n\006dev_id\030\002" +
      " \001(\tB\t\342\336\037\005DevID\"\272\002\n\006Device\022\031\n\006app_id\030\001 \001" +
      "(\tB\t\342\336\037\005AppID\022\031\n\006dev_id\030\002 \001(\tB\t\342\336\037\005DevID" +
      "\022<\n\016lorawan_device\030\003 \001(\0132\017.lorawan.Devic" +
      "eB\021\342\336\037\rLoRaWANDeviceH\000\022\020\n\010latitude\030\n \001(\002" +
      "\022\021\n\tlongitude\030\013 \001(\002\022\020\n\010altitude\030\014 \001(\005\0223\n" +
      "\nattributes\030\r \003(\0132\037.handler.Device.Attri" +
      "butesEntry\022\023\n\013description\030\024 \001(\t\0321\n\017Attri" +
      "butesEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\002" +
      "8\001B\010\n\006device\".\n\nDeviceList\022 \n\007devices\030\001 " +
      "\003(\0132\017.handler.Device\"l\n\022DryDownlinkMessa" +
      "ge\022\017\n\007payload\030\001 \001(\014\022\016\n\006fields\030\002 \001(\t\022\'\n\003a" +
      "pp\030\003 \001(\0132\024.handler.ApplicationB\004\310\336\037\000\022\014\n\004" +
      "port\030\004 \001(\r\"Z\n\020DryUplinkMessage\022\017\n\007payloa" +
      "d\030\001 \001(\014\022\'\n\003app\030\002 \001(\0132\024.handler.Applicati" +
      "onB\004\310\336\037\000\022\014\n\004port\030\003 \001(\r\"m\n\026SimulatedUplin" +
      "kMessage\022\031\n\006app_id\030\001 \001(\tB\t\342\336\037\005AppID\022\031\n\006d" +
      "ev_id\030\002 \001(\tB\t\342\336\037\005DevID\022\017\n\007payload\030\003 \001(\014\022" +
      "\014\n\004port\030\004 \001(\r\",\n\010LogEntry\022\020\n\010function\030\001 " +
      "\001(\t\022\016\n\006fields\030\002 \003(\t\"b\n\017DryUplinkResult\022\017" +
      "\n\007payload\030\001 \001(\014\022\016\n\006fields\030\002 \001(\t\022\r\n\005valid" +
      "\030\003 \001(\010\022\037\n\004logs\030\004 \003(\0132\021.handler.LogEntry\"" +
      "E\n\021DryDownlinkResult\022\017\n\007payload\030\001 \001(\014\022\037\n" +
      "\004logs\030\002 \003(\0132\021.handler.LogEntry2\305\001\n\007Handl" +
      "er\022^\n\023ActivationChallenge\022\".broker.Activ" +
      "ationChallengeRequest\032#.broker.Activatio" +
      "nChallengeResponse\022Z\n\010Activate\022+.broker." +
      "DeduplicatedDeviceActivationRequest\032!.ha" +
      "ndler.DeviceActivationResponse2\343\t\n\022Appli" +
      "cationManager\022g\n\023RegisterApplication\022\036.h" +
      "andler.ApplicationIdentifier\032\026.google.pr" +
      "otobuf.Empty\"\030\202\323\344\223\002\022\"\r/applications:\001*\022f" +
      "\n\016GetApplication\022\036.handler.ApplicationId" +
      "entifier\032\024.handler.Application\"\036\202\323\344\223\002\030\022\026" +
      "/applications/{app_id}\022~\n\016SetApplication" +
      "\022\024.handler.Application\032\026.google.protobuf" +
      ".Empty\">\202\323\344\223\0028\"\026/applications/{app_id}:\001" +
      "*Z\033\032\026/applications/{app_id}:\001*\022k\n\021Delete" +
      "Application\022\036.handler.ApplicationIdentif" +
      "ier\032\026.google.protobuf.Empty\"\036\202\323\344\223\002\030*\026/ap" +
      "plications/{app_id}\022h\n\tGetDevice\022\031.handl" +
      "er.DeviceIdentifier\032\017.handler.Device\"/\202\323" +
      "\344\223\002)\022\'/applications/{app_id}/devices/{de" +
      "v_id}\022\342\001\n\tSetDevice\022\017.handler.Device\032\026.g" +
      "oogle.protobuf.Empty\"\253\001\202\323\344\223\002\244\001\"\'/applica" +
      "tions/{app_id}/devices/{dev_id}:\001*Z,\032\'/a" +
      "pplications/{app_id}/devices/{dev_id}:\001*" +
      "Z#\"\036/applications/{app_id}/devices:\001*Z#\032" +
      "\036/applications/{app_id}/devices:\001*\022r\n\014De" +
      "leteDevice\022\031.handler.DeviceIdentifier\032\026." +
      "google.protobuf.Empty\"/\202\323\344\223\002)*\'/applicat" +
      "ions/{app_id}/devices/{dev_id}\022w\n\030GetDev" +
      "icesForApplication\022\036.handler.Application" +
      "Identifier\032\023.handler.DeviceList\"&\202\323\344\223\002 \022" +
      "\036/applications/{app_id}/devices\022F\n\013DryDo" +
      "wnlink\022\033.handler.DryDownlinkMessage\032\032.ha" +
      "ndler.DryDownlinkResult\022@\n\tDryUplink\022\031.h" +
      "andler.DryUplinkMessage\032\030.handler.DryUpl" +
      "inkResult\022I\n\016SimulateUplink\022\037.handler.Si" +
      "mulatedUplinkMessage\032\026.google.protobuf.E" +
      "mpty2F\n\016HandlerManager\0224\n\tGetStatus\022\026.ha" +
      "ndler.StatusRequest\032\017.handler.StatusBz\n " +
      "org.thethingsnetwork.api.handlerB\014Handle" +
      "rProtoP\001Z\'github.com/TheThingsNetwork/ap" +
      "i/handler\252\002\034TheThingsNetwork.API.Handler" +
      "b\006proto3"
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
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.GoGoProtos.getDescriptor(),
          org.thethingsnetwork.api.APIProto.getDescriptor(),
          org.thethingsnetwork.api.broker.BrokerProto.getDescriptor(),
          org.thethingsnetwork.api.protocol.ProtocolProto.getDescriptor(),
          org.thethingsnetwork.api.protocol.lorawan.LoRaWANDeviceProto.getDescriptor(),
          org.thethingsnetwork.api.trace.TraceProto.getDescriptor(),
        }, assigner);
    internal_static_handler_DeviceActivationResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_handler_DeviceActivationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_handler_DeviceActivationResponse_descriptor,
        new java.lang.String[] { "Payload", "Message", "DownlinkOption", "ActivationMetadata", "Trace", });
    internal_static_handler_StatusRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_handler_StatusRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_handler_StatusRequest_descriptor,
        new java.lang.String[] { });
    internal_static_handler_Status_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_handler_Status_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_handler_Status_descriptor,
        new java.lang.String[] { "System", "Component", "Uplink", "Downlink", "Activations", });
    internal_static_handler_ApplicationIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_handler_ApplicationIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_handler_ApplicationIdentifier_descriptor,
        new java.lang.String[] { "AppId", });
    internal_static_handler_Application_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_handler_Application_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_handler_Application_descriptor,
        new java.lang.String[] { "AppId", "PayloadFormat", "Decoder", "Converter", "Validator", "Encoder", "RegisterOnJoinAccessKey", });
    internal_static_handler_DeviceIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_handler_DeviceIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_handler_DeviceIdentifier_descriptor,
        new java.lang.String[] { "AppId", "DevId", });
    internal_static_handler_Device_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_handler_Device_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_handler_Device_descriptor,
        new java.lang.String[] { "AppId", "DevId", "LorawanDevice", "Latitude", "Longitude", "Altitude", "Attributes", "Description", "Device", });
    internal_static_handler_Device_AttributesEntry_descriptor =
      internal_static_handler_Device_descriptor.getNestedTypes().get(0);
    internal_static_handler_Device_AttributesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_handler_Device_AttributesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_handler_DeviceList_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_handler_DeviceList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_handler_DeviceList_descriptor,
        new java.lang.String[] { "Devices", });
    internal_static_handler_DryDownlinkMessage_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_handler_DryDownlinkMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_handler_DryDownlinkMessage_descriptor,
        new java.lang.String[] { "Payload", "Fields", "App", "Port", });
    internal_static_handler_DryUplinkMessage_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_handler_DryUplinkMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_handler_DryUplinkMessage_descriptor,
        new java.lang.String[] { "Payload", "App", "Port", });
    internal_static_handler_SimulatedUplinkMessage_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_handler_SimulatedUplinkMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_handler_SimulatedUplinkMessage_descriptor,
        new java.lang.String[] { "AppId", "DevId", "Payload", "Port", });
    internal_static_handler_LogEntry_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_handler_LogEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_handler_LogEntry_descriptor,
        new java.lang.String[] { "Function", "Fields", });
    internal_static_handler_DryUplinkResult_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_handler_DryUplinkResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_handler_DryUplinkResult_descriptor,
        new java.lang.String[] { "Payload", "Fields", "Valid", "Logs", });
    internal_static_handler_DryDownlinkResult_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_handler_DryDownlinkResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_handler_DryDownlinkResult_descriptor,
        new java.lang.String[] { "Payload", "Logs", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.customname);
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.GoGoProtos.getDescriptor();
    org.thethingsnetwork.api.APIProto.getDescriptor();
    org.thethingsnetwork.api.broker.BrokerProto.getDescriptor();
    org.thethingsnetwork.api.protocol.ProtocolProto.getDescriptor();
    org.thethingsnetwork.api.protocol.lorawan.LoRaWANDeviceProto.getDescriptor();
    org.thethingsnetwork.api.trace.TraceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
