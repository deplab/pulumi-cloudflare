// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.EmailRoutingCatchAllArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.EmailRoutingCatchAllState;
import com.pulumi.cloudflare.outputs.EmailRoutingCatchAllAction;
import com.pulumi.cloudflare.outputs.EmailRoutingCatchAllMatcher;
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
 * Provides a resource for managing Email Routing Addresses catch all behaviour.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.EmailRoutingCatchAll;
 * import com.pulumi.cloudflare.EmailRoutingCatchAllArgs;
 * import com.pulumi.cloudflare.inputs.EmailRoutingCatchAllActionArgs;
 * import com.pulumi.cloudflare.inputs.EmailRoutingCatchAllMatcherArgs;
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
 *         var example = new EmailRoutingCatchAll(&#34;example&#34;, EmailRoutingCatchAllArgs.builder()        
 *             .actions(EmailRoutingCatchAllActionArgs.builder()
 *                 .type(&#34;forward&#34;)
 *                 .values(&#34;destinationaddress@example.net&#34;)
 *                 .build())
 *             .enabled(true)
 *             .matchers(EmailRoutingCatchAllMatcherArgs.builder()
 *                 .type(&#34;all&#34;)
 *                 .build())
 *             .name(&#34;example catch all&#34;)
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/emailRoutingCatchAll:EmailRoutingCatchAll")
public class EmailRoutingCatchAll extends com.pulumi.resources.CustomResource {
    /**
     * List actions patterns.
     * 
     */
    @Export(name="actions", refs={List.class,EmailRoutingCatchAllAction.class}, tree="[0,1]")
    private Output<List<EmailRoutingCatchAllAction>> actions;

    /**
     * @return List actions patterns.
     * 
     */
    public Output<List<EmailRoutingCatchAllAction>> actions() {
        return this.actions;
    }
    /**
     * Routing rule status.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Routing rule status.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Matching patterns to forward to your actions.
     * 
     */
    @Export(name="matchers", refs={List.class,EmailRoutingCatchAllMatcher.class}, tree="[0,1]")
    private Output<List<EmailRoutingCatchAllMatcher>> matchers;

    /**
     * @return Matching patterns to forward to your actions.
     * 
     */
    public Output<List<EmailRoutingCatchAllMatcher>> matchers() {
        return this.matchers;
    }
    /**
     * Routing rule name.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Routing rule name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Routing rule identifier.
     * 
     */
    @Export(name="tag", refs={String.class}, tree="[0]")
    private Output<String> tag;

    /**
     * @return Routing rule identifier.
     * 
     */
    public Output<String> tag() {
        return this.tag;
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
    public EmailRoutingCatchAll(String name) {
        this(name, EmailRoutingCatchAllArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EmailRoutingCatchAll(String name, EmailRoutingCatchAllArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EmailRoutingCatchAll(String name, EmailRoutingCatchAllArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/emailRoutingCatchAll:EmailRoutingCatchAll", name, args == null ? EmailRoutingCatchAllArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EmailRoutingCatchAll(String name, Output<String> id, @Nullable EmailRoutingCatchAllState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/emailRoutingCatchAll:EmailRoutingCatchAll", name, state, makeResourceOptions(options, id));
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
    public static EmailRoutingCatchAll get(String name, Output<String> id, @Nullable EmailRoutingCatchAllState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EmailRoutingCatchAll(name, id, state, options);
    }
}
