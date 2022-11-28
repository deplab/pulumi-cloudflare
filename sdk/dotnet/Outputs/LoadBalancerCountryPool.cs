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
    public sealed class LoadBalancerCountryPool
    {
        /// <summary>
        /// A country code which can be determined with the Load Balancing Regions API described [here](https://developers.cloudflare.com/load-balancing/reference/region-mapping-api/). Multiple entries should not be specified with the same country.
        /// </summary>
        public readonly string Country;
        /// <summary>
        /// A list of pool IDs in failover priority to use in the given country.
        /// </summary>
        public readonly ImmutableArray<string> PoolIds;

        [OutputConstructor]
        private LoadBalancerCountryPool(
            string country,

            ImmutableArray<string> poolIds)
        {
            Country = country;
            PoolIds = poolIds;
        }
    }
}
