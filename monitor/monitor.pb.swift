// DO NOT EDIT.
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: github.com/TheThingsNetwork/api/monitor/monitor.proto
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

enum Monitor_Level: SwiftProtobuf.Enum {
  typealias RawValue = Int
  case debug // = 0
  case info // = 1
  case warn // = 2
  case error // = 3
  case fatal // = 4
  case UNRECOGNIZED(Int)

  init() {
    self = .debug
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .debug
    case 1: self = .info
    case 2: self = .warn
    case 3: self = .error
    case 4: self = .fatal
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .debug: return 0
    case .info: return 1
    case .warn: return 2
    case .error: return 3
    case .fatal: return 4
    case .UNRECOGNIZED(let i): return i
    }
  }

}

struct Monitor_LogMessage: SwiftProtobuf.Message {
  static let protoMessageName: String = _protobuf_package + ".LogMessage"

  /// Timestamp of the log message. Will be filled by the server if empty.
  var time: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _storage._time ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_uniqueStorage()._time = newValue}
  }
  /// Returns true if `time` has been explicitly set.
  var hasTime: Bool {return _storage._time != nil}
  /// Clears the value of `time`. Subsequent reads from it will return its default value.
  mutating func clearTime() {_storage._time = nil}

  /// The log level
  /// DEBUG: Messages that help debug the execution of some logic; SHOULD NOT be used in production.
  /// INFO:  Messages that inform about an event (request, uplink, ...); a single event MUST NOT trigger more than one INFO message.
  /// WARN:  Messages that warn about unexpected events, but the program can cope with those just fine (bad user input, something not found).
  /// ERROR: Messages that indicate a problem in the program that may require user intervention, but the program can keep running.
  /// FATAL: Messages that indicate a problem that prevents the program from continuing. FATAL messages trigger an "exit 1" after forwarding.
  var level: Monitor_Level {
    get {return _storage._level}
    set {_uniqueStorage()._level = newValue}
  }

  /// The log message is a short description of what's happening.
  /// - Log messages are full sentences that start with a capital letter.
  /// - Log messages do not shorten words (use "Could not" instead of "Couldn't")
  /// - Log messages do generally not end with a period (for example: "Connected to database").
  /// - Log messages can end with three periods (...) if something is about to happen (for example: "Connecting to database...").
  var message: String {
    get {return _storage._message}
    set {_uniqueStorage()._message = newValue}
  }

  /// Structured log fields allow analyses
  /// - Add fields that are informative
  /// - Add fields that someone might want to use to filter the logs (for example: IDs/EUIs, ...)
  /// - Add fields that someone might want to use to visualize the logs (for example: number of results per query, duration, ...)
  /// - Log field names use PascalCase
  var fields: SwiftProtobuf.Google_Protobuf_Struct {
    get {return _storage._fields ?? SwiftProtobuf.Google_Protobuf_Struct()}
    set {_uniqueStorage()._fields = newValue}
  }
  /// Returns true if `fields` has been explicitly set.
  var hasFields: Bool {return _storage._fields != nil}
  /// Clears the value of `fields`. Subsequent reads from it will return its default value.
  mutating func clearFields() {_storage._fields = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  /// Used by the decoding initializers in the SwiftProtobuf library, not generally
  /// used directly. `init(serializedData:)`, `init(jsonUTF8Data:)`, and other decoding
  /// initializers are defined in the SwiftProtobuf library. See the Message and
  /// Message+*Additions` files.
  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    _ = _uniqueStorage()
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      while let fieldNumber = try decoder.nextFieldNumber() {
        switch fieldNumber {
        case 1: try decoder.decodeSingularMessageField(value: &_storage._time)
        case 2: try decoder.decodeSingularEnumField(value: &_storage._level)
        case 3: try decoder.decodeSingularStringField(value: &_storage._message)
        case 4: try decoder.decodeSingularMessageField(value: &_storage._fields)
        default: break
        }
      }
    }
  }

  /// Used by the encoding methods of the SwiftProtobuf library, not generally
  /// used directly. `Message.serializedData()`, `Message.jsonUTF8Data()`, and
  /// other serializer methods are defined in the SwiftProtobuf library. See the
  /// `Message` and `Message+*Additions` files.
  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      if let v = _storage._time {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
      }
      if _storage._level != .debug {
        try visitor.visitSingularEnumField(value: _storage._level, fieldNumber: 2)
      }
      if !_storage._message.isEmpty {
        try visitor.visitSingularStringField(value: _storage._message, fieldNumber: 3)
      }
      if let v = _storage._fields {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
      }
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  fileprivate var _storage = _StorageClass.defaultInstance
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "monitor"

extension Monitor_Level: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "DEBUG"),
    1: .same(proto: "INFO"),
    2: .same(proto: "WARN"),
    3: .same(proto: "ERROR"),
    4: .same(proto: "FATAL"),
  ]
}

extension Monitor_LogMessage: SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "time"),
    2: .same(proto: "level"),
    3: .same(proto: "message"),
    4: .same(proto: "fields"),
  ]

  fileprivate class _StorageClass {
    var _time: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
    var _level: Monitor_Level = .debug
    var _message: String = String()
    var _fields: SwiftProtobuf.Google_Protobuf_Struct? = nil

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _time = source._time
      _level = source._level
      _message = source._message
      _fields = source._fields
    }
  }

  fileprivate mutating func _uniqueStorage() -> _StorageClass {
    if !isKnownUniquelyReferenced(&_storage) {
      _storage = _StorageClass(copying: _storage)
    }
    return _storage
  }

  func _protobuf_generated_isEqualTo(other: Monitor_LogMessage) -> Bool {
    if _storage !== other._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((_storage, other._storage)) { (_storage, other_storage) in
        if _storage._time != other_storage._time {return false}
        if _storage._level != other_storage._level {return false}
        if _storage._message != other_storage._message {return false}
        if _storage._fields != other_storage._fields {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if unknownFields != other.unknownFields {return false}
    return true
  }
}
