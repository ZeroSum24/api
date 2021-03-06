/* Generated by the protocol buffer compiler.  DO NOT EDIT! */
/* Generated from: github.com/TheThingsNetwork/api/gateway/gateway.proto */

#ifndef PROTOBUF_C_github_2ecom_2fTheThingsNetwork_2fapi_2fgateway_2fgateway_2eproto__INCLUDED
#define PROTOBUF_C_github_2ecom_2fTheThingsNetwork_2fapi_2fgateway_2fgateway_2eproto__INCLUDED

#include <protobuf-c/protobuf-c.h>

PROTOBUF_C__BEGIN_DECLS

#if PROTOBUF_C_VERSION_NUMBER < 1003000
# error This file was generated by a newer version of protoc-c which is incompatible with your libprotobuf-c headers. Please update your headers.
#elif 1003003 < PROTOBUF_C_MIN_COMPILER_VERSION
# error This file was generated by an older version of protoc-c which is incompatible with your libprotobuf-c headers. Please regenerate this file with a newer version of protoc-c.
#endif

#include "github.com/gogo/protobuf/gogoproto/gogo.pb-c.h"

typedef struct _Gateway__LocationMetadata Gateway__LocationMetadata;
typedef struct _Gateway__RxMetadata Gateway__RxMetadata;
typedef struct _Gateway__RxMetadata__Antenna Gateway__RxMetadata__Antenna;
typedef struct _Gateway__TxConfiguration Gateway__TxConfiguration;
typedef struct _Gateway__Status Gateway__Status;
typedef struct _Gateway__Status__OSMetrics Gateway__Status__OSMetrics;


/* --- enums --- */

typedef enum _Gateway__LocationMetadata__LocationSource {
  /*
   * The source of the location is not known or not set
   */
  GATEWAY__LOCATION_METADATA__LOCATION_SOURCE__UNKNOWN = 0,
  /*
   * The location is determined by GPS
   */
  GATEWAY__LOCATION_METADATA__LOCATION_SOURCE__GPS = 1,
  /*
   * The location is fixed by configuration
   */
  GATEWAY__LOCATION_METADATA__LOCATION_SOURCE__CONFIG = 2,
  /*
   * The location is set in and updated from a registry
   */
  GATEWAY__LOCATION_METADATA__LOCATION_SOURCE__REGISTRY = 3,
  /*
   * The location is estimated with IP Geolocation
   */
  /*
   * More estimation methods can be added
   */
  GATEWAY__LOCATION_METADATA__LOCATION_SOURCE__IP_GEOLOCATION = 4
    PROTOBUF_C__FORCE_ENUM_TO_BE_INT_SIZE(GATEWAY__LOCATION_METADATA__LOCATION_SOURCE)
} Gateway__LocationMetadata__LocationSource;

/* --- messages --- */

struct  _Gateway__LocationMetadata
{
  ProtobufCMessage base;
  /*
   * Time (unix nanoseconds)
   */
  int64_t time;
  /*
   * the north–south position (degrees; -90 to +90), where 0 is the equator, north pole is positive, south pole is negative
   */
  float latitude;
  /*
   * the east-west position (degrees; -180 to +180), where 0 is the Prime Meridian (Greenwich), east is positive , west is negative
   */
  float longitude;
  /*
   * the altitude (meters), where 0 is the mean sea level
   */
  int32_t altitude;
  /*
   * the accuracy of the location (meters)
   */
  int32_t accuracy;
  Gateway__LocationMetadata__LocationSource source;
};
#define GATEWAY__LOCATION_METADATA__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&gateway__location_metadata__descriptor) \
    , 0, 0, 0, 0, 0, GATEWAY__LOCATION_METADATA__LOCATION_SOURCE__UNKNOWN }


struct  _Gateway__RxMetadata__Antenna
{
  ProtobufCMessage base;
  uint32_t antenna;
  uint32_t channel;
  /*
   * Received signal power in dBm
   */
  float rssi;
  /*
   * Received channel power in dBm
   */
  float channel_rssi;
  /*
   * Standard deviation of the RSSI
   */
  float rssi_standard_deviation;
  /*
   * Frequency offset (Hz)
   */
  int64_t frequency_offset;
  /*
   * Signal-to-noise-ratio in dB
   */
  float snr;
  /*
   * Encrypted fine timestamp from the Gateway FPGA
   */
  ProtobufCBinaryData encrypted_time;
  /*
   * Fine timestamp from the Gateway FPGA (decrypted)
   */
  int64_t fine_time;
};
#define GATEWAY__RX_METADATA__ANTENNA__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&gateway__rx_metadata__antenna__descriptor) \
    , 0, 0, 0, 0, 0, 0, 0, {0,NULL}, 0 }


