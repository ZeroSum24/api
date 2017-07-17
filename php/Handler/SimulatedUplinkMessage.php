<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/handler/handler.proto

namespace Handler;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * <pre>
 * SimulatedUplinkMessage is a simulated uplink message
 * </pre>
 *
 * Protobuf type <code>handler.SimulatedUplinkMessage</code>
 */
class SimulatedUplinkMessage extends \Google\Protobuf\Internal\Message
{
    /**
     * <code>string app_id = 1 [(.gogoproto.customname) = "AppID"];</code>
     */
    private $app_id = '';
    /**
     * <code>string dev_id = 2 [(.gogoproto.customname) = "DevID"];</code>
     */
    private $dev_id = '';
    /**
     * <pre>
     * The binary payload to use
     * </pre>
     *
     * <code>bytes payload = 3;</code>
     */
    private $payload = '';
    /**
     * <pre>
     * The port number
     * </pre>
     *
     * <code>uint32 port = 4;</code>
     */
    private $port = 0;

    public function __construct() {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Handler\Handler::initOnce();
        parent::__construct();
    }

    /**
     * <code>string app_id = 1 [(.gogoproto.customname) = "AppID"];</code>
     */
    public function getAppId()
    {
        return $this->app_id;
    }

    /**
     * <code>string app_id = 1 [(.gogoproto.customname) = "AppID"];</code>
     */
    public function setAppId($var)
    {
        GPBUtil::checkString($var, True);
        $this->app_id = $var;
    }

    /**
     * <code>string dev_id = 2 [(.gogoproto.customname) = "DevID"];</code>
     */
    public function getDevId()
    {
        return $this->dev_id;
    }

    /**
     * <code>string dev_id = 2 [(.gogoproto.customname) = "DevID"];</code>
     */
    public function setDevId($var)
    {
        GPBUtil::checkString($var, True);
        $this->dev_id = $var;
    }

    /**
     * <pre>
     * The binary payload to use
     * </pre>
     *
     * <code>bytes payload = 3;</code>
     */
    public function getPayload()
    {
        return $this->payload;
    }

    /**
     * <pre>
     * The binary payload to use
     * </pre>
     *
     * <code>bytes payload = 3;</code>
     */
    public function setPayload($var)
    {
        GPBUtil::checkString($var, False);
        $this->payload = $var;
    }

    /**
     * <pre>
     * The port number
     * </pre>
     *
     * <code>uint32 port = 4;</code>
     */
    public function getPort()
    {
        return $this->port;
    }

    /**
     * <pre>
     * The port number
     * </pre>
     *
     * <code>uint32 port = 4;</code>
     */
    public function setPort($var)
    {
        GPBUtil::checkUint32($var);
        $this->port = $var;
    }

}

