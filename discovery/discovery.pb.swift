// DO NOT EDIT.
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: github.com/TheThingsNetwork/api/discovery/discovery.proto
//
// For information on using the generated types, please see the documenation:
//   https://github.com/apple/swift-protobuf/

// Copyright © 2017 The Things Network
// Use of this source code is governed by the MIT license that can be found in the LICENSE file.

import Foundation
import SwiftProtobuf

// If the compiler emits an error on this type, it is because this file
// was generated by a version of the `protoc` Swift plug-in that is
// incompatible with the version of SwiftProtobuf to which you are linking.
// Please ensure that your are building against the same version of the API
// that was used to generate this file.
fileprivate struct _GeneratedWithProtocGenSwiftVersion: SwiftProtobuf.ProtobufAPIVersionCheck {
  struct _2: SwiftProtobuf.ProtobufAPIVersion_2 {}
  typealias Version = _2
}

struct Discovery_Metadata {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// General metadata (0-9)
  var metadata: Discovery_Metadata.OneOf_Metadata? = nil

  /// GatewayID that is registered to this Router
  /// This metadata can only be added if the requesting client is authorized to manage this GatewayID.
  var gatewayID: String {
    get {
      if case .gatewayID(let v)? = metadata {return v}
      return String()
    }
    set {metadata = .gatewayID(newValue)}
  }

  /// DevAddr prefix that is routed by this Broker
  /// 5 bytes; the first byte is the prefix length, the following 4 bytes are the address.
  /// Only authorized Brokers can announce PREFIX metadata.
  var devAddrPrefix: Data {
    get {
      if case .devAddrPrefix(let v)? = metadata {return v}
      return SwiftProtobuf.Internal.emptyData
    }
    set {metadata = .devAddrPrefix(newValue)}
  }

  /// AppID that is registered to this Handler
  /// This metadata can only be added if the requesting client is authorized to manage this AppID.
  var appID: String {
    get {
      if case .appID(let v)? = metadata {return v}
      return String()
    }
    set {metadata = .appID(newValue)}
  }

  /// AppEUI that is registered to this Join Handler
  /// Only authorized Join Handlers can announce APP_EUI metadata (and we don't have any of those yet).
  var appEui: Data {
    get {
      if case .appEui(let v)? = metadata {return v}
      return SwiftProtobuf.Internal.emptyData
    }
    set {metadata = .appEui(newValue)}
  }

  var unknownFields = SwiftProtobuf.UnknownStorage()

  /// General metadata (0-9)
  enum OneOf_Metadata: Equatable {
    /// GatewayID that is registered to this Router
    /// This metadata can only be added if the requesting client is authorized to manage this GatewayID.
    case gatewayID(String)
    /// DevAddr prefix that is routed by this Broker
    /// 5 bytes; the first byte is the prefix length, the following 4 bytes are the address.
    /// Only authorized Brokers can announce PREFIX metadata.
    case devAddrPrefix(Data)
    /// AppID that is registered to this Handler
    /// This metadata can only be added if the requesting client is authorized to manage this AppID.
    case appID(String)
    /// AppEUI that is registered to this Join Handler
    /// Only authorized Join Handlers can announce APP_EUI metadata (and we don't have any of those yet).
    case appEui(Data)

  #if !swift(>=4.1)
    static func ==(lhs: Discovery_Metadata.OneOf_Metadata, rhs: Discovery_Metadata.OneOf_Metadata) -> Bool {
      switch (lhs, rhs) {
      case (.gatewayID(let l), .gatewayID(let r)): return l == r
      case (.devAddrPrefix(let l), .devAddrPrefix(let r)): return l == r
      case (.appID(let l), .appID(let r)): return l == r
      case (.appEui(let l), .appEui(let r)): return l == r
      default: return false
      }
    }
  #endif
  }

  init() {}
}

/// The Announcement of a service (also called component)
struct Discovery_Announcement {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// The ID of the component
  var id: String = String()

  /// The name of the component (router/broker/handler)
  var serviceName: String = String()

  /// Service version in the form "[version]-[commit] ([build date])"
  var serviceVersion: String = String()

  /// Description of the component
  var description_p: String = String()

  /// URL with documentation or more information about this component
  var url: String = String()

