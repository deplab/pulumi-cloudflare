// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class LoadBalancerRuleOverrideLocationStrategyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Determines the authoritative location when ECS is not preferred, does not exist in the request, or its GeoIP lookup is unsuccessful. Value `pop` will use the Cloudflare PoP location. Value `resolver_ip` will use the DNS resolver GeoIP location. If the GeoIP lookup is unsuccessful, it will use the Cloudflare PoP location. Available values: `pop`, `resolver_ip`. Defaults to `pop`.
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// Whether the EDNS Client Subnet (ECS) GeoIP should be preferred as the authoritative location. Value `always` will always prefer ECS, `never` will never prefer ECS, `proximity` will prefer ECS only when `steering_policy="proximity"`, and `geo` will prefer ECS only when `steering_policy="geo"`. Available values: `always`, `never`, `proximity`, `geo`. Defaults to `proximity`.
        /// </summary>
        [Input("preferEcs")]
        public Input<string>? PreferEcs { get; set; }

        public LoadBalancerRuleOverrideLocationStrategyArgs()
        {
        }
        public static new LoadBalancerRuleOverrideLocationStrategyArgs Empty => new LoadBalancerRuleOverrideLocationStrategyArgs();
    }
}
