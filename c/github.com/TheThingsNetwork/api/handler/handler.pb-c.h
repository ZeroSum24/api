/* Generated by the protocol buffer compiler.  DO NOT EDIT! */
/* Generated from: github.com/TheThingsNetwork/api/handler/handler.proto */

#ifndef PROTOBUF_C_github_2ecom_2fTheThingsNetwork_2fapi_2fhandler_2fhandler_2eproto__INCLUDED
#define PROTOBUF_C_github_2ecom_2fTheThingsNetwork_2fapi_2fhandler_2fhandler_2eproto__INCLUDED

#include <protobuf-c/protobuf-c.h>

PROTOBUF_C__BEGIN_DECLS

#if PROTOBUF_C_VERSION_NUMBER < 1003000
# error This file was generated by a newer version of protoc-c which is incompatible with your libprotobuf-c headers. Please update your headers.
#elif 1003001 < PROTOBUF_C_MIN_COMPILER_VERSION
# error This file was generated by an older version of protoc-c which is incompatible with your libprotobuf-c headers. Please regenerate this file with a newer version of protoc-c.
#endif

#include "google/protobuf/empty.pb-c.h"
#include "google/api/annotations.pb-c.h"
#include "github.com/gogo/protobuf/gogoproto/gogo.pb-c.h"
#include "github.com/TheThingsNetwork/api/api.pb-c.h"
#include "github.com/TheThingsNetwork/api/broker/broker.pb-c.h"
#include "github.com/TheThingsNetwork/api/protocol/protocol.pb-c.h"
#include "github.com/TheThingsNetwork/api/protocol/lorawan/device.pb-c.h"
#include "github.com/TheThingsNetwork/api/trace/trace.pb-c.h"

typedef struct _Handler__DeviceActivationResponse Handler__DeviceActivationResponse;
typedef struct _Handler__StatusRequest Handler__StatusRequest;
typedef struct _Handler__Status Handler__Status;
typedef struct _Handler__ApplicationIdentifier Handler__ApplicationIdentifier;
typedef struct _Handler__Application Handler__Application;
typedef struct _Handler__DeviceIdentifier Handler__DeviceIdentifier;
typedef struct _Handler__Device Handler__Device;
typedef struct _Handler__Device__AttributesEntry Handler__Device__AttributesEntry;
typedef struct _Handler__DeviceList Handler__DeviceList;
typedef struct _Handler__DryDownlinkMessage Handler__DryDownlinkMessage;
typedef struct _Handler__DryUplinkMessage Handler__DryUplinkMessage;
typedef struct _Handler__SimulatedUplinkMessage Handler__SimulatedUplinkMessage;
typedef struct _Handler__LogEntry Handler__LogEntry;
typedef struct _Handler__DryUplinkResult Handler__DryUplinkResult;
typedef struct _Handler__DryDownlinkResult Handler__DryDownlinkResult;


/* --- enums --- */


/* --- messages --- */

struct  _Handler__DeviceActivationResponse
{
  ProtobufCMessage base;
  ProtobufCBinaryData payload;
  Protocol__Message *message;
  Broker__DownlinkOption *downlink_option;
  Protocol__ActivationMetadata *activation_metadata;
  Trace__Trace *trace;
};
#define HANDLER__DEVICE_ACTIVATION_RESPONSE__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&handler__device_activation_response__descriptor) \
    , {0,NULL}, NULL, NULL, NULL, NULL }


/*
 * message StatusRequest is used to request the status of this Handler
 */
struct  _Handler__StatusRequest
{
  ProtobufCMessage base;
};
#define HANDLER__STATUS_REQUEST__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&handler__status_request__descriptor) \
     }


/*
 * message Status is the response to the StatusRequest
 */
struct  _Handler__Status
{
  ProtobufCMessage base;
  Api__SystemStats *system;
  Api__ComponentStats *component;
  Api__Rates *uplink;
  Api__Rates *downlink;
  Api__Rates *activations;
};
#define HANDLER__STATUS__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&handler__status__descriptor) \
    , NULL, NULL, NULL, NULL, NULL }


