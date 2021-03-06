<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/discovery/discovery.proto

namespace Discovery;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>discovery.Metadata</code>
 */
class Metadata extends \Google\Protobuf\Internal\Message
{
    protected $metadata;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $gateway_id
     *           GatewayID that is registered to this Router
     *           This metadata can only be added if the requesting client is authorized to manage this GatewayID.
     *     @type string $dev_addr_prefix
     *           DevAddr prefix that is routed by this Broker
     *           5 bytes; the first byte is the prefix length, the following 4 bytes are the address.
     *           Only authorized Brokers can announce PREFIX metadata.
     *     @type string $app_id
     *           AppID that is registered to this Handler
     *           This metadata can only be added if the requesting client is authorized to manage this AppID.
     *     @type string $app_eui
     *           AppEUI that is registered to this Join Handler
     *           Only authorized Join Handlers can announce APP_EUI metadata (and we don't have any of those yet).
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Discovery\Discovery::initOnce();
        parent::__construct($data);
    }

    /**
     * GatewayID that is registered to this Router
     * This metadata can only be added if the requesting client is authorized to manage this GatewayID.
     *
     * Generated from protobuf field <code>string gateway_id = 10 [(.gogoproto.customname) = "GatewayID"];</code>
     * @return string
     */
    public function getGatewayId()
    {
        return $this->readOneof(10);
    }

    /**
     * GatewayID that is registered to this Router
     * This metadata can only be added if the requesting client is authorized to manage this GatewayID.
     *
     * Generated from protobuf field <code>string gateway_id = 10 [(.gogoproto.customname) = "GatewayID"];</code>
     * @param string $var
     * @return $this
     */
    public function setGatewayId($var)
    {
        GPBUtil::checkString($var, True);
        $this->writeOneof(10, $var);

        return $this;
    }

    /**
     * DevAddr prefix that is routed by this Broker
     * 5 bytes; the first byte is the prefix length, the following 4 bytes are the address.
     * Only authorized Brokers can announce PREFIX metadata.
     *
     * Generated from protobuf field <code>bytes dev_addr_prefix = 20;</code>
     * @return string
     */
    public function getDevAddrPrefix()
    {
        return $this->readOneof(20);
    }

    /**
     * DevAddr prefix that is routed by this Broker
     * 5 bytes; the first byte is the prefix length, the following 4 bytes are the address.
     * Only authorized Brokers can announce PREFIX metadata.
     *
     * Generated from protobuf field <code>bytes dev_addr_prefix = 20;</code>
     * @param string $var
     * @return $this
     */
    public function setDevAddrPrefix($var)
    {
        GPBUtil::checkString($var, False);
        $this->writeOneof(20, $var);

        return $this;
    }

    /**
     * AppID that is registered to this Handler
     * This metadata can only be added if the requesting client is authorized to manage this AppID.
     *
     * Generated from protobuf field <code>string app_id = 30 [(.gogoproto.customname) = "AppID"];</code>
     * @return string
     */
    public function getAppId()
    {
        return $this->readOneof(30);
    }

    /**
     * AppID that is registered to this Handler
     * This metadata can only be added if the requesting client is authorized to manage this AppID.
     *
     * Generated from protobuf field <code>string app_id = 30 [(.gogoproto.customname) = "AppID"];</code>
     * @param string $var
     * @return $this
     */
    public function setAppId($var)
    {
        GPBUtil::checkString($var, True);
        $this->writeOneof(30, $var);

        return $this;
    }

    /**
     * AppEUI that is registered to this Join Handler
     * Only authorized Join Handlers can announce APP_EUI metadata (and we don't have any of those yet).
     *
     * Generated from protobuf field <code>bytes app_eui = 31 [(.gogoproto.customname) = "AppEUI"];</code>
     * @return string
     */
    public function getAppEui()
    {
        return $this->readOneof(31);
    }

    /**
     * AppEUI that is registered to this Join Handler
     * Only authorized Join Handlers can announce APP_EUI metadata (and we don't have any of those yet).
     *
     * Generated from protobuf field <code>bytes app_eui = 31 [(.gogoproto.customname) = "AppEUI"];</code>
     * @param string $var
     * @return $this
     */
    public function setAppEui($var)
    {
        GPBUtil::checkString($var, False);
        $this->writeOneof(31, $var);

        return $this;
    }

    /**
     * @return string
     */
    public function getMetadata()
    {
        return $this->whichOneof("metadata");
    }

}

