// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.HostnameTlsSettingCiphersArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.HostnameTlsSettingCiphersState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare per-hostname TLS setting resource, specifically for ciphers suites. Used to set ciphers suites for hostnames under the specified zone.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.HostnameTlsSettingCiphers;
 * import com.pulumi.cloudflare.HostnameTlsSettingCiphersArgs;
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
 *         var example = new HostnameTlsSettingCiphers(&#34;example&#34;, HostnameTlsSettingCiphersArgs.builder()        
 *             .hostname(&#34;sub.example.com&#34;)
 *             .values(&#34;ECDHE-RSA-AES128-GCM-SHA256&#34;)
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
 *  $ pulumi import cloudflare:index/hostnameTlsSettingCiphers:HostnameTlsSettingCiphers example &lt;zone_id&gt;/&lt;hostname&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/hostnameTlsSettingCiphers:HostnameTlsSettingCiphers")
public class HostnameTlsSettingCiphers extends com.pulumi.resources.CustomResource {
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="hostname", refs={String.class}, tree="[0]")
    private Output<String> hostname;

    /**
     * @return Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }
    /**
     * Ports to use within the IP rule.
     * 
     */
    @Export(name="ports", refs={List.class,Integer.class}, tree="[0,1]")
    private Output</* @Nullable */ List<Integer>> ports;

    /**
     * @return Ports to use within the IP rule.
     * 
     */
    public Output<Optional<List<Integer>>> ports() {
        return Codegen.optional(this.ports);
    }
    @Export(name="updatedAt", refs={String.class}, tree="[0]")
    private Output<String> updatedAt;

    public Output<String> updatedAt() {
        return this.updatedAt;
    }
    /**
     * Ciphers suites value.
     * 
     */
    @Export(name="values", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> values;

    /**
     * @return Ciphers suites value.
     * 
     */
    public Output<List<String>> values() {
        return this.values;
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
    public HostnameTlsSettingCiphers(String name) {
        this(name, HostnameTlsSettingCiphersArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HostnameTlsSettingCiphers(String name, HostnameTlsSettingCiphersArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HostnameTlsSettingCiphers(String name, HostnameTlsSettingCiphersArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/hostnameTlsSettingCiphers:HostnameTlsSettingCiphers", name, args == null ? HostnameTlsSettingCiphersArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HostnameTlsSettingCiphers(String name, Output<String> id, @Nullable HostnameTlsSettingCiphersState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/hostnameTlsSettingCiphers:HostnameTlsSettingCiphers", name, state, makeResourceOptions(options, id));
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
    public static HostnameTlsSettingCiphers get(String name, Output<String> id, @Nullable HostnameTlsSettingCiphersState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HostnameTlsSettingCiphers(name, id, state, options);
    }
}