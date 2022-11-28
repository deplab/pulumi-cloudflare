// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.LoadBalancerArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.LoadBalancerState;
import com.pulumi.cloudflare.outputs.LoadBalancerAdaptiveRouting;
import com.pulumi.cloudflare.outputs.LoadBalancerCountryPool;
import com.pulumi.cloudflare.outputs.LoadBalancerLocationStrategy;
import com.pulumi.cloudflare.outputs.LoadBalancerPopPool;
import com.pulumi.cloudflare.outputs.LoadBalancerRandomSteering;
import com.pulumi.cloudflare.outputs.LoadBalancerRegionPool;
import com.pulumi.cloudflare.outputs.LoadBalancerRule;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare Load Balancer resource. This sits in front of
 * a number of defined pools of origins and provides various options
 * for geographically-aware load balancing. Note that the load balancing
 * feature must be enabled in your Cloudflare account before you can use
 * this resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.LoadBalancerPool;
 * import com.pulumi.cloudflare.LoadBalancerPoolArgs;
 * import com.pulumi.cloudflare.inputs.LoadBalancerPoolOriginArgs;
 * import com.pulumi.cloudflare.LoadBalancer;
 * import com.pulumi.cloudflare.LoadBalancerArgs;
 * import com.pulumi.cloudflare.inputs.LoadBalancerPopPoolArgs;
 * import com.pulumi.cloudflare.inputs.LoadBalancerCountryPoolArgs;
 * import com.pulumi.cloudflare.inputs.LoadBalancerRegionPoolArgs;
 * import com.pulumi.cloudflare.inputs.LoadBalancerRuleArgs;
 * import com.pulumi.cloudflare.inputs.LoadBalancerRuleFixedResponseArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleLoadBalancerPool = new LoadBalancerPool(&#34;exampleLoadBalancerPool&#34;, LoadBalancerPoolArgs.builder()        
 *             .name(&#34;example-lb-pool&#34;)
 *             .origins(LoadBalancerPoolOriginArgs.builder()
 *                 .name(&#34;example-1&#34;)
 *                 .address(&#34;192.0.2.1&#34;)
 *                 .enabled(false)
 *                 .build())
 *             .build());
 * 
 *         var exampleLoadBalancer = new LoadBalancer(&#34;exampleLoadBalancer&#34;, LoadBalancerArgs.builder()        
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .name(&#34;example-load-balancer.example.com&#34;)
 *             .fallbackPoolId(exampleLoadBalancerPool.id())
 *             .defaultPoolIds(exampleLoadBalancerPool.id())
 *             .description(&#34;example load balancer using geo-balancing&#34;)
 *             .proxied(true)
 *             .steeringPolicy(&#34;geo&#34;)
 *             .popPools(LoadBalancerPopPoolArgs.builder()
 *                 .pop(&#34;LAX&#34;)
 *                 .poolIds(exampleLoadBalancerPool.id())
 *                 .build())
 *             .countryPools(LoadBalancerCountryPoolArgs.builder()
 *                 .country(&#34;US&#34;)
 *                 .poolIds(exampleLoadBalancerPool.id())
 *                 .build())
 *             .regionPools(LoadBalancerRegionPoolArgs.builder()
 *                 .region(&#34;WNAM&#34;)
 *                 .poolIds(exampleLoadBalancerPool.id())
 *                 .build())
 *             .rules(LoadBalancerRuleArgs.builder()
 *                 .name(&#34;example rule&#34;)
 *                 .condition(&#34;http.request.uri.path contains \&#34;testing\&#34;&#34;)
 *                 .fixedResponse(LoadBalancerRuleFixedResponseArgs.builder()
 *                     .messageBody(&#34;hello&#34;)
 *                     .statusCode(200)
 *                     .contentType(&#34;html&#34;)
 *                     .location(&#34;www.example.com&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/loadBalancer:LoadBalancer example &lt;zone_id&gt;/&lt;load_balancer_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/loadBalancer:LoadBalancer")
public class LoadBalancer extends com.pulumi.resources.CustomResource {
    /**
     * Controls features that modify the routing of requests to pools and origins in response to dynamic conditions, such as during the interval between active health monitoring requests.
     * 
     */
    @Export(name="adaptiveRoutings", type=List.class, parameters={LoadBalancerAdaptiveRouting.class})
    private Output</* @Nullable */ List<LoadBalancerAdaptiveRouting>> adaptiveRoutings;

    /**
     * @return Controls features that modify the routing of requests to pools and origins in response to dynamic conditions, such as during the interval between active health monitoring requests.
     * 
     */
    public Output<Optional<List<LoadBalancerAdaptiveRouting>>> adaptiveRoutings() {
        return Codegen.optional(this.adaptiveRoutings);
    }
    /**
     * A set containing mappings of country codes to a list of pool IDs (ordered by their failover priority) for the given country.
     * 
     */
    @Export(name="countryPools", type=List.class, parameters={LoadBalancerCountryPool.class})
    private Output<List<LoadBalancerCountryPool>> countryPools;

    /**
     * @return A set containing mappings of country codes to a list of pool IDs (ordered by their failover priority) for the given country.
     * 
     */
    public Output<List<LoadBalancerCountryPool>> countryPools() {
        return this.countryPools;
    }
    /**
     * The RFC3339 timestamp of when the load balancer was created.
     * 
     */
    @Export(name="createdOn", type=String.class, parameters={})
    private Output<String> createdOn;

    /**
     * @return The RFC3339 timestamp of when the load balancer was created.
     * 
     */
    public Output<String> createdOn() {
        return this.createdOn;
    }
    /**
     * A list of pool IDs ordered by their failover priority. Used whenever `pop_pools`/`country_pools`/`region_pools` are not defined.
     * 
     */
    @Export(name="defaultPoolIds", type=List.class, parameters={String.class})
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
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Free text description.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Enable or disable the load balancer. Defaults to `true`.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Enable or disable the load balancer. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * The pool ID to use when all other pools are detected as unhealthy.
     * 
     */
    @Export(name="fallbackPoolId", type=String.class, parameters={})
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
    @Export(name="locationStrategies", type=List.class, parameters={LoadBalancerLocationStrategy.class})
    private Output</* @Nullable */ List<LoadBalancerLocationStrategy>> locationStrategies;

    /**
     * @return Controls location-based steering for non-proxied requests.
     * 
     */
    public Output<Optional<List<LoadBalancerLocationStrategy>>> locationStrategies() {
        return Codegen.optional(this.locationStrategies);
    }
    /**
     * The RFC3339 timestamp of when the load balancer was last modified.
     * 
     */
    @Export(name="modifiedOn", type=String.class, parameters={})
    private Output<String> modifiedOn;

    /**
     * @return The RFC3339 timestamp of when the load balancer was last modified.
     * 
     */
    public Output<String> modifiedOn() {
        return this.modifiedOn;
    }
    /**
     * The DNS hostname to associate with your load balancer. If this hostname already exists as a DNS record in Cloudflare&#39;s DNS, the load balancer will take precedence and the DNS record will not be used.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
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
    @Export(name="popPools", type=List.class, parameters={LoadBalancerPopPool.class})
    private Output<List<LoadBalancerPopPool>> popPools;

    /**
     * @return A set containing mappings of Cloudflare Point-of-Presence (PoP) identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). This feature is only available to enterprise customers.
     * 
     */
    public Output<List<LoadBalancerPopPool>> popPools() {
        return this.popPools;
    }
    /**
     * Whether the hostname gets Cloudflare&#39;s origin protection. Defaults to `false`. Conflicts with `ttl`.
     * 
     */
    @Export(name="proxied", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> proxied;

    /**
     * @return Whether the hostname gets Cloudflare&#39;s origin protection. Defaults to `false`. Conflicts with `ttl`.
     * 
     */
    public Output<Optional<Boolean>> proxied() {
        return Codegen.optional(this.proxied);
    }
    /**
     * Configures pool weights for random steering. When the `steering_policy=&#34;random&#34;`, a random pool is selected with probability proportional to these pool weights.
     * 
     */
    @Export(name="randomSteerings", type=List.class, parameters={LoadBalancerRandomSteering.class})
    private Output</* @Nullable */ List<LoadBalancerRandomSteering>> randomSteerings;

    /**
     * @return Configures pool weights for random steering. When the `steering_policy=&#34;random&#34;`, a random pool is selected with probability proportional to these pool weights.
     * 
     */
    public Output<Optional<List<LoadBalancerRandomSteering>>> randomSteerings() {
        return Codegen.optional(this.randomSteerings);
    }
    /**
     * A set containing mappings of region codes to a list of pool IDs (ordered by their failover priority) for the given region.
     * 
     */
    @Export(name="regionPools", type=List.class, parameters={LoadBalancerRegionPool.class})
    private Output<List<LoadBalancerRegionPool>> regionPools;

    /**
     * @return A set containing mappings of region codes to a list of pool IDs (ordered by their failover priority) for the given region.
     * 
     */
    public Output<List<LoadBalancerRegionPool>> regionPools() {
        return this.regionPools;
    }
    /**
     * A list of rules for this load balancer to execute.
     * 
     */
    @Export(name="rules", type=List.class, parameters={LoadBalancerRule.class})
    private Output</* @Nullable */ List<LoadBalancerRule>> rules;

    /**
     * @return A list of rules for this load balancer to execute.
     * 
     */
    public Output<Optional<List<LoadBalancerRule>>> rules() {
        return Codegen.optional(this.rules);
    }
    /**
     * Specifies the type of session affinity the load balancer should use unless specified as `none` or `&#34;&#34;` (default). With value `cookie`, on the first request to a proxied load balancer, a cookie is generated, encoding information of which origin the request will be forwarded to. Subsequent requests, by the same client to the same load balancer, will be sent to the origin server the cookie encodes, for the duration of the cookie and as long as the origin server remains healthy. If the cookie has expired or the origin server is unhealthy then a new origin server is calculated and used. Value `ip_cookie` behaves the same as `cookie` except the initial origin selection is stable and based on the client&#39;s IP address. Available values: `&#34;&#34;`, `none`, `cookie`, `ip_cookie`. Defaults to `none`.
     * 
     */
    @Export(name="sessionAffinity", type=String.class, parameters={})
    private Output</* @Nullable */ String> sessionAffinity;

    /**
     * @return Specifies the type of session affinity the load balancer should use unless specified as `none` or `&#34;&#34;` (default). With value `cookie`, on the first request to a proxied load balancer, a cookie is generated, encoding information of which origin the request will be forwarded to. Subsequent requests, by the same client to the same load balancer, will be sent to the origin server the cookie encodes, for the duration of the cookie and as long as the origin server remains healthy. If the cookie has expired or the origin server is unhealthy then a new origin server is calculated and used. Value `ip_cookie` behaves the same as `cookie` except the initial origin selection is stable and based on the client&#39;s IP address. Available values: `&#34;&#34;`, `none`, `cookie`, `ip_cookie`. Defaults to `none`.
     * 
     */
    public Output<Optional<String>> sessionAffinity() {
        return Codegen.optional(this.sessionAffinity);
    }
    /**
     * See `session_affinity_attributes`.
     * 
     */
    @Export(name="sessionAffinityAttributes", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> sessionAffinityAttributes;

    /**
     * @return See `session_affinity_attributes`.
     * 
     */
    public Output<Optional<Map<String,String>>> sessionAffinityAttributes() {
        return Codegen.optional(this.sessionAffinityAttributes);
    }
    /**
     * Time, in seconds, until this load balancer&#39;s session affinity cookie expires after being created. This parameter is ignored unless a supported session affinity policy is set. The current default of `82800` (23 hours) will be used unless `session_affinity_ttl` is explicitly set. Once the expiry time has been reached, subsequent requests may get sent to a different origin server. Valid values are between `1800` and `604800`.
     * 
     */
    @Export(name="sessionAffinityTtl", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> sessionAffinityTtl;

    /**
     * @return Time, in seconds, until this load balancer&#39;s session affinity cookie expires after being created. This parameter is ignored unless a supported session affinity policy is set. The current default of `82800` (23 hours) will be used unless `session_affinity_ttl` is explicitly set. Once the expiry time has been reached, subsequent requests may get sent to a different origin server. Valid values are between `1800` and `604800`.
     * 
     */
    public Output<Optional<Integer>> sessionAffinityTtl() {
        return Codegen.optional(this.sessionAffinityTtl);
    }
    /**
     * The method the load balancer uses to determine the route to your origin. Value `off` uses `default_pool_ids`. Value `geo` uses `pop_pools`/`country_pools`/`region_pools`. For non-proxied requests, the `country` for `country_pools` is determined by `location_strategy`. Value `random` selects a pool randomly. Value `dynamic_latency` uses round trip time to select the closest pool in `default_pool_ids` (requires pool health checks). Value `proximity` uses the pools&#39; latitude and longitude to select the closest pool using the Cloudflare PoP location for proxied requests or the location determined by `location_strategy` for non-proxied requests. Value `&#34;&#34;` maps to `geo` if you use `pop_pools`/`country_pools`/`region_pools` otherwise `off`. Available values: `off`, `geo`, `dynamic_latency`, `random`, `proximity`, `&#34;&#34;` Defaults to `&#34;&#34;`.
     * 
     */
    @Export(name="steeringPolicy", type=String.class, parameters={})
    private Output<String> steeringPolicy;

    /**
     * @return The method the load balancer uses to determine the route to your origin. Value `off` uses `default_pool_ids`. Value `geo` uses `pop_pools`/`country_pools`/`region_pools`. For non-proxied requests, the `country` for `country_pools` is determined by `location_strategy`. Value `random` selects a pool randomly. Value `dynamic_latency` uses round trip time to select the closest pool in `default_pool_ids` (requires pool health checks). Value `proximity` uses the pools&#39; latitude and longitude to select the closest pool using the Cloudflare PoP location for proxied requests or the location determined by `location_strategy` for non-proxied requests. Value `&#34;&#34;` maps to `geo` if you use `pop_pools`/`country_pools`/`region_pools` otherwise `off`. Available values: `off`, `geo`, `dynamic_latency`, `random`, `proximity`, `&#34;&#34;` Defaults to `&#34;&#34;`.
     * 
     */
    public Output<String> steeringPolicy() {
        return this.steeringPolicy;
    }
    /**
     * Time to live (TTL) of the DNS entry for the IP address returned by this load balancer. This cannot be set for proxied load balancers. Defaults to `30`. Conflicts with `proxied`.
     * 
     */
    @Export(name="ttl", type=Integer.class, parameters={})
    private Output<Integer> ttl;

    /**
     * @return Time to live (TTL) of the DNS entry for the IP address returned by this load balancer. This cannot be set for proxied load balancers. Defaults to `30`. Conflicts with `proxied`.
     * 
     */
    public Output<Integer> ttl() {
        return this.ttl;
    }
    /**
     * The zone ID to add the load balancer to.
     * 
     */
    @Export(name="zoneId", type=String.class, parameters={})
    private Output<String> zoneId;

    /**
     * @return The zone ID to add the load balancer to.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LoadBalancer(String name) {
        this(name, LoadBalancerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LoadBalancer(String name, LoadBalancerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LoadBalancer(String name, LoadBalancerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/loadBalancer:LoadBalancer", name, args == null ? LoadBalancerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LoadBalancer(String name, Output<String> id, @Nullable LoadBalancerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/loadBalancer:LoadBalancer", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LoadBalancer get(String name, Output<String> id, @Nullable LoadBalancerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LoadBalancer(name, id, state, options);
    }
}
