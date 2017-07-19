# Generated by the protocol buffer compiler.  DO NOT EDIT!
# Source: monitor/monitor.proto for package 'monitor'
# Original file comments:
# Copyright © 2017 The Things Network
# Use of this source code is governed by the MIT license that can be found in the LICENSE file.
#

require 'grpc'
require 'monitor/monitor_pb'

module Monitor
  module Monitor
    class Service

      include GRPC::GenericService

      self.marshal_class_method = :encode
      self.unmarshal_class_method = :decode
      self.service_name = 'monitor.Monitor'

      rpc :RouterStatus, stream(Router::Status), Google::Protobuf::Empty
      rpc :GatewayStatus, stream(Gateway::Status), Google::Protobuf::Empty
      rpc :GatewayUplink, stream(Router::UplinkMessage), Google::Protobuf::Empty
      rpc :GatewayDownlink, stream(Router::DownlinkMessage), Google::Protobuf::Empty
      rpc :BrokerStatus, stream(Broker::Status), Google::Protobuf::Empty
      rpc :BrokerUplink, stream(Broker::DeduplicatedUplinkMessage), Google::Protobuf::Empty
      rpc :BrokerDownlink, stream(Broker::DownlinkMessage), Google::Protobuf::Empty
      rpc :HandlerStatus, stream(Handler::Status), Google::Protobuf::Empty
      rpc :HandlerUplink, stream(Broker::DeduplicatedUplinkMessage), Google::Protobuf::Empty
      rpc :HandlerDownlink, stream(Broker::DownlinkMessage), Google::Protobuf::Empty
      rpc :NetworkServerStatus, stream(Networkserver::Status), Google::Protobuf::Empty
      rpc :Logs, stream(LogMessage), Google::Protobuf::Empty
    end

    Stub = Service.rpc_stub_class
  end
end
