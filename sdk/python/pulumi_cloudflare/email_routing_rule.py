# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['EmailRoutingRuleArgs', 'EmailRoutingRule']

@pulumi.input_type
class EmailRoutingRuleArgs:
    def __init__(__self__, *,
                 actions: pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleActionArgs']]],
                 matchers: pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleMatcherArgs']]],
                 name: pulumi.Input[str],
                 zone_id: pulumi.Input[str],
                 enabled: Optional[pulumi.Input[bool]] = None,
                 priority: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a EmailRoutingRule resource.
        :param pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleActionArgs']]] actions: List actions patterns.
        :param pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleMatcherArgs']]] matchers: Matching patterns to forward to your actions.
        :param pulumi.Input[str] name: Routing rule name.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource.
        :param pulumi.Input[bool] enabled: Routing rule status.
        :param pulumi.Input[int] priority: Priority of the routing rule.
        """
        EmailRoutingRuleArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            actions=actions,
            matchers=matchers,
            name=name,
            zone_id=zone_id,
            enabled=enabled,
            priority=priority,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             actions: Optional[pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleActionArgs']]]] = None,
             matchers: Optional[pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleMatcherArgs']]]] = None,
             name: Optional[pulumi.Input[str]] = None,
             zone_id: Optional[pulumi.Input[str]] = None,
             enabled: Optional[pulumi.Input[bool]] = None,
             priority: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if actions is None:
            raise TypeError("Missing 'actions' argument")
        if matchers is None:
            raise TypeError("Missing 'matchers' argument")
        if name is None:
            raise TypeError("Missing 'name' argument")
        if zone_id is None and 'zoneId' in kwargs:
            zone_id = kwargs['zoneId']
        if zone_id is None:
            raise TypeError("Missing 'zone_id' argument")

        _setter("actions", actions)
        _setter("matchers", matchers)
        _setter("name", name)
        _setter("zone_id", zone_id)
        if enabled is not None:
            _setter("enabled", enabled)
        if priority is not None:
            _setter("priority", priority)

    @property
    @pulumi.getter
    def actions(self) -> pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleActionArgs']]]:
        """
        List actions patterns.
        """
        return pulumi.get(self, "actions")

    @actions.setter
    def actions(self, value: pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleActionArgs']]]):
        pulumi.set(self, "actions", value)

    @property
    @pulumi.getter
    def matchers(self) -> pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleMatcherArgs']]]:
        """
        Matching patterns to forward to your actions.
        """
        return pulumi.get(self, "matchers")

    @matchers.setter
    def matchers(self, value: pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleMatcherArgs']]]):
        pulumi.set(self, "matchers", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        Routing rule name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

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
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Routing rule status.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[int]]:
        """
        Priority of the routing rule.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "priority", value)


