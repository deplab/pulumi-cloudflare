# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['HostnameTlsSettingArgs', 'HostnameTlsSetting']

@pulumi.input_type
class HostnameTlsSettingArgs:
    def __init__(__self__, *,
                 hostname: pulumi.Input[str],
                 setting: pulumi.Input[str],
                 value: pulumi.Input[str],
                 zone_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a HostnameTlsSetting resource.
        :param pulumi.Input[str] hostname: Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] setting: TLS setting name. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] value: TLS setting value.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        pulumi.set(__self__, "hostname", hostname)
        pulumi.set(__self__, "setting", setting)
        pulumi.set(__self__, "value", value)
        pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter
    def hostname(self) -> pulumi.Input[str]:
        """
        Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "hostname")

    @hostname.setter
    def hostname(self, value: pulumi.Input[str]):
        pulumi.set(self, "hostname", value)

    @property
    @pulumi.getter
    def setting(self) -> pulumi.Input[str]:
        """
        TLS setting name. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "setting")

    @setting.setter
    def setting(self, value: pulumi.Input[str]):
        pulumi.set(self, "setting", value)

    @property
    @pulumi.getter
    def value(self) -> pulumi.Input[str]:
        """
        TLS setting value.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: pulumi.Input[str]):
        pulumi.set(self, "value", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Input[str]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "zone_id", value)


@pulumi.input_type
class _HostnameTlsSettingState:
    def __init__(__self__, *,
                 created_at: Optional[pulumi.Input[str]] = None,
                 hostname: Optional[pulumi.Input[str]] = None,
                 setting: Optional[pulumi.Input[str]] = None,
                 updated_at: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering HostnameTlsSetting resources.
        :param pulumi.Input[str] hostname: Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] setting: TLS setting name. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] value: TLS setting value.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if hostname is not None:
            pulumi.set(__self__, "hostname", hostname)
        if setting is not None:
            pulumi.set(__self__, "setting", setting)
        if updated_at is not None:
            pulumi.set(__self__, "updated_at", updated_at)
        if value is not None:
            pulumi.set(__self__, "value", value)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter
    def hostname(self) -> Optional[pulumi.Input[str]]:
        """
        Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "hostname")

    @hostname.setter
    def hostname(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "hostname", value)

    @property
    @pulumi.getter
    def setting(self) -> Optional[pulumi.Input[str]]:
        """
        TLS setting name. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "setting")

    @setting.setter
    def setting(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "setting", value)

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "updated_at")

    @updated_at.setter
    def updated_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "updated_at", value)

    @property
    @pulumi.getter
    def value(self) -> Optional[pulumi.Input[str]]:
        """
        TLS setting value.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "value", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class HostnameTlsSetting(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 hostname: Optional[pulumi.Input[str]] = None,
                 setting: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloudflare per-hostname TLS setting resource. Used to set TLS settings for hostnames under the specified zone.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.HostnameTlsSetting("example",
            hostname="sub.example.com",
            setting="min_tls_version",
            value="1.2",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711")
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/hostnameTlsSetting:HostnameTlsSetting example <zone_id>/<hostname>/<setting_name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] hostname: Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] setting: TLS setting name. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] value: TLS setting value.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: HostnameTlsSettingArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloudflare per-hostname TLS setting resource. Used to set TLS settings for hostnames under the specified zone.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.HostnameTlsSetting("example",
            hostname="sub.example.com",
            setting="min_tls_version",
            value="1.2",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711")
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/hostnameTlsSetting:HostnameTlsSetting example <zone_id>/<hostname>/<setting_name>
        ```

        :param str resource_name: The name of the resource.
        :param HostnameTlsSettingArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(HostnameTlsSettingArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 hostname: Optional[pulumi.Input[str]] = None,
                 setting: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = HostnameTlsSettingArgs.__new__(HostnameTlsSettingArgs)

            if hostname is None and not opts.urn:
                raise TypeError("Missing required property 'hostname'")
            __props__.__dict__["hostname"] = hostname
            if setting is None and not opts.urn:
                raise TypeError("Missing required property 'setting'")
            __props__.__dict__["setting"] = setting
            if value is None and not opts.urn:
                raise TypeError("Missing required property 'value'")
            __props__.__dict__["value"] = value
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
            __props__.__dict__["created_at"] = None
            __props__.__dict__["updated_at"] = None
        super(HostnameTlsSetting, __self__).__init__(
            'cloudflare:index/hostnameTlsSetting:HostnameTlsSetting',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            hostname: Optional[pulumi.Input[str]] = None,
            setting: Optional[pulumi.Input[str]] = None,
            updated_at: Optional[pulumi.Input[str]] = None,
            value: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'HostnameTlsSetting':
        """
        Get an existing HostnameTlsSetting resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] hostname: Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] setting: TLS setting name. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] value: TLS setting value.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _HostnameTlsSettingState.__new__(_HostnameTlsSettingState)

        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["hostname"] = hostname
        __props__.__dict__["setting"] = setting
        __props__.__dict__["updated_at"] = updated_at
        __props__.__dict__["value"] = value
        __props__.__dict__["zone_id"] = zone_id
        return HostnameTlsSetting(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter
    def hostname(self) -> pulumi.Output[str]:
        """
        Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "hostname")

    @property
    @pulumi.getter
    def setting(self) -> pulumi.Output[str]:
        """
        TLS setting name. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "setting")

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> pulumi.Output[str]:
        return pulumi.get(self, "updated_at")

    @property
    @pulumi.getter
    def value(self) -> pulumi.Output[str]:
        """
        TLS setting value.
        """
        return pulumi.get(self, "value")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