struct  _Gateway__RxMetadata
{
  ProtobufCMessage base;
  char *gateway_id;
  /*
   * Indicates whether the gateway is trusted. Components that are able to verify gateway trust MUST do so and set this value accordingly
   */
  protobuf_c_boolean gateway_trusted;
  /*
   * Timestamp (uptime of LoRa module) in microseconds with rollover
   */
  uint32_t timestamp;
  /*
   * Time in Unix nanoseconds
   */
  int64_t time;
  /*
   * Encrypted time from the Gateway FPGA
   */
  ProtobufCBinaryData encrypted_time;
  uint32_t rf_chain;
  uint32_t channel;
  size_t n_antennas;
  Gateway__RxMetadata__Antenna **antennas;
  /*
   * Frequency in Hz
   */
  uint64_t frequency;
  /*
   * Received signal strength in dBm
   */
  float rssi;
  /*
   * Signal-to-noise-ratio in dB
   */
  float snr;
  Gateway__LocationMetadata *location;
};
#define GATEWAY__RX_METADATA__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&gateway__rx_metadata__descriptor) \
    , (char *)protobuf_c_empty_string, 0, 0, 0, {0,NULL}, 0, 0, 0,NULL, 0, 0, 0, NULL }


struct  _Gateway__TxConfiguration
{
  ProtobufCMessage base;
  /*
   * Timestamp (uptime of LoRa module) in microseconds with rollover
   */
  uint32_t timestamp;
  uint32_t rf_chain;
  /*
   * Frequency in Hz
   */
  uint64_t frequency;
  /*
   * Transmit power in dBm
   */
  int32_t power;
  /*
   * LoRa polarization inversion (basically always true for messages from gateway to node)
   */
  protobuf_c_boolean polarization_inversion;
  /*
   * FSK frequency deviation in Hz
   */
  uint32_t frequency_deviation;
};
#define GATEWAY__TX_CONFIGURATION__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&gateway__tx_configuration__descriptor) \
    , 0, 0, 0, 0, 0, 0 }


/*
 * Additional metrics from the operating system
 */
struct  _Gateway__Status__OSMetrics
{
  ProtobufCMessage base;
  float load_1;
  float load_5;
  float load_15;
  float cpu_percentage;
  float memory_percentage;
  float temperature;
};
#define GATEWAY__STATUS__OSMETRICS__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&gateway__status__osmetrics__descriptor) \
    , 0, 0, 0, 0, 0, 0 }


/*
 * message Status represents a status update from a Gateway.
 */
struct  _Gateway__Status
{
  ProtobufCMessage base;
  /*
   * Timestamp (uptime of gateway) in microseconds with rollover
   */
  uint32_t timestamp;
  /*
   * Time in Unix nanoseconds
   */
  int64_t time;
  /*
   * Indicates whether the gateway is trusted. Components that are able to verify gateway trust MUST do so and set this value accordingly
   */
  protobuf_c_boolean gateway_trusted;
  /*
   * Boot time in Unix nanoseconds
   */
  int64_t boot_time;
  size_t n_ip;
  char **ip;
  char *platform;
  char *contact_email;
  char *description;
  /*
   * The gateway's frequency plan: one of EU_863_870, US_902_928, CN_779_787, EU_433, AU_915_928, CN_470_510, AS_923, AS_920_923, AS_923_925, KR_920_923
   */
  char *frequency_plan;
  /*
   * The value of Bridge is set by the Bridge
   */
  char *bridge;
  /*
   * The value of Router is set by the Router
   */
  char *router;
  /*
   * Version of Gateway FPGA
   */
  uint32_t fpga;
  /*
   * Version of Gateway DSP software
   */
  uint32_t dsp;
  /*
   * Version of gateway driver (in X.X.X format)
   */
  char *hal;
  Gateway__LocationMetadata *location;
  /*
   * Round-trip time to the server in milliseconds
   */
  uint32_t rtt;
  /*
   * Total number of received uplink packets since boot
   */
  uint32_t rx_in;
  /*
   * Total number of successful (correct) uplink packets since boot
   */
  uint32_t rx_ok;
  /*
   * Total number of received downlink packets since boot
   */
  uint32_t tx_in;
  /*
   * Total number of successfully sent downlink packets since boot
   */
  uint32_t tx_ok;
  /*
   * Total number of packets received from link testing mote, with CRC OK
   */
  uint32_t lm_ok;
  /*
   * Sequence number of the first packet received from the link testing mote
   */
  uint32_t lm_st;
  /*
   * Sequence number of the last packet received from the link testing mote
   */
  uint32_t lm_nw;
  /*
   * Number of lost PPS pulses
   */
  uint32_t l_pps;
  Gateway__Status__OSMetrics *os;
  /*
   * debug or warning messages from the gateway
   */
  size_t n_messages;
  char **messages;
};
#define GATEWAY__STATUS__INIT \
 { PROTOBUF_C_MESSAGE_INIT (&gateway__status__descriptor) \
    , 0, 0, 0, 0, 0,NULL, (char *)protobuf_c_empty_string, (char *)protobuf_c_empty_string, (char *)protobuf_c_empty_string, (char *)protobuf_c_empty_string, (char *)protobuf_c_empty_string, (char *)protobuf_c_empty_string, 0, 0, (char *)protobuf_c_empty_string, NULL, 0, 0, 0, 0, 0, 0, 0, 0, 0, NULL, 0,NULL }


