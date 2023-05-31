// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class TunnelConfigConfigOriginRequest
    {
        public readonly Outputs.TunnelConfigConfigOriginRequestAccess? Access;
        public readonly bool? BastionMode;
        public readonly string? CaPool;
        public readonly string? ConnectTimeout;
        public readonly bool? DisableChunkedEncoding;
        public readonly bool? Http2Origin;
        public readonly string? HttpHostHeader;
        public readonly ImmutableArray<Outputs.TunnelConfigConfigOriginRequestIpRule> IpRules;
        public readonly int? KeepAliveConnections;
        public readonly string? KeepAliveTimeout;
        public readonly bool? NoHappyEyeballs;
        public readonly bool? NoTlsVerify;
        public readonly string? OriginServerName;
        public readonly string? ProxyAddress;
        public readonly int? ProxyPort;
        public readonly string? ProxyType;
        public readonly string? TcpKeepAlive;
        public readonly string? TlsTimeout;

        [OutputConstructor]
        private TunnelConfigConfigOriginRequest(
            Outputs.TunnelConfigConfigOriginRequestAccess? access,

            bool? bastionMode,

            string? caPool,

            string? connectTimeout,

            bool? disableChunkedEncoding,

            bool? http2Origin,

            string? httpHostHeader,

            ImmutableArray<Outputs.TunnelConfigConfigOriginRequestIpRule> ipRules,

            int? keepAliveConnections,

            string? keepAliveTimeout,

            bool? noHappyEyeballs,

            bool? noTlsVerify,

            string? originServerName,

            string? proxyAddress,

            int? proxyPort,

            string? proxyType,

            string? tcpKeepAlive,

            string? tlsTimeout)
        {
            Access = access;
            BastionMode = bastionMode;
            CaPool = caPool;
            ConnectTimeout = connectTimeout;
            DisableChunkedEncoding = disableChunkedEncoding;
            Http2Origin = http2Origin;
            HttpHostHeader = httpHostHeader;
            IpRules = ipRules;
            KeepAliveConnections = keepAliveConnections;
            KeepAliveTimeout = keepAliveTimeout;
            NoHappyEyeballs = noHappyEyeballs;
            NoTlsVerify = noTlsVerify;
            OriginServerName = originServerName;
            ProxyAddress = proxyAddress;
            ProxyPort = proxyPort;
            ProxyType = proxyType;
            TcpKeepAlive = tcpKeepAlive;
            TlsTimeout = tlsTimeout;
        }
    }
}
