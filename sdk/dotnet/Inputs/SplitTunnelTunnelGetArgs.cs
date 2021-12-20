// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class SplitTunnelTunnelGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The address in CIDR format to include in the tunnel configuration. Conflicts with `"host"`.
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// The description of the tunnel.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The domain name to include in the tunnel configuration. Conflicts with `"address"`.
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

        public SplitTunnelTunnelGetArgs()
        {
        }
    }
}