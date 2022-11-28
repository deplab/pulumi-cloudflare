// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.ArgoTunnelArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.ArgoTunnelState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Argo Tunnel exposes applications running on your local web server on any network with an internet connection without manually adding DNS records or configuring a firewall or router.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.ArgoTunnel;
 * import com.pulumi.cloudflare.ArgoTunnelArgs;
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
 *         var example = new ArgoTunnel(&#34;example&#34;, ArgoTunnelArgs.builder()        
 *             .accountId(&#34;d41d8cd98f00b204e9800998ecf8427e&#34;)
 *             .name(&#34;my-tunnel&#34;)
 *             .secret(&#34;AQIDBAUGBwgBAgMEBQYHCAECAwQFBgcIAQIDBAUGBwg=&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Argo Tunnels can be imported a composite ID of the account ID and tunnel UUID.
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/argoTunnel:ArgoTunnel example d41d8cd98f00b204e9800998ecf8427e/fd2455cb-5fcc-4c13-8738-8d8d2605237f
 * ```
 * 
 *  where - `d41d8cd98f00b204e9800998ecf8427e` is the account ID - `fd2455cb-5fcc-4c13-8738-8d8d2605237f` is the Argo Tunnel UUID
 * 
 */
@ResourceType(type="cloudflare:index/argoTunnel:ArgoTunnel")
public class ArgoTunnel extends com.pulumi.resources.CustomResource {
    /**
     * The Cloudflare account ID that you wish to manage the Argo Tunnel on.
     * 
     */
    @Export(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    /**
     * @return The Cloudflare account ID that you wish to manage the Argo Tunnel on.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Usable CNAME for accessing the Argo Tunnel.
     * 
     */
    @Export(name="cname", type=String.class, parameters={})
    private Output<String> cname;

    /**
     * @return Usable CNAME for accessing the Argo Tunnel.
     * 
     */
    public Output<String> cname() {
        return this.cname;
    }
    /**
     * A user-friendly name chosen when the tunnel is created. Cannot be empty.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A user-friendly name chosen when the tunnel is created. Cannot be empty.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * 32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel&#39;s password. Anyone wishing to run the tunnel needs this password.
     * 
     */
    @Export(name="secret", type=String.class, parameters={})
    private Output<String> secret;

    /**
     * @return 32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel&#39;s password. Anyone wishing to run the tunnel needs this password.
     * 
     */
    public Output<String> secret() {
        return this.secret;
    }
    /**
     * Token used by a connector to authenticate and run the tunnel.
     * 
     */
    @Export(name="tunnelToken", type=String.class, parameters={})
    private Output<String> tunnelToken;

    /**
     * @return Token used by a connector to authenticate and run the tunnel.
     * 
     */
    public Output<String> tunnelToken() {
        return this.tunnelToken;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ArgoTunnel(String name) {
        this(name, ArgoTunnelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ArgoTunnel(String name, ArgoTunnelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ArgoTunnel(String name, ArgoTunnelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/argoTunnel:ArgoTunnel", name, args == null ? ArgoTunnelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ArgoTunnel(String name, Output<String> id, @Nullable ArgoTunnelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/argoTunnel:ArgoTunnel", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "secret"
            ))
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
    public static ArgoTunnel get(String name, Output<String> id, @Nullable ArgoTunnelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ArgoTunnel(name, id, state, options);
    }
}
