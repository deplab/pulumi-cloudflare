# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['AccessTagArgs', 'AccessTag']

@pulumi.input_type
class AccessTagArgs:
    def __init__(__self__, *,
                 name: pulumi.Input[str],
                 account_id: Optional[pulumi.Input[str]] = None,
                 app_count: Optional[pulumi.Input[int]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AccessTag resource.
        :param pulumi.Input[str] name: Friendly name of the Access Tag.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[int] app_count: Number of apps associated with the tag.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. Conflicts with `account_id`. **Modifying this attribute will force creation of a new resource.**
        """
        AccessTagArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            name=name,
            account_id=account_id,
            app_count=app_count,
            zone_id=zone_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             name: Optional[pulumi.Input[str]] = None,
             account_id: Optional[pulumi.Input[str]] = None,
             app_count: Optional[pulumi.Input[int]] = None,
             zone_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if name is None:
            raise TypeError("Missing 'name' argument")
        if account_id is None and 'accountId' in kwargs:
            account_id = kwargs['accountId']
        if app_count is None and 'appCount' in kwargs:
            app_count = kwargs['appCount']
        if zone_id is None and 'zoneId' in kwargs:
            zone_id = kwargs['zoneId']

        _setter("name", name)
        if account_id is not None:
            _setter("account_id", account_id)
        if app_count is not None:
            _setter("app_count", app_count)
        if zone_id is not None:
            _setter("zone_id", zone_id)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        Friendly name of the Access Tag.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="appCount")
    def app_count(self) -> Optional[pulumi.Input[int]]:
        """
        Number of apps associated with the tag.
        """
        return pulumi.get(self, "app_count")

    @app_count.setter
    def app_count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "app_count", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The zone identifier to target for the resource. Conflicts with `account_id`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


@pulumi.input_type
class _AccessTagState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 app_count: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AccessTag resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[int] app_count: Number of apps associated with the tag.
        :param pulumi.Input[str] name: Friendly name of the Access Tag.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. Conflicts with `account_id`. **Modifying this attribute will force creation of a new resource.**
        """
        _AccessTagState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            account_id=account_id,
            app_count=app_count,
            name=name,
            zone_id=zone_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             account_id: Optional[pulumi.Input[str]] = None,
             app_count: Optional[pulumi.Input[int]] = None,
             name: Optional[pulumi.Input[str]] = None,
             zone_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if account_id is None and 'accountId' in kwargs:
            account_id = kwargs['accountId']
        if app_count is None and 'appCount' in kwargs:
            app_count = kwargs['appCount']
        if zone_id is None and 'zoneId' in kwargs:
            zone_id = kwargs['zoneId']

        if account_id is not None:
            _setter("account_id", account_id)
        if app_count is not None:
            _setter("app_count", app_count)
        if name is not None:
            _setter("name", name)
        if zone_id is not None:
            _setter("zone_id", zone_id)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="appCount")
    def app_count(self) -> Optional[pulumi.Input[int]]:
        """
        Number of apps associated with the tag.
        """
        return pulumi.get(self, "app_count")

    @app_count.setter
    def app_count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "app_count", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Friendly name of the Access Tag.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The zone identifier to target for the resource. Conflicts with `account_id`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class AccessTag(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 app_count: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a resource to customize the pages your end users will see
        when trying to reach applications behind Cloudflare Access.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[int] app_count: Number of apps associated with the tag.
        :param pulumi.Input[str] name: Friendly name of the Access Tag.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. Conflicts with `account_id`. **Modifying this attribute will force creation of a new resource.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AccessTagArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource to customize the pages your end users will see
        when trying to reach applications behind Cloudflare Access.

        :param str resource_name: The name of the resource.
        :param AccessTagArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AccessTagArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            AccessTagArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 app_count: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AccessTagArgs.__new__(AccessTagArgs)

            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["app_count"] = app_count
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            __props__.__dict__["zone_id"] = zone_id
        super(AccessTag, __self__).__init__(
            'cloudflare:index/accessTag:AccessTag',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            app_count: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'AccessTag':
        """
        Get an existing AccessTag resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[int] app_count: Number of apps associated with the tag.
        :param pulumi.Input[str] name: Friendly name of the Access Tag.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. Conflicts with `account_id`. **Modifying this attribute will force creation of a new resource.**
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AccessTagState.__new__(_AccessTagState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["app_count"] = app_count
        __props__.__dict__["name"] = name
        __props__.__dict__["zone_id"] = zone_id
        return AccessTag(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[Optional[str]]:
        """
        The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="appCount")
    def app_count(self) -> pulumi.Output[int]:
        """
        Number of apps associated with the tag.
        """
        return pulumi.get(self, "app_count")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Friendly name of the Access Tag.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[Optional[str]]:
        """
        The zone identifier to target for the resource. Conflicts with `account_id`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")
