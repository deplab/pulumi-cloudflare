# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['AccountMemberArgs', 'AccountMember']

@pulumi.input_type
class AccountMemberArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 email_address: pulumi.Input[str],
                 role_ids: pulumi.Input[Sequence[pulumi.Input[str]]],
                 status: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AccountMember resource.
        :param pulumi.Input[str] account_id: Account ID to create the account member in.
        :param pulumi.Input[str] email_address: The email address of the user who you wish to manage. Following creation, this field becomes read only via the API and cannot be updated.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] role_ids: List of account role IDs that you want to assign to a member.
        :param pulumi.Input[str] status: A member's status in the account. Available values: `accepted`, `pending`.
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "email_address", email_address)
        pulumi.set(__self__, "role_ids", role_ids)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[str]:
        """
        Account ID to create the account member in.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="emailAddress")
    def email_address(self) -> pulumi.Input[str]:
        """
        The email address of the user who you wish to manage. Following creation, this field becomes read only via the API and cannot be updated.
        """
        return pulumi.get(self, "email_address")

    @email_address.setter
    def email_address(self, value: pulumi.Input[str]):
        pulumi.set(self, "email_address", value)

    @property
    @pulumi.getter(name="roleIds")
    def role_ids(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        List of account role IDs that you want to assign to a member.
        """
        return pulumi.get(self, "role_ids")

    @role_ids.setter
    def role_ids(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "role_ids", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        A member's status in the account. Available values: `accepted`, `pending`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


@pulumi.input_type
class _AccountMemberState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 email_address: Optional[pulumi.Input[str]] = None,
                 role_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AccountMember resources.
        :param pulumi.Input[str] account_id: Account ID to create the account member in.
        :param pulumi.Input[str] email_address: The email address of the user who you wish to manage. Following creation, this field becomes read only via the API and cannot be updated.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] role_ids: List of account role IDs that you want to assign to a member.
        :param pulumi.Input[str] status: A member's status in the account. Available values: `accepted`, `pending`.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if email_address is not None:
            pulumi.set(__self__, "email_address", email_address)
        if role_ids is not None:
            pulumi.set(__self__, "role_ids", role_ids)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        Account ID to create the account member in.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="emailAddress")
    def email_address(self) -> Optional[pulumi.Input[str]]:
        """
        The email address of the user who you wish to manage. Following creation, this field becomes read only via the API and cannot be updated.
        """
        return pulumi.get(self, "email_address")

    @email_address.setter
    def email_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "email_address", value)

    @property
    @pulumi.getter(name="roleIds")
    def role_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of account role IDs that you want to assign to a member.
        """
        return pulumi.get(self, "role_ids")

    @role_ids.setter
    def role_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "role_ids", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        A member's status in the account. Available values: `accepted`, `pending`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class AccountMember(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 email_address: Optional[pulumi.Input[str]] = None,
                 role_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a resource which manages Cloudflare account members.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example_user = cloudflare.AccountMember("exampleUser",
            email_address="user@example.com",
            role_ids=[
                "68b329da9893e34099c7d8ad5cb9c940",
                "d784fa8b6d98d27699781bd9a7cf19f0",
            ])
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/accountMember:AccountMember example <account_id>/<member_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: Account ID to create the account member in.
        :param pulumi.Input[str] email_address: The email address of the user who you wish to manage. Following creation, this field becomes read only via the API and cannot be updated.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] role_ids: List of account role IDs that you want to assign to a member.
        :param pulumi.Input[str] status: A member's status in the account. Available values: `accepted`, `pending`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AccountMemberArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource which manages Cloudflare account members.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example_user = cloudflare.AccountMember("exampleUser",
            email_address="user@example.com",
            role_ids=[
                "68b329da9893e34099c7d8ad5cb9c940",
                "d784fa8b6d98d27699781bd9a7cf19f0",
            ])
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/accountMember:AccountMember example <account_id>/<member_id>
        ```

        :param str resource_name: The name of the resource.
        :param AccountMemberArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AccountMemberArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 email_address: Optional[pulumi.Input[str]] = None,
                 role_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AccountMemberArgs.__new__(AccountMemberArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            if email_address is None and not opts.urn:
                raise TypeError("Missing required property 'email_address'")
            __props__.__dict__["email_address"] = email_address
            if role_ids is None and not opts.urn:
                raise TypeError("Missing required property 'role_ids'")
            __props__.__dict__["role_ids"] = role_ids
            __props__.__dict__["status"] = status
        super(AccountMember, __self__).__init__(
            'cloudflare:index/accountMember:AccountMember',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            email_address: Optional[pulumi.Input[str]] = None,
            role_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'AccountMember':
        """
        Get an existing AccountMember resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: Account ID to create the account member in.
        :param pulumi.Input[str] email_address: The email address of the user who you wish to manage. Following creation, this field becomes read only via the API and cannot be updated.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] role_ids: List of account role IDs that you want to assign to a member.
        :param pulumi.Input[str] status: A member's status in the account. Available values: `accepted`, `pending`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AccountMemberState.__new__(_AccountMemberState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["email_address"] = email_address
        __props__.__dict__["role_ids"] = role_ids
        __props__.__dict__["status"] = status
        return AccountMember(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        Account ID to create the account member in.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="emailAddress")
    def email_address(self) -> pulumi.Output[str]:
        """
        The email address of the user who you wish to manage. Following creation, this field becomes read only via the API and cannot be updated.
        """
        return pulumi.get(self, "email_address")

    @property
    @pulumi.getter(name="roleIds")
    def role_ids(self) -> pulumi.Output[Sequence[str]]:
        """
        List of account role IDs that you want to assign to a member.
        """
        return pulumi.get(self, "role_ids")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        A member's status in the account. Available values: `accepted`, `pending`.
        """
        return pulumi.get(self, "status")

