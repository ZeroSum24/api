# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

from github_com.TheThingsNetwork.api.gateway import gateway_pb2 as github_dot_com_dot_TheThingsNetwork_dot_api_dot_gateway_dot_gateway__pb2
from github_com.TheThingsNetwork.api.router import router_pb2 as github_dot_com_dot_TheThingsNetwork_dot_api_dot_router_dot_router__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2


class RouterStub(object):
  """The Router service provides pure network functionality
  """

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.GatewayStatus = channel.stream_unary(
        '/router.Router/GatewayStatus',
        request_serializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_gateway_dot_gateway__pb2.Status.SerializeToString,
        response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
        )
    self.Uplink = channel.stream_unary(
        '/router.Router/Uplink',
        request_serializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_router_dot_router__pb2.UplinkMessage.SerializeToString,
        response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
        )
    self.Subscribe = channel.unary_stream(
        '/router.Router/Subscribe',
        request_serializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_router_dot_router__pb2.SubscribeRequest.SerializeToString,
        response_deserializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_router_dot_router__pb2.DownlinkMessage.FromString,
        )
    self.Activate = channel.unary_unary(
        '/router.Router/Activate',
        request_serializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_router_dot_router__pb2.DeviceActivationRequest.SerializeToString,
        response_deserializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_router_dot_router__pb2.DeviceActivationResponse.FromString,
        )


class RouterServicer(object):
  """The Router service provides pure network functionality
  """

  def GatewayStatus(self, request_iterator, context):
    """Gateway streams status messages to Router
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def Uplink(self, request_iterator, context):
    """Gateway streams uplink messages to Router
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def Subscribe(self, request, context):
    """Gateway subscribes to downlink messages from Router
    It is possible to open multiple subscriptions (but not recommended).
    If you do this, you are responsible for de-duplication of downlink messages.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def Activate(self, request, context):
    """Gateway requests device activation
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_RouterServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'GatewayStatus': grpc.stream_unary_rpc_method_handler(
          servicer.GatewayStatus,
          request_deserializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_gateway_dot_gateway__pb2.Status.FromString,
          response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
      ),
      'Uplink': grpc.stream_unary_rpc_method_handler(
          servicer.Uplink,
          request_deserializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_router_dot_router__pb2.UplinkMessage.FromString,
          response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
      ),
      'Subscribe': grpc.unary_stream_rpc_method_handler(
          servicer.Subscribe,
          request_deserializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_router_dot_router__pb2.SubscribeRequest.FromString,
          response_serializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_router_dot_router__pb2.DownlinkMessage.SerializeToString,
      ),
      'Activate': grpc.unary_unary_rpc_method_handler(
          servicer.Activate,
          request_deserializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_router_dot_router__pb2.DeviceActivationRequest.FromString,
          response_serializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_router_dot_router__pb2.DeviceActivationResponse.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'router.Router', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))


class RouterManagerStub(object):
  """The RouterManager service provides configuration and monitoring functionality
  """

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.GatewayStatus = channel.unary_unary(
        '/router.RouterManager/GatewayStatus',
        request_serializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_router_dot_router__pb2.GatewayStatusRequest.SerializeToString,
        response_deserializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_router_dot_router__pb2.GatewayStatusResponse.FromString,
        )
    self.GetStatus = channel.unary_unary(
        '/router.RouterManager/GetStatus',
        request_serializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_router_dot_router__pb2.StatusRequest.SerializeToString,
        response_deserializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_router_dot_router__pb2.Status.FromString,
        )


class RouterManagerServicer(object):
  """The RouterManager service provides configuration and monitoring functionality
  """

  def GatewayStatus(self, request, context):
    """Gateway owner or network operator requests Gateway status from Router Manager
    Deprecated: Use monitor API (NOC) instead of this
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def GetStatus(self, request, context):
    """Network operator requests Router status
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_RouterManagerServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'GatewayStatus': grpc.unary_unary_rpc_method_handler(
          servicer.GatewayStatus,
          request_deserializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_router_dot_router__pb2.GatewayStatusRequest.FromString,
          response_serializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_router_dot_router__pb2.GatewayStatusResponse.SerializeToString,
      ),
      'GetStatus': grpc.unary_unary_rpc_method_handler(
          servicer.GetStatus,
          request_deserializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_router_dot_router__pb2.StatusRequest.FromString,
          response_serializer=github_dot_com_dot_TheThingsNetwork_dot_api_dot_router_dot_router__pb2.Status.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'router.RouterManager', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))
