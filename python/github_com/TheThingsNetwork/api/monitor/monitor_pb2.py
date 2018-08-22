# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/monitor/monitor.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from github_com.TheThingsNetwork.api.gateway import gateway_pb2 as github_dot_com_dot_TheThingsNetwork_dot_api_dot_gateway_dot_gateway__pb2
from github_com.TheThingsNetwork.api.router import router_pb2 as github_dot_com_dot_TheThingsNetwork_dot_api_dot_router_dot_router__pb2
from github_com.TheThingsNetwork.api.broker import broker_pb2 as github_dot_com_dot_TheThingsNetwork_dot_api_dot_broker_dot_broker__pb2
from github_com.TheThingsNetwork.api.handler import handler_pb2 as github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2
from github_com.TheThingsNetwork.api.networkserver import networkserver_pb2 as github_dot_com_dot_TheThingsNetwork_dot_api_dot_networkserver_dot_networkserver__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='github.com/TheThingsNetwork/api/monitor/monitor.proto',
  package='monitor',
  syntax='proto3',
  serialized_options=_b('\n org.thethingsnetwork.api.monitorB\014MonitorProtoP\001Z\'github.com/TheThingsNetwork/api/monitor\252\002\034TheThingsNetwork.API.Monitor'),
  serialized_pb=_b('\n5github.com/TheThingsNetwork/api/monitor/monitor.proto\x12\x07monitor\x1a\x1bgoogle/protobuf/empty.proto\x1a\x35github.com/TheThingsNetwork/api/gateway/gateway.proto\x1a\x33github.com/TheThingsNetwork/api/router/router.proto\x1a\x33github.com/TheThingsNetwork/api/broker/broker.proto\x1a\x35github.com/TheThingsNetwork/api/handler/handler.proto\x1a\x41github.com/TheThingsNetwork/api/networkserver/networkserver.proto2\xeb\x05\n\x07Monitor\x12\x38\n\x0cRouterStatus\x12\x0e.router.Status\x1a\x16.google.protobuf.Empty(\x01\x12:\n\rGatewayStatus\x12\x0f.gateway.Status\x1a\x16.google.protobuf.Empty(\x01\x12@\n\rGatewayUplink\x12\x15.router.UplinkMessage\x1a\x16.google.protobuf.Empty(\x01\x12\x44\n\x0fGatewayDownlink\x12\x17.router.DownlinkMessage\x1a\x16.google.protobuf.Empty(\x01\x12\x38\n\x0c\x42rokerStatus\x12\x0e.broker.Status\x1a\x16.google.protobuf.Empty(\x01\x12K\n\x0c\x42rokerUplink\x12!.broker.DeduplicatedUplinkMessage\x1a\x16.google.protobuf.Empty(\x01\x12\x43\n\x0e\x42rokerDownlink\x12\x17.broker.DownlinkMessage\x1a\x16.google.protobuf.Empty(\x01\x12:\n\rHandlerStatus\x12\x0f.handler.Status\x1a\x16.google.protobuf.Empty(\x01\x12L\n\rHandlerUplink\x12!.broker.DeduplicatedUplinkMessage\x1a\x16.google.protobuf.Empty(\x01\x12\x44\n\x0fHandlerDownlink\x12\x17.broker.DownlinkMessage\x1a\x16.google.protobuf.Empty(\x01\x12\x46\n\x13NetworkServerStatus\x12\x15.networkserver.Status\x1a\x16.google.protobuf.Empty(\x01\x42z\n org.thethingsnetwork.api.monitorB\x0cMonitorProtoP\x01Z\'github.com/TheThingsNetwork/api/monitor\xaa\x02\x1cTheThingsNetwork.API.Monitorb\x06proto3')
  ,
  dependencies=[google_dot_protobuf_dot_empty__pb2.DESCRIPTOR,github_dot_com_dot_TheThingsNetwork_dot_api_dot_gateway_dot_gateway__pb2.DESCRIPTOR,github_dot_com_dot_TheThingsNetwork_dot_api_dot_router_dot_router__pb2.DESCRIPTOR,github_dot_com_dot_TheThingsNetwork_dot_api_dot_broker_dot_broker__pb2.DESCRIPTOR,github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2.DESCRIPTOR,github_dot_com_dot_TheThingsNetwork_dot_api_dot_networkserver_dot_networkserver__pb2.DESCRIPTOR,])



