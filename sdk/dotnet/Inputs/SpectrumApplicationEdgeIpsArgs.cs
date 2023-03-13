// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class SpectrumApplicationEdgeIpsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IP versions supported for inbound connections on Spectrum anycast IPs. Required when `type` is not `static`. Available values: `all`, `ipv4`, `ipv6`.
        /// </summary>
        [Input("connectivity")]
        public Input<string>? Connectivity { get; set; }

        [Input("ips")]
        private InputList<string>? _ips;

        /// <summary>
        /// The collection of customer owned IPs to broadcast via anycast for this hostname and application. Requires [Bring Your Own IP](https://developers.cloudflare.com/spectrum/getting-started/byoip/) provisioned.
        /// </summary>
        public InputList<string> Ips
        {
            get => _ips ?? (_ips = new InputList<string>());
            set => _ips = value;
        }

        /// <summary>
        /// The type of edge IP configuration specified. Available values: `dynamic`, `static`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public SpectrumApplicationEdgeIpsArgs()
        {
        }
        public static new SpectrumApplicationEdgeIpsArgs Empty => new SpectrumApplicationEdgeIpsArgs();
    }
}
