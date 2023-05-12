# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetZoneResult',
    'AwaitableGetZoneResult',
    'get_zone',
    'get_zone_output',
]

@pulumi.output_type
class GetZoneResult:
    """
    A collection of values returned by getZone.
    """
    def __init__(__self__, account_id=None, id=None, name=None, name_servers=None, paused=None, plan=None, status=None, vanity_name_servers=None, zone_id=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if name_servers and not isinstance(name_servers, list):
            raise TypeError("Expected argument 'name_servers' to be a list")
        pulumi.set(__self__, "name_servers", name_servers)
        if paused and not isinstance(paused, bool):
            raise TypeError("Expected argument 'paused' to be a bool")
        pulumi.set(__self__, "paused", paused)
        if plan and not isinstance(plan, str):
            raise TypeError("Expected argument 'plan' to be a str")
        pulumi.set(__self__, "plan", plan)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if vanity_name_servers and not isinstance(vanity_name_servers, list):
            raise TypeError("Expected argument 'vanity_name_servers' to be a list")
        pulumi.set(__self__, "vanity_name_servers", vanity_name_servers)
        if zone_id and not isinstance(zone_id, str):
            raise TypeError("Expected argument 'zone_id' to be a str")
        pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> str:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the zone. Must provide only one of `zone_id`, `name`.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nameServers")
    def name_servers(self) -> Sequence[str]:
        """
        Cloudflare assigned name servers. This is only populated for zones that use Cloudflare DNS.
        """
        return pulumi.get(self, "name_servers")

    @property
    @pulumi.getter
    def paused(self) -> bool:
        """
        Whether the zone is paused on Cloudflare.
        """
        return pulumi.get(self, "paused")

    @property
    @pulumi.getter
    def plan(self) -> str:
        """
        The name of the plan associated with the zone.
        """
        return pulumi.get(self, "plan")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        Status of the zone.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="vanityNameServers")
    def vanity_name_servers(self) -> Sequence[str]:
        """
        List of Vanity Nameservers (if set).
        """
        return pulumi.get(self, "vanity_name_servers")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> str:
        """
        The zone identifier to target for the resource. Must provide only one of `zone_id`, `name`.
        """
        return pulumi.get(self, "zone_id")


class AwaitableGetZoneResult(GetZoneResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetZoneResult(
            account_id=self.account_id,
            id=self.id,
            name=self.name,
            name_servers=self.name_servers,
            paused=self.paused,
            plan=self.plan,
            status=self.status,
            vanity_name_servers=self.vanity_name_servers,
            zone_id=self.zone_id)


def get_zone(account_id: Optional[str] = None,
             name: Optional[str] = None,
             zone_id: Optional[str] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetZoneResult:
    """
    Use this data source to look up [zone](https://api.cloudflare.com/#zone-properties)
    info. This is the singular alternative to `get_zones`.

    > **Note** Cloudflare zone names **are not unique**. It is possible for multiple
    accounts to have the same zone created but in different states. If you are
    using this setup, it is advised to use the `account_id` attribute on this
    resource or swap to `get_zones` to further filter the results.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_zone = cloudflare.get_zone(name="example.com")
    example_record = cloudflare.Record("exampleRecord",
        zone_id=example_zone.id,
        name="www",
        value="203.0.113.1",
        type="A",
        proxied=True)
    ```


    :param str account_id: The account identifier to target for the resource.
    :param str name: The name of the zone. Must provide only one of `zone_id`, `name`.
    :param str zone_id: The zone identifier to target for the resource. Must provide only one of `zone_id`, `name`.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['name'] = name
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getZone:getZone', __args__, opts=opts, typ=GetZoneResult).value

    return AwaitableGetZoneResult(
        account_id=__ret__.account_id,
        id=__ret__.id,
        name=__ret__.name,
        name_servers=__ret__.name_servers,
        paused=__ret__.paused,
        plan=__ret__.plan,
        status=__ret__.status,
        vanity_name_servers=__ret__.vanity_name_servers,
        zone_id=__ret__.zone_id)


@_utilities.lift_output_func(get_zone)
def get_zone_output(account_id: Optional[pulumi.Input[Optional[str]]] = None,
                    name: Optional[pulumi.Input[Optional[str]]] = None,
                    zone_id: Optional[pulumi.Input[Optional[str]]] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetZoneResult]:
    """
    Use this data source to look up [zone](https://api.cloudflare.com/#zone-properties)
    info. This is the singular alternative to `get_zones`.

    > **Note** Cloudflare zone names **are not unique**. It is possible for multiple
    accounts to have the same zone created but in different states. If you are
    using this setup, it is advised to use the `account_id` attribute on this
    resource or swap to `get_zones` to further filter the results.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_zone = cloudflare.get_zone(name="example.com")
    example_record = cloudflare.Record("exampleRecord",
        zone_id=example_zone.id,
        name="www",
        value="203.0.113.1",
        type="A",
        proxied=True)
    ```


    :param str account_id: The account identifier to target for the resource.
    :param str name: The name of the zone. Must provide only one of `zone_id`, `name`.
    :param str zone_id: The zone identifier to target for the resource. Must provide only one of `zone_id`, `name`.
    """
    ...