_sym_db.RegisterFileDescriptor(DESCRIPTOR)


DESCRIPTOR._options = None

_MONITOR = _descriptor.ServiceDescriptor(
  name='Monitor',
  full_name='monitor.Monitor',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  serialized_start=379,
  serialized_end=1126,
  methods=[
  _descriptor.MethodDescriptor(
    name='RouterStatus',
    full_name='monitor.Monitor.RouterStatus',
    index=0,
    containing_service=None,
    input_type=github_dot_com_dot_TheThingsNetwork_dot_api_dot_router_dot_router__pb2._STATUS,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='GatewayStatus',
    full_name='monitor.Monitor.GatewayStatus',
    index=1,
    containing_service=None,
    input_type=github_dot_com_dot_TheThingsNetwork_dot_api_dot_gateway_dot_gateway__pb2._STATUS,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='GatewayUplink',
    full_name='monitor.Monitor.GatewayUplink',
    index=2,
    containing_service=None,
    input_type=github_dot_com_dot_TheThingsNetwork_dot_api_dot_router_dot_router__pb2._UPLINKMESSAGE,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='GatewayDownlink',
    full_name='monitor.Monitor.GatewayDownlink',
    index=3,
    containing_service=None,
    input_type=github_dot_com_dot_TheThingsNetwork_dot_api_dot_router_dot_router__pb2._DOWNLINKMESSAGE,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='BrokerStatus',
    full_name='monitor.Monitor.BrokerStatus',
    index=4,
    containing_service=None,
    input_type=github_dot_com_dot_TheThingsNetwork_dot_api_dot_broker_dot_broker__pb2._STATUS,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='BrokerUplink',
    full_name='monitor.Monitor.BrokerUplink',
    index=5,
    containing_service=None,
    input_type=github_dot_com_dot_TheThingsNetwork_dot_api_dot_broker_dot_broker__pb2._DEDUPLICATEDUPLINKMESSAGE,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='BrokerDownlink',
    full_name='monitor.Monitor.BrokerDownlink',
    index=6,
    containing_service=None,
    input_type=github_dot_com_dot_TheThingsNetwork_dot_api_dot_broker_dot_broker__pb2._DOWNLINKMESSAGE,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='HandlerStatus',
    full_name='monitor.Monitor.HandlerStatus',
    index=7,
    containing_service=None,
    input_type=github_dot_com_dot_TheThingsNetwork_dot_api_dot_handler_dot_handler__pb2._STATUS,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='HandlerUplink',
    full_name='monitor.Monitor.HandlerUplink',
    index=8,
    containing_service=None,
    input_type=github_dot_com_dot_TheThingsNetwork_dot_api_dot_broker_dot_broker__pb2._DEDUPLICATEDUPLINKMESSAGE,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='HandlerDownlink',
    full_name='monitor.Monitor.HandlerDownlink',
    index=9,
    containing_service=None,
    input_type=github_dot_com_dot_TheThingsNetwork_dot_api_dot_broker_dot_broker__pb2._DOWNLINKMESSAGE,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='NetworkServerStatus',
    full_name='monitor.Monitor.NetworkServerStatus',
    index=10,
    containing_service=None,
    input_type=github_dot_com_dot_TheThingsNetwork_dot_api_dot_networkserver_dot_networkserver__pb2._STATUS,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=None,
  ),
])
_sym_db.RegisterServiceDescriptor(_MONITOR)

DESCRIPTOR.services_by_name['Monitor'] = _MONITOR

# @@protoc_insertion_point(module_scope)
