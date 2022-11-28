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
    'GetOriginCaRootCertificateResult',
    'AwaitableGetOriginCaRootCertificateResult',
    'get_origin_ca_root_certificate',
    'get_origin_ca_root_certificate_output',
]

@pulumi.output_type
class GetOriginCaRootCertificateResult:
    """
    A collection of values returned by getOriginCaRootCertificate.
    """
    def __init__(__self__, algorithm=None, cert_pem=None, id=None):
        if algorithm and not isinstance(algorithm, str):
            raise TypeError("Expected argument 'algorithm' to be a str")
        pulumi.set(__self__, "algorithm", algorithm)
        if cert_pem and not isinstance(cert_pem, str):
            raise TypeError("Expected argument 'cert_pem' to be a str")
        pulumi.set(__self__, "cert_pem", cert_pem)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter
    def algorithm(self) -> str:
        return pulumi.get(self, "algorithm")

    @property
    @pulumi.getter(name="certPem")
    def cert_pem(self) -> str:
        """
        The Origin CA root certificate in PEM format.
        """
        return pulumi.get(self, "cert_pem")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")


class AwaitableGetOriginCaRootCertificateResult(GetOriginCaRootCertificateResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetOriginCaRootCertificateResult(
            algorithm=self.algorithm,
            cert_pem=self.cert_pem,
            id=self.id)


def get_origin_ca_root_certificate(algorithm: Optional[str] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetOriginCaRootCertificateResult:
    """
    Use this data source to get the [Origin CA root certificate](https://developers.cloudflare.com/ssl/origin-configuration/origin-ca#4-required-for-some-add-cloudflare-origin-ca-root-certificates) for a given algorithm.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    origin_ca = cloudflare.get_origin_ca_root_certificate(algorithm="<algorithm>")
    ```


    :param str algorithm: The name of the algorithm used when creating an Origin CA certificate. Currently-supported values are "rsa" and "ecc" (case-insensitive).
    """
    __args__ = dict()
    __args__['algorithm'] = algorithm
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getOriginCaRootCertificate:getOriginCaRootCertificate', __args__, opts=opts, typ=GetOriginCaRootCertificateResult).value

    return AwaitableGetOriginCaRootCertificateResult(
        algorithm=__ret__.algorithm,
        cert_pem=__ret__.cert_pem,
        id=__ret__.id)


@_utilities.lift_output_func(get_origin_ca_root_certificate)
def get_origin_ca_root_certificate_output(algorithm: Optional[pulumi.Input[str]] = None,
                                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetOriginCaRootCertificateResult]:
    """
    Use this data source to get the [Origin CA root certificate](https://developers.cloudflare.com/ssl/origin-configuration/origin-ca#4-required-for-some-add-cloudflare-origin-ca-root-certificates) for a given algorithm.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    origin_ca = cloudflare.get_origin_ca_root_certificate(algorithm="<algorithm>")
    ```


    :param str algorithm: The name of the algorithm used when creating an Origin CA certificate. Currently-supported values are "rsa" and "ecc" (case-insensitive).
    """
    ...
