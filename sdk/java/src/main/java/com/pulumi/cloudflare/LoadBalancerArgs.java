// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.LoadBalancerAdaptiveRoutingArgs;
import com.pulumi.cloudflare.inputs.LoadBalancerCountryPoolArgs;
import com.pulumi.cloudflare.inputs.LoadBalancerLocationStrategyArgs;
import com.pulumi.cloudflare.inputs.LoadBalancerPopPoolArgs;
import com.pulumi.cloudflare.inputs.LoadBalancerRandomSteeringArgs;
import com.pulumi.cloudflare.inputs.LoadBalancerRegionPoolArgs;
import com.pulumi.cloudflare.inputs.LoadBalancerRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerArgs Empty = new LoadBalancerArgs();

    /**
     * Controls features that modify the routing of requests to pools and origins in response to dynamic conditions, such as during the interval between active health monitoring requests.
     * 
     */
    @Import(name="adaptiveRoutings")
    private @Nullable Output<List<LoadBalancerAdaptiveRoutingArgs>> adaptiveRoutings;

    /**
     * @return Controls features that modify the routing of requests to pools and origins in response to dynamic conditions, such as during the interval between active health monitoring requests.
     * 
     */
    public Optional<Output<List<LoadBalancerAdaptiveRoutingArgs>>> adaptiveRoutings() {
        return Optional.ofNullable(this.adaptiveRoutings);
    }

    /**
     * A set containing mappings of country codes to a list of pool IDs (ordered by their failover priority) for the given country.
     * 
     */
    @Import(name="countryPools")
    private @Nullable Output<List<LoadBalancerCountryPoolArgs>> countryPools;

    /**
     * @return A set containing mappings of country codes to a list of pool IDs (ordered by their failover priority) for the given country.
     * 
     */
    public Optional<Output<List<LoadBalancerCountryPoolArgs>>> countryPools() {
        return Optional.ofNullable(this.countryPools);
    }

    /**
     * A list of pool IDs ordered by their failover priority. Used whenever `pop_pools`/`country_pools`/`region_pools` are not defined.
     * 
     */
    @Import(name="defaultPoolIds", required=true)
    private Output<List<String>> defaultPoolIds;

    /**
     * @return A list of pool IDs ordered by their failover priority. Used whenever `pop_pools`/`country_pools`/`region_pools` are not defined.
     * 
     */
    public Output<List<String>> defaultPoolIds() {
        return this.defaultPoolIds;
    }

    /**
     * Free text description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Free text description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Enable or disable the load balancer. Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enable or disable the load balancer. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The pool ID to use when all other pools are detected as unhealthy.
     * 
     */
    @Import(name="fallbackPoolId", required=true)
    private Output<String> fallbackPoolId;

    /**
     * @return The pool ID to use when all other pools are detected as unhealthy.
     * 
     */
    public Output<String> fallbackPoolId() {
        return this.fallbackPoolId;
    }

    /**
     * Controls location-based steering for non-proxied requests.
     * 
     */
    @Import(name="locationStrategies")
    private @Nullable Output<List<LoadBalancerLocationStrategyArgs>> locationStrategies;

    /**
     * @return Controls location-based steering for non-proxied requests.
     * 
     */
    public Optional<Output<List<LoadBalancerLocationStrategyArgs>>> locationStrategies() {
        return Optional.ofNullable(this.locationStrategies);
    }

    /**
     * The DNS hostname to associate with your load balancer. If this hostname already exists as a DNS record in Cloudflare&#39;s DNS, the load balancer will take precedence and the DNS record will not be used.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The DNS hostname to associate with your load balancer. If this hostname already exists as a DNS record in Cloudflare&#39;s DNS, the load balancer will take precedence and the DNS record will not be used.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * A set containing mappings of Cloudflare Point-of-Presence (PoP) identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). This feature is only available to enterprise customers.
     * 
     */
    @Import(name="popPools")
    private @Nullable Output<List<LoadBalancerPopPoolArgs>> popPools;

    /**
     * @return A set containing mappings of Cloudflare Point-of-Presence (PoP) identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). This feature is only available to enterprise customers.
     * 
     */
    public Optional<Output<List<LoadBalancerPopPoolArgs>>> popPools() {
        return Optional.ofNullable(this.popPools);
    }

    /**
     * Whether the hostname gets Cloudflare&#39;s origin protection. Defaults to `false`. Conflicts with `ttl`.
     * 
     */
    @Import(name="proxied")
    private @Nullable Output<Boolean> proxied;

    /**
     * @return Whether the hostname gets Cloudflare&#39;s origin protection. Defaults to `false`. Conflicts with `ttl`.
     * 
     */
    public Optional<Output<Boolean>> proxied() {
        return Optional.ofNullable(this.proxied);
    }

    /**
     * Configures pool weights for random steering. When the `steering_policy=&#34;random&#34;`, a random pool is selected with probability proportional to these pool weights.
     * 
     */
    @Import(name="randomSteerings")
    private @Nullable Output<List<LoadBalancerRandomSteeringArgs>> randomSteerings;

    /**
     * @return Configures pool weights for random steering. When the `steering_policy=&#34;random&#34;`, a random pool is selected with probability proportional to these pool weights.
     * 
     */
    public Optional<Output<List<LoadBalancerRandomSteeringArgs>>> randomSteerings() {
        return Optional.ofNullable(this.randomSteerings);
    }

    /**
     * A set containing mappings of region codes to a list of pool IDs (ordered by their failover priority) for the given region.
     * 
     */
    @Import(name="regionPools")
    private @Nullable Output<List<LoadBalancerRegionPoolArgs>> regionPools;

    /**
     * @return A set containing mappings of region codes to a list of pool IDs (ordered by their failover priority) for the given region.
     * 
     */
    public Optional<Output<List<LoadBalancerRegionPoolArgs>>> regionPools() {
        return Optional.ofNullable(this.regionPools);
    }

    /**
     * A list of rules for this load balancer to execute.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<LoadBalancerRuleArgs>> rules;

    /**
     * @return A list of rules for this load balancer to execute.
     * 
     */
    public Optional<Output<List<LoadBalancerRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    /**
     * Specifies the type of session affinity the load balancer should use unless specified as `none` or `&#34;&#34;` (default). With value `cookie`, on the first request to a proxied load balancer, a cookie is generated, encoding information of which origin the request will be forwarded to. Subsequent requests, by the same client to the same load balancer, will be sent to the origin server the cookie encodes, for the duration of the cookie and as long as the origin server remains healthy. If the cookie has expired or the origin server is unhealthy then a new origin server is calculated and used. Value `ip_cookie` behaves the same as `cookie` except the initial origin selection is stable and based on the client&#39;s IP address. Available values: `&#34;&#34;`, `none`, `cookie`, `ip_cookie`. Defaults to `none`.
     * 
     */
    @Import(name="sessionAffinity")
    private @Nullable Output<String> sessionAffinity;

    /**
     * @return Specifies the type of session affinity the load balancer should use unless specified as `none` or `&#34;&#34;` (default). With value `cookie`, on the first request to a proxied load balancer, a cookie is generated, encoding information of which origin the request will be forwarded to. Subsequent requests, by the same client to the same load balancer, will be sent to the origin server the cookie encodes, for the duration of the cookie and as long as the origin server remains healthy. If the cookie has expired or the origin server is unhealthy then a new origin server is calculated and used. Value `ip_cookie` behaves the same as `cookie` except the initial origin selection is stable and based on the client&#39;s IP address. Available values: `&#34;&#34;`, `none`, `cookie`, `ip_cookie`. Defaults to `none`.
     * 
     */
    public Optional<Output<String>> sessionAffinity() {
        return Optional.ofNullable(this.sessionAffinity);
    }

    /**
     * See `session_affinity_attributes`.
     * 
     */
    @Import(name="sessionAffinityAttributes")
    private @Nullable Output<Map<String,String>> sessionAffinityAttributes;

    /**
     * @return See `session_affinity_attributes`.
     * 
     */
    public Optional<Output<Map<String,String>>> sessionAffinityAttributes() {
        return Optional.ofNullable(this.sessionAffinityAttributes);
    }

    /**
     * Time, in seconds, until this load balancer&#39;s session affinity cookie expires after being created. This parameter is ignored unless a supported session affinity policy is set. The current default of `82800` (23 hours) will be used unless `session_affinity_ttl` is explicitly set. Once the expiry time has been reached, subsequent requests may get sent to a different origin server. Valid values are between `1800` and `604800`.
     * 
     */
    @Import(name="sessionAffinityTtl")
    private @Nullable Output<Integer> sessionAffinityTtl;

    /**
     * @return Time, in seconds, until this load balancer&#39;s session affinity cookie expires after being created. This parameter is ignored unless a supported session affinity policy is set. The current default of `82800` (23 hours) will be used unless `session_affinity_ttl` is explicitly set. Once the expiry time has been reached, subsequent requests may get sent to a different origin server. Valid values are between `1800` and `604800`.
     * 
     */
    public Optional<Output<Integer>> sessionAffinityTtl() {
        return Optional.ofNullable(this.sessionAffinityTtl);
    }

    /**
     * The method the load balancer uses to determine the route to your origin. Value `off` uses `default_pool_ids`. Value `geo` uses `pop_pools`/`country_pools`/`region_pools`. For non-proxied requests, the `country` for `country_pools` is determined by `location_strategy`. Value `random` selects a pool randomly. Value `dynamic_latency` uses round trip time to select the closest pool in `default_pool_ids` (requires pool health checks). Value `proximity` uses the pools&#39; latitude and longitude to select the closest pool using the Cloudflare PoP location for proxied requests or the location determined by `location_strategy` for non-proxied requests. Value `&#34;&#34;` maps to `geo` if you use `pop_pools`/`country_pools`/`region_pools` otherwise `off`. Available values: `off`, `geo`, `dynamic_latency`, `random`, `proximity`, `&#34;&#34;` Defaults to `&#34;&#34;`.
     * 
     */
    @Import(name="steeringPolicy")
    private @Nullable Output<String> steeringPolicy;

    /**
     * @return The method the load balancer uses to determine the route to your origin. Value `off` uses `default_pool_ids`. Value `geo` uses `pop_pools`/`country_pools`/`region_pools`. For non-proxied requests, the `country` for `country_pools` is determined by `location_strategy`. Value `random` selects a pool randomly. Value `dynamic_latency` uses round trip time to select the closest pool in `default_pool_ids` (requires pool health checks). Value `proximity` uses the pools&#39; latitude and longitude to select the closest pool using the Cloudflare PoP location for proxied requests or the location determined by `location_strategy` for non-proxied requests. Value `&#34;&#34;` maps to `geo` if you use `pop_pools`/`country_pools`/`region_pools` otherwise `off`. Available values: `off`, `geo`, `dynamic_latency`, `random`, `proximity`, `&#34;&#34;` Defaults to `&#34;&#34;`.
     * 
     */
    public Optional<Output<String>> steeringPolicy() {
        return Optional.ofNullable(this.steeringPolicy);
    }

    /**
     * Time to live (TTL) of the DNS entry for the IP address returned by this load balancer. This cannot be set for proxied load balancers. Defaults to `30`. Conflicts with `proxied`.
     * 
     */
    @Import(name="ttl")
    private @Nullable Output<Integer> ttl;

    /**
     * @return Time to live (TTL) of the DNS entry for the IP address returned by this load balancer. This cannot be set for proxied load balancers. Defaults to `30`. Conflicts with `proxied`.
     * 
     */
    public Optional<Output<Integer>> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    /**
     * The zone ID to add the load balancer to.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return The zone ID to add the load balancer to.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private LoadBalancerArgs() {}

    private LoadBalancerArgs(LoadBalancerArgs $) {
        this.adaptiveRoutings = $.adaptiveRoutings;
        this.countryPools = $.countryPools;
        this.defaultPoolIds = $.defaultPoolIds;
        this.description = $.description;
        this.enabled = $.enabled;
        this.fallbackPoolId = $.fallbackPoolId;
        this.locationStrategies = $.locationStrategies;
        this.name = $.name;
        this.popPools = $.popPools;
        this.proxied = $.proxied;
        this.randomSteerings = $.randomSteerings;
        this.regionPools = $.regionPools;
        this.rules = $.rules;
        this.sessionAffinity = $.sessionAffinity;
        this.sessionAffinityAttributes = $.sessionAffinityAttributes;
        this.sessionAffinityTtl = $.sessionAffinityTtl;
        this.steeringPolicy = $.steeringPolicy;
        this.ttl = $.ttl;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerArgs $;

        public Builder() {
            $ = new LoadBalancerArgs();
        }

        public Builder(LoadBalancerArgs defaults) {
            $ = new LoadBalancerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param adaptiveRoutings Controls features that modify the routing of requests to pools and origins in response to dynamic conditions, such as during the interval between active health monitoring requests.
         * 
         * @return builder
         * 
         */
        public Builder adaptiveRoutings(@Nullable Output<List<LoadBalancerAdaptiveRoutingArgs>> adaptiveRoutings) {
            $.adaptiveRoutings = adaptiveRoutings;
            return this;
        }

        /**
         * @param adaptiveRoutings Controls features that modify the routing of requests to pools and origins in response to dynamic conditions, such as during the interval between active health monitoring requests.
         * 
         * @return builder
         * 
         */
        public Builder adaptiveRoutings(List<LoadBalancerAdaptiveRoutingArgs> adaptiveRoutings) {
            return adaptiveRoutings(Output.of(adaptiveRoutings));
        }

        /**
         * @param adaptiveRoutings Controls features that modify the routing of requests to pools and origins in response to dynamic conditions, such as during the interval between active health monitoring requests.
         * 
         * @return builder
         * 
         */
        public Builder adaptiveRoutings(LoadBalancerAdaptiveRoutingArgs... adaptiveRoutings) {
            return adaptiveRoutings(List.of(adaptiveRoutings));
        }

        /**
         * @param countryPools A set containing mappings of country codes to a list of pool IDs (ordered by their failover priority) for the given country.
         * 
         * @return builder
         * 
         */
        public Builder countryPools(@Nullable Output<List<LoadBalancerCountryPoolArgs>> countryPools) {
            $.countryPools = countryPools;
            return this;
        }

        /**
         * @param countryPools A set containing mappings of country codes to a list of pool IDs (ordered by their failover priority) for the given country.
         * 
         * @return builder
         * 
         */
        public Builder countryPools(List<LoadBalancerCountryPoolArgs> countryPools) {
            return countryPools(Output.of(countryPools));
        }

        /**
         * @param countryPools A set containing mappings of country codes to a list of pool IDs (ordered by their failover priority) for the given country.
         * 
         * @return builder
         * 
         */
        public Builder countryPools(LoadBalancerCountryPoolArgs... countryPools) {
            return countryPools(List.of(countryPools));
        }

        /**
         * @param defaultPoolIds A list of pool IDs ordered by their failover priority. Used whenever `pop_pools`/`country_pools`/`region_pools` are not defined.
         * 
         * @return builder
         * 
         */
        public Builder defaultPoolIds(Output<List<String>> defaultPoolIds) {
            $.defaultPoolIds = defaultPoolIds;
            return this;
        }

        /**
         * @param defaultPoolIds A list of pool IDs ordered by their failover priority. Used whenever `pop_pools`/`country_pools`/`region_pools` are not defined.
         * 
         * @return builder
         * 
         */
        public Builder defaultPoolIds(List<String> defaultPoolIds) {
            return defaultPoolIds(Output.of(defaultPoolIds));
        }

        /**
         * @param defaultPoolIds A list of pool IDs ordered by their failover priority. Used whenever `pop_pools`/`country_pools`/`region_pools` are not defined.
         * 
         * @return builder
         * 
         */
        public Builder defaultPoolIds(String... defaultPoolIds) {
            return defaultPoolIds(List.of(defaultPoolIds));
        }

        /**
         * @param description Free text description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Free text description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enabled Enable or disable the load balancer. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable or disable the load balancer. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param fallbackPoolId The pool ID to use when all other pools are detected as unhealthy.
         * 
         * @return builder
         * 
         */
        public Builder fallbackPoolId(Output<String> fallbackPoolId) {
            $.fallbackPoolId = fallbackPoolId;
            return this;
        }

        /**
         * @param fallbackPoolId The pool ID to use when all other pools are detected as unhealthy.
         * 
         * @return builder
         * 
         */
        public Builder fallbackPoolId(String fallbackPoolId) {
            return fallbackPoolId(Output.of(fallbackPoolId));
        }

        /**
         * @param locationStrategies Controls location-based steering for non-proxied requests.
         * 
         * @return builder
         * 
         */
        public Builder locationStrategies(@Nullable Output<List<LoadBalancerLocationStrategyArgs>> locationStrategies) {
            $.locationStrategies = locationStrategies;
            return this;
        }

        /**
         * @param locationStrategies Controls location-based steering for non-proxied requests.
         * 
         * @return builder
         * 
         */
        public Builder locationStrategies(List<LoadBalancerLocationStrategyArgs> locationStrategies) {
            return locationStrategies(Output.of(locationStrategies));
        }

        /**
         * @param locationStrategies Controls location-based steering for non-proxied requests.
         * 
         * @return builder
         * 
         */
        public Builder locationStrategies(LoadBalancerLocationStrategyArgs... locationStrategies) {
            return locationStrategies(List.of(locationStrategies));
        }

        /**
         * @param name The DNS hostname to associate with your load balancer. If this hostname already exists as a DNS record in Cloudflare&#39;s DNS, the load balancer will take precedence and the DNS record will not be used.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The DNS hostname to associate with your load balancer. If this hostname already exists as a DNS record in Cloudflare&#39;s DNS, the load balancer will take precedence and the DNS record will not be used.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param popPools A set containing mappings of Cloudflare Point-of-Presence (PoP) identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). This feature is only available to enterprise customers.
         * 
         * @return builder
         * 
         */
        public Builder popPools(@Nullable Output<List<LoadBalancerPopPoolArgs>> popPools) {
            $.popPools = popPools;
            return this;
        }

        /**
         * @param popPools A set containing mappings of Cloudflare Point-of-Presence (PoP) identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). This feature is only available to enterprise customers.
         * 
         * @return builder
         * 
         */
        public Builder popPools(List<LoadBalancerPopPoolArgs> popPools) {
            return popPools(Output.of(popPools));
        }

        /**
         * @param popPools A set containing mappings of Cloudflare Point-of-Presence (PoP) identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). This feature is only available to enterprise customers.
         * 
         * @return builder
         * 
         */
        public Builder popPools(LoadBalancerPopPoolArgs... popPools) {
            return popPools(List.of(popPools));
        }

        /**
         * @param proxied Whether the hostname gets Cloudflare&#39;s origin protection. Defaults to `false`. Conflicts with `ttl`.
         * 
         * @return builder
         * 
         */
        public Builder proxied(@Nullable Output<Boolean> proxied) {
            $.proxied = proxied;
            return this;
        }

        /**
         * @param proxied Whether the hostname gets Cloudflare&#39;s origin protection. Defaults to `false`. Conflicts with `ttl`.
         * 
         * @return builder
         * 
         */
        public Builder proxied(Boolean proxied) {
            return proxied(Output.of(proxied));
        }

        /**
         * @param randomSteerings Configures pool weights for random steering. When the `steering_policy=&#34;random&#34;`, a random pool is selected with probability proportional to these pool weights.
         * 
         * @return builder
         * 
         */
        public Builder randomSteerings(@Nullable Output<List<LoadBalancerRandomSteeringArgs>> randomSteerings) {
            $.randomSteerings = randomSteerings;
            return this;
        }

        /**
         * @param randomSteerings Configures pool weights for random steering. When the `steering_policy=&#34;random&#34;`, a random pool is selected with probability proportional to these pool weights.
         * 
         * @return builder
         * 
         */
        public Builder randomSteerings(List<LoadBalancerRandomSteeringArgs> randomSteerings) {
            return randomSteerings(Output.of(randomSteerings));
        }

        /**
         * @param randomSteerings Configures pool weights for random steering. When the `steering_policy=&#34;random&#34;`, a random pool is selected with probability proportional to these pool weights.
         * 
         * @return builder
         * 
         */
        public Builder randomSteerings(LoadBalancerRandomSteeringArgs... randomSteerings) {
            return randomSteerings(List.of(randomSteerings));
        }

        /**
         * @param regionPools A set containing mappings of region codes to a list of pool IDs (ordered by their failover priority) for the given region.
         * 
         * @return builder
         * 
         */
        public Builder regionPools(@Nullable Output<List<LoadBalancerRegionPoolArgs>> regionPools) {
            $.regionPools = regionPools;
            return this;
        }

        /**
         * @param regionPools A set containing mappings of region codes to a list of pool IDs (ordered by their failover priority) for the given region.
         * 
         * @return builder
         * 
         */
        public Builder regionPools(List<LoadBalancerRegionPoolArgs> regionPools) {
            return regionPools(Output.of(regionPools));
        }

        /**
         * @param regionPools A set containing mappings of region codes to a list of pool IDs (ordered by their failover priority) for the given region.
         * 
         * @return builder
         * 
         */
        public Builder regionPools(LoadBalancerRegionPoolArgs... regionPools) {
            return regionPools(List.of(regionPools));
        }

        /**
         * @param rules A list of rules for this load balancer to execute.
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<LoadBalancerRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules A list of rules for this load balancer to execute.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<LoadBalancerRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules A list of rules for this load balancer to execute.
         * 
         * @return builder
         * 
         */
        public Builder rules(LoadBalancerRuleArgs... rules) {
            return rules(List.of(rules));
        }

        /**
         * @param sessionAffinity Specifies the type of session affinity the load balancer should use unless specified as `none` or `&#34;&#34;` (default). With value `cookie`, on the first request to a proxied load balancer, a cookie is generated, encoding information of which origin the request will be forwarded to. Subsequent requests, by the same client to the same load balancer, will be sent to the origin server the cookie encodes, for the duration of the cookie and as long as the origin server remains healthy. If the cookie has expired or the origin server is unhealthy then a new origin server is calculated and used. Value `ip_cookie` behaves the same as `cookie` except the initial origin selection is stable and based on the client&#39;s IP address. Available values: `&#34;&#34;`, `none`, `cookie`, `ip_cookie`. Defaults to `none`.
         * 
         * @return builder
         * 
         */
        public Builder sessionAffinity(@Nullable Output<String> sessionAffinity) {
            $.sessionAffinity = sessionAffinity;
            return this;
        }

        /**
         * @param sessionAffinity Specifies the type of session affinity the load balancer should use unless specified as `none` or `&#34;&#34;` (default). With value `cookie`, on the first request to a proxied load balancer, a cookie is generated, encoding information of which origin the request will be forwarded to. Subsequent requests, by the same client to the same load balancer, will be sent to the origin server the cookie encodes, for the duration of the cookie and as long as the origin server remains healthy. If the cookie has expired or the origin server is unhealthy then a new origin server is calculated and used. Value `ip_cookie` behaves the same as `cookie` except the initial origin selection is stable and based on the client&#39;s IP address. Available values: `&#34;&#34;`, `none`, `cookie`, `ip_cookie`. Defaults to `none`.
         * 
         * @return builder
         * 
         */
        public Builder sessionAffinity(String sessionAffinity) {
            return sessionAffinity(Output.of(sessionAffinity));
        }

        /**
         * @param sessionAffinityAttributes See `session_affinity_attributes`.
         * 
         * @return builder
         * 
         */
        public Builder sessionAffinityAttributes(@Nullable Output<Map<String,String>> sessionAffinityAttributes) {
            $.sessionAffinityAttributes = sessionAffinityAttributes;
            return this;
        }

        /**
         * @param sessionAffinityAttributes See `session_affinity_attributes`.
         * 
         * @return builder
         * 
         */
        public Builder sessionAffinityAttributes(Map<String,String> sessionAffinityAttributes) {
            return sessionAffinityAttributes(Output.of(sessionAffinityAttributes));
        }

        /**
         * @param sessionAffinityTtl Time, in seconds, until this load balancer&#39;s session affinity cookie expires after being created. This parameter is ignored unless a supported session affinity policy is set. The current default of `82800` (23 hours) will be used unless `session_affinity_ttl` is explicitly set. Once the expiry time has been reached, subsequent requests may get sent to a different origin server. Valid values are between `1800` and `604800`.
         * 
         * @return builder
         * 
         */
        public Builder sessionAffinityTtl(@Nullable Output<Integer> sessionAffinityTtl) {
            $.sessionAffinityTtl = sessionAffinityTtl;
            return this;
        }

        /**
         * @param sessionAffinityTtl Time, in seconds, until this load balancer&#39;s session affinity cookie expires after being created. This parameter is ignored unless a supported session affinity policy is set. The current default of `82800` (23 hours) will be used unless `session_affinity_ttl` is explicitly set. Once the expiry time has been reached, subsequent requests may get sent to a different origin server. Valid values are between `1800` and `604800`.
         * 
         * @return builder
         * 
         */
        public Builder sessionAffinityTtl(Integer sessionAffinityTtl) {
            return sessionAffinityTtl(Output.of(sessionAffinityTtl));
        }

        /**
         * @param steeringPolicy The method the load balancer uses to determine the route to your origin. Value `off` uses `default_pool_ids`. Value `geo` uses `pop_pools`/`country_pools`/`region_pools`. For non-proxied requests, the `country` for `country_pools` is determined by `location_strategy`. Value `random` selects a pool randomly. Value `dynamic_latency` uses round trip time to select the closest pool in `default_pool_ids` (requires pool health checks). Value `proximity` uses the pools&#39; latitude and longitude to select the closest pool using the Cloudflare PoP location for proxied requests or the location determined by `location_strategy` for non-proxied requests. Value `&#34;&#34;` maps to `geo` if you use `pop_pools`/`country_pools`/`region_pools` otherwise `off`. Available values: `off`, `geo`, `dynamic_latency`, `random`, `proximity`, `&#34;&#34;` Defaults to `&#34;&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder steeringPolicy(@Nullable Output<String> steeringPolicy) {
            $.steeringPolicy = steeringPolicy;
            return this;
        }

        /**
         * @param steeringPolicy The method the load balancer uses to determine the route to your origin. Value `off` uses `default_pool_ids`. Value `geo` uses `pop_pools`/`country_pools`/`region_pools`. For non-proxied requests, the `country` for `country_pools` is determined by `location_strategy`. Value `random` selects a pool randomly. Value `dynamic_latency` uses round trip time to select the closest pool in `default_pool_ids` (requires pool health checks). Value `proximity` uses the pools&#39; latitude and longitude to select the closest pool using the Cloudflare PoP location for proxied requests or the location determined by `location_strategy` for non-proxied requests. Value `&#34;&#34;` maps to `geo` if you use `pop_pools`/`country_pools`/`region_pools` otherwise `off`. Available values: `off`, `geo`, `dynamic_latency`, `random`, `proximity`, `&#34;&#34;` Defaults to `&#34;&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder steeringPolicy(String steeringPolicy) {
            return steeringPolicy(Output.of(steeringPolicy));
        }

        /**
         * @param ttl Time to live (TTL) of the DNS entry for the IP address returned by this load balancer. This cannot be set for proxied load balancers. Defaults to `30`. Conflicts with `proxied`.
         * 
         * @return builder
         * 
         */
        public Builder ttl(@Nullable Output<Integer> ttl) {
            $.ttl = ttl;
            return this;
        }

        /**
         * @param ttl Time to live (TTL) of the DNS entry for the IP address returned by this load balancer. This cannot be set for proxied load balancers. Defaults to `30`. Conflicts with `proxied`.
         * 
         * @return builder
         * 
         */
        public Builder ttl(Integer ttl) {
            return ttl(Output.of(ttl));
        }

        /**
         * @param zoneId The zone ID to add the load balancer to.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone ID to add the load balancer to.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public LoadBalancerArgs build() {
            $.defaultPoolIds = Objects.requireNonNull($.defaultPoolIds, "expected parameter 'defaultPoolIds' to be non-null");
            $.fallbackPoolId = Objects.requireNonNull($.fallbackPoolId, "expected parameter 'fallbackPoolId' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.zoneId = Objects.requireNonNull($.zoneId, "expected parameter 'zoneId' to be non-null");
            return $;
        }
    }

}
