# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['NotificationPolicyArgs', 'NotificationPolicy']

@pulumi.input_type
class NotificationPolicyArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 alert_type: pulumi.Input[str],
                 enabled: pulumi.Input[bool],
                 name: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 email_integrations: Optional[pulumi.Input[Sequence[pulumi.Input['NotificationPolicyEmailIntegrationArgs']]]] = None,
                 filters: Optional[pulumi.Input['NotificationPolicyFiltersArgs']] = None,
                 pagerduty_integrations: Optional[pulumi.Input[Sequence[pulumi.Input['NotificationPolicyPagerdutyIntegrationArgs']]]] = None,
                 webhooks_integrations: Optional[pulumi.Input[Sequence[pulumi.Input['NotificationPolicyWebhooksIntegrationArgs']]]] = None):
        """
        The set of arguments for constructing a NotificationPolicy resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] alert_type: The event type that will trigger the dispatch of a notification. See the developer documentation for descriptions of
               [available alert types](https://developers.cloudflare.com/fundamentals/notifications/notification-available/) Available
               values: `billing_usage_alert`, `health_check_status_notification`, `g6_pool_toggle_alert`, `real_origin_monitoring`,
               `universal_ssl_event_type`, `bgp_hijack_notification`, `http_alert_origin_error`, `workers_alert`,
               `weekly_account_overview`
        :param pulumi.Input[bool] enabled: The status of the notification policy.
        :param pulumi.Input[str] name: The name of the notification policy.
        :param pulumi.Input[str] description: Description of the notification policy.
        :param pulumi.Input[Sequence[pulumi.Input['NotificationPolicyEmailIntegrationArgs']]] email_integrations: The email id to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is
               required.
        :param pulumi.Input['NotificationPolicyFiltersArgs'] filters: An optional nested block of filters that applies to the selected `alert_type`. A key-value map that specifies the type
               of filter and the values to match against (refer to the alert type block for available fields).
        :param pulumi.Input[Sequence[pulumi.Input['NotificationPolicyPagerdutyIntegrationArgs']]] pagerduty_integrations: The unique id of a configured pagerduty endpoint to which the notification should be dispatched. One of email, webhooks,
               or PagerDuty mechanisms is required.
        :param pulumi.Input[Sequence[pulumi.Input['NotificationPolicyWebhooksIntegrationArgs']]] webhooks_integrations: The unique id of a configured webhooks endpoint to which the notification should be dispatched. One of email, webhooks,
               or PagerDuty mechanisms is required.
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "alert_type", alert_type)
        pulumi.set(__self__, "enabled", enabled)
        pulumi.set(__self__, "name", name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if email_integrations is not None:
            pulumi.set(__self__, "email_integrations", email_integrations)
        if filters is not None:
            pulumi.set(__self__, "filters", filters)
        if pagerduty_integrations is not None:
            pulumi.set(__self__, "pagerduty_integrations", pagerduty_integrations)
        if webhooks_integrations is not None:
            pulumi.set(__self__, "webhooks_integrations", webhooks_integrations)

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
    @pulumi.getter(name="alertType")
    def alert_type(self) -> pulumi.Input[str]:
        """
        The event type that will trigger the dispatch of a notification. See the developer documentation for descriptions of
        [available alert types](https://developers.cloudflare.com/fundamentals/notifications/notification-available/) Available
        values: `billing_usage_alert`, `health_check_status_notification`, `g6_pool_toggle_alert`, `real_origin_monitoring`,
        `universal_ssl_event_type`, `bgp_hijack_notification`, `http_alert_origin_error`, `workers_alert`,
        `weekly_account_overview`
        """
        return pulumi.get(self, "alert_type")

    @alert_type.setter
    def alert_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "alert_type", value)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Input[bool]:
        """
        The status of the notification policy.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: pulumi.Input[bool]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        The name of the notification policy.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the notification policy.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="emailIntegrations")
    def email_integrations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NotificationPolicyEmailIntegrationArgs']]]]:
        """
        The email id to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is
        required.
        """
        return pulumi.get(self, "email_integrations")

    @email_integrations.setter
    def email_integrations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NotificationPolicyEmailIntegrationArgs']]]]):
        pulumi.set(self, "email_integrations", value)

    @property
    @pulumi.getter
    def filters(self) -> Optional[pulumi.Input['NotificationPolicyFiltersArgs']]:
        """
        An optional nested block of filters that applies to the selected `alert_type`. A key-value map that specifies the type
        of filter and the values to match against (refer to the alert type block for available fields).
        """
        return pulumi.get(self, "filters")

    @filters.setter
    def filters(self, value: Optional[pulumi.Input['NotificationPolicyFiltersArgs']]):
        pulumi.set(self, "filters", value)

    @property
    @pulumi.getter(name="pagerdutyIntegrations")
    def pagerduty_integrations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NotificationPolicyPagerdutyIntegrationArgs']]]]:
        """
        The unique id of a configured pagerduty endpoint to which the notification should be dispatched. One of email, webhooks,
        or PagerDuty mechanisms is required.
        """
        return pulumi.get(self, "pagerduty_integrations")

    @pagerduty_integrations.setter
    def pagerduty_integrations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NotificationPolicyPagerdutyIntegrationArgs']]]]):
        pulumi.set(self, "pagerduty_integrations", value)

    @property
    @pulumi.getter(name="webhooksIntegrations")
    def webhooks_integrations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NotificationPolicyWebhooksIntegrationArgs']]]]:
        """
        The unique id of a configured webhooks endpoint to which the notification should be dispatched. One of email, webhooks,
        or PagerDuty mechanisms is required.
        """
        return pulumi.get(self, "webhooks_integrations")

    @webhooks_integrations.setter
    def webhooks_integrations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NotificationPolicyWebhooksIntegrationArgs']]]]):
        pulumi.set(self, "webhooks_integrations", value)


