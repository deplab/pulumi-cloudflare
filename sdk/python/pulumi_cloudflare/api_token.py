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

__all__ = ['ApiTokenArgs', 'ApiToken']

@pulumi.input_type
class ApiTokenArgs:
    def __init__(__self__, *,
                 name: pulumi.Input[str],
                 policies: pulumi.Input[Sequence[pulumi.Input['ApiTokenPolicyArgs']]],
                 condition: Optional[pulumi.Input['ApiTokenConditionArgs']] = None,
                 expires_on: Optional[pulumi.Input[str]] = None,
                 not_before: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ApiToken resource.
        :param pulumi.Input[str] name: Name of the API Token.
        :param pulumi.Input[Sequence[pulumi.Input['ApiTokenPolicyArgs']]] policies: Permissions policy. Multiple policy blocks can be defined.
        :param pulumi.Input['ApiTokenConditionArgs'] condition: Conditions under which the token should be considered valid.
        :param pulumi.Input[str] expires_on: The expiration time on or after which the token MUST NOT be accepted for processing.
        :param pulumi.Input[str] not_before: The time before which the token MUST NOT be accepted for processing.
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "policies", policies)
        if condition is not None:
            pulumi.set(__self__, "condition", condition)
        if expires_on is not None:
            pulumi.set(__self__, "expires_on", expires_on)
        if not_before is not None:
            pulumi.set(__self__, "not_before", not_before)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        Name of the API Token.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def policies(self) -> pulumi.Input[Sequence[pulumi.Input['ApiTokenPolicyArgs']]]:
        """
        Permissions policy. Multiple policy blocks can be defined.
        """
        return pulumi.get(self, "policies")

    @policies.setter
    def policies(self, value: pulumi.Input[Sequence[pulumi.Input['ApiTokenPolicyArgs']]]):
        pulumi.set(self, "policies", value)

    @property
    @pulumi.getter
    def condition(self) -> Optional[pulumi.Input['ApiTokenConditionArgs']]:
        """
        Conditions under which the token should be considered valid.
        """
        return pulumi.get(self, "condition")

    @condition.setter
    def condition(self, value: Optional[pulumi.Input['ApiTokenConditionArgs']]):
        pulumi.set(self, "condition", value)

    @property
    @pulumi.getter(name="expiresOn")
    def expires_on(self) -> Optional[pulumi.Input[str]]:
        """
        The expiration time on or after which the token MUST NOT be accepted for processing.
        """
        return pulumi.get(self, "expires_on")

    @expires_on.setter
    def expires_on(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expires_on", value)

    @property
    @pulumi.getter(name="notBefore")
    def not_before(self) -> Optional[pulumi.Input[str]]:
        """
        The time before which the token MUST NOT be accepted for processing.
        """
        return pulumi.get(self, "not_before")

    @not_before.setter
    def not_before(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "not_before", value)


@pulumi.input_type
class _ApiTokenState:
    def __init__(__self__, *,
                 condition: Optional[pulumi.Input['ApiTokenConditionArgs']] = None,
                 expires_on: Optional[pulumi.Input[str]] = None,
                 issued_on: Optional[pulumi.Input[str]] = None,
                 modified_on: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 not_before: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input['ApiTokenPolicyArgs']]]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ApiToken resources.
        :param pulumi.Input['ApiTokenConditionArgs'] condition: Conditions under which the token should be considered valid.
        :param pulumi.Input[str] expires_on: The expiration time on or after which the token MUST NOT be accepted for processing.
        :param pulumi.Input[str] issued_on: Timestamp of when the token was issued.
        :param pulumi.Input[str] modified_on: Timestamp of when the token was last modified.
        :param pulumi.Input[str] name: Name of the API Token.
        :param pulumi.Input[str] not_before: The time before which the token MUST NOT be accepted for processing.
        :param pulumi.Input[Sequence[pulumi.Input['ApiTokenPolicyArgs']]] policies: Permissions policy. Multiple policy blocks can be defined.
        :param pulumi.Input[str] value: The value of the API Token.
        """
        if condition is not None:
            pulumi.set(__self__, "condition", condition)
        if expires_on is not None:
            pulumi.set(__self__, "expires_on", expires_on)
        if issued_on is not None:
            pulumi.set(__self__, "issued_on", issued_on)
        if modified_on is not None:
            pulumi.set(__self__, "modified_on", modified_on)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if not_before is not None:
            pulumi.set(__self__, "not_before", not_before)
        if policies is not None:
            pulumi.set(__self__, "policies", policies)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def condition(self) -> Optional[pulumi.Input['ApiTokenConditionArgs']]:
        """
        Conditions under which the token should be considered valid.
        """
        return pulumi.get(self, "condition")

    @condition.setter
    def condition(self, value: Optional[pulumi.Input['ApiTokenConditionArgs']]):
        pulumi.set(self, "condition", value)

    @property
    @pulumi.getter(name="expiresOn")
    def expires_on(self) -> Optional[pulumi.Input[str]]:
        """
        The expiration time on or after which the token MUST NOT be accepted for processing.
        """
        return pulumi.get(self, "expires_on")

    @expires_on.setter
    def expires_on(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expires_on", value)

    @property
    @pulumi.getter(name="issuedOn")
    def issued_on(self) -> Optional[pulumi.Input[str]]:
        """
        Timestamp of when the token was issued.
        """
        return pulumi.get(self, "issued_on")

    @issued_on.setter
    def issued_on(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "issued_on", value)

    @property
    @pulumi.getter(name="modifiedOn")
    def modified_on(self) -> Optional[pulumi.Input[str]]:
        """
        Timestamp of when the token was last modified.
        """
        return pulumi.get(self, "modified_on")

    @modified_on.setter
    def modified_on(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "modified_on", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the API Token.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="notBefore")
    def not_before(self) -> Optional[pulumi.Input[str]]:
        """
        The time before which the token MUST NOT be accepted for processing.
        """
        return pulumi.get(self, "not_before")

    @not_before.setter
    def not_before(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "not_before", value)

    @property
    @pulumi.getter
    def policies(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ApiTokenPolicyArgs']]]]:
        """
        Permissions policy. Multiple policy blocks can be defined.
        """
        return pulumi.get(self, "policies")

    @policies.setter
    def policies(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ApiTokenPolicyArgs']]]]):
        pulumi.set(self, "policies", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def value(self) -> Optional[pulumi.Input[str]]:
        """
        The value of the API Token.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "value", value)


