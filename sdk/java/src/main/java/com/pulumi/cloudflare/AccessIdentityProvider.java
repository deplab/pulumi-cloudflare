// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.AccessIdentityProviderArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.AccessIdentityProviderState;
import com.pulumi.cloudflare.outputs.AccessIdentityProviderConfig;
import com.pulumi.cloudflare.outputs.AccessIdentityProviderScimConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare Access Identity Provider resource. Identity
 * Providers are used as an authentication or authorisation source
 * within Access.
 * 
 * &gt; It&#39;s required that an `account_id` or `zone_id` is provided and in
 * most cases using either is fine. However, if you&#39;re using a scoped
 * access token, you must provide the argument that matches the token&#39;s
 * scope. For example, an access token that is scoped to the &#34;example.com&#34;
 * zone needs to use the `zone_id` argument.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.AccessIdentityProvider;
 * import com.pulumi.cloudflare.AccessIdentityProviderArgs;
 * import com.pulumi.cloudflare.inputs.AccessIdentityProviderConfigArgs;
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
 *         var pinLogin = new AccessIdentityProvider(&#34;pinLogin&#34;, AccessIdentityProviderArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .name(&#34;PIN login&#34;)
 *             .type(&#34;onetimepin&#34;)
 *             .build());
 * 
 *         var githubOauth = new AccessIdentityProvider(&#34;githubOauth&#34;, AccessIdentityProviderArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .configs(AccessIdentityProviderConfigArgs.builder()
 *                 .clientId(&#34;example&#34;)
 *                 .clientSecret(&#34;secret_key&#34;)
 *                 .build())
 *             .name(&#34;GitHub OAuth&#34;)
 *             .type(&#34;github&#34;)
 *             .build());
 * 
 *         var jumpcloudSaml = new AccessIdentityProvider(&#34;jumpcloudSaml&#34;, AccessIdentityProviderArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .configs(AccessIdentityProviderConfigArgs.builder()
 *                 .attributes(                
 *                     &#34;email&#34;,
 *                     &#34;username&#34;)
 *                 .idpPublicCert(&#34;&#34;&#34;
 * MIIDpDCCAoygAwIBAgIGAV2ka+55MA0GCSqGSIb3DQEBCwUAMIGSMQswCQ...GF/Q2/MHadws97cZg
 * uTnQyuOqPuHbnN83d/2l1NSYKCbHt24o
 *                 &#34;&#34;&#34;)
 *                 .issuerUrl(&#34;jumpcloud&#34;)
 *                 .signRequest(false)
 *                 .ssoTargetUrl(&#34;https://sso.myexample.jumpcloud.com/saml2/cloudflareaccess&#34;)
 *                 .build())
 *             .name(&#34;JumpCloud SAML&#34;)
 *             .type(&#34;saml&#34;)
 *             .build());
 * 
 *         var okta = new AccessIdentityProvider(&#34;okta&#34;, AccessIdentityProviderArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .configs(AccessIdentityProviderConfigArgs.builder()
 *                 .apiToken(&#34;okta_api_token&#34;)
 *                 .clientId(&#34;example&#34;)
 *                 .clientSecret(&#34;secret_key&#34;)
 *                 .oktaAccount(&#34;https://example.com&#34;)
 *                 .build())
 *             .name(&#34;Okta&#34;)
 *             .type(&#34;okta&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/accessIdentityProvider:AccessIdentityProvider example &lt;account_id&gt;/&lt;identity_provider_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/accessIdentityProvider:AccessIdentityProvider")
public class AccessIdentityProvider extends com.pulumi.resources.CustomResource {
    /**
     * The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> accountId;

    /**
     * @return The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<Optional<String>> accountId() {
        return Codegen.optional(this.accountId);
    }
    /**
     * Provider configuration from the [developer documentation](https://developers.cloudflare.com/access/configuring-identity-providers/).
     * 
     */
    @Export(name="configs", refs={List.class,AccessIdentityProviderConfig.class}, tree="[0,1]")
    private Output<List<AccessIdentityProviderConfig>> configs;

    /**
     * @return Provider configuration from the [developer documentation](https://developers.cloudflare.com/access/configuring-identity-providers/).
     * 
     */
    public Output<List<AccessIdentityProviderConfig>> configs() {
        return this.configs;
    }
    /**
     * Friendly name of the Access Identity Provider configuration.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Friendly name of the Access Identity Provider configuration.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Configuration for SCIM settings for a given IDP.
     * 
     */
    @Export(name="scimConfigs", refs={List.class,AccessIdentityProviderScimConfig.class}, tree="[0,1]")
    private Output<List<AccessIdentityProviderScimConfig>> scimConfigs;

    /**
     * @return Configuration for SCIM settings for a given IDP.
     * 
     */
    public Output<List<AccessIdentityProviderScimConfig>> scimConfigs() {
        return this.scimConfigs;
    }
    /**
     * The provider type to use. Available values: `azureAD`, `centrify`, `facebook`, `github`, `google`, `google-apps`, `linkedin`, `oidc`, `okta`, `onelogin`, `onetimepin`, `pingone`, `saml`, `yandex`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The provider type to use. Available values: `azureAD`, `centrify`, `facebook`, `github`, `google`, `google-apps`, `linkedin`, `oidc`, `okta`, `onelogin`, `onetimepin`, `pingone`, `saml`, `yandex`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The zone identifier to target for the resource. Conflicts with `account_id`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> zoneId;

    /**
     * @return The zone identifier to target for the resource. Conflicts with `account_id`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<Optional<String>> zoneId() {
        return Codegen.optional(this.zoneId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessIdentityProvider(String name) {
        this(name, AccessIdentityProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessIdentityProvider(String name, AccessIdentityProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessIdentityProvider(String name, AccessIdentityProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/accessIdentityProvider:AccessIdentityProvider", name, args == null ? AccessIdentityProviderArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccessIdentityProvider(String name, Output<String> id, @Nullable AccessIdentityProviderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/accessIdentityProvider:AccessIdentityProvider", name, state, makeResourceOptions(options, id));
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
    public static AccessIdentityProvider get(String name, Output<String> id, @Nullable AccessIdentityProviderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccessIdentityProvider(name, id, state, options);
    }
}
