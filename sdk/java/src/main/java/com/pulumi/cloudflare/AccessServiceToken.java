// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.AccessServiceTokenArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.AccessServiceTokenState;
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
 * Access Service Tokens are used for service-to-service communication
 * when an application is behind Cloudflare Access.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.AccessServiceToken;
 * import com.pulumi.cloudflare.AccessServiceTokenArgs;
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
 *         var myApp = new AccessServiceToken(&#34;myApp&#34;, AccessServiceTokenArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .minDaysForRenewal(30)
 *             .name(&#34;CI/CD app renewed&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * If you are importing an Access Service Token you will not have the client_secret available in the state for use. The client_secret is only available once, at creation. In most cases, it is better to just create a new resource should you need to reference it in other resources.
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/accessServiceToken:AccessServiceToken example &lt;account_id&gt;/&lt;service_token_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/accessServiceToken:AccessServiceToken")
public class AccessServiceToken extends com.pulumi.resources.CustomResource {
    /**
     * The account identifier to target for the resource. Conflicts with `zone_id`.
     * 
     */
    @Export(name="accountId", type=String.class, parameters={})
    private Output</* @Nullable */ String> accountId;

    /**
     * @return The account identifier to target for the resource. Conflicts with `zone_id`.
     * 
     */
    public Output<Optional<String>> accountId() {
        return Codegen.optional(this.accountId);
    }
    /**
     * UUID client ID associated with the Service Token.
     * 
     */
    @Export(name="clientId", type=String.class, parameters={})
    private Output<String> clientId;

    /**
     * @return UUID client ID associated with the Service Token.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }
    /**
     * A secret for interacting with Access protocols.
     * 
     */
    @Export(name="clientSecret", type=String.class, parameters={})
    private Output<String> clientSecret;

    /**
     * @return A secret for interacting with Access protocols.
     * 
     */
    public Output<String> clientSecret() {
        return this.clientSecret;
    }
    /**
     * Date when the token expires.
     * 
     */
    @Export(name="expiresAt", type=String.class, parameters={})
    private Output<String> expiresAt;

    /**
     * @return Date when the token expires.
     * 
     */
    public Output<String> expiresAt() {
        return this.expiresAt;
    }
    /**
     * Refresh the token if terraform is run within the specified amount of days before expiration
     * 
     */
    @Export(name="minDaysForRenewal", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minDaysForRenewal;

    /**
     * @return Refresh the token if terraform is run within the specified amount of days before expiration
     * 
     */
    public Output<Optional<Integer>> minDaysForRenewal() {
        return Codegen.optional(this.minDaysForRenewal);
    }
    /**
     * Friendly name of the token&#39;s intent.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Friendly name of the token&#39;s intent.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The zone identifier to target for the resource. Conflicts with `account_id`.
     * 
     */
    @Export(name="zoneId", type=String.class, parameters={})
    private Output</* @Nullable */ String> zoneId;

    /**
     * @return The zone identifier to target for the resource. Conflicts with `account_id`.
     * 
     */
    public Output<Optional<String>> zoneId() {
        return Codegen.optional(this.zoneId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessServiceToken(String name) {
        this(name, AccessServiceTokenArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessServiceToken(String name, AccessServiceTokenArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessServiceToken(String name, AccessServiceTokenArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/accessServiceToken:AccessServiceToken", name, args == null ? AccessServiceTokenArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccessServiceToken(String name, Output<String> id, @Nullable AccessServiceTokenState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/accessServiceToken:AccessServiceToken", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "clientSecret"
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
    public static AccessServiceToken get(String name, Output<String> id, @Nullable AccessServiceTokenState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccessServiceToken(name, id, state, options);
    }
}
