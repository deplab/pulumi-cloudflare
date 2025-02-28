// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.NotificationPolicyWebhooksArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.NotificationPolicyWebhooksState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource, that manages a webhook destination. These destinations can be tied to the notification policies created for Cloudflare&#39;s products.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.NotificationPolicyWebhooks;
 * import com.pulumi.cloudflare.NotificationPolicyWebhooksArgs;
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
 *         var example = new NotificationPolicyWebhooks(&#34;example&#34;, NotificationPolicyWebhooksArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .name(&#34;Webhooks destination&#34;)
 *             .secret(&#34;my-secret&#34;)
 *             .url(&#34;https://example.com&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/notificationPolicyWebhooks:NotificationPolicyWebhooks example &lt;account_id&gt;/&lt;notification_webhook_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/notificationPolicyWebhooks:NotificationPolicyWebhooks")
public class NotificationPolicyWebhooks extends com.pulumi.resources.CustomResource {
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
     * Timestamp of when the notification webhook was created.
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return Timestamp of when the notification webhook was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Timestamp of when the notification webhook last faiuled.
     * 
     */
    @Export(name="lastFailure", refs={String.class}, tree="[0]")
    private Output<String> lastFailure;

    /**
     * @return Timestamp of when the notification webhook last faiuled.
     * 
     */
    public Output<String> lastFailure() {
        return this.lastFailure;
    }
    /**
     * Timestamp of when the notification webhook was last successful.
     * 
     */
    @Export(name="lastSuccess", refs={String.class}, tree="[0]")
    private Output<String> lastSuccess;

    /**
     * @return Timestamp of when the notification webhook was last successful.
     * 
     */
    public Output<String> lastSuccess() {
        return this.lastSuccess;
    }
    /**
     * The name of the webhook destination.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the webhook destination.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * An optional secret can be provided that will be passed in the `cf-webhook-auth` header when dispatching a webhook notification. Secrets are not returned in any API response body. Refer to the [documentation](https://api.cloudflare.com/#notification-webhooks-create-webhook) for more details.
     * 
     */
    @Export(name="secret", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> secret;

    /**
     * @return An optional secret can be provided that will be passed in the `cf-webhook-auth` header when dispatching a webhook notification. Secrets are not returned in any API response body. Refer to the [documentation](https://api.cloudflare.com/#notification-webhooks-create-webhook) for more details.
     * 
     */
    public Output<Optional<String>> secret() {
        return Codegen.optional(this.secret);
    }
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }
    /**
     * The URL of the webhook destinations. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="url", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> url;

    /**
     * @return The URL of the webhook destinations. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<Optional<String>> url() {
        return Codegen.optional(this.url);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NotificationPolicyWebhooks(String name) {
        this(name, NotificationPolicyWebhooksArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NotificationPolicyWebhooks(String name, NotificationPolicyWebhooksArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NotificationPolicyWebhooks(String name, NotificationPolicyWebhooksArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/notificationPolicyWebhooks:NotificationPolicyWebhooks", name, args == null ? NotificationPolicyWebhooksArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NotificationPolicyWebhooks(String name, Output<String> id, @Nullable NotificationPolicyWebhooksState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/notificationPolicyWebhooks:NotificationPolicyWebhooks", name, state, makeResourceOptions(options, id));
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
    public static NotificationPolicyWebhooks get(String name, Output<String> id, @Nullable NotificationPolicyWebhooksState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NotificationPolicyWebhooks(name, id, state, options);
    }
}
