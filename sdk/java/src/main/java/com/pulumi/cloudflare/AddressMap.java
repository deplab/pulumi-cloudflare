// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.AddressMapArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.AddressMapState;
import com.pulumi.cloudflare.outputs.AddressMapIp;
import com.pulumi.cloudflare.outputs.AddressMapMembership;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides the ability to manage IP addresses that can be used by DNS records when
 * they are proxied through Cloudflare.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.AddressMap;
 * import com.pulumi.cloudflare.AddressMapArgs;
 * import com.pulumi.cloudflare.inputs.AddressMapIpArgs;
 * import com.pulumi.cloudflare.inputs.AddressMapMembershipArgs;
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
 *         var example = new AddressMap(&#34;example&#34;, AddressMapArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .defaultSni(&#34;*.example.com&#34;)
 *             .description(&#34;My address map&#34;)
 *             .enabled(true)
 *             .ips(            
 *                 AddressMapIpArgs.builder()
 *                     .ip(&#34;192.0.2.1&#34;)
 *                     .build(),
 *                 AddressMapIpArgs.builder()
 *                     .ip(&#34;203.0.113.1&#34;)
 *                     .build())
 *             .memberships(            
 *                 AddressMapMembershipArgs.builder()
 *                     .identifier(&#34;92f17202ed8bd63d69a66b86a49a8f6b&#34;)
 *                     .kind(&#34;account&#34;)
 *                     .build(),
 *                 AddressMapMembershipArgs.builder()
 *                     .identifier(&#34;023e105f4ecef8ad9ca31a8372d0c353&#34;)
 *                     .kind(&#34;zone&#34;)
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/addressMap:AddressMap example &lt;account_id&gt;/&lt;address_map_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/addressMap:AddressMap")
public class AddressMap extends com.pulumi.resources.CustomResource {
    /**
     * The account identifier to target for the resource.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * If set to false, then the Address Map cannot be deleted via API. This is true for Cloudflare-managed maps.
     * 
     */
    @Export(name="canDelete", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> canDelete;

    /**
     * @return If set to false, then the Address Map cannot be deleted via API. This is true for Cloudflare-managed maps.
     * 
     */
    public Output<Boolean> canDelete() {
        return this.canDelete;
    }
    /**
     * If set to false, then the IPs on the Address Map cannot be modified via the API. This is true for Cloudflare-managed maps.
     * 
     */
    @Export(name="canModifyIps", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> canModifyIps;

    /**
     * @return If set to false, then the IPs on the Address Map cannot be modified via the API. This is true for Cloudflare-managed maps.
     * 
     */
    public Output<Boolean> canModifyIps() {
        return this.canModifyIps;
    }
    /**
     * If you have legacy TLS clients which do not send the TLS server name indicator, then you can specify one default SNI on the map.
     * 
     */
    @Export(name="defaultSni", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> defaultSni;

    /**
     * @return If you have legacy TLS clients which do not send the TLS server name indicator, then you can specify one default SNI on the map.
     * 
     */
    public Output<Optional<String>> defaultSni() {
        return Codegen.optional(this.defaultSni);
    }
    /**
     * Description of the address map.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the address map.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Whether the Address Map is enabled or not.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return Whether the Address Map is enabled or not.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * The set of IPs on the Address Map.
     * 
     */
    @Export(name="ips", refs={List.class,AddressMapIp.class}, tree="[0,1]")
    private Output</* @Nullable */ List<AddressMapIp>> ips;

    /**
     * @return The set of IPs on the Address Map.
     * 
     */
    public Output<Optional<List<AddressMapIp>>> ips() {
        return Codegen.optional(this.ips);
    }
    /**
     * Zones and Accounts which will be assigned IPs on this Address Map.
     * 
     */
    @Export(name="memberships", refs={List.class,AddressMapMembership.class}, tree="[0,1]")
    private Output</* @Nullable */ List<AddressMapMembership>> memberships;

    /**
     * @return Zones and Accounts which will be assigned IPs on this Address Map.
     * 
     */
    public Output<Optional<List<AddressMapMembership>>> memberships() {
        return Codegen.optional(this.memberships);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AddressMap(String name) {
        this(name, AddressMapArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AddressMap(String name, AddressMapArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AddressMap(String name, AddressMapArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/addressMap:AddressMap", name, args == null ? AddressMapArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AddressMap(String name, Output<String> id, @Nullable AddressMapState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/addressMap:AddressMap", name, state, makeResourceOptions(options, id));
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
    public static AddressMap get(String name, Output<String> id, @Nullable AddressMapState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AddressMap(name, id, state, options);
    }
}