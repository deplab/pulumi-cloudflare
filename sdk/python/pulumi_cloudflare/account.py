# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['AccountArgs', 'Account']

@pulumi.input_type
class AccountArgs:
    def __init__(__self__, *,
                 name: pulumi.Input[str],
                 enforce_twofactor: Optional[pulumi.Input[bool]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Account resource.
        :param pulumi.Input[str] name: The name of the account that is displayed in the Cloudflare dashboard.
        :param pulumi.Input[bool] enforce_twofactor: Whether 2FA is enforced on the account. Defaults to `false`.
        :param pulumi.Input[str] type: Account type. Available values: `enterprise`, `standard`. Defaults to `standard`. **Modifying this attribute will force creation of a new resource.**
        """
        AccountArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            name=name,
            enforce_twofactor=enforce_twofactor,
            type=type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             name: Optional[pulumi.Input[str]] = None,
             enforce_twofactor: Optional[pulumi.Input[bool]] = None,
             type: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if name is None:
            raise TypeError("Missing 'name' argument")
        if enforce_twofactor is None and 'enforceTwofactor' in kwargs:
            enforce_twofactor = kwargs['enforceTwofactor']

        _setter("name", name)
        if enforce_twofactor is not None:
            _setter("enforce_twofactor", enforce_twofactor)
        if type is not None:
            _setter("type", type)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        The name of the account that is displayed in the Cloudflare dashboard.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="enforceTwofactor")
    def enforce_twofactor(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether 2FA is enforced on the account. Defaults to `false`.
        """
        return pulumi.get(self, "enforce_twofactor")

    @enforce_twofactor.setter
    def enforce_twofactor(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enforce_twofactor", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Account type. Available values: `enterprise`, `standard`. Defaults to `standard`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class _AccountState:
    def __init__(__self__, *,
                 enforce_twofactor: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Account resources.
        :param pulumi.Input[bool] enforce_twofactor: Whether 2FA is enforced on the account. Defaults to `false`.
        :param pulumi.Input[str] name: The name of the account that is displayed in the Cloudflare dashboard.
        :param pulumi.Input[str] type: Account type. Available values: `enterprise`, `standard`. Defaults to `standard`. **Modifying this attribute will force creation of a new resource.**
        """
        _AccountState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            enforce_twofactor=enforce_twofactor,
            name=name,
            type=type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             enforce_twofactor: Optional[pulumi.Input[bool]] = None,
             name: Optional[pulumi.Input[str]] = None,
             type: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if enforce_twofactor is None and 'enforceTwofactor' in kwargs:
            enforce_twofactor = kwargs['enforceTwofactor']

        if enforce_twofactor is not None:
            _setter("enforce_twofactor", enforce_twofactor)
        if name is not None:
            _setter("name", name)
        if type is not None:
            _setter("type", type)

    @property
    @pulumi.getter(name="enforceTwofactor")
    def enforce_twofactor(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether 2FA is enforced on the account. Defaults to `false`.
        """
        return pulumi.get(self, "enforce_twofactor")

    @enforce_twofactor.setter
    def enforce_twofactor(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enforce_twofactor", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the account that is displayed in the Cloudflare dashboard.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Account type. Available values: `enterprise`, `standard`. Defaults to `standard`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class Account(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enforce_twofactor: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloudflare Account resource. Account is the basic resource for
        working with Cloudflare zones, teams and users.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.Account("example",
            enforce_twofactor=True,
            name="some-enterprise-account",
            type="enterprise")
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/account:Account example <account_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enforce_twofactor: Whether 2FA is enforced on the account. Defaults to `false`.
        :param pulumi.Input[str] name: The name of the account that is displayed in the Cloudflare dashboard.
        :param pulumi.Input[str] type: Account type. Available values: `enterprise`, `standard`. Defaults to `standard`. **Modifying this attribute will force creation of a new resource.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AccountArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloudflare Account resource. Account is the basic resource for
        working with Cloudflare zones, teams and users.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.Account("example",
            enforce_twofactor=True,
            name="some-enterprise-account",
            type="enterprise")
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/account:Account example <account_id>
        ```

        :param str resource_name: The name of the resource.
        :param AccountArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AccountArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            AccountArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enforce_twofactor: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AccountArgs.__new__(AccountArgs)

            __props__.__dict__["enforce_twofactor"] = enforce_twofactor
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            __props__.__dict__["type"] = type
        super(Account, __self__).__init__(
            'cloudflare:index/account:Account',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            enforce_twofactor: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'Account':
        """
        Get an existing Account resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enforce_twofactor: Whether 2FA is enforced on the account. Defaults to `false`.
        :param pulumi.Input[str] name: The name of the account that is displayed in the Cloudflare dashboard.
        :param pulumi.Input[str] type: Account type. Available values: `enterprise`, `standard`. Defaults to `standard`. **Modifying this attribute will force creation of a new resource.**
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AccountState.__new__(_AccountState)

        __props__.__dict__["enforce_twofactor"] = enforce_twofactor
        __props__.__dict__["name"] = name
        __props__.__dict__["type"] = type
        return Account(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="enforceTwofactor")
    def enforce_twofactor(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether 2FA is enforced on the account. Defaults to `false`.
        """
        return pulumi.get(self, "enforce_twofactor")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the account that is displayed in the Cloudflare dashboard.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[Optional[str]]:
        """
        Account type. Available values: `enterprise`, `standard`. Defaults to `standard`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "type")

