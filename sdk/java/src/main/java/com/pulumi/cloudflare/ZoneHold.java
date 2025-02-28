// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.ZoneHoldArgs;
import com.pulumi.cloudflare.inputs.ZoneHoldState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare Zone Hold resource that prevents adding
 * the hostname to another account for use.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.ZoneHold;
 * import com.pulumi.cloudflare.ZoneHoldArgs;
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
 *         var example = new ZoneHold(&#34;example&#34;, ZoneHoldArgs.builder()        
 *             .hold(true)
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/zoneHold:ZoneHold example &lt;zone_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/zoneHold:ZoneHold")
public class ZoneHold extends com.pulumi.resources.CustomResource {
    /**
     * Enablement status of the zone hold.
     * 
     */
    @Export(name="hold", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> hold;

    /**
     * @return Enablement status of the zone hold.
     * 
     */
    public Output<Boolean> hold() {
        return this.hold;
    }
    /**
     * The RFC3339 compatible timestamp when to automatically re-enable the zone hold.
     * 
     */
    @Export(name="holdAfter", refs={String.class}, tree="[0]")
    private Output<String> holdAfter;

    /**
     * @return The RFC3339 compatible timestamp when to automatically re-enable the zone hold.
     * 
     */
    public Output<String> holdAfter() {
        return this.holdAfter;
    }
    /**
     * Whether to extend to block any subdomain of the given zone.
     * 
     */
    @Export(name="includeSubdomains", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> includeSubdomains;

    /**
     * @return Whether to extend to block any subdomain of the given zone.
     * 
     */
    public Output<Optional<Boolean>> includeSubdomains() {
        return Codegen.optional(this.includeSubdomains);
    }
    /**
     * The zone identifier to target for the resource.
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ZoneHold(String name) {
        this(name, ZoneHoldArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ZoneHold(String name, ZoneHoldArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ZoneHold(String name, ZoneHoldArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zoneHold:ZoneHold", name, args == null ? ZoneHoldArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ZoneHold(String name, Output<String> id, @Nullable ZoneHoldState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zoneHold:ZoneHold", name, state, makeResourceOptions(options, id));
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
    public static ZoneHold get(String name, Output<String> id, @Nullable ZoneHoldState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ZoneHold(name, id, state, options);
    }
}