struct  _Handler__ApplicationIdentifier
{
  ProtobufCMessage base;
  char *app_id;
};
#define HANDLER__APPLICATION_IDENTIFIER__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&handler__application_identifier__descriptor) \
    , (char *)protobuf_c_empty_string }


/*
 * The Application settings
 */
struct  _Handler__Application
{
  ProtobufCMessage base;
  char *app_id;
  /*
   * The payload format indicates how payload is formatted.
   */
  char *payload_format;
  /*
   * The decoder is a JavaScript function that decodes a byte array to an object.
   * This function is used when the payload format is set to custom.
   */
  char *decoder;
  /*
   * The converter is a JavaScript function that can be used to convert values
   * in the object returned from the decoder. This can for example be useful to
   * convert a voltage to a temperature. This function is used when the payload format is set to custom.
   */
  char *converter;
  /*
   * The validator is a JavaScript function that checks the validity of the
   * object returned by the decoder or converter. If validation fails, the
   * message is dropped. This function is used when the payload format is set to custom.
   */
  char *validator;
  /*
   * The encoder is a JavaScript function that encodes an object to a byte array.
   * This function is used when the payload format is set to custom.
   */
  char *encoder;
  /*
   * The "register on join" access key should only be set if devices need to be registered on join
   */
  char *register_on_join_access_key;
};
#define HANDLER__APPLICATION__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&handler__application__descriptor) \
    , (char *)protobuf_c_empty_string, (char *)protobuf_c_empty_string, (char *)protobuf_c_empty_string, (char *)protobuf_c_empty_string, (char *)protobuf_c_empty_string, (char *)protobuf_c_empty_string, (char *)protobuf_c_empty_string }


struct  _Handler__DeviceIdentifier
{
  ProtobufCMessage base;
  char *app_id;
  char *dev_id;
};
#define HANDLER__DEVICE_IDENTIFIER__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&handler__device_identifier__descriptor) \
    , (char *)protobuf_c_empty_string, (char *)protobuf_c_empty_string }


struct  _Handler__Device__AttributesEntry
{
  ProtobufCMessage base;
  char *key;
  char *value;
};
#define HANDLER__DEVICE__ATTRIBUTES_ENTRY__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&handler__device__attributes_entry__descriptor) \
    , (char *)protobuf_c_empty_string, (char *)protobuf_c_empty_string }


typedef enum {
  HANDLER__DEVICE__DEVICE__NOT_SET = 0,
  HANDLER__DEVICE__DEVICE_LORAWAN_DEVICE = 3
    PROTOBUF_C__FORCE_ENUM_TO_BE_INT_SIZE(HANDLER__DEVICE__DEVICE)
} Handler__Device__DeviceCase;

/*
 * The Device settings
 */
struct  _Handler__Device
{
  ProtobufCMessage base;
  char *app_id;
  char *dev_id;
  float latitude;
  float longitude;
  int32_t altitude;
  size_t n_attributes;
  Handler__Device__AttributesEntry **attributes;
  char *description;
  Handler__Device__DeviceCase device_case;
  union {
    Lorawan__Device *lorawan_device;
  };
};
#define HANDLER__DEVICE__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&handler__device__descriptor) \
    , (char *)protobuf_c_empty_string, (char *)protobuf_c_empty_string, 0, 0, 0, 0,NULL, (char *)protobuf_c_empty_string, HANDLER__DEVICE__DEVICE__NOT_SET, {0} }


struct  _Handler__DeviceList
{
  ProtobufCMessage base;
  size_t n_devices;
  Handler__Device **devices;
};
#define HANDLER__DEVICE_LIST__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&handler__device_list__descriptor) \
    , 0,NULL }


/*
 * DryDownlinkMessage is a simulated message to test downlink processing
 */
struct  _Handler__DryDownlinkMessage
{
  ProtobufCMessage base;
  /*
   * The binary payload to use
   */
  ProtobufCBinaryData payload;
  /*
   * JSON-encoded object with fields to encode
   */
  char *fields;
  /*
   * The Application containing the payload functions that should be executed
   */
  Handler__Application *app;
  /*
   * The port number that should be passed to the payload function
   */
  uint32_t port;
};
#define HANDLER__DRY_DOWNLINK_MESSAGE__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&handler__dry_downlink_message__descriptor) \
    , {0,NULL}, (char *)protobuf_c_empty_string, NULL, 0 }


