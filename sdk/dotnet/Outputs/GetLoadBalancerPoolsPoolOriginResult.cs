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
    public sealed class GetLoadBalancerPoolsPoolOriginResult
    {
        public readonly string Address;
        public readonly bool? Enabled;
        public readonly ImmutableArray<Outputs.GetLoadBalancerPoolsPoolOriginHeaderResult> Headers;
        public readonly string Name;
        public readonly double? Weight;

        [OutputConstructor]
        private GetLoadBalancerPoolsPoolOriginResult(
            string address,

            bool? enabled,

            ImmutableArray<Outputs.GetLoadBalancerPoolsPoolOriginHeaderResult> headers,

            string name,

            double? weight)
        {
            Address = address;
            Enabled = enabled;
            Headers = headers;
            Name = name;
            Weight = weight;
        }
    }
}