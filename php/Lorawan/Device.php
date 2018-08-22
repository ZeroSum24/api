<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/protocol/lorawan/device.proto

namespace Lorawan;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>lorawan.Device</code>
 */
class Device extends \Google\Protobuf\Internal\Message
{
    /**
     * The AppEUI is a unique, 8 byte identifier for the application a device belongs to.
     *
     * Generated from protobuf field <code>bytes app_eui = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI", (.gogoproto.customname) = "AppEUI"];</code>
     */
    private $app_eui = '';
    /**
     * The DevEUI is a unique, 8 byte identifier for the device.
     *
     * Generated from protobuf field <code>bytes dev_eui = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevEUI", (.gogoproto.customname) = "DevEUI"];</code>
     */
    private $dev_eui = '';
    /**
     * The AppID is a unique identifier for the application a device belongs to. It can contain lowercase letters, numbers, - and _.
     *
     * Generated from protobuf field <code>string app_id = 3 [(.gogoproto.customname) = "AppID"];</code>
     */
    private $app_id = '';
    /**
     * The DevID is a unique identifier for the device. It can contain lowercase letters, numbers, - and _.
     *
     * Generated from protobuf field <code>string dev_id = 4 [(.gogoproto.customname) = "DevID"];</code>
     */
    private $dev_id = '';
    /**
     * The DevAddr is a dynamic, 4 byte session address for the device.
     *
     * Generated from protobuf field <code>bytes dev_addr = 5 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevAddr"];</code>
     */
    private $dev_addr = '';
    /**
     * The NwkSKey is a 16 byte session key that is known by the device and the network. It is used for routing and MAC related functionality.
     * This key is negotiated during the OTAA join procedure, or statically configured using ABP.
     *
     * Generated from protobuf field <code>bytes nwk_s_key = 6 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.NwkSKey"];</code>
     */
    private $nwk_s_key = '';
    /**
     * The AppSKey is a 16 byte session key that is known by the device and the application. It is used for payload encryption.
     * This key is negotiated during the OTAA join procedure, or statically configured using ABP.
     *
     * Generated from protobuf field <code>bytes app_s_key = 7 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppSKey"];</code>
     */
    private $app_s_key = '';
    /**
     * The AppKey is a 16 byte static key that is known by the device and the application. It is used for negotiating session keys (OTAA).
     *
     * Generated from protobuf field <code>bytes app_key = 8 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppKey"];</code>
     */
    private $app_key = '';
    /**
     * FCntUp is the uplink frame counter for a device session.
     *
     * Generated from protobuf field <code>uint32 f_cnt_up = 9;</code>
     */
    private $f_cnt_up = 0;
    /**
     * FCntDown is the downlink frame counter for a device session.
     *
     * Generated from protobuf field <code>uint32 f_cnt_down = 10;</code>
     */
    private $f_cnt_down = 0;
    /**
     * The DisableFCntCheck option disables the frame counter check. Disabling this makes the device vulnerable to replay attacks, but makes ABP slightly easier.
     *
     * Generated from protobuf field <code>bool disable_f_cnt_check = 11;</code>
     */
    private $disable_f_cnt_check = false;
    /**
     * The Uses32BitFCnt option indicates that the device keeps track of full 32 bit frame counters. As only the 16 lsb are actually transmitted, the 16 msb will have to be inferred.
     *
     * Generated from protobuf field <code>bool uses32_bit_f_cnt = 12;</code>
     */
    private $uses32_bit_f_cnt = false;
    /**
     * The ActivationContstraints are used to allocate a device address for a device (comma-separated).
     * There are different prefixes for `otaa`, `abp`, `world`, `local`, `private`, `testing`.
     *
     * Generated from protobuf field <code>string activation_constraints = 13;</code>
     */
    private $activation_constraints = '';
    /**
     * The DevNonces that have been used in joins. This field is read-only. Reset the nonces by changing the AppKey.
     *
     * Generated from protobuf field <code>repeated bytes used_dev_nonces = 14 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevNonce"];</code>
     */
    private $used_dev_nonces;
    /**
     * The AppNonces that have been used in joins. This field is read-only. Reset the nonces by changing the AppKey.
     *
     * Generated from protobuf field <code>repeated bytes used_app_nonces = 15 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppNonce"];</code>
     */
    private $used_app_nonces;
    /**
     * When the device was last seen (Unix nanoseconds)
     *
     * Generated from protobuf field <code>int64 last_seen = 21;</code>
     */
    private $last_seen = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $app_eui
     *           The AppEUI is a unique, 8 byte identifier for the application a device belongs to.
     *     @type string $dev_eui
     *           The DevEUI is a unique, 8 byte identifier for the device.
     *     @type string $app_id
     *           The AppID is a unique identifier for the application a device belongs to. It can contain lowercase letters, numbers, - and _.
     *     @type string $dev_id
     *           The DevID is a unique identifier for the device. It can contain lowercase letters, numbers, - and _.
     *     @type string $dev_addr
     *           The DevAddr is a dynamic, 4 byte session address for the device.
     *     @type string $nwk_s_key
     *           The NwkSKey is a 16 byte session key that is known by the device and the network. It is used for routing and MAC related functionality.
     *           This key is negotiated during the OTAA join procedure, or statically configured using ABP.
     *     @type string $app_s_key
     *           The AppSKey is a 16 byte session key that is known by the device and the application. It is used for payload encryption.
     *           This key is negotiated during the OTAA join procedure, or statically configured using ABP.
     *     @type string $app_key
     *           The AppKey is a 16 byte static key that is known by the device and the application. It is used for negotiating session keys (OTAA).
     *     @type int $f_cnt_up
     *           FCntUp is the uplink frame counter for a device session.
     *     @type int $f_cnt_down
     *           FCntDown is the downlink frame counter for a device session.
     *     @type bool $disable_f_cnt_check
     *           The DisableFCntCheck option disables the frame counter check. Disabling this makes the device vulnerable to replay attacks, but makes ABP slightly easier.
     *     @type bool $uses32_bit_f_cnt
     *           The Uses32BitFCnt option indicates that the device keeps track of full 32 bit frame counters. As only the 16 lsb are actually transmitted, the 16 msb will have to be inferred.
     *     @type string $activation_constraints
     *           The ActivationContstraints are used to allocate a device address for a device (comma-separated).
     *           There are different prefixes for `otaa`, `abp`, `world`, `local`, `private`, `testing`.
     *     @type string[]|\Google\Protobuf\Internal\RepeatedField $used_dev_nonces
     *           The DevNonces that have been used in joins. This field is read-only. Reset the nonces by changing the AppKey.
     *     @type string[]|\Google\Protobuf\Internal\RepeatedField $used_app_nonces
     *           The AppNonces that have been used in joins. This field is read-only. Reset the nonces by changing the AppKey.
     *     @type int|string $last_seen
     *           When the device was last seen (Unix nanoseconds)
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Protocol\Lorawan\Device::initOnce();
        parent::__construct($data);
    }

    /**
     * The AppEUI is a unique, 8 byte identifier for the application a device belongs to.
     *
     * Generated from protobuf field <code>bytes app_eui = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI", (.gogoproto.customname) = "AppEUI"];</code>
     * @return string
     */
    public function getAppEui()
    {
        return $this->app_eui;
    }

    /**
     * The AppEUI is a unique, 8 byte identifier for the application a device belongs to.
     *
     * Generated from protobuf field <code>bytes app_eui = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI", (.gogoproto.customname) = "AppEUI"];</code>
     * @param string $var
     * @return $this
     */
    public function setAppEui($var)
    {
        GPBUtil::checkString($var, False);
        $this->app_eui = $var;

        return $this;
    }

    /**
     * The DevEUI is a unique, 8 byte identifier for the device.
     *
     * Generated from protobuf field <code>bytes dev_eui = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevEUI", (.gogoproto.customname) = "DevEUI"];</code>
     * @return string
     */
    public function getDevEui()
    {
        return $this->dev_eui;
    }

    /**
     * The DevEUI is a unique, 8 byte identifier for the device.
     *
     * Generated from protobuf field <code>bytes dev_eui = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevEUI", (.gogoproto.customname) = "DevEUI"];</code>
     * @param string $var
     * @return $this
     */
    public function setDevEui($var)
    {
        GPBUtil::checkString($var, False);
        $this->dev_eui = $var;

        return $this;
    }

    /**
     * The AppID is a unique identifier for the application a device belongs to. It can contain lowercase letters, numbers, - and _.
     *
     * Generated from protobuf field <code>string app_id = 3 [(.gogoproto.customname) = "AppID"];</code>
     * @return string
     */
    public function getAppId()
    {
        return $this->app_id;
    }

    /**
     * The AppID is a unique identifier for the application a device belongs to. It can contain lowercase letters, numbers, - and _.
     *
     * Generated from protobuf field <code>string app_id = 3 [(.gogoproto.customname) = "AppID"];</code>
     * @param string $var
     * @return $this
     */
    public function setAppId($var)
    {
        GPBUtil::checkString($var, True);
        $this->app_id = $var;

        return $this;
    }

    /**
     * The DevID is a unique identifier for the device. It can contain lowercase letters, numbers, - and _.
     *
     * Generated from protobuf field <code>string dev_id = 4 [(.gogoproto.customname) = "DevID"];</code>
     * @return string
     */
    public function getDevId()
    {
        return $this->dev_id;
    }

    /**
     * The DevID is a unique identifier for the device. It can contain lowercase letters, numbers, - and _.
     *
     * Generated from protobuf field <code>string dev_id = 4 [(.gogoproto.customname) = "DevID"];</code>
     * @param string $var
     * @return $this
     */
    public function setDevId($var)
    {
        GPBUtil::checkString($var, True);
        $this->dev_id = $var;

        return $this;
    }

    /**
     * The DevAddr is a dynamic, 4 byte session address for the device.
     *
     * Generated from protobuf field <code>bytes dev_addr = 5 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevAddr"];</code>
     * @return string
     */
    public function getDevAddr()
    {
        return $this->dev_addr;
    }

    /**
     * The DevAddr is a dynamic, 4 byte session address for the device.
     *
     * Generated from protobuf field <code>bytes dev_addr = 5 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevAddr"];</code>
     * @param string $var
     * @return $this
     */
    public function setDevAddr($var)
    {
        GPBUtil::checkString($var, False);
        $this->dev_addr = $var;

        return $this;
    }

    /**
     * The NwkSKey is a 16 byte session key that is known by the device and the network. It is used for routing and MAC related functionality.
     * This key is negotiated during the OTAA join procedure, or statically configured using ABP.
     *
     * Generated from protobuf field <code>bytes nwk_s_key = 6 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.NwkSKey"];</code>
     * @return string
     */
    public function getNwkSKey()
    {
        return $this->nwk_s_key;
    }

    /**
     * The NwkSKey is a 16 byte session key that is known by the device and the network. It is used for routing and MAC related functionality.
     * This key is negotiated during the OTAA join procedure, or statically configured using ABP.
     *
     * Generated from protobuf field <code>bytes nwk_s_key = 6 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.NwkSKey"];</code>
     * @param string $var
     * @return $this
     */
    public function setNwkSKey($var)
    {
        GPBUtil::checkString($var, False);
        $this->nwk_s_key = $var;

        return $this;
    }

    /**
     * The AppSKey is a 16 byte session key that is known by the device and the application. It is used for payload encryption.
     * This key is negotiated during the OTAA join procedure, or statically configured using ABP.
     *
     * Generated from protobuf field <code>bytes app_s_key = 7 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppSKey"];</code>
     * @return string
     */
    public function getAppSKey()
    {
        return $this->app_s_key;
    }

    /**
     * The AppSKey is a 16 byte session key that is known by the device and the application. It is used for payload encryption.
     * This key is negotiated during the OTAA join procedure, or statically configured using ABP.
     *
     * Generated from protobuf field <code>bytes app_s_key = 7 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppSKey"];</code>
     * @param string $var
     * @return $this
     */
    public function setAppSKey($var)
    {
        GPBUtil::checkString($var, False);
        $this->app_s_key = $var;

        return $this;
    }

    /**
     * The AppKey is a 16 byte static key that is known by the device and the application. It is used for negotiating session keys (OTAA).
     *
     * Generated from protobuf field <code>bytes app_key = 8 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppKey"];</code>
     * @return string
     */
    public function getAppKey()
    {
        return $this->app_key;
    }

    /**
     * The AppKey is a 16 byte static key that is known by the device and the application. It is used for negotiating session keys (OTAA).
     *
     * Generated from protobuf field <code>bytes app_key = 8 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppKey"];</code>
     * @param string $var
     * @return $this
     */
    public function setAppKey($var)
    {
        GPBUtil::checkString($var, False);
        $this->app_key = $var;

        return $this;
    }

    /**
     * FCntUp is the uplink frame counter for a device session.
     *
     * Generated from protobuf field <code>uint32 f_cnt_up = 9;</code>
     * @return int
     */
    public function getFCntUp()
    {
        return $this->f_cnt_up;
    }

    /**
     * FCntUp is the uplink frame counter for a device session.
     *
     * Generated from protobuf field <code>uint32 f_cnt_up = 9;</code>
     * @param int $var
     * @return $this
     */
    public function setFCntUp($var)
    {
        GPBUtil::checkUint32($var);
        $this->f_cnt_up = $var;

        return $this;
    }

    /**
     * FCntDown is the downlink frame counter for a device session.
     *
     * Generated from protobuf field <code>uint32 f_cnt_down = 10;</code>
     * @return int
     */
    public function getFCntDown()
    {
        return $this->f_cnt_down;
    }

    /**
     * FCntDown is the downlink frame counter for a device session.
     *
     * Generated from protobuf field <code>uint32 f_cnt_down = 10;</code>
     * @param int $var
     * @return $this
     */
    public function setFCntDown($var)
    {
        GPBUtil::checkUint32($var);
        $this->f_cnt_down = $var;

        return $this;
    }

    /**
     * The DisableFCntCheck option disables the frame counter check. Disabling this makes the device vulnerable to replay attacks, but makes ABP slightly easier.
     *
     * Generated from protobuf field <code>bool disable_f_cnt_check = 11;</code>
     * @return bool
     */
    public function getDisableFCntCheck()
    {
        return $this->disable_f_cnt_check;
    }

    /**
     * The DisableFCntCheck option disables the frame counter check. Disabling this makes the device vulnerable to replay attacks, but makes ABP slightly easier.
     *
     * Generated from protobuf field <code>bool disable_f_cnt_check = 11;</code>
     * @param bool $var
     * @return $this
     */
    public function setDisableFCntCheck($var)
    {
        GPBUtil::checkBool($var);
        $this->disable_f_cnt_check = $var;

        return $this;
    }

    /**
     * The Uses32BitFCnt option indicates that the device keeps track of full 32 bit frame counters. As only the 16 lsb are actually transmitted, the 16 msb will have to be inferred.
     *
     * Generated from protobuf field <code>bool uses32_bit_f_cnt = 12;</code>
     * @return bool
     */
    public function getUses32BitFCnt()
    {
        return $this->uses32_bit_f_cnt;
    }

    /**
     * The Uses32BitFCnt option indicates that the device keeps track of full 32 bit frame counters. As only the 16 lsb are actually transmitted, the 16 msb will have to be inferred.
     *
     * Generated from protobuf field <code>bool uses32_bit_f_cnt = 12;</code>
     * @param bool $var
     * @return $this
     */
    public function setUses32BitFCnt($var)
    {
        GPBUtil::checkBool($var);
        $this->uses32_bit_f_cnt = $var;

        return $this;
    }

    /**
     * The ActivationContstraints are used to allocate a device address for a device (comma-separated).
     * There are different prefixes for `otaa`, `abp`, `world`, `local`, `private`, `testing`.
     *
     * Generated from protobuf field <code>string activation_constraints = 13;</code>
     * @return string
     */
    public function getActivationConstraints()
    {
        return $this->activation_constraints;
    }

    /**
     * The ActivationContstraints are used to allocate a device address for a device (comma-separated).
     * There are different prefixes for `otaa`, `abp`, `world`, `local`, `private`, `testing`.
     *
     * Generated from protobuf field <code>string activation_constraints = 13;</code>
     * @param string $var
     * @return $this
     */
    public function setActivationConstraints($var)
    {
        GPBUtil::checkString($var, True);
        $this->activation_constraints = $var;

        return $this;
    }

    /**
     * The DevNonces that have been used in joins. This field is read-only. Reset the nonces by changing the AppKey.
     *
     * Generated from protobuf field <code>repeated bytes used_dev_nonces = 14 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevNonce"];</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getUsedDevNonces()
    {
        return $this->used_dev_nonces;
    }

    /**
     * The DevNonces that have been used in joins. This field is read-only. Reset the nonces by changing the AppKey.
     *
     * Generated from protobuf field <code>repeated bytes used_dev_nonces = 14 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevNonce"];</code>
     * @param string[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setUsedDevNonces($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::BYTES);
        $this->used_dev_nonces = $arr;

        return $this;
    }

    /**
     * The AppNonces that have been used in joins. This field is read-only. Reset the nonces by changing the AppKey.
     *
     * Generated from protobuf field <code>repeated bytes used_app_nonces = 15 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppNonce"];</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getUsedAppNonces()
    {
        return $this->used_app_nonces;
    }

    /**
     * The AppNonces that have been used in joins. This field is read-only. Reset the nonces by changing the AppKey.
     *
     * Generated from protobuf field <code>repeated bytes used_app_nonces = 15 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppNonce"];</code>
     * @param string[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setUsedAppNonces($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::BYTES);
        $this->used_app_nonces = $arr;

        return $this;
    }

    /**
     * When the device was last seen (Unix nanoseconds)
     *
     * Generated from protobuf field <code>int64 last_seen = 21;</code>
     * @return int|string
     */
    public function getLastSeen()
    {
        return $this->last_seen;
    }

    /**
     * When the device was last seen (Unix nanoseconds)
     *
     * Generated from protobuf field <code>int64 last_seen = 21;</code>
     * @param int|string $var
     * @return $this
     */
    public function setLastSeen($var)
    {
        GPBUtil::checkInt64($var);
        $this->last_seen = $var;

        return $this;
    }

}