@pulumi.input_type
class _NotificationPolicyState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 alert_type: Optional[pulumi.Input[str]] = None,
                 created: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 email_integrations: Optional[pulumi.Input[Sequence[pulumi.Input['NotificationPolicyEmailIntegrationArgs']]]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 filters: Optional[pulumi.Input['NotificationPolicyFiltersArgs']] = None,
                 modified: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 pagerduty_integrations: Optional[pulumi.Input[Sequence[pulumi.Input['NotificationPolicyPagerdutyIntegrationArgs']]]] = None,
                 webhooks_integrations: Optional[pulumi.Input[Sequence[pulumi.Input['NotificationPolicyWebhooksIntegrationArgs']]]] = None):
        """
        Input properties used for looking up and filtering NotificationPolicy resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] alert_type: The event type that will trigger the dispatch of a notification. See the developer documentation for descriptions of
               [available alert types](https://developers.cloudflare.com/fundamentals/notifications/notification-available/) Available
               values: `billing_usage_alert`, `health_check_status_notification`, `g6_pool_toggle_alert`, `real_origin_monitoring`,
               `universal_ssl_event_type`, `bgp_hijack_notification`, `http_alert_origin_error`, `workers_alert`,
               `weekly_account_overview`
        :param pulumi.Input[str] created: When the notification policy was created.
        :param pulumi.Input[str] description: Description of the notification policy.
        :param pulumi.Input[Sequence[pulumi.Input['NotificationPolicyEmailIntegrationArgs']]] email_integrations: The email id to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is
               required.
        :param pulumi.Input[bool] enabled: The status of the notification policy.
        :param pulumi.Input['NotificationPolicyFiltersArgs'] filters: An optional nested block of filters that applies to the selected `alert_type`. A key-value map that specifies the type
               of filter and the values to match against (refer to the alert type block for available fields).
        :param pulumi.Input[str] modified: When the notification policy was last modified.
        :param pulumi.Input[str] name: The name of the notification policy.
        :param pulumi.Input[Sequence[pulumi.Input['NotificationPolicyPagerdutyIntegrationArgs']]] pagerduty_integrations: The unique id of a configured pagerduty endpoint to which the notification should be dispatched. One of email, webhooks,
               or PagerDuty mechanisms is required.
        :param pulumi.Input[Sequence[pulumi.Input['NotificationPolicyWebhooksIntegrationArgs']]] webhooks_integrations: The unique id of a configured webhooks endpoint to which the notification should be dispatched. One of email, webhooks,
               or PagerDuty mechanisms is required.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if alert_type is not None:
            pulumi.set(__self__, "alert_type", alert_type)
        if created is not None:
            pulumi.set(__self__, "created", created)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if email_integrations is not None:
            pulumi.set(__self__, "email_integrations", email_integrations)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if filters is not None:
            pulumi.set(__self__, "filters", filters)
        if modified is not None:
            pulumi.set(__self__, "modified", modified)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if pagerduty_integrations is not None:
            pulumi.set(__self__, "pagerduty_integrations", pagerduty_integrations)
        if webhooks_integrations is not None:
            pulumi.set(__self__, "webhooks_integrations", webhooks_integrations)

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
    @pulumi.getter(name="alertType")
    def alert_type(self) -> Optional[pulumi.Input[str]]:
        """
        The event type that will trigger the dispatch of a notification. See the developer documentation for descriptions of
        [available alert types](https://developers.cloudflare.com/fundamentals/notifications/notification-available/) Available
        values: `billing_usage_alert`, `health_check_status_notification`, `g6_pool_toggle_alert`, `real_origin_monitoring`,
        `universal_ssl_event_type`, `bgp_hijack_notification`, `http_alert_origin_error`, `workers_alert`,
        `weekly_account_overview`
        """
        return pulumi.get(self, "alert_type")

    @alert_type.setter
    def alert_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "alert_type", value)

    @property
    @pulumi.getter
    def created(self) -> Optional[pulumi.Input[str]]:
        """
        When the notification policy was created.
        """
        return pulumi.get(self, "created")

    @created.setter
    def created(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the notification policy.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="emailIntegrations")
    def email_integrations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NotificationPolicyEmailIntegrationArgs']]]]:
        """
        The email id to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is
        required.
        """
        return pulumi.get(self, "email_integrations")

    @email_integrations.setter
    def email_integrations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NotificationPolicyEmailIntegrationArgs']]]]):
        pulumi.set(self, "email_integrations", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        The status of the notification policy.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def filters(self) -> Optional[pulumi.Input['NotificationPolicyFiltersArgs']]:
        """
        An optional nested block of filters that applies to the selected `alert_type`. A key-value map that specifies the type
        of filter and the values to match against (refer to the alert type block for available fields).
        """
        return pulumi.get(self, "filters")

    @filters.setter
    def filters(self, value: Optional[pulumi.Input['NotificationPolicyFiltersArgs']]):
        pulumi.set(self, "filters", value)

    @property
    @pulumi.getter
    def modified(self) -> Optional[pulumi.Input[str]]:
        """
        When the notification policy was last modified.
        """
        return pulumi.get(self, "modified")

    @modified.setter
    def modified(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "modified", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the notification policy.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="pagerdutyIntegrations")
    def pagerduty_integrations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NotificationPolicyPagerdutyIntegrationArgs']]]]:
        """
        The unique id of a configured pagerduty endpoint to which the notification should be dispatched. One of email, webhooks,
        or PagerDuty mechanisms is required.
        """
        return pulumi.get(self, "pagerduty_integrations")

    @pagerduty_integrations.setter
    def pagerduty_integrations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NotificationPolicyPagerdutyIntegrationArgs']]]]):
        pulumi.set(self, "pagerduty_integrations", value)

    @property
    @pulumi.getter(name="webhooksIntegrations")
    def webhooks_integrations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NotificationPolicyWebhooksIntegrationArgs']]]]:
        """
        The unique id of a configured webhooks endpoint to which the notification should be dispatched. One of email, webhooks,
        or PagerDuty mechanisms is required.
        """
        return pulumi.get(self, "webhooks_integrations")

    @webhooks_integrations.setter
    def webhooks_integrations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NotificationPolicyWebhooksIntegrationArgs']]]]):
        pulumi.set(self, "webhooks_integrations", value)


class NotificationPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 alert_type: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 email_integrations: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NotificationPolicyEmailIntegrationArgs']]]]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 filters: Optional[pulumi.Input[pulumi.InputType['NotificationPolicyFiltersArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 pagerduty_integrations: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NotificationPolicyPagerdutyIntegrationArgs']]]]] = None,
                 webhooks_integrations: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NotificationPolicyWebhooksIntegrationArgs']]]]] = None,
                 __props__=None):
        """
        Provides a resource, that manages a notification policy for Cloudflare's products. The delivery mechanisms supported are email, webhooks, and PagerDuty.

        ## Import

        ```sh
         $ pulumi import cloudflare:index/notificationPolicy:NotificationPolicy example <account_id>/<policy_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] alert_type: The event type that will trigger the dispatch of a notification. See the developer documentation for descriptions of
               [available alert types](https://developers.cloudflare.com/fundamentals/notifications/notification-available/) Available
               values: `billing_usage_alert`, `health_check_status_notification`, `g6_pool_toggle_alert`, `real_origin_monitoring`,
               `universal_ssl_event_type`, `bgp_hijack_notification`, `http_alert_origin_error`, `workers_alert`,
               `weekly_account_overview`
        :param pulumi.Input[str] description: Description of the notification policy.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NotificationPolicyEmailIntegrationArgs']]]] email_integrations: The email id to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is
               required.
        :param pulumi.Input[bool] enabled: The status of the notification policy.
        :param pulumi.Input[pulumi.InputType['NotificationPolicyFiltersArgs']] filters: An optional nested block of filters that applies to the selected `alert_type`. A key-value map that specifies the type
               of filter and the values to match against (refer to the alert type block for available fields).
        :param pulumi.Input[str] name: The name of the notification policy.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NotificationPolicyPagerdutyIntegrationArgs']]]] pagerduty_integrations: The unique id of a configured pagerduty endpoint to which the notification should be dispatched. One of email, webhooks,
               or PagerDuty mechanisms is required.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NotificationPolicyWebhooksIntegrationArgs']]]] webhooks_integrations: The unique id of a configured webhooks endpoint to which the notification should be dispatched. One of email, webhooks,
               or PagerDuty mechanisms is required.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NotificationPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource, that manages a notification policy for Cloudflare's products. The delivery mechanisms supported are email, webhooks, and PagerDuty.

        ## Import

        ```sh
         $ pulumi import cloudflare:index/notificationPolicy:NotificationPolicy example <account_id>/<policy_id>
        ```

        :param str resource_name: The name of the resource.
        :param NotificationPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NotificationPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 alert_type: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 email_integrations: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NotificationPolicyEmailIntegrationArgs']]]]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 filters: Optional[pulumi.Input[pulumi.InputType['NotificationPolicyFiltersArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 pagerduty_integrations: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NotificationPolicyPagerdutyIntegrationArgs']]]]] = None,
                 webhooks_integrations: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NotificationPolicyWebhooksIntegrationArgs']]]]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NotificationPolicyArgs.__new__(NotificationPolicyArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            if alert_type is None and not opts.urn:
                raise TypeError("Missing required property 'alert_type'")
            __props__.__dict__["alert_type"] = alert_type
            __props__.__dict__["description"] = description
            __props__.__dict__["email_integrations"] = email_integrations
            if enabled is None and not opts.urn:
                raise TypeError("Missing required property 'enabled'")
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["filters"] = filters
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            __props__.__dict__["pagerduty_integrations"] = pagerduty_integrations
            __props__.__dict__["webhooks_integrations"] = webhooks_integrations
            __props__.__dict__["created"] = None
            __props__.__dict__["modified"] = None
        super(NotificationPolicy, __self__).__init__(
            'cloudflare:index/notificationPolicy:NotificationPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            alert_type: Optional[pulumi.Input[str]] = None,
            created: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            email_integrations: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NotificationPolicyEmailIntegrationArgs']]]]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            filters: Optional[pulumi.Input[pulumi.InputType['NotificationPolicyFiltersArgs']]] = None,
            modified: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            pagerduty_integrations: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NotificationPolicyPagerdutyIntegrationArgs']]]]] = None,
            webhooks_integrations: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NotificationPolicyWebhooksIntegrationArgs']]]]] = None) -> 'NotificationPolicy':
        """
        Get an existing NotificationPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] alert_type: The event type that will trigger the dispatch of a notification. See the developer documentation for descriptions of
               [available alert types](https://developers.cloudflare.com/fundamentals/notifications/notification-available/) Available
               values: `billing_usage_alert`, `health_check_status_notification`, `g6_pool_toggle_alert`, `real_origin_monitoring`,
               `universal_ssl_event_type`, `bgp_hijack_notification`, `http_alert_origin_error`, `workers_alert`,
               `weekly_account_overview`
        :param pulumi.Input[str] created: When the notification policy was created.
        :param pulumi.Input[str] description: Description of the notification policy.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NotificationPolicyEmailIntegrationArgs']]]] email_integrations: The email id to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is
               required.
        :param pulumi.Input[bool] enabled: The status of the notification policy.
        :param pulumi.Input[pulumi.InputType['NotificationPolicyFiltersArgs']] filters: An optional nested block of filters that applies to the selected `alert_type`. A key-value map that specifies the type
               of filter and the values to match against (refer to the alert type block for available fields).
        :param pulumi.Input[str] modified: When the notification policy was last modified.
        :param pulumi.Input[str] name: The name of the notification policy.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NotificationPolicyPagerdutyIntegrationArgs']]]] pagerduty_integrations: The unique id of a configured pagerduty endpoint to which the notification should be dispatched. One of email, webhooks,
               or PagerDuty mechanisms is required.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NotificationPolicyWebhooksIntegrationArgs']]]] webhooks_integrations: The unique id of a configured webhooks endpoint to which the notification should be dispatched. One of email, webhooks,
               or PagerDuty mechanisms is required.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NotificationPolicyState.__new__(_NotificationPolicyState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["alert_type"] = alert_type
        __props__.__dict__["created"] = created
        __props__.__dict__["description"] = description
        __props__.__dict__["email_integrations"] = email_integrations
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["filters"] = filters
        __props__.__dict__["modified"] = modified
        __props__.__dict__["name"] = name
        __props__.__dict__["pagerduty_integrations"] = pagerduty_integrations
        __props__.__dict__["webhooks_integrations"] = webhooks_integrations
        return NotificationPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="alertType")
    def alert_type(self) -> pulumi.Output[str]:
        """
        The event type that will trigger the dispatch of a notification. See the developer documentation for descriptions of
        [available alert types](https://developers.cloudflare.com/fundamentals/notifications/notification-available/) Available
        values: `billing_usage_alert`, `health_check_status_notification`, `g6_pool_toggle_alert`, `real_origin_monitoring`,
        `universal_ssl_event_type`, `bgp_hijack_notification`, `http_alert_origin_error`, `workers_alert`,
        `weekly_account_overview`
        """
        return pulumi.get(self, "alert_type")

    @property
    @pulumi.getter
    def created(self) -> pulumi.Output[str]:
        """
        When the notification policy was created.
        """
        return pulumi.get(self, "created")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the notification policy.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="emailIntegrations")
    def email_integrations(self) -> pulumi.Output[Optional[Sequence['outputs.NotificationPolicyEmailIntegration']]]:
        """
        The email id to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is
        required.
        """
        return pulumi.get(self, "email_integrations")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[bool]:
        """
        The status of the notification policy.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def filters(self) -> pulumi.Output[Optional['outputs.NotificationPolicyFilters']]:
        """
        An optional nested block of filters that applies to the selected `alert_type`. A key-value map that specifies the type
        of filter and the values to match against (refer to the alert type block for available fields).
        """
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def modified(self) -> pulumi.Output[str]:
        """
        When the notification policy was last modified.
        """
        return pulumi.get(self, "modified")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the notification policy.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="pagerdutyIntegrations")
    def pagerduty_integrations(self) -> pulumi.Output[Optional[Sequence['outputs.NotificationPolicyPagerdutyIntegration']]]:
        """
        The unique id of a configured pagerduty endpoint to which the notification should be dispatched. One of email, webhooks,
        or PagerDuty mechanisms is required.
        """
        return pulumi.get(self, "pagerduty_integrations")

    @property
    @pulumi.getter(name="webhooksIntegrations")
    def webhooks_integrations(self) -> pulumi.Output[Optional[Sequence['outputs.NotificationPolicyWebhooksIntegration']]]:
        """
        The unique id of a configured webhooks endpoint to which the notification should be dispatched. One of email, webhooks,
        or PagerDuty mechanisms is required.
        """
        return pulumi.get(self, "webhooks_integrations")

