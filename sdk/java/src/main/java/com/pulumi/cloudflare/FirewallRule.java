// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.FirewallRuleArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.FirewallRuleState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.Filter;
 * import com.pulumi.cloudflare.FilterArgs;
 * import com.pulumi.cloudflare.FirewallRule;
 * import com.pulumi.cloudflare.FirewallRuleArgs;
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
 *         var wordpressFilter = new Filter(&#34;wordpressFilter&#34;, FilterArgs.builder()        
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .description(&#34;Wordpress break-in attempts that are outside of the office&#34;)
 *             .expression(&#34;(http.request.uri.path ~ \&#34;.*wp-login.php\&#34; or http.request.uri.path ~ \&#34;.*xmlrpc.php\&#34;) and ip.src ne 192.0.2.1&#34;)
 *             .build());
 * 
 *         var wordpressFirewallRule = new FirewallRule(&#34;wordpressFirewallRule&#34;, FirewallRuleArgs.builder()        
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .description(&#34;Block wordpress break-in attempts&#34;)
 *             .filterId(wordpressFilter.id())
 *             .action(&#34;block&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/firewallRule:FirewallRule example &lt;zone_id&gt;/&lt;firewall_rule_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/firewallRule:FirewallRule")
public class FirewallRule extends com.pulumi.resources.CustomResource {
    /**
     * The action to apply to a matched request. Available values: `block`, `challenge`, `allow`, `js_challenge`, `managed_challenge`, `log`, `bypass`.
     * 
     */
    @Export(name="action", refs={String.class}, tree="[0]")
    private Output<String> action;

    /**
     * @return The action to apply to a matched request. Available values: `block`, `challenge`, `allow`, `js_challenge`, `managed_challenge`, `log`, `bypass`.
     * 
     */
    public Output<String> action() {
        return this.action;
    }
    /**
     * A description of the rule to help identify it.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the rule to help identify it.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The identifier of the Filter to use for determining if the Firewall Rule should be triggered.
     * 
     */
    @Export(name="filterId", refs={String.class}, tree="[0]")
    private Output<String> filterId;

    /**
     * @return The identifier of the Filter to use for determining if the Firewall Rule should be triggered.
     * 
     */
    public Output<String> filterId() {
        return this.filterId;
    }
    /**
     * Whether this filter based firewall rule is currently paused.
     * 
     */
    @Export(name="paused", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> paused;

    /**
     * @return Whether this filter based firewall rule is currently paused.
     * 
     */
    public Output<Optional<Boolean>> paused() {
        return Codegen.optional(this.paused);
    }
    /**
     * The priority of the rule to allow control of processing order. A lower number indicates high priority. If not provided, any rules with a priority will be sequenced before those without.
     * 
     */
    @Export(name="priority", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> priority;

    /**
     * @return The priority of the rule to allow control of processing order. A lower number indicates high priority. If not provided, any rules with a priority will be sequenced before those without.
     * 
     */
    public Output<Optional<Integer>> priority() {
        return Codegen.optional(this.priority);
    }
    /**
     * List of products to bypass for a request when the bypass action is used. Available values: `zoneLockdown`, `uaBlock`, `bic`, `hot`, `securityLevel`, `rateLimit`, `waf`.
     * 
     */
    @Export(name="products", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> products;

    /**
     * @return List of products to bypass for a request when the bypass action is used. Available values: `zoneLockdown`, `uaBlock`, `bic`, `hot`, `securityLevel`, `rateLimit`, `waf`.
     * 
     */
    public Output<Optional<List<String>>> products() {
        return Codegen.optional(this.products);
    }
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FirewallRule(String name) {
        this(name, FirewallRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FirewallRule(String name, FirewallRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FirewallRule(String name, FirewallRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/firewallRule:FirewallRule", name, args == null ? FirewallRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FirewallRule(String name, Output<String> id, @Nullable FirewallRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/firewallRule:FirewallRule", name, state, makeResourceOptions(options, id));
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
    public static FirewallRule get(String name, Output<String> id, @Nullable FirewallRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FirewallRule(name, id, state, options);
    }
}