/*
 * DryUplinkMessage is a simulated message to test uplink processing
 */
struct  _Handler__DryUplinkMessage
{
  ProtobufCMessage base;
  /*
   * The binary payload to use
   */
  ProtobufCBinaryData payload;
  /*
   * The Application containing the payload functions that should be executed
   */
  Handler__Application *app;
  /*
   * The port number that should be passed to the payload function
   */
  uint32_t port;
};
#define HANDLER__DRY_UPLINK_MESSAGE__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&handler__dry_uplink_message__descriptor) \
    , {0,NULL}, NULL, 0 }


/*
 * SimulatedUplinkMessage is a simulated uplink message
 */
struct  _Handler__SimulatedUplinkMessage
{
  ProtobufCMessage base;
  char *app_id;
  char *dev_id;
  /*
   * The binary payload to use
   */
  ProtobufCBinaryData payload;
  /*
   * The port number
   */
  uint32_t port;
};
#define HANDLER__SIMULATED_UPLINK_MESSAGE__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&handler__simulated_uplink_message__descriptor) \
    , (char *)protobuf_c_empty_string, (char *)protobuf_c_empty_string, {0,NULL}, 0 }


struct  _Handler__LogEntry
{
  ProtobufCMessage base;
  /*
   * The location where the log was created (what payload function)
   */
  char *function;
  /*
   * A list of JSON-encoded fields that were logged
   */
  size_t n_fields;
  char **fields;
};
#define HANDLER__LOG_ENTRY__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&handler__log_entry__descriptor) \
    , (char *)protobuf_c_empty_string, 0,NULL }


/*
 * DryUplinkResult is the result from an uplink simulation
 */
struct  _Handler__DryUplinkResult
{
  ProtobufCMessage base;
  /*
   * The binary payload
   */
  ProtobufCBinaryData payload;
  /*
   * The decoded fields
   */
  char *fields;
  /*
   * Was validation of the message successful
   */
  protobuf_c_boolean valid;
  /*
   * Logs that have been generated while processing
   */
  size_t n_logs;
  Handler__LogEntry **logs;
};
#define HANDLER__DRY_UPLINK_RESULT__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&handler__dry_uplink_result__descriptor) \
    , {0,NULL}, (char *)protobuf_c_empty_string, 0, 0,NULL }


/*
 * DryDownlinkResult is the result from a downlink simulation
 */
struct  _Handler__DryDownlinkResult
{
  ProtobufCMessage base;
  /*
   * The payload that was encoded
   */
  ProtobufCBinaryData payload;
  /*
   * Logs that have been generated while processing
   */
  size_t n_logs;
  Handler__LogEntry **logs;
};
#define HANDLER__DRY_DOWNLINK_RESULT__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&handler__dry_downlink_result__descriptor) \
    , {0,NULL}, 0,NULL }


/* Handler__DeviceActivationResponse methods */
void   handler__device_activation_response__init
                     (Handler__DeviceActivationResponse         *message);
size_t handler__device_activation_response__get_packed_size
                     (const Handler__DeviceActivationResponse   *message);
size_t handler__device_activation_response__pack
                     (const Handler__DeviceActivationResponse   *message,
                      uint8_t             *out);
size_t handler__device_activation_response__pack_to_buffer
                     (const Handler__DeviceActivationResponse   *message,
                      ProtobufCBuffer     *buffer);
Handler__DeviceActivationResponse *
       handler__device_activation_response__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   handler__device_activation_response__free_unpacked
                     (Handler__DeviceActivationResponse *message,
                      ProtobufCAllocator *allocator);
/* Handler__StatusRequest methods */
void   handler__status_request__init
                     (Handler__StatusRequest         *message);
size_t handler__status_request__get_packed_size
                     (const Handler__StatusRequest   *message);
size_t handler__status_request__pack
                     (const Handler__StatusRequest   *message,
                      uint8_t             *out);
size_t handler__status_request__pack_to_buffer
                     (const Handler__StatusRequest   *message,
                      ProtobufCBuffer     *buffer);