class ApiToken(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 condition: Optional[pulumi.Input[pulumi.InputType['ApiTokenConditionArgs']]] = None,
                 expires_on: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 not_before: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApiTokenPolicyArgs']]]]] = None,
                 __props__=None):
        """
        Provides a resource which manages Cloudflare API tokens.

        Read more about permission groups and their applicable scopes in the
        [developer documentation](https://developers.cloudflare.com/api/tokens/create/permissions).

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['ApiTokenConditionArgs']] condition: Conditions under which the token should be considered valid.
        :param pulumi.Input[str] expires_on: The expiration time on or after which the token MUST NOT be accepted for processing.
        :param pulumi.Input[str] name: Name of the API Token.
        :param pulumi.Input[str] not_before: The time before which the token MUST NOT be accepted for processing.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApiTokenPolicyArgs']]]] policies: Permissions policy. Multiple policy blocks can be defined.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ApiTokenArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource which manages Cloudflare API tokens.

        Read more about permission groups and their applicable scopes in the
        [developer documentation](https://developers.cloudflare.com/api/tokens/create/permissions).

        :param str resource_name: The name of the resource.
        :param ApiTokenArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ApiTokenArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 condition: Optional[pulumi.Input[pulumi.InputType['ApiTokenConditionArgs']]] = None,
                 expires_on: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 not_before: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApiTokenPolicyArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ApiTokenArgs.__new__(ApiTokenArgs)

            __props__.__dict__["condition"] = condition
            __props__.__dict__["expires_on"] = expires_on
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            __props__.__dict__["not_before"] = not_before
            if policies is None and not opts.urn:
                raise TypeError("Missing required property 'policies'")
            __props__.__dict__["policies"] = policies
            __props__.__dict__["issued_on"] = None
            __props__.__dict__["modified_on"] = None
            __props__.__dict__["status"] = None
            __props__.__dict__["value"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["value"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(ApiToken, __self__).__init__(
            'cloudflare:index/apiToken:ApiToken',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            condition: Optional[pulumi.Input[pulumi.InputType['ApiTokenConditionArgs']]] = None,
            expires_on: Optional[pulumi.Input[str]] = None,
            issued_on: Optional[pulumi.Input[str]] = None,
            modified_on: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            not_before: Optional[pulumi.Input[str]] = None,
            policies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApiTokenPolicyArgs']]]]] = None,
            status: Optional[pulumi.Input[str]] = None,
            value: Optional[pulumi.Input[str]] = None) -> 'ApiToken':
        """
        Get an existing ApiToken resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['ApiTokenConditionArgs']] condition: Conditions under which the token should be considered valid.
        :param pulumi.Input[str] expires_on: The expiration time on or after which the token MUST NOT be accepted for processing.
        :param pulumi.Input[str] issued_on: Timestamp of when the token was issued.
        :param pulumi.Input[str] modified_on: Timestamp of when the token was last modified.
        :param pulumi.Input[str] name: Name of the API Token.
        :param pulumi.Input[str] not_before: The time before which the token MUST NOT be accepted for processing.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApiTokenPolicyArgs']]]] policies: Permissions policy. Multiple policy blocks can be defined.
        :param pulumi.Input[str] value: The value of the API Token.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ApiTokenState.__new__(_ApiTokenState)

        __props__.__dict__["condition"] = condition
        __props__.__dict__["expires_on"] = expires_on
        __props__.__dict__["issued_on"] = issued_on
        __props__.__dict__["modified_on"] = modified_on
        __props__.__dict__["name"] = name
        __props__.__dict__["not_before"] = not_before
        __props__.__dict__["policies"] = policies
        __props__.__dict__["status"] = status
        __props__.__dict__["value"] = value
        return ApiToken(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def condition(self) -> pulumi.Output[Optional['outputs.ApiTokenCondition']]:
        """
        Conditions under which the token should be considered valid.
        """
        return pulumi.get(self, "condition")

    @property
    @pulumi.getter(name="expiresOn")
    def expires_on(self) -> pulumi.Output[Optional[str]]:
        """
        The expiration time on or after which the token MUST NOT be accepted for processing.
        """
        return pulumi.get(self, "expires_on")

    @property
    @pulumi.getter(name="issuedOn")
    def issued_on(self) -> pulumi.Output[str]:
        """
        Timestamp of when the token was issued.
        """
        return pulumi.get(self, "issued_on")

    @property
    @pulumi.getter(name="modifiedOn")
    def modified_on(self) -> pulumi.Output[str]:
        """
        Timestamp of when the token was last modified.
        """
        return pulumi.get(self, "modified_on")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the API Token.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="notBefore")
    def not_before(self) -> pulumi.Output[Optional[str]]:
        """
        The time before which the token MUST NOT be accepted for processing.
        """
        return pulumi.get(self, "not_before")

    @property
    @pulumi.getter
    def policies(self) -> pulumi.Output[Sequence['outputs.ApiTokenPolicy']]:
        """
        Permissions policy. Multiple policy blocks can be defined.
        """
        return pulumi.get(self, "policies")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def value(self) -> pulumi.Output[str]:
        """
        The value of the API Token.
        """
        return pulumi.get(self, "value")

