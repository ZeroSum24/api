<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/broker/broker.proto

namespace Broker;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * <pre>
 * received from the Router
 * </pre>
 *
 * Protobuf type <code>broker.UplinkMessage</code>
 */
class UplinkMessage extends \Google\Protobuf\Internal\Message
{
    /**
     * <code>bytes payload = 1;</code>
     */
    private $payload = '';
    /**
     * <code>.protocol.Message message = 2;</code>
     */
    private $message = null;
    /**
     * <code>bytes dev_eui = 11 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevEUI", (.gogoproto.customname) = "DevEUI"];</code>
     */
    private $dev_eui = '';
    /**
     * <code>bytes app_eui = 12 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI", (.gogoproto.customname) = "AppEUI"];</code>
     */
    private $app_eui = '';
    /**
     * <code>string app_id = 13 [(.gogoproto.customname) = "AppID"];</code>
     */
    private $app_id = '';
    /**
     * <code>string dev_id = 14 [(.gogoproto.customname) = "DevID"];</code>
     */
    private $dev_id = '';
    /**
     * <code>.protocol.RxMetadata protocol_metadata = 21;</code>
     */
    private $protocol_metadata = null;
    /**
     * <code>.gateway.RxMetadata gateway_metadata = 22;</code>
     */
    private $gateway_metadata = null;
    /**
     * <code>repeated .broker.DownlinkOption downlink_options = 31;</code>
     */
    private $downlink_options;
    /**
     * <code>.trace.Trace trace = 41;</code>
     */
    private $trace = null;

    public function __construct() {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Broker\Broker::initOnce();
        parent::__construct();
    }

    /**
     * <code>bytes payload = 1;</code>
     */
    public function getPayload()
    {
        return $this->payload;
    }

    /**
     * <code>bytes payload = 1;</code>
     */
    public function setPayload($var)
    {
        GPBUtil::checkString($var, False);
        $this->payload = $var;
    }

    /**
     * <code>.protocol.Message message = 2;</code>
     */
    public function getMessage()
    {
        return $this->message;
    }

    /**
     * <code>.protocol.Message message = 2;</code>
     */
    public function setMessage(&$var)
    {
        GPBUtil::checkMessage($var, \Protocol\Message::class);
        $this->message = $var;
    }

    /**
     * <code>bytes dev_eui = 11 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevEUI", (.gogoproto.customname) = "DevEUI"];</code>
     */
    public function getDevEui()
    {
        return $this->dev_eui;
    }

    /**
     * <code>bytes dev_eui = 11 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevEUI", (.gogoproto.customname) = "DevEUI"];</code>
     */
    public function setDevEui($var)
    {
        GPBUtil::checkString($var, False);
        $this->dev_eui = $var;
    }

    /**
     * <code>bytes app_eui = 12 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI", (.gogoproto.customname) = "AppEUI"];</code>
     */
    public function getAppEui()
    {
        return $this->app_eui;
    }

    /**
     * <code>bytes app_eui = 12 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI", (.gogoproto.customname) = "AppEUI"];</code>
     */
    public function setAppEui($var)
    {
        GPBUtil::checkString($var, False);
        $this->app_eui = $var;
    }

    /**
     * <code>string app_id = 13 [(.gogoproto.customname) = "AppID"];</code>
     */
    public function getAppId()
    {
        return $this->app_id;
    }

    /**
     * <code>string app_id = 13 [(.gogoproto.customname) = "AppID"];</code>
     */
    public function setAppId($var)
    {
        GPBUtil::checkString($var, True);
        $this->app_id = $var;
    }

    /**
     * <code>string dev_id = 14 [(.gogoproto.customname) = "DevID"];</code>
     */
    public function getDevId()
    {
        return $this->dev_id;
    }

    /**
     * <code>string dev_id = 14 [(.gogoproto.customname) = "DevID"];</code>
     */
    public function setDevId($var)
    {
        GPBUtil::checkString($var, True);
        $this->dev_id = $var;
    }

    /**
     * <code>.protocol.RxMetadata protocol_metadata = 21;</code>
     */
    public function getProtocolMetadata()
    {
        return $this->protocol_metadata;
    }

    /**
     * <code>.protocol.RxMetadata protocol_metadata = 21;</code>
     */
    public function setProtocolMetadata(&$var)
    {
        GPBUtil::checkMessage($var, \Protocol\RxMetadata::class);
        $this->protocol_metadata = $var;
    }

    /**
     * <code>.gateway.RxMetadata gateway_metadata = 22;</code>
     */
    public function getGatewayMetadata()
    {
        return $this->gateway_metadata;
    }

    /**
     * <code>.gateway.RxMetadata gateway_metadata = 22;</code>
     */
    public function setGatewayMetadata(&$var)
    {
        GPBUtil::checkMessage($var, \Gateway\RxMetadata::class);
        $this->gateway_metadata = $var;
    }

    /**
     * <code>repeated .broker.DownlinkOption downlink_options = 31;</code>
     */
    public function getDownlinkOptions()
    {
        return $this->downlink_options;
    }

    /**
     * <code>repeated .broker.DownlinkOption downlink_options = 31;</code>
     */
    public function setDownlinkOptions(&$var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Broker\DownlinkOption::class);
        $this->downlink_options = $arr;
    }

    /**
     * <code>.trace.Trace trace = 41;</code>
     */
    public function getTrace()
    {
        return $this->trace;
    }

    /**
     * <code>.trace.Trace trace = 41;</code>
     */
    public function setTrace(&$var)
    {
        GPBUtil::checkMessage($var, \Trace\Trace::class);
        $this->trace = $var;
    }

}

