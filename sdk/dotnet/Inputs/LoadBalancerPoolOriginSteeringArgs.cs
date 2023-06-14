// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class LoadBalancerPoolOriginSteeringArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Origin steering policy to be used. Value `random` selects an origin randomly. Value `hash` selects an origin by computing a hash over the CF-Connecting-IP address. Value `least_outstanding_requests` selects an origin by taking into consideration origin weights, as well as each origin's number of outstanding requests. Origins with more pending requests are weighted proportionately less relative to others. Available values: `""`, `hash`, `random`, `least_outstanding_requests`. Defaults to `random`.
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        public LoadBalancerPoolOriginSteeringArgs()
        {
        }
        public static new LoadBalancerPoolOriginSteeringArgs Empty => new LoadBalancerPoolOriginSteeringArgs();
    }
}