Handler__StatusRequest *
       handler__status_request__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   handler__status_request__free_unpacked
                     (Handler__StatusRequest *message,
                      ProtobufCAllocator *allocator);
/* Handler__Status methods */
void   handler__status__init
                     (Handler__Status         *message);
size_t handler__status__get_packed_size
                     (const Handler__Status   *message);
size_t handler__status__pack
                     (const Handler__Status   *message,
                      uint8_t             *out);
size_t handler__status__pack_to_buffer
                     (const Handler__Status   *message,
                      ProtobufCBuffer     *buffer);
Handler__Status *
       handler__status__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   handler__status__free_unpacked
                     (Handler__Status *message,
                      ProtobufCAllocator *allocator);
/* Handler__ApplicationIdentifier methods */
void   handler__application_identifier__init
                     (Handler__ApplicationIdentifier         *message);
size_t handler__application_identifier__get_packed_size
                     (const Handler__ApplicationIdentifier   *message);
size_t handler__application_identifier__pack
                     (const Handler__ApplicationIdentifier   *message,
                      uint8_t             *out);
size_t handler__application_identifier__pack_to_buffer
                     (const Handler__ApplicationIdentifier   *message,
                      ProtobufCBuffer     *buffer);
Handler__ApplicationIdentifier *
       handler__application_identifier__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   handler__application_identifier__free_unpacked
                     (Handler__ApplicationIdentifier *message,
                      ProtobufCAllocator *allocator);
/* Handler__Application methods */
void   handler__application__init
                     (Handler__Application         *message);
size_t handler__application__get_packed_size
                     (const Handler__Application   *message);
size_t handler__application__pack
                     (const Handler__Application   *message,
                      uint8_t             *out);
size_t handler__application__pack_to_buffer
                     (const Handler__Application   *message,
                      ProtobufCBuffer     *buffer);
Handler__Application *
       handler__application__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   handler__application__free_unpacked
                     (Handler__Application *message,
                      ProtobufCAllocator *allocator);
/* Handler__DeviceIdentifier methods */
void   handler__device_identifier__init
                     (Handler__DeviceIdentifier         *message);
size_t handler__device_identifier__get_packed_size
                     (const Handler__DeviceIdentifier   *message);
size_t handler__device_identifier__pack
                     (const Handler__DeviceIdentifier   *message,
                      uint8_t             *out);
size_t handler__device_identifier__pack_to_buffer
                     (const Handler__DeviceIdentifier   *message,
                      ProtobufCBuffer     *buffer);
Handler__DeviceIdentifier *
       handler__device_identifier__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   handler__device_identifier__free_unpacked
                     (Handler__DeviceIdentifier *message,
                      ProtobufCAllocator *allocator);
/* Handler__Device__AttributesEntry methods */
void   handler__device__attributes_entry__init
                     (Handler__Device__AttributesEntry         *message);
/* Handler__Device methods */
void   handler__device__init
                     (Handler__Device         *message);
size_t handler__device__get_packed_size
                     (const Handler__Device   *message);
size_t handler__device__pack
                     (const Handler__Device   *message,
                      uint8_t             *out);
size_t handler__device__pack_to_buffer
                     (const Handler__Device   *message,
                      ProtobufCBuffer     *buffer);
Handler__Device *
       handler__device__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   handler__device__free_unpacked
                     (Handler__Device *message,
                      ProtobufCAllocator *allocator);
/* Handler__DeviceList methods */
void   handler__device_list__init
                     (Handler__DeviceList         *message);
size_t handler__device_list__get_packed_size
                     (const Handler__DeviceList   *message);
size_t handler__device_list__pack
                     (const Handler__DeviceList   *message,
                      uint8_t             *out);
size_t handler__device_list__pack_to_buffer
                     (const Handler__DeviceList   *message,
                      ProtobufCBuffer     *buffer);
Handler__DeviceList *
       handler__device_list__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   handler__device_list__free_unpacked
                     (Handler__DeviceList *message,
                      ProtobufCAllocator *allocator);
