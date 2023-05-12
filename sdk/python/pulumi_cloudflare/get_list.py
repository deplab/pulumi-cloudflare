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
    'GetListResult',
    'AwaitableGetListResult',
    'get_list',
    'get_list_output',
]

@pulumi.output_type
class GetListResult:
    """
    A collection of values returned by getList.
    """
    def __init__(__self__, account_id=None, description=None, id=None, kind=None, name=None, numitems=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if kind and not isinstance(kind, str):
            raise TypeError("Expected argument 'kind' to be a str")
        pulumi.set(__self__, "kind", kind)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if numitems and not isinstance(numitems, int):
            raise TypeError("Expected argument 'numitems' to be a int")
        pulumi.set(__self__, "numitems", numitems)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> str:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        List description.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def kind(self) -> str:
        """
        List kind.
        """
        return pulumi.get(self, "kind")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The list name to target for the resource.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def numitems(self) -> int:
        """
        Number of items in list.
        """
        return pulumi.get(self, "numitems")


class AwaitableGetListResult(GetListResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetListResult(
            account_id=self.account_id,
            description=self.description,
            id=self.id,
            kind=self.kind,
            name=self.name,
            numitems=self.numitems)


def get_list(account_id: Optional[str] = None,
             name: Optional[str] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetListResult:
    """
    Use this data source to lookup a [List](https://developers.cloudflare.com/api/operations/lists-get-lists).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example = cloudflare.get_list(account_id="f037e56e89293a057740de681ac9abbe",
        name="list_name")
    ```


    :param str account_id: The account identifier to target for the resource.
    :param str name: The list name to target for the resource.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getList:getList', __args__, opts=opts, typ=GetListResult).value

    return AwaitableGetListResult(
        account_id=__ret__.account_id,
        description=__ret__.description,
        id=__ret__.id,
        kind=__ret__.kind,
        name=__ret__.name,
        numitems=__ret__.numitems)


@_utilities.lift_output_func(get_list)
def get_list_output(account_id: Optional[pulumi.Input[str]] = None,
                    name: Optional[pulumi.Input[str]] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetListResult]:
    """
    Use this data source to lookup a [List](https://developers.cloudflare.com/api/operations/lists-get-lists).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example = cloudflare.get_list(account_id="f037e56e89293a057740de681ac9abbe",
        name="list_name")
    ```


    :param str account_id: The account identifier to target for the resource.
    :param str name: The list name to target for the resource.
    """
    ...