@pulumi.input_type
class _EmailRoutingRuleState:
    def __init__(__self__, *,
                 actions: Optional[pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleActionArgs']]]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 matchers: Optional[pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleMatcherArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 tag: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering EmailRoutingRule resources.
        :param pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleActionArgs']]] actions: List actions patterns.
        :param pulumi.Input[bool] enabled: Routing rule status.
        :param pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleMatcherArgs']]] matchers: Matching patterns to forward to your actions.
        :param pulumi.Input[str] name: Routing rule name.
        :param pulumi.Input[int] priority: Priority of the routing rule.
        :param pulumi.Input[str] tag: Routing rule identifier.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource.
        """
        _EmailRoutingRuleState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            actions=actions,
            enabled=enabled,
            matchers=matchers,
            name=name,
            priority=priority,
            tag=tag,
            zone_id=zone_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             actions: Optional[pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleActionArgs']]]] = None,
             enabled: Optional[pulumi.Input[bool]] = None,
             matchers: Optional[pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleMatcherArgs']]]] = None,
             name: Optional[pulumi.Input[str]] = None,
             priority: Optional[pulumi.Input[int]] = None,
             tag: Optional[pulumi.Input[str]] = None,
             zone_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if zone_id is None and 'zoneId' in kwargs:
            zone_id = kwargs['zoneId']

        if actions is not None:
            _setter("actions", actions)
        if enabled is not None:
            _setter("enabled", enabled)
        if matchers is not None:
            _setter("matchers", matchers)
        if name is not None:
            _setter("name", name)
        if priority is not None:
            _setter("priority", priority)
        if tag is not None:
            _setter("tag", tag)
        if zone_id is not None:
            _setter("zone_id", zone_id)

    @property
    @pulumi.getter
    def actions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleActionArgs']]]]:
        """
        List actions patterns.
        """
        return pulumi.get(self, "actions")

    @actions.setter
    def actions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleActionArgs']]]]):
        pulumi.set(self, "actions", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Routing rule status.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def matchers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleMatcherArgs']]]]:
        """
        Matching patterns to forward to your actions.
        """
        return pulumi.get(self, "matchers")

    @matchers.setter
    def matchers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleMatcherArgs']]]]):
        pulumi.set(self, "matchers", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Routing rule name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[int]]:
        """
        Priority of the routing rule.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "priority", value)

    @property
    @pulumi.getter
    def tag(self) -> Optional[pulumi.Input[str]]:
        """
        Routing rule identifier.
        """
        return pulumi.get(self, "tag")

    @tag.setter
    def tag(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tag", value)

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


class EmailRoutingRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 actions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EmailRoutingRuleActionArgs']]]]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 matchers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EmailRoutingRuleMatcherArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a resource for managing Email Routing rules.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        main = cloudflare.EmailRoutingRule("main",
            actions=[cloudflare.EmailRoutingRuleActionArgs(
                type="forward",
                values=["destinationaddress@example.net"],
            )],
            enabled=True,
            matchers=[cloudflare.EmailRoutingRuleMatcherArgs(
                field="to",
                type="literal",
                value="test@example.com",
            )],
            name="terraform rule",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EmailRoutingRuleActionArgs']]]] actions: List actions patterns.
        :param pulumi.Input[bool] enabled: Routing rule status.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EmailRoutingRuleMatcherArgs']]]] matchers: Matching patterns to forward to your actions.
        :param pulumi.Input[str] name: Routing rule name.
        :param pulumi.Input[int] priority: Priority of the routing rule.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EmailRoutingRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource for managing Email Routing rules.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        main = cloudflare.EmailRoutingRule("main",
            actions=[cloudflare.EmailRoutingRuleActionArgs(
                type="forward",
                values=["destinationaddress@example.net"],
            )],
            enabled=True,
            matchers=[cloudflare.EmailRoutingRuleMatcherArgs(
                field="to",
                type="literal",
                value="test@example.com",
            )],
            name="terraform rule",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711")
        ```

        :param str resource_name: The name of the resource.
        :param EmailRoutingRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EmailRoutingRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            EmailRoutingRuleArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 actions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EmailRoutingRuleActionArgs']]]]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 matchers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EmailRoutingRuleMatcherArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EmailRoutingRuleArgs.__new__(EmailRoutingRuleArgs)

            if actions is None and not opts.urn:
                raise TypeError("Missing required property 'actions'")
            __props__.__dict__["actions"] = actions
            __props__.__dict__["enabled"] = enabled
            if matchers is None and not opts.urn:
                raise TypeError("Missing required property 'matchers'")
            __props__.__dict__["matchers"] = matchers
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            __props__.__dict__["priority"] = priority
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
            __props__.__dict__["tag"] = None
        super(EmailRoutingRule, __self__).__init__(
            'cloudflare:index/emailRoutingRule:EmailRoutingRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            actions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EmailRoutingRuleActionArgs']]]]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            matchers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EmailRoutingRuleMatcherArgs']]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            priority: Optional[pulumi.Input[int]] = None,
            tag: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'EmailRoutingRule':
        """
        Get an existing EmailRoutingRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EmailRoutingRuleActionArgs']]]] actions: List actions patterns.
        :param pulumi.Input[bool] enabled: Routing rule status.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EmailRoutingRuleMatcherArgs']]]] matchers: Matching patterns to forward to your actions.
        :param pulumi.Input[str] name: Routing rule name.
        :param pulumi.Input[int] priority: Priority of the routing rule.
        :param pulumi.Input[str] tag: Routing rule identifier.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EmailRoutingRuleState.__new__(_EmailRoutingRuleState)

        __props__.__dict__["actions"] = actions
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["matchers"] = matchers
        __props__.__dict__["name"] = name
        __props__.__dict__["priority"] = priority
        __props__.__dict__["tag"] = tag
        __props__.__dict__["zone_id"] = zone_id
        return EmailRoutingRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def actions(self) -> pulumi.Output[Sequence['outputs.EmailRoutingRuleAction']]:
        """
        List actions patterns.
        """
        return pulumi.get(self, "actions")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Routing rule status.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def matchers(self) -> pulumi.Output[Sequence['outputs.EmailRoutingRuleMatcher']]:
        """
        Matching patterns to forward to your actions.
        """
        return pulumi.get(self, "matchers")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Routing rule name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def priority(self) -> pulumi.Output[int]:
        """
        Priority of the routing rule.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter
    def tag(self) -> pulumi.Output[str]:
        """
        Routing rule identifier.
        """
        return pulumi.get(self, "tag")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The zone identifier to target for the resource.
        """
        return pulumi.get(self, "zone_id")