/* Handler__DryDownlinkMessage methods */
void   handler__dry_downlink_message__init
                     (Handler__DryDownlinkMessage         *message);
size_t handler__dry_downlink_message__get_packed_size
                     (const Handler__DryDownlinkMessage   *message);
size_t handler__dry_downlink_message__pack
                     (const Handler__DryDownlinkMessage   *message,
                      uint8_t             *out);
size_t handler__dry_downlink_message__pack_to_buffer
                     (const Handler__DryDownlinkMessage   *message,
                      ProtobufCBuffer     *buffer);
Handler__DryDownlinkMessage *
       handler__dry_downlink_message__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   handler__dry_downlink_message__free_unpacked
                     (Handler__DryDownlinkMessage *message,
                      ProtobufCAllocator *allocator);
/* Handler__DryUplinkMessage methods */
void   handler__dry_uplink_message__init
                     (Handler__DryUplinkMessage         *message);
size_t handler__dry_uplink_message__get_packed_size
                     (const Handler__DryUplinkMessage   *message);
size_t handler__dry_uplink_message__pack
                     (const Handler__DryUplinkMessage   *message,
                      uint8_t             *out);
size_t handler__dry_uplink_message__pack_to_buffer
                     (const Handler__DryUplinkMessage   *message,
                      ProtobufCBuffer     *buffer);
Handler__DryUplinkMessage *
       handler__dry_uplink_message__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   handler__dry_uplink_message__free_unpacked
                     (Handler__DryUplinkMessage *message,
                      ProtobufCAllocator *allocator);
/* Handler__SimulatedUplinkMessage methods */
void   handler__simulated_uplink_message__init
                     (Handler__SimulatedUplinkMessage         *message);
size_t handler__simulated_uplink_message__get_packed_size
                     (const Handler__SimulatedUplinkMessage   *message);
size_t handler__simulated_uplink_message__pack
                     (const Handler__SimulatedUplinkMessage   *message,
                      uint8_t             *out);
size_t handler__simulated_uplink_message__pack_to_buffer
                     (const Handler__SimulatedUplinkMessage   *message,
                      ProtobufCBuffer     *buffer);
Handler__SimulatedUplinkMessage *
       handler__simulated_uplink_message__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   handler__simulated_uplink_message__free_unpacked
                     (Handler__SimulatedUplinkMessage *message,
                      ProtobufCAllocator *allocator);
/* Handler__LogEntry methods */
void   handler__log_entry__init
                     (Handler__LogEntry         *message);
size_t handler__log_entry__get_packed_size
                     (const Handler__LogEntry   *message);
size_t handler__log_entry__pack
                     (const Handler__LogEntry   *message,
                      uint8_t             *out);
size_t handler__log_entry__pack_to_buffer
                     (const Handler__LogEntry   *message,
                      ProtobufCBuffer     *buffer);
Handler__LogEntry *
       handler__log_entry__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   handler__log_entry__free_unpacked
                     (Handler__LogEntry *message,
                      ProtobufCAllocator *allocator);
/* Handler__DryUplinkResult methods */
void   handler__dry_uplink_result__init
                     (Handler__DryUplinkResult         *message);
size_t handler__dry_uplink_result__get_packed_size
                     (const Handler__DryUplinkResult   *message);
size_t handler__dry_uplink_result__pack
                     (const Handler__DryUplinkResult   *message,
                      uint8_t             *out);
size_t handler__dry_uplink_result__pack_to_buffer
                     (const Handler__DryUplinkResult   *message,
                      ProtobufCBuffer     *buffer);
Handler__DryUplinkResult *
       handler__dry_uplink_result__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   handler__dry_uplink_result__free_unpacked
                     (Handler__DryUplinkResult *message,
                      ProtobufCAllocator *allocator);
/* Handler__DryDownlinkResult methods */
void   handler__dry_downlink_result__init
                     (Handler__DryDownlinkResult         *message);
size_t handler__dry_downlink_result__get_packed_size
                     (const Handler__DryDownlinkResult   *message);
size_t handler__dry_downlink_result__pack
                     (const Handler__DryDownlinkResult   *message,
                      uint8_t             *out);