/* Gateway__LocationMetadata methods */
void   gateway__location_metadata__init
                     (Gateway__LocationMetadata         *message);
size_t gateway__location_metadata__get_packed_size
                     (const Gateway__LocationMetadata   *message);
size_t gateway__location_metadata__pack
                     (const Gateway__LocationMetadata   *message,
                      uint8_t             *out);
size_t gateway__location_metadata__pack_to_buffer
                     (const Gateway__LocationMetadata   *message,
                      ProtobufCBuffer     *buffer);
Gateway__LocationMetadata *
       gateway__location_metadata__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   gateway__location_metadata__free_unpacked
                     (Gateway__LocationMetadata *message,
                      ProtobufCAllocator *allocator);
/* Gateway__RxMetadata__Antenna methods */
void   gateway__rx_metadata__antenna__init
                     (Gateway__RxMetadata__Antenna         *message);
/* Gateway__RxMetadata methods */
void   gateway__rx_metadata__init
                     (Gateway__RxMetadata         *message);
size_t gateway__rx_metadata__get_packed_size
                     (const Gateway__RxMetadata   *message);
size_t gateway__rx_metadata__pack
                     (const Gateway__RxMetadata   *message,
                      uint8_t             *out);
size_t gateway__rx_metadata__pack_to_buffer
                     (const Gateway__RxMetadata   *message,
                      ProtobufCBuffer     *buffer);
Gateway__RxMetadata *
       gateway__rx_metadata__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   gateway__rx_metadata__free_unpacked
                     (Gateway__RxMetadata *message,
                      ProtobufCAllocator *allocator);
/* Gateway__TxConfiguration methods */
void   gateway__tx_configuration__init
                     (Gateway__TxConfiguration         *message);
size_t gateway__tx_configuration__get_packed_size
                     (const Gateway__TxConfiguration   *message);
size_t gateway__tx_configuration__pack
                     (const Gateway__TxConfiguration   *message,
                      uint8_t             *out);
size_t gateway__tx_configuration__pack_to_buffer
                     (const Gateway__TxConfiguration   *message,
                      ProtobufCBuffer     *buffer);
Gateway__TxConfiguration *
       gateway__tx_configuration__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   gateway__tx_configuration__free_unpacked
                     (Gateway__TxConfiguration *message,
                      ProtobufCAllocator *allocator);
/* Gateway__Status__OSMetrics methods */
void   gateway__status__osmetrics__init
                     (Gateway__Status__OSMetrics         *message);
/* Gateway__Status methods */
void   gateway__status__init
                     (Gateway__Status         *message);
size_t gateway__status__get_packed_size
                     (const Gateway__Status   *message);
size_t gateway__status__pack
                     (const Gateway__Status   *message,
                      uint8_t             *out);
size_t gateway__status__pack_to_buffer
                     (const Gateway__Status   *message,
                      ProtobufCBuffer     *buffer);
Gateway__Status *
       gateway__status__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data);
void   gateway__status__free_unpacked
                     (Gateway__Status *message,
                      ProtobufCAllocator *allocator);
/* --- per-message closures --- */

typedef void (*Gateway__LocationMetadata_Closure)
                 (const Gateway__LocationMetadata *message,
                  void *closure_data);
typedef void (*Gateway__RxMetadata__Antenna_Closure)
                 (const Gateway__RxMetadata__Antenna *message,
                  void *closure_data);
typedef void (*Gateway__RxMetadata_Closure)
                 (const Gateway__RxMetadata *message,
                  void *closure_data);
typedef void (*Gateway__TxConfiguration_Closure)
                 (const Gateway__TxConfiguration *message,
                  void *closure_data);
typedef void (*Gateway__Status__OSMetrics_Closure)
                 (const Gateway__Status__OSMetrics *message,
                  void *closure_data);
typedef void (*Gateway__Status_Closure)
                 (const Gateway__Status *message,
                  void *closure_data);

/* --- services --- */


/* --- descriptors --- */

extern const ProtobufCMessageDescriptor gateway__location_metadata__descriptor;
extern const ProtobufCEnumDescriptor    gateway__location_metadata__location_source__descriptor;
extern const ProtobufCMessageDescriptor gateway__rx_metadata__descriptor;
extern const ProtobufCMessageDescriptor gateway__rx_metadata__antenna__descriptor;
extern const ProtobufCMessageDescriptor gateway__tx_configuration__descriptor;
extern const ProtobufCMessageDescriptor gateway__status__descriptor;
extern const ProtobufCMessageDescriptor gateway__status__osmetrics__descriptor;

PROTOBUF_C__END_DECLS


#endif  /* PROTOBUF_C_github_2ecom_2fTheThingsNetwork_2fapi_2fgateway_2fgateway_2eproto__INCLUDED */