  /// Indicates whether this service is part of The Things Network (the public community network)
  var `public`: Bool = false

  /// Comma-separated network addresses in the form "domain1:port,domain2:port,domain3:port" (currently we only use the first)
  var netAddress: String = String()

  /// ECDSA public key of this component
  var publicKey: String = String()

  /// TLS Certificate for gRPC on net_address (if TLS is enabled)
  var certificate: String = String()

  /// Contains the address where the HTTP API is exposed (if there is one).
  /// Format of api_address: `http(s)://domain(:port)`
  /// default http port is 80, default https port is 443.
  var apiAddress: String = String()

  /// Contains the address where the MQTT API is exposed (if there is one)
  /// Format of mqtt_address: `(mqtt(s)://)host(:port)`
  /// default mqtt port is 1883, default mqtts port is 8883.
  /// Examples:
  /// if `host:port` then `mqtt://host:port`
  /// if `host:8883` then `mqtts://host:8883`
  /// if `host` then `mqtt://host:1883` and `mqtts://host:8883`
  /// if `mqtt://host` then `mqtt://host:1883`
  /// if `mqtts://host` then `mqtt://host:1883` and `mqtts://host:8883`
  var mqttAddress: String = String()

  /// Contains the address where the AMQP API is exposed (if there is one)
  /// Format of amqp_address: `(amqp(s)://)host(:port)`
  /// default amqp port is 5672, default amqps port is 5671.
  /// Examples:
  /// if `host:port` then `amqp://host:port`
  /// if `host:5671` then `amqps://host:5671`
  /// if `host` then `amqp://host:5672` and `amqps://host:5671`
  /// if `amqp://host` then `amqp://host:5672`
  /// if `amqps://host` then `amqp://host:5672` and `amqps://host:5671`
  var amqpAddress: String = String()

  /// Metadata for this component
  var metadata: [Discovery_Metadata] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Discovery_GetServiceRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// The name of the service (router/broker/handler)
  var serviceName: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// The identifier of the service that should be returned
struct Discovery_GetRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// The ID of the service
  var id: String = String()

  /// The name of the service (router/broker/handler)
  var serviceName: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// The metadata to add or remove from an announement
struct Discovery_MetadataRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// The ID of the service that should be modified
  var id: String {
    get {return _storage._id}
    set {_uniqueStorage()._id = newValue}
  }

  /// The name of the service (router/broker/handler) that should be modified
  var serviceName: String {
    get {return _storage._serviceName}
    set {_uniqueStorage()._serviceName = newValue}
  }

