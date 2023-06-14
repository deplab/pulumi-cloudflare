// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class LoadBalancerRuleOverrideGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("adaptiveRoutings")]
        private InputList<Inputs.LoadBalancerRuleOverrideAdaptiveRoutingGetArgs>? _adaptiveRoutings;

        /// <summary>
        /// Controls features that modify the routing of requests to pools and origins in response to dynamic conditions, such as during the interval between active health monitoring requests.
        /// </summary>
        public InputList<Inputs.LoadBalancerRuleOverrideAdaptiveRoutingGetArgs> AdaptiveRoutings
        {
            get => _adaptiveRoutings ?? (_adaptiveRoutings = new InputList<Inputs.LoadBalancerRuleOverrideAdaptiveRoutingGetArgs>());
            set => _adaptiveRoutings = value;
        }

        [Input("countryPools")]
        private InputList<Inputs.LoadBalancerRuleOverrideCountryPoolGetArgs>? _countryPools;

        /// <summary>
        /// A set containing mappings of country codes to a list of pool IDs (ordered by their failover priority) for the given country.
        /// </summary>
        public InputList<Inputs.LoadBalancerRuleOverrideCountryPoolGetArgs> CountryPools
        {
            get => _countryPools ?? (_countryPools = new InputList<Inputs.LoadBalancerRuleOverrideCountryPoolGetArgs>());
            set => _countryPools = value;
        }

        [Input("defaultPools")]
        private InputList<string>? _defaultPools;
        public InputList<string> DefaultPools
        {
            get => _defaultPools ?? (_defaultPools = new InputList<string>());
            set => _defaultPools = value;
        }

        [Input("fallbackPool")]
        public Input<string>? FallbackPool { get; set; }

        [Input("locationStrategies")]
        private InputList<Inputs.LoadBalancerRuleOverrideLocationStrategyGetArgs>? _locationStrategies;

        /// <summary>
        /// Controls location-based steering for non-proxied requests.
        /// </summary>
        public InputList<Inputs.LoadBalancerRuleOverrideLocationStrategyGetArgs> LocationStrategies
        {
            get => _locationStrategies ?? (_locationStrategies = new InputList<Inputs.LoadBalancerRuleOverrideLocationStrategyGetArgs>());
            set => _locationStrategies = value;
        }

        [Input("popPools")]
        private InputList<Inputs.LoadBalancerRuleOverridePopPoolGetArgs>? _popPools;

        /// <summary>
        /// A set containing mappings of Cloudflare Point-of-Presence (PoP) identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). This feature is only available to enterprise customers.
        /// </summary>
        public InputList<Inputs.LoadBalancerRuleOverridePopPoolGetArgs> PopPools
        {
            get => _popPools ?? (_popPools = new InputList<Inputs.LoadBalancerRuleOverridePopPoolGetArgs>());
            set => _popPools = value;
        }

        [Input("randomSteerings")]
        private InputList<Inputs.LoadBalancerRuleOverrideRandomSteeringGetArgs>? _randomSteerings;

        /// <summary>
        /// Configures pool weights. When `steering_policy="random"`, a random pool is selected with probability proportional to pool weights. When `steering_policy="least_outstanding_requests"`, pool weights are used to scale each pool's outstanding requests.
        /// </summary>
        public InputList<Inputs.LoadBalancerRuleOverrideRandomSteeringGetArgs> RandomSteerings
        {
            get => _randomSteerings ?? (_randomSteerings = new InputList<Inputs.LoadBalancerRuleOverrideRandomSteeringGetArgs>());
            set => _randomSteerings = value;
        }

        [Input("regionPools")]
        private InputList<Inputs.LoadBalancerRuleOverrideRegionPoolGetArgs>? _regionPools;

        /// <summary>
        /// A set containing mappings of region codes to a list of pool IDs (ordered by their failover priority) for the given region.
        /// </summary>
        public InputList<Inputs.LoadBalancerRuleOverrideRegionPoolGetArgs> RegionPools
        {
            get => _regionPools ?? (_regionPools = new InputList<Inputs.LoadBalancerRuleOverrideRegionPoolGetArgs>());
            set => _regionPools = value;
        }

        /// <summary>
        /// Specifies the type of session affinity the load balancer should use unless specified as `none` or `""` (default). With value `cookie`, on the first request to a proxied load balancer, a cookie is generated, encoding information of which origin the request will be forwarded to. Subsequent requests, by the same client to the same load balancer, will be sent to the origin server the cookie encodes, for the duration of the cookie and as long as the origin server remains healthy. If the cookie has expired or the origin server is unhealthy then a new origin server is calculated and used. Value `ip_cookie` behaves the same as `cookie` except the initial origin selection is stable and based on the client's IP address. Available values: `""`, `none`, `cookie`, `ip_cookie`. Defaults to `none`.
        /// </summary>
        [Input("sessionAffinity")]
        public Input<string>? SessionAffinity { get; set; }

        [Input("sessionAffinityAttributes")]
        private InputList<Inputs.LoadBalancerRuleOverrideSessionAffinityAttributeGetArgs>? _sessionAffinityAttributes;

        /// <summary>
        /// Configure cookie attributes for session affinity cookie.
        /// </summary>
        public InputList<Inputs.LoadBalancerRuleOverrideSessionAffinityAttributeGetArgs> SessionAffinityAttributes
        {
            get => _sessionAffinityAttributes ?? (_sessionAffinityAttributes = new InputList<Inputs.LoadBalancerRuleOverrideSessionAffinityAttributeGetArgs>());
            set => _sessionAffinityAttributes = value;
        }

        /// <summary>
        /// Time, in seconds, until this load balancer's session affinity cookie expires after being created. This parameter is ignored unless a supported session affinity policy is set. The current default of `82800` (23 hours) will be used unless `session_affinity_ttl` is explicitly set. Once the expiry time has been reached, subsequent requests may get sent to a different origin server. Valid values are between `1800` and `604800`.
        /// </summary>
        [Input("sessionAffinityTtl")]
        public Input<int>? SessionAffinityTtl { get; set; }

        /// <summary>
        /// The method the load balancer uses to determine the route to your origin. Value `off` uses `default_pool_ids`. Value `geo` uses `pop_pools`/`country_pools`/`region_pools`. For non-proxied requests, the `country` for `country_pools` is determined by `location_strategy`. Value `random` selects a pool randomly. Value `dynamic_latency` uses round trip time to select the closest pool in `default_pool_ids` (requires pool health checks). Value `proximity` uses the pools' latitude and longitude to select the closest pool using the Cloudflare PoP location for proxied requests or the location determined by `location_strategy` for non-proxied requests. Value `least_outstanding_requests` selects a pool by taking into consideration `random_steering` weights, as well as each pool's number of outstanding requests. Pools with more pending requests are weighted proportionately less relative to others. Value `""` maps to `geo` if you use `pop_pools`/`country_pools`/`region_pools` otherwise `off`. Available values: `off`, `geo`, `dynamic_latency`, `random`, `proximity`, `least_outstanding_requests`, `""` Defaults to `""`.
        /// </summary>
        [Input("steeringPolicy")]
        public Input<string>? SteeringPolicy { get; set; }

        /// <summary>
        /// Time to live (TTL) of the DNS entry for the IP address returned by this load balancer. This cannot be set for proxied load balancers. Defaults to `30`. Conflicts with `proxied`.
        /// </summary>
        [Input("ttl")]
        public Input<int>? Ttl { get; set; }

        public LoadBalancerRuleOverrideGetArgs()
        {
        }
        public static new LoadBalancerRuleOverrideGetArgs Empty => new LoadBalancerRuleOverrideGetArgs();
    }
}
