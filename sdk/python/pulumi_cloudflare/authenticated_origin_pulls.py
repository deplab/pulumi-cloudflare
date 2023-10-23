# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['AuthenticatedOriginPullsArgs', 'AuthenticatedOriginPulls']

@pulumi.input_type
class AuthenticatedOriginPullsArgs:
    def __init__(__self__, *,
                 enabled: pulumi.Input[bool],
                 zone_id: pulumi.Input[str],
                 authenticated_origin_pulls_certificate: Optional[pulumi.Input[str]] = None,
                 hostname: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AuthenticatedOriginPulls resource.
        :param pulumi.Input[bool] enabled: Whether to enable Authenticated Origin Pulls on the given zone or hostname.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] authenticated_origin_pulls_certificate: The ID of an uploaded Authenticated Origin Pulls certificate. If no hostname is provided, this certificate will be used zone wide as Per-Zone Authenticated Origin Pulls.
        :param pulumi.Input[str] hostname: Specify a hostname to enable Per-Hostname Authenticated Origin Pulls on, using the provided certificate.
        """
        AuthenticatedOriginPullsArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            enabled=enabled,
            zone_id=zone_id,
            authenticated_origin_pulls_certificate=authenticated_origin_pulls_certificate,
            hostname=hostname,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             enabled: Optional[pulumi.Input[bool]] = None,
             zone_id: Optional[pulumi.Input[str]] = None,
             authenticated_origin_pulls_certificate: Optional[pulumi.Input[str]] = None,
             hostname: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if enabled is None:
            raise TypeError("Missing 'enabled' argument")
        if zone_id is None and 'zoneId' in kwargs:
            zone_id = kwargs['zoneId']
        if zone_id is None:
            raise TypeError("Missing 'zone_id' argument")
        if authenticated_origin_pulls_certificate is None and 'authenticatedOriginPullsCertificate' in kwargs:
            authenticated_origin_pulls_certificate = kwargs['authenticatedOriginPullsCertificate']

        _setter("enabled", enabled)
        _setter("zone_id", zone_id)
        if authenticated_origin_pulls_certificate is not None:
            _setter("authenticated_origin_pulls_certificate", authenticated_origin_pulls_certificate)
        if hostname is not None:
            _setter("hostname", hostname)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Input[bool]:
        """
        Whether to enable Authenticated Origin Pulls on the given zone or hostname.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: pulumi.Input[bool]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Input[str]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "zone_id", value)

    @property
    @pulumi.getter(name="authenticatedOriginPullsCertificate")
    def authenticated_origin_pulls_certificate(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of an uploaded Authenticated Origin Pulls certificate. If no hostname is provided, this certificate will be used zone wide as Per-Zone Authenticated Origin Pulls.
        """
        return pulumi.get(self, "authenticated_origin_pulls_certificate")

    @authenticated_origin_pulls_certificate.setter
    def authenticated_origin_pulls_certificate(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "authenticated_origin_pulls_certificate", value)

    @property
    @pulumi.getter
    def hostname(self) -> Optional[pulumi.Input[str]]:
        """
        Specify a hostname to enable Per-Hostname Authenticated Origin Pulls on, using the provided certificate.
        """
        return pulumi.get(self, "hostname")

    @hostname.setter
    def hostname(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "hostname", value)


@pulumi.input_type
class _AuthenticatedOriginPullsState:
    def __init__(__self__, *,
                 authenticated_origin_pulls_certificate: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 hostname: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AuthenticatedOriginPulls resources.
        :param pulumi.Input[str] authenticated_origin_pulls_certificate: The ID of an uploaded Authenticated Origin Pulls certificate. If no hostname is provided, this certificate will be used zone wide as Per-Zone Authenticated Origin Pulls.
        :param pulumi.Input[bool] enabled: Whether to enable Authenticated Origin Pulls on the given zone or hostname.
        :param pulumi.Input[str] hostname: Specify a hostname to enable Per-Hostname Authenticated Origin Pulls on, using the provided certificate.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        _AuthenticatedOriginPullsState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            authenticated_origin_pulls_certificate=authenticated_origin_pulls_certificate,
            enabled=enabled,
            hostname=hostname,
            zone_id=zone_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             authenticated_origin_pulls_certificate: Optional[pulumi.Input[str]] = None,
             enabled: Optional[pulumi.Input[bool]] = None,
             hostname: Optional[pulumi.Input[str]] = None,
             zone_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if authenticated_origin_pulls_certificate is None and 'authenticatedOriginPullsCertificate' in kwargs:
            authenticated_origin_pulls_certificate = kwargs['authenticatedOriginPullsCertificate']
        if zone_id is None and 'zoneId' in kwargs:
            zone_id = kwargs['zoneId']

        if authenticated_origin_pulls_certificate is not None:
            _setter("authenticated_origin_pulls_certificate", authenticated_origin_pulls_certificate)
        if enabled is not None:
            _setter("enabled", enabled)
        if hostname is not None:
            _setter("hostname", hostname)
        if zone_id is not None:
            _setter("zone_id", zone_id)

    @property
    @pulumi.getter(name="authenticatedOriginPullsCertificate")
    def authenticated_origin_pulls_certificate(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of an uploaded Authenticated Origin Pulls certificate. If no hostname is provided, this certificate will be used zone wide as Per-Zone Authenticated Origin Pulls.
        """
        return pulumi.get(self, "authenticated_origin_pulls_certificate")

    @authenticated_origin_pulls_certificate.setter
    def authenticated_origin_pulls_certificate(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "authenticated_origin_pulls_certificate", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to enable Authenticated Origin Pulls on the given zone or hostname.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def hostname(self) -> Optional[pulumi.Input[str]]:
        """
        Specify a hostname to enable Per-Hostname Authenticated Origin Pulls on, using the provided certificate.
        """
        return pulumi.get(self, "hostname")

    @hostname.setter
    def hostname(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "hostname", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class AuthenticatedOriginPulls(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 authenticated_origin_pulls_certificate: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 hostname: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloudflare Authenticated Origin Pulls resource. A `AuthenticatedOriginPulls`
        resource is required to use Per-Zone or Per-Hostname Authenticated
        Origin Pulls.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        # Authenticated Origin Pulls
        my_aop = cloudflare.AuthenticatedOriginPulls("myAop",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711",
            enabled=True)
        # Per-Zone Authenticated Origin Pulls
        my_per_zone_aop_cert = cloudflare.AuthenticatedOriginPullsCertificate("myPerZoneAopCert",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711",
            certificate="-----INSERT CERTIFICATE-----",
            private_key="-----INSERT PRIVATE KEY-----",
            type="per-zone")
        my_per_zone_aop = cloudflare.AuthenticatedOriginPulls("myPerZoneAop",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711",
            authenticated_origin_pulls_certificate=my_per_zone_aop_cert.id,
            enabled=True)
        # Per-Hostname Authenticated Origin Pulls
        my_per_hostname_aop_cert = cloudflare.AuthenticatedOriginPullsCertificate("myPerHostnameAopCert",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711",
            certificate="-----INSERT CERTIFICATE-----",
            private_key="-----INSERT PRIVATE KEY-----",
            type="per-hostname")
        my_per_hostname_aop = cloudflare.AuthenticatedOriginPulls("myPerHostnameAop",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711",
            authenticated_origin_pulls_certificate=my_per_hostname_aop_cert.id,
            hostname="aop.example.com",
            enabled=True)
        ```

        ## Import

        global

        ```sh
         $ pulumi import cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls example <zone_id>
        ```

         per zone

        ```sh
         $ pulumi import cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls example <zone_id>/<certificate_id>
        ```

         per hostname

        ```sh
         $ pulumi import cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls example <zone_id>/<certificate_id>/<hostname>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] authenticated_origin_pulls_certificate: The ID of an uploaded Authenticated Origin Pulls certificate. If no hostname is provided, this certificate will be used zone wide as Per-Zone Authenticated Origin Pulls.
        :param pulumi.Input[bool] enabled: Whether to enable Authenticated Origin Pulls on the given zone or hostname.
        :param pulumi.Input[str] hostname: Specify a hostname to enable Per-Hostname Authenticated Origin Pulls on, using the provided certificate.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AuthenticatedOriginPullsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloudflare Authenticated Origin Pulls resource. A `AuthenticatedOriginPulls`
        resource is required to use Per-Zone or Per-Hostname Authenticated
        Origin Pulls.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        # Authenticated Origin Pulls
        my_aop = cloudflare.AuthenticatedOriginPulls("myAop",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711",
            enabled=True)
        # Per-Zone Authenticated Origin Pulls
        my_per_zone_aop_cert = cloudflare.AuthenticatedOriginPullsCertificate("myPerZoneAopCert",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711",
            certificate="-----INSERT CERTIFICATE-----",
            private_key="-----INSERT PRIVATE KEY-----",
            type="per-zone")
        my_per_zone_aop = cloudflare.AuthenticatedOriginPulls("myPerZoneAop",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711",
            authenticated_origin_pulls_certificate=my_per_zone_aop_cert.id,
            enabled=True)
        # Per-Hostname Authenticated Origin Pulls
        my_per_hostname_aop_cert = cloudflare.AuthenticatedOriginPullsCertificate("myPerHostnameAopCert",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711",
            certificate="-----INSERT CERTIFICATE-----",
            private_key="-----INSERT PRIVATE KEY-----",
            type="per-hostname")
        my_per_hostname_aop = cloudflare.AuthenticatedOriginPulls("myPerHostnameAop",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711",
            authenticated_origin_pulls_certificate=my_per_hostname_aop_cert.id,
            hostname="aop.example.com",
            enabled=True)
        ```

        ## Import

        global

        ```sh
         $ pulumi import cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls example <zone_id>
        ```

         per zone

        ```sh
         $ pulumi import cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls example <zone_id>/<certificate_id>
        ```

         per hostname

        ```sh
         $ pulumi import cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls example <zone_id>/<certificate_id>/<hostname>
        ```

        :param str resource_name: The name of the resource.
        :param AuthenticatedOriginPullsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AuthenticatedOriginPullsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            AuthenticatedOriginPullsArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 authenticated_origin_pulls_certificate: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 hostname: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AuthenticatedOriginPullsArgs.__new__(AuthenticatedOriginPullsArgs)

            __props__.__dict__["authenticated_origin_pulls_certificate"] = authenticated_origin_pulls_certificate
            if enabled is None and not opts.urn:
                raise TypeError("Missing required property 'enabled'")
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["hostname"] = hostname
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
        super(AuthenticatedOriginPulls, __self__).__init__(
            'cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            authenticated_origin_pulls_certificate: Optional[pulumi.Input[str]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            hostname: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'AuthenticatedOriginPulls':
        """
        Get an existing AuthenticatedOriginPulls resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] authenticated_origin_pulls_certificate: The ID of an uploaded Authenticated Origin Pulls certificate. If no hostname is provided, this certificate will be used zone wide as Per-Zone Authenticated Origin Pulls.
        :param pulumi.Input[bool] enabled: Whether to enable Authenticated Origin Pulls on the given zone or hostname.
        :param pulumi.Input[str] hostname: Specify a hostname to enable Per-Hostname Authenticated Origin Pulls on, using the provided certificate.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AuthenticatedOriginPullsState.__new__(_AuthenticatedOriginPullsState)

        __props__.__dict__["authenticated_origin_pulls_certificate"] = authenticated_origin_pulls_certificate
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["hostname"] = hostname
        __props__.__dict__["zone_id"] = zone_id
        return AuthenticatedOriginPulls(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="authenticatedOriginPullsCertificate")
    def authenticated_origin_pulls_certificate(self) -> pulumi.Output[Optional[str]]:
        """
        The ID of an uploaded Authenticated Origin Pulls certificate. If no hostname is provided, this certificate will be used zone wide as Per-Zone Authenticated Origin Pulls.
        """
        return pulumi.get(self, "authenticated_origin_pulls_certificate")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[bool]:
        """
        Whether to enable Authenticated Origin Pulls on the given zone or hostname.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def hostname(self) -> pulumi.Output[Optional[str]]:
        """
        Specify a hostname to enable Per-Hostname Authenticated Origin Pulls on, using the provided certificate.
        """
        return pulumi.get(self, "hostname")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