size_t handler__dry_downlink_result__pack_to_buffer
                     (const Handler__DryDownlinkResult   *message,
                      ProtobufCBuffer     *buffer);
Handler__DryDownlinkResult *
       handler__dry_downlink_result__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   handler__dry_downlink_result__free_unpacked
                     (Handler__DryDownlinkResult *message,
                      ProtobufCAllocator *allocator);
/* --- per-message closures --- */

typedef void (*Handler__DeviceActivationResponse_Closure)
                 (const Handler__DeviceActivationResponse *message,
                  void *closure_data);
typedef void (*Handler__StatusRequest_Closure)
                 (const Handler__StatusRequest *message,
                  void *closure_data);
typedef void (*Handler__Status_Closure)
                 (const Handler__Status *message,
                  void *closure_data);
typedef void (*Handler__ApplicationIdentifier_Closure)
                 (const Handler__ApplicationIdentifier *message,
                  void *closure_data);
typedef void (*Handler__Application_Closure)
                 (const Handler__Application *message,
                  void *closure_data);
typedef void (*Handler__DeviceIdentifier_Closure)
                 (const Handler__DeviceIdentifier *message,
                  void *closure_data);
typedef void (*Handler__Device__AttributesEntry_Closure)
                 (const Handler__Device__AttributesEntry *message,
                  void *closure_data);
typedef void (*Handler__Device_Closure)
                 (const Handler__Device *message,
                  void *closure_data);
typedef void (*Handler__DeviceList_Closure)
                 (const Handler__DeviceList *message,
                  void *closure_data);
typedef void (*Handler__DryDownlinkMessage_Closure)
                 (const Handler__DryDownlinkMessage *message,
                  void *closure_data);
typedef void (*Handler__DryUplinkMessage_Closure)
                 (const Handler__DryUplinkMessage *message,
                  void *closure_data);
typedef void (*Handler__SimulatedUplinkMessage_Closure)
                 (const Handler__SimulatedUplinkMessage *message,
                  void *closure_data);
typedef void (*Handler__LogEntry_Closure)
                 (const Handler__LogEntry *message,
                  void *closure_data);
typedef void (*Handler__DryUplinkResult_Closure)
                 (const Handler__DryUplinkResult *message,
                  void *closure_data);
typedef void (*Handler__DryDownlinkResult_Closure)
                 (const Handler__DryDownlinkResult *message,
                  void *closure_data);

/* --- services --- */

typedef struct _Handler__Handler_Service Handler__Handler_Service;
struct _Handler__Handler_Service
{
  ProtobufCService base;
  void (*activation_challenge)(Handler__Handler_Service *service,
                               const Broker__ActivationChallengeRequest *input,
                               Broker__ActivationChallengeResponse_Closure closure,
                               void *closure_data);
  void (*activate)(Handler__Handler_Service *service,
                   const Broker__DeduplicatedDeviceActivationRequest *input,
                   Handler__DeviceActivationResponse_Closure closure,
                   void *closure_data);
};
typedef void (*Handler__Handler_ServiceDestroy)(Handler__Handler_Service *);
void handler__handler__init (Handler__Handler_Service *service,
                             Handler__Handler_ServiceDestroy destroy);
#define HANDLER__HANDLER__BASE_INIT \
    { &handler__handler__descriptor, protobuf_c_service_invoke_internal, NULL }
