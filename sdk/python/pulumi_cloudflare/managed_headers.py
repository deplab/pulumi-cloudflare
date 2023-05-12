# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['ManagedHeadersArgs', 'ManagedHeaders']

@pulumi.input_type
class ManagedHeadersArgs:
    def __init__(__self__, *,
                 zone_id: pulumi.Input[str],
                 managed_request_headers: Optional[pulumi.Input[Sequence[pulumi.Input['ManagedHeadersManagedRequestHeaderArgs']]]] = None,
                 managed_response_headers: Optional[pulumi.Input[Sequence[pulumi.Input['ManagedHeadersManagedResponseHeaderArgs']]]] = None):
        """
        The set of arguments for constructing a ManagedHeaders resource.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource.
        :param pulumi.Input[Sequence[pulumi.Input['ManagedHeadersManagedRequestHeaderArgs']]] managed_request_headers: The list of managed request headers.
        :param pulumi.Input[Sequence[pulumi.Input['ManagedHeadersManagedResponseHeaderArgs']]] managed_response_headers: The list of managed response headers.
        """
        pulumi.set(__self__, "zone_id", zone_id)
        if managed_request_headers is not None:
            pulumi.set(__self__, "managed_request_headers", managed_request_headers)
        if managed_response_headers is not None:
            pulumi.set(__self__, "managed_response_headers", managed_response_headers)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Input[str]:
        """
        The zone identifier to target for the resource.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "zone_id", value)

    @property
    @pulumi.getter(name="managedRequestHeaders")
    def managed_request_headers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ManagedHeadersManagedRequestHeaderArgs']]]]:
        """
        The list of managed request headers.
        """
        return pulumi.get(self, "managed_request_headers")

    @managed_request_headers.setter
    def managed_request_headers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ManagedHeadersManagedRequestHeaderArgs']]]]):
        pulumi.set(self, "managed_request_headers", value)

    @property
    @pulumi.getter(name="managedResponseHeaders")
    def managed_response_headers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ManagedHeadersManagedResponseHeaderArgs']]]]:
        """
        The list of managed response headers.
        """
        return pulumi.get(self, "managed_response_headers")

    @managed_response_headers.setter
    def managed_response_headers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ManagedHeadersManagedResponseHeaderArgs']]]]):
        pulumi.set(self, "managed_response_headers", value)


@pulumi.input_type
class _ManagedHeadersState:
    def __init__(__self__, *,
                 managed_request_headers: Optional[pulumi.Input[Sequence[pulumi.Input['ManagedHeadersManagedRequestHeaderArgs']]]] = None,
                 managed_response_headers: Optional[pulumi.Input[Sequence[pulumi.Input['ManagedHeadersManagedResponseHeaderArgs']]]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ManagedHeaders resources.
        :param pulumi.Input[Sequence[pulumi.Input['ManagedHeadersManagedRequestHeaderArgs']]] managed_request_headers: The list of managed request headers.
        :param pulumi.Input[Sequence[pulumi.Input['ManagedHeadersManagedResponseHeaderArgs']]] managed_response_headers: The list of managed response headers.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource.
        """
        if managed_request_headers is not None:
            pulumi.set(__self__, "managed_request_headers", managed_request_headers)
        if managed_response_headers is not None:
            pulumi.set(__self__, "managed_response_headers", managed_response_headers)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="managedRequestHeaders")
    def managed_request_headers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ManagedHeadersManagedRequestHeaderArgs']]]]:
        """
        The list of managed request headers.
        """
        return pulumi.get(self, "managed_request_headers")

    @managed_request_headers.setter
    def managed_request_headers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ManagedHeadersManagedRequestHeaderArgs']]]]):
        pulumi.set(self, "managed_request_headers", value)

    @property
    @pulumi.getter(name="managedResponseHeaders")
    def managed_response_headers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ManagedHeadersManagedResponseHeaderArgs']]]]:
        """
        The list of managed response headers.
        """
        return pulumi.get(self, "managed_response_headers")

    @managed_response_headers.setter
    def managed_response_headers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ManagedHeadersManagedResponseHeaderArgs']]]]):
        pulumi.set(self, "managed_response_headers", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The zone identifier to target for the resource.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class ManagedHeaders(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 managed_request_headers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagedHeadersManagedRequestHeaderArgs']]]]] = None,
                 managed_response_headers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagedHeadersManagedResponseHeaderArgs']]]]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        The [Cloudflare Managed Headers](https://developers.cloudflare.com/rules/transform/managed-transforms/)
        allows you to add or remove some predefined headers to one's
        requests or origin responses.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        # Enable security headers using Managed Meaders
        example = cloudflare.ManagedHeaders("example",
            managed_request_headers=[cloudflare.ManagedHeadersManagedRequestHeaderArgs(
                enabled=True,
                id="add_true_client_ip_headers",
            )],
            managed_response_headers=[cloudflare.ManagedHeadersManagedResponseHeaderArgs(
                enabled=True,
                id="remove_x-powered-by_header",
            )],
            zone_id="0da42c8d2132a9ddaf714f9e7c920711")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagedHeadersManagedRequestHeaderArgs']]]] managed_request_headers: The list of managed request headers.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagedHeadersManagedResponseHeaderArgs']]]] managed_response_headers: The list of managed response headers.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ManagedHeadersArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The [Cloudflare Managed Headers](https://developers.cloudflare.com/rules/transform/managed-transforms/)
        allows you to add or remove some predefined headers to one's
        requests or origin responses.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        # Enable security headers using Managed Meaders
        example = cloudflare.ManagedHeaders("example",
            managed_request_headers=[cloudflare.ManagedHeadersManagedRequestHeaderArgs(
                enabled=True,
                id="add_true_client_ip_headers",
            )],
            managed_response_headers=[cloudflare.ManagedHeadersManagedResponseHeaderArgs(
                enabled=True,
                id="remove_x-powered-by_header",
            )],
            zone_id="0da42c8d2132a9ddaf714f9e7c920711")
        ```

        :param str resource_name: The name of the resource.
        :param ManagedHeadersArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ManagedHeadersArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 managed_request_headers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagedHeadersManagedRequestHeaderArgs']]]]] = None,
                 managed_response_headers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagedHeadersManagedResponseHeaderArgs']]]]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ManagedHeadersArgs.__new__(ManagedHeadersArgs)

            __props__.__dict__["managed_request_headers"] = managed_request_headers
            __props__.__dict__["managed_response_headers"] = managed_response_headers
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
        super(ManagedHeaders, __self__).__init__(
            'cloudflare:index/managedHeaders:ManagedHeaders',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            managed_request_headers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagedHeadersManagedRequestHeaderArgs']]]]] = None,
            managed_response_headers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagedHeadersManagedResponseHeaderArgs']]]]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'ManagedHeaders':
        """
        Get an existing ManagedHeaders resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagedHeadersManagedRequestHeaderArgs']]]] managed_request_headers: The list of managed request headers.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagedHeadersManagedResponseHeaderArgs']]]] managed_response_headers: The list of managed response headers.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ManagedHeadersState.__new__(_ManagedHeadersState)

        __props__.__dict__["managed_request_headers"] = managed_request_headers
        __props__.__dict__["managed_response_headers"] = managed_response_headers
        __props__.__dict__["zone_id"] = zone_id
        return ManagedHeaders(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="managedRequestHeaders")
    def managed_request_headers(self) -> pulumi.Output[Optional[Sequence['outputs.ManagedHeadersManagedRequestHeader']]]:
        """
        The list of managed request headers.
        """
        return pulumi.get(self, "managed_request_headers")

    @property
    @pulumi.getter(name="managedResponseHeaders")
    def managed_response_headers(self) -> pulumi.Output[Optional[Sequence['outputs.ManagedHeadersManagedResponseHeader']]]:
        """
        The list of managed response headers.
        """
        return pulumi.get(self, "managed_response_headers")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The zone identifier to target for the resource.
        """
        return pulumi.get(self, "zone_id")

