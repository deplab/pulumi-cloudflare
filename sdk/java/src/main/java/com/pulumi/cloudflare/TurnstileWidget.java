// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.TurnstileWidgetArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.TurnstileWidgetState;
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
 * The [Challenge Widget](https://developers.cloudflare.com/turnstile/) resource allows you to manage Cloudflare Turnstile Widgets.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.TurnstileWidget;
 * import com.pulumi.cloudflare.TurnstileWidgetArgs;
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
 *         var example = new TurnstileWidget(&#34;example&#34;, TurnstileWidgetArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .botFightMode(false)
 *             .domains(&#34;example.com&#34;)
 *             .mode(&#34;invisible&#34;)
 *             .name(&#34;example widget&#34;)
 *             .region(&#34;world&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/turnstileWidget:TurnstileWidget")
public class TurnstileWidget extends com.pulumi.resources.CustomResource {
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
     * If bot*fight*mode is set to true, Cloudflare issues computationally expensive challenges in response to malicious bots (Enterprise only).
     * 
     */
    @Export(name="botFightMode", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> botFightMode;

    /**
     * @return If bot*fight*mode is set to true, Cloudflare issues computationally expensive challenges in response to malicious bots (Enterprise only).
     * 
     */
    public Output<Optional<Boolean>> botFightMode() {
        return Codegen.optional(this.botFightMode);
    }
    /**
     * Domains where the widget is deployed
     * 
     */
    @Export(name="domains", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> domains;

    /**
     * @return Domains where the widget is deployed
     * 
     */
    public Output<List<String>> domains() {
        return this.domains;
    }
    /**
     * Widget Mode
     * 
     */
    @Export(name="mode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> mode;

    /**
     * @return Widget Mode
     * 
     */
    public Output<Optional<String>> mode() {
        return Codegen.optional(this.mode);
    }
    /**
     * Human readable widget name.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Human readable widget name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Do not show any Cloudflare branding on the widget (Enterprise only).
     * 
     */
    @Export(name="offlabel", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> offlabel;

    /**
     * @return Do not show any Cloudflare branding on the widget (Enterprise only).
     * 
     */
    public Output<Boolean> offlabel() {
        return this.offlabel;
    }
    /**
     * Region where this widget can be used.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> region;

    /**
     * @return Region where this widget can be used.
     * 
     */
    public Output<Optional<String>> region() {
        return Codegen.optional(this.region);
    }
    /**
     * Secret key for this widget.
     * 
     */
    @Export(name="secret", refs={String.class}, tree="[0]")
    private Output<String> secret;

    /**
     * @return Secret key for this widget.
     * 
     */
    public Output<String> secret() {
        return this.secret;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TurnstileWidget(String name) {
        this(name, TurnstileWidgetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TurnstileWidget(String name, TurnstileWidgetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TurnstileWidget(String name, TurnstileWidgetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/turnstileWidget:TurnstileWidget", name, args == null ? TurnstileWidgetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TurnstileWidget(String name, Output<String> id, @Nullable TurnstileWidgetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/turnstileWidget:TurnstileWidget", name, state, makeResourceOptions(options, id));
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
    public static TurnstileWidget get(String name, Output<String> id, @Nullable TurnstileWidgetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TurnstileWidget(name, id, state, options);
    }
}
