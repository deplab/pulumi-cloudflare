# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['WorkersKvNamespaceArgs', 'WorkersKvNamespace']

@pulumi.input_type
class WorkersKvNamespaceArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 title: pulumi.Input[str]):
        """
        The set of arguments for constructing a WorkersKvNamespace resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] title: Title value of the Worker KV Namespace.
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "title", title)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[str]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def title(self) -> pulumi.Input[str]:
        """
        Title value of the Worker KV Namespace.
        """
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: pulumi.Input[str]):
        pulumi.set(self, "title", value)


@pulumi.input_type
class _WorkersKvNamespaceState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 title: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering WorkersKvNamespace resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] title: Title value of the Worker KV Namespace.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if title is not None:
            pulumi.set(__self__, "title", title)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def title(self) -> Optional[pulumi.Input[str]]:
        """
        Title value of the Worker KV Namespace.
        """
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "title", value)


class WorkersKvNamespace(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 title: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides the ability to manage Cloudflare Workers KV Namespace features.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.WorkersKvNamespace("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            title="test-namespace")
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/workersKvNamespace:WorkersKvNamespace example <account_id>/<namespace_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] title: Title value of the Worker KV Namespace.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WorkersKvNamespaceArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides the ability to manage Cloudflare Workers KV Namespace features.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.WorkersKvNamespace("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            title="test-namespace")
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/workersKvNamespace:WorkersKvNamespace example <account_id>/<namespace_id>
        ```

        :param str resource_name: The name of the resource.
        :param WorkersKvNamespaceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WorkersKvNamespaceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 title: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WorkersKvNamespaceArgs.__new__(WorkersKvNamespaceArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            if title is None and not opts.urn:
                raise TypeError("Missing required property 'title'")
            __props__.__dict__["title"] = title
        super(WorkersKvNamespace, __self__).__init__(
            'cloudflare:index/workersKvNamespace:WorkersKvNamespace',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            title: Optional[pulumi.Input[str]] = None) -> 'WorkersKvNamespace':
        """
        Get an existing WorkersKvNamespace resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] title: Title value of the Worker KV Namespace.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WorkersKvNamespaceState.__new__(_WorkersKvNamespaceState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["title"] = title
        return WorkersKvNamespace(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def title(self) -> pulumi.Output[str]:
        """
        Title value of the Worker KV Namespace.
        """
        return pulumi.get(self, "title")