#define HANDLER__HANDLER__INIT(function_prefix__) \
    { HANDLER__HANDLER__BASE_INIT,\
      function_prefix__ ## activation_challenge,\
      function_prefix__ ## activate  }
void handler__handler__activation_challenge(ProtobufCService *service,
                                            const Broker__ActivationChallengeRequest *input,
                                            Broker__ActivationChallengeResponse_Closure closure,
                                            void *closure_data);
void handler__handler__activate(ProtobufCService *service,
                                const Broker__DeduplicatedDeviceActivationRequest *input,
                                Handler__DeviceActivationResponse_Closure closure,
                                void *closure_data);
typedef struct _Handler__ApplicationManager_Service Handler__ApplicationManager_Service;
struct _Handler__ApplicationManager_Service
{
  ProtobufCService base;
  void (*register_application)(Handler__ApplicationManager_Service *service,
                               const Handler__ApplicationIdentifier *input,
                               Google__Protobuf__Empty_Closure closure,
                               void *closure_data);
  void (*get_application)(Handler__ApplicationManager_Service *service,
                          const Handler__ApplicationIdentifier *input,
                          Handler__Application_Closure closure,
                          void *closure_data);
  void (*set_application)(Handler__ApplicationManager_Service *service,
                          const Handler__Application *input,
                          Google__Protobuf__Empty_Closure closure,
                          void *closure_data);
  void (*delete_application)(Handler__ApplicationManager_Service *service,
                             const Handler__ApplicationIdentifier *input,
                             Google__Protobuf__Empty_Closure closure,
                             void *closure_data);
  void (*get_device)(Handler__ApplicationManager_Service *service,
                     const Handler__DeviceIdentifier *input,
                     Handler__Device_Closure closure,
                     void *closure_data);
  void (*set_device)(Handler__ApplicationManager_Service *service,
                     const Handler__Device *input,
                     Google__Protobuf__Empty_Closure closure,
                     void *closure_data);
  void (*delete_device)(Handler__ApplicationManager_Service *service,
                        const Handler__DeviceIdentifier *input,
                        Google__Protobuf__Empty_Closure closure,
                        void *closure_data);
  void (*get_devices_for_application)(Handler__ApplicationManager_Service *service,
                                      const Handler__ApplicationIdentifier *input,
                                      Handler__DeviceList_Closure closure,
                                      void *closure_data);
  void (*dry_downlink)(Handler__ApplicationManager_Service *service,
                       const Handler__DryDownlinkMessage *input,
                       Handler__DryDownlinkResult_Closure closure,
                       void *closure_data);
  void (*dry_uplink)(Handler__ApplicationManager_Service *service,
                     const Handler__DryUplinkMessage *input,
                     Handler__DryUplinkResult_Closure closure,
                     void *closure_data);
  void (*simulate_uplink)(Handler__ApplicationManager_Service *service,
                          const Handler__SimulatedUplinkMessage *input,
                          Google__Protobuf__Empty_Closure closure,
                          void *closure_data);
};
typedef void (*Handler__ApplicationManager_ServiceDestroy)(Handler__ApplicationManager_Service *);
void handler__application_manager__init (Handler__ApplicationManager_Service *service,
                                         Handler__ApplicationManager_ServiceDestroy destroy);
#define HANDLER__APPLICATION_MANAGER__BASE_INIT \
    { &handler__application_manager__descriptor, protobuf_c_service_invoke_internal, NULL }
#define HANDLER__APPLICATION_MANAGER__INIT(function_prefix__) \
    { HANDLER__APPLICATION_MANAGER__BASE_INIT,\
      function_prefix__ ## register_application,\
      function_prefix__ ## get_application,\
      function_prefix__ ## set_application,\
      function_prefix__ ## delete_application,\
      function_prefix__ ## get_device,\
      function_prefix__ ## set_device,\
      function_prefix__ ## delete_device,\
      function_prefix__ ## get_devices_for_application,\
      function_prefix__ ## dry_downlink,\
      function_prefix__ ## dry_uplink,\
      function_prefix__ ## simulate_uplink  }
void handler__application_manager__register_application(ProtobufCService *service,
                                                        const Handler__ApplicationIdentifier *input,
                                                        Google__Protobuf__Empty_Closure closure,
                                                        void *closure_data);
void handler__application_manager__get_application(ProtobufCService *service,
                                                   const Handler__ApplicationIdentifier *input,
                                                   Handler__Application_Closure closure,
                                                   void *closure_data);
void handler__application_manager__set_application(ProtobufCService *service,
                                                   const Handler__Application *input,
                                                   Google__Protobuf__Empty_Closure closure,
                                                   void *closure_data);
void handler__application_manager__delete_application(ProtobufCService *service,
                                                      const Handler__ApplicationIdentifier *input,
                                                      Google__Protobuf__Empty_Closure closure,
                                                      void *closure_data);
void handler__application_manager__get_device(ProtobufCService *service,
                                              const Handler__DeviceIdentifier *input,
                                              Handler__Device_Closure closure,
                                              void *closure_data);
void handler__application_manager__set_device(ProtobufCService *service,
                                              const Handler__Device *input,
                                              Google__Protobuf__Empty_Closure closure,
                                              void *closure_data);
void handler__application_manager__delete_device(ProtobufCService *service,
                                                 const Handler__DeviceIdentifier *input,
                                                 Google__Protobuf__Empty_Closure closure,
                                                 void *closure_data);
void handler__application_manager__get_devices_for_application(ProtobufCService *service,
                                                               const Handler__ApplicationIdentifier *input,
                                                               Handler__DeviceList_Closure closure,
                                                               void *closure_data);
void handler__application_manager__dry_downlink(ProtobufCService *service,
                                                const Handler__DryDownlinkMessage *input,
                                                Handler__DryDownlinkResult_Closure closure,
                                                void *closure_data);
void handler__application_manager__dry_uplink(ProtobufCService *service,
                                              const Handler__DryUplinkMessage *input,
                                              Handler__DryUplinkResult_Closure closure,
                                              void *closure_data);
void handler__application_manager__simulate_uplink(ProtobufCService *service,
                                                   const Handler__SimulatedUplinkMessage *input,
                                                   Google__Protobuf__Empty_Closure closure,
                                                   void *closure_data);
typedef struct _Handler__HandlerManager_Service Handler__HandlerManager_Service;
struct _Handler__HandlerManager_Service
{
  ProtobufCService base;
  void (*get_status)(Handler__HandlerManager_Service *service,
                     const Handler__StatusRequest *input,
                     Handler__Status_Closure closure,
                     void *closure_data);
};
typedef void (*Handler__HandlerManager_ServiceDestroy)(Handler__HandlerManager_Service *);
void handler__handler_manager__init (Handler__HandlerManager_Service *service,
                                     Handler__HandlerManager_ServiceDestroy destroy);
#define HANDLER__HANDLER_MANAGER__BASE_INIT \
    { &handler__handler_manager__descriptor, protobuf_c_service_invoke_internal, NULL }
#define HANDLER__HANDLER_MANAGER__INIT(function_prefix__) \
    { HANDLER__HANDLER_MANAGER__BASE_INIT,\
      function_prefix__ ## get_status  }
void handler__handler_manager__get_status(ProtobufCService *service,
                                          const Handler__StatusRequest *input,
                                          Handler__Status_Closure closure,
                                          void *closure_data);

/* --- descriptors --- */

extern const ProtobufCMessageDescriptor handler__device_activation_response__descriptor;
extern const ProtobufCMessageDescriptor handler__status_request__descriptor;
extern const ProtobufCMessageDescriptor handler__status__descriptor;
extern const ProtobufCMessageDescriptor handler__application_identifier__descriptor;
extern const ProtobufCMessageDescriptor handler__application__descriptor;
extern const ProtobufCMessageDescriptor handler__device_identifier__descriptor;
extern const ProtobufCMessageDescriptor handler__device__descriptor;
extern const ProtobufCMessageDescriptor handler__device__attributes_entry__descriptor;
extern const ProtobufCMessageDescriptor handler__device_list__descriptor;
extern const ProtobufCMessageDescriptor handler__dry_downlink_message__descriptor;
extern const ProtobufCMessageDescriptor handler__dry_uplink_message__descriptor;
extern const ProtobufCMessageDescriptor handler__simulated_uplink_message__descriptor;
extern const ProtobufCMessageDescriptor handler__log_entry__descriptor;
extern const ProtobufCMessageDescriptor handler__dry_uplink_result__descriptor;
extern const ProtobufCMessageDescriptor handler__dry_downlink_result__descriptor;
extern const ProtobufCServiceDescriptor handler__handler__descriptor;
extern const ProtobufCServiceDescriptor handler__application_manager__descriptor;
extern const ProtobufCServiceDescriptor handler__handler_manager__descriptor;

PROTOBUF_C__END_DECLS


#endif  /* PROTOBUF_C_github_2ecom_2fTheThingsNetwork_2fapi_2fhandler_2fhandler_2eproto__INCLUDED */
