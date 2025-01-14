// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.DevicePostureIntegrationArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.DevicePostureIntegrationState;
import com.pulumi.cloudflare.outputs.DevicePostureIntegrationConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare Device Posture Integration resource. Device
 * posture integrations configure third-party data providers for device
 * posture rules.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.DevicePostureIntegration;
 * import com.pulumi.cloudflare.DevicePostureIntegrationArgs;
 * import com.pulumi.cloudflare.inputs.DevicePostureIntegrationConfigArgs;
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
 *         var example = new DevicePostureIntegration(&#34;example&#34;, DevicePostureIntegrationArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .configs(DevicePostureIntegrationConfigArgs.builder()
 *                 .apiUrl(&#34;https://example.com/api&#34;)
 *                 .authUrl(&#34;https://example.com/connect/token&#34;)
 *                 .clientId(&#34;client-id&#34;)
 *                 .clientSecret(&#34;client-secret&#34;)
 *                 .build())
 *             .interval(&#34;24h&#34;)
 *             .name(&#34;Device posture integration&#34;)
 *             .type(&#34;workspace_one&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/devicePostureIntegration:DevicePostureIntegration example &lt;account_id&gt;/&lt;device_posture_integration_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/devicePostureIntegration:DevicePostureIntegration")
public class DevicePostureIntegration extends com.pulumi.resources.CustomResource {
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
     * The device posture integration&#39;s connection authorization parameters.
     * 
     */
    @Export(name="configs", refs={List.class,DevicePostureIntegrationConfig.class}, tree="[0,1]")
    private Output</* @Nullable */ List<DevicePostureIntegrationConfig>> configs;

    /**
     * @return The device posture integration&#39;s connection authorization parameters.
     * 
     */
    public Output<Optional<List<DevicePostureIntegrationConfig>>> configs() {
        return Codegen.optional(this.configs);
    }
    @Export(name="identifier", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> identifier;

    public Output<Optional<String>> identifier() {
        return Codegen.optional(this.identifier);
    }
    /**
     * Indicates the frequency with which to poll the third-party API. Must be in the format `1h` or `30m`.
     * 
     */
    @Export(name="interval", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> interval;

    /**
     * @return Indicates the frequency with which to poll the third-party API. Must be in the format `1h` or `30m`.
     * 
     */
    public Output<Optional<String>> interval() {
        return Codegen.optional(this.interval);
    }
    /**
     * Name of the device posture integration.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the device posture integration.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The device posture integration type. Available values: `workspace_one`, `uptycs`, `crowdstrike_s2s`, `intune`, `kolide`, `sentinelone_s2s`, `tanium_s2s`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The device posture integration type. Available values: `workspace_one`, `uptycs`, `crowdstrike_s2s`, `intune`, `kolide`, `sentinelone_s2s`, `tanium_s2s`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DevicePostureIntegration(String name) {
        this(name, DevicePostureIntegrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DevicePostureIntegration(String name, DevicePostureIntegrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DevicePostureIntegration(String name, DevicePostureIntegrationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/devicePostureIntegration:DevicePostureIntegration", name, args == null ? DevicePostureIntegrationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DevicePostureIntegration(String name, Output<String> id, @Nullable DevicePostureIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/devicePostureIntegration:DevicePostureIntegration", name, state, makeResourceOptions(options, id));
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
    public static DevicePostureIntegration get(String name, Output<String> id, @Nullable DevicePostureIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DevicePostureIntegration(name, id, state, options);
    }
}