  /// Metadata to add or remove
  var metadata: Discovery_Metadata {
    get {return _storage._metadata ?? Discovery_Metadata()}
    set {_uniqueStorage()._metadata = newValue}
  }
  /// Returns true if `metadata` has been explicitly set.
  var hasMetadata: Bool {return _storage._metadata != nil}
  /// Clears the value of `metadata`. Subsequent reads from it will return its default value.
  mutating func clearMetadata() {_uniqueStorage()._metadata = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

/// A list of announcements
struct Discovery_AnnouncementsResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var services: [Discovery_Announcement] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Discovery_GetByAppIDRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// compatible with Metadata message
  var appID: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Discovery_GetByGatewayIDRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// compatible with Metadata message
  var gatewayID: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Discovery_GetByAppEUIRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// compatible with Metadata message
  var appEui: Data = SwiftProtobuf.Internal.emptyData

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "discovery"

extension Discovery_Metadata: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Metadata"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    10: .standard(proto: "gateway_id"),
    20: .standard(proto: "dev_addr_prefix"),
    30: .standard(proto: "app_id"),
    31: .standard(proto: "app_eui"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 10:
        if self.metadata != nil {try decoder.handleConflictingOneOf()}
        var v: String?
        try decoder.decodeSingularStringField(value: &v)
        if let v = v {self.metadata = .gatewayID(v)}
      case 20:
        if self.metadata != nil {try decoder.handleConflictingOneOf()}
        var v: Data?
        try decoder.decodeSingularBytesField(value: &v)
        if let v = v {self.metadata = .devAddrPrefix(v)}
      case 30:
        if self.metadata != nil {try decoder.handleConflictingOneOf()}
        var v: String?
        try decoder.decodeSingularStringField(value: &v)
        if let v = v {self.metadata = .appID(v)}
      case 31:
        if self.metadata != nil {try decoder.handleConflictingOneOf()}
        var v: Data?
        try decoder.decodeSingularBytesField(value: &v)
        if let v = v {self.metadata = .appEui(v)}
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    switch self.metadata {
    case .gatewayID(let v)?:
      try visitor.visitSingularStringField(value: v, fieldNumber: 10)
    case .devAddrPrefix(let v)?:
      try visitor.visitSingularBytesField(value: v, fieldNumber: 20)
    case .appID(let v)?:
      try visitor.visitSingularStringField(value: v, fieldNumber: 30)
    case .appEui(let v)?:
      try visitor.visitSingularBytesField(value: v, fieldNumber: 31)
    case nil: break
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Discovery_Metadata, rhs: Discovery_Metadata) -> Bool {
    if lhs.metadata != rhs.metadata {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Discovery_Announcement: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Announcement"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .standard(proto: "service_name"),
    3: .standard(proto: "service_version"),
    4: .same(proto: "description"),
    5: .same(proto: "url"),
    6: .same(proto: "public"),
    11: .standard(proto: "net_address"),
    12: .standard(proto: "public_key"),
    13: .same(proto: "certificate"),
    14: .standard(proto: "api_address"),
    15: .standard(proto: "mqtt_address"),
    16: .standard(proto: "amqp_address"),
    22: .same(proto: "metadata"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularStringField(value: &self.id)
      case 2: try decoder.decodeSingularStringField(value: &self.serviceName)
      case 3: try decoder.decodeSingularStringField(value: &self.serviceVersion)
      case 4: try decoder.decodeSingularStringField(value: &self.description_p)
      case 5: try decoder.decodeSingularStringField(value: &self.url)
      case 6: try decoder.decodeSingularBoolField(value: &self.`public`)
      case 11: try decoder.decodeSingularStringField(value: &self.netAddress)
      case 12: try decoder.decodeSingularStringField(value: &self.publicKey)
      case 13: try decoder.decodeSingularStringField(value: &self.certificate)
      case 14: try decoder.decodeSingularStringField(value: &self.apiAddress)
      case 15: try decoder.decodeSingularStringField(value: &self.mqttAddress)
      case 16: try decoder.decodeSingularStringField(value: &self.amqpAddress)
      case 22: try decoder.decodeRepeatedMessageField(value: &self.metadata)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.id.isEmpty {
      try visitor.visitSingularStringField(value: self.id, fieldNumber: 1)
    }
    if !self.serviceName.isEmpty {
      try visitor.visitSingularStringField(value: self.serviceName, fieldNumber: 2)
    }
    if !self.serviceVersion.isEmpty {
      try visitor.visitSingularStringField(value: self.serviceVersion, fieldNumber: 3)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 4)
    }
    if !self.url.isEmpty {
      try visitor.visitSingularStringField(value: self.url, fieldNumber: 5)
    }
    if self.`public` != false {
      try visitor.visitSingularBoolField(value: self.`public`, fieldNumber: 6)
    }
    if !self.netAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.netAddress, fieldNumber: 11)
    }
    if !self.publicKey.isEmpty {
      try visitor.visitSingularStringField(value: self.publicKey, fieldNumber: 12)
    }
    if !self.certificate.isEmpty {
      try visitor.visitSingularStringField(value: self.certificate, fieldNumber: 13)
    }
    if !self.apiAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.apiAddress, fieldNumber: 14)
    }
    if !self.mqttAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.mqttAddress, fieldNumber: 15)
    }
    if !self.amqpAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.amqpAddress, fieldNumber: 16)
    }
    if !self.metadata.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.metadata, fieldNumber: 22)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Discovery_Announcement, rhs: Discovery_Announcement) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.serviceName != rhs.serviceName {return false}
    if lhs.serviceVersion != rhs.serviceVersion {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.url != rhs.url {return false}
    if lhs.`public` != rhs.`public` {return false}
    if lhs.netAddress != rhs.netAddress {return false}
    if lhs.publicKey != rhs.publicKey {return false}
    if lhs.certificate != rhs.certificate {return false}
    if lhs.apiAddress != rhs.apiAddress {return false}
    if lhs.mqttAddress != rhs.mqttAddress {return false}
    if lhs.amqpAddress != rhs.amqpAddress {return false}
    if lhs.metadata != rhs.metadata {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Discovery_GetServiceRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GetServiceRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "service_name"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularStringField(value: &self.serviceName)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.serviceName.isEmpty {
      try visitor.visitSingularStringField(value: self.serviceName, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Discovery_GetServiceRequest, rhs: Discovery_GetServiceRequest) -> Bool {
    if lhs.serviceName != rhs.serviceName {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Discovery_GetRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GetRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .standard(proto: "service_name"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularStringField(value: &self.id)
      case 2: try decoder.decodeSingularStringField(value: &self.serviceName)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.id.isEmpty {
      try visitor.visitSingularStringField(value: self.id, fieldNumber: 1)
    }
    if !self.serviceName.isEmpty {
      try visitor.visitSingularStringField(value: self.serviceName, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Discovery_GetRequest, rhs: Discovery_GetRequest) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.serviceName != rhs.serviceName {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Discovery_MetadataRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MetadataRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .standard(proto: "service_name"),
    12: .same(proto: "metadata"),
  ]

  fileprivate class _StorageClass {
    var _id: String = String()
    var _serviceName: String = String()
    var _metadata: Discovery_Metadata? = nil

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _id = source._id
      _serviceName = source._serviceName
      _metadata = source._metadata
    }
  }

  fileprivate mutating func _uniqueStorage() -> _StorageClass {
    if !isKnownUniquelyReferenced(&_storage) {
      _storage = _StorageClass(copying: _storage)
    }
    return _storage
  }

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    _ = _uniqueStorage()
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      while let fieldNumber = try decoder.nextFieldNumber() {
        switch fieldNumber {
        case 1: try decoder.decodeSingularStringField(value: &_storage._id)
        case 2: try decoder.decodeSingularStringField(value: &_storage._serviceName)
        case 12: try decoder.decodeSingularMessageField(value: &_storage._metadata)
        default: break
        }
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      if !_storage._id.isEmpty {
        try visitor.visitSingularStringField(value: _storage._id, fieldNumber: 1)
      }
      if !_storage._serviceName.isEmpty {
        try visitor.visitSingularStringField(value: _storage._serviceName, fieldNumber: 2)
      }
      if let v = _storage._metadata {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 12)
      }
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Discovery_MetadataRequest, rhs: Discovery_MetadataRequest) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._id != rhs_storage._id {return false}
        if _storage._serviceName != rhs_storage._serviceName {return false}
        if _storage._metadata != rhs_storage._metadata {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Discovery_AnnouncementsResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".AnnouncementsResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "services"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeRepeatedMessageField(value: &self.services)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.services.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.services, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Discovery_AnnouncementsResponse, rhs: Discovery_AnnouncementsResponse) -> Bool {
    if lhs.services != rhs.services {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Discovery_GetByAppIDRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GetByAppIDRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    30: .standard(proto: "app_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 30: try decoder.decodeSingularStringField(value: &self.appID)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.appID.isEmpty {
      try visitor.visitSingularStringField(value: self.appID, fieldNumber: 30)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Discovery_GetByAppIDRequest, rhs: Discovery_GetByAppIDRequest) -> Bool {
    if lhs.appID != rhs.appID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Discovery_GetByGatewayIDRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GetByGatewayIDRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    30: .standard(proto: "gateway_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 30: try decoder.decodeSingularStringField(value: &self.gatewayID)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.gatewayID.isEmpty {
      try visitor.visitSingularStringField(value: self.gatewayID, fieldNumber: 30)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Discovery_GetByGatewayIDRequest, rhs: Discovery_GetByGatewayIDRequest) -> Bool {
    if lhs.gatewayID != rhs.gatewayID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Discovery_GetByAppEUIRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GetByAppEUIRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    31: .standard(proto: "app_eui"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 31: try decoder.decodeSingularBytesField(value: &self.appEui)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.appEui.isEmpty {
      try visitor.visitSingularBytesField(value: self.appEui, fieldNumber: 31)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Discovery_GetByAppEUIRequest, rhs: Discovery_GetByAppEUIRequest) -> Bool {
    if lhs.appEui != rhs.appEui {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
