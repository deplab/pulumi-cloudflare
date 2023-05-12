// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PageRuleActionsCacheKeyFieldsUser {
    /**
     * @return `true` - classifies a request as “mobile”, “desktop”, or “tablet” based on the User Agent; defaults to `false`.
     * 
     */
    private @Nullable Boolean deviceType;
    /**
     * @return `true` - includes the client’s country, derived from the IP address; defaults to `false`.
     * 
     */
    private @Nullable Boolean geo;
    /**
     * @return `true` - includes the first language code contained in the `Accept-Language` header sent by the client; defaults to `false`.
     * 
     * Example:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.cloudflare.PageRule;
     * import com.pulumi.cloudflare.PageRuleArgs;
     * import com.pulumi.cloudflare.inputs.PageRuleActionsArgs;
     * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsArgs;
     * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsCookieArgs;
     * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsHeaderArgs;
     * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsHostArgs;
     * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsQueryStringArgs;
     * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsUserArgs;
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
     *         var foobar = new PageRule(&#34;foobar&#34;, PageRuleArgs.builder()        
     *             .zoneId(var_.cloudflare_zone_id())
     *             .target(String.format(&#34;%s/app/*&#34;, var_.cloudflare_zone()))
     *             .priority(1)
     *             .actions(PageRuleActionsArgs.builder()
     *                 .cacheKeyFields(PageRuleActionsCacheKeyFieldsArgs.builder()
     *                     .cookie(PageRuleActionsCacheKeyFieldsCookieArgs.builder()
     *                         .checkPresences(&#34;wordpress_test_cookie&#34;)
     *                         .build())
     *                     .header(PageRuleActionsCacheKeyFieldsHeaderArgs.builder()
     *                         .checkPresences(&#34;header_present&#34;)
     *                         .excludes(&#34;origin&#34;)
     *                         .includes(                        
     *                             &#34;api-key&#34;,
     *                             &#34;dnt&#34;)
     *                         .build())
     *                     .host(PageRuleActionsCacheKeyFieldsHostArgs.builder()
     *                         .resolved(true)
     *                         .build())
     *                     .queryString(PageRuleActionsCacheKeyFieldsQueryStringArgs.builder()
     *                         .ignore(true)
     *                         .build())
     *                     .user(PageRuleActionsCacheKeyFieldsUserArgs.builder()
     *                         .deviceType(false)
     *                         .geo(true)
     *                         .lang(true)
     *                         .build())
     *                     .build())
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    private @Nullable Boolean lang;

    private PageRuleActionsCacheKeyFieldsUser() {}
    /**
     * @return `true` - classifies a request as “mobile”, “desktop”, or “tablet” based on the User Agent; defaults to `false`.
     * 
     */
    public Optional<Boolean> deviceType() {
        return Optional.ofNullable(this.deviceType);
    }
    /**
     * @return `true` - includes the client’s country, derived from the IP address; defaults to `false`.
     * 
     */
    public Optional<Boolean> geo() {
        return Optional.ofNullable(this.geo);
    }
    /**
     * @return `true` - includes the first language code contained in the `Accept-Language` header sent by the client; defaults to `false`.
     * 
     * Example:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.cloudflare.PageRule;
     * import com.pulumi.cloudflare.PageRuleArgs;
     * import com.pulumi.cloudflare.inputs.PageRuleActionsArgs;
     * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsArgs;
     * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsCookieArgs;
     * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsHeaderArgs;
     * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsHostArgs;
     * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsQueryStringArgs;
     * import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsUserArgs;
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
     *         var foobar = new PageRule(&#34;foobar&#34;, PageRuleArgs.builder()        
     *             .zoneId(var_.cloudflare_zone_id())
     *             .target(String.format(&#34;%s/app/*&#34;, var_.cloudflare_zone()))
     *             .priority(1)
     *             .actions(PageRuleActionsArgs.builder()
     *                 .cacheKeyFields(PageRuleActionsCacheKeyFieldsArgs.builder()
     *                     .cookie(PageRuleActionsCacheKeyFieldsCookieArgs.builder()
     *                         .checkPresences(&#34;wordpress_test_cookie&#34;)
     *                         .build())
     *                     .header(PageRuleActionsCacheKeyFieldsHeaderArgs.builder()
     *                         .checkPresences(&#34;header_present&#34;)
     *                         .excludes(&#34;origin&#34;)
     *                         .includes(                        
     *                             &#34;api-key&#34;,
     *                             &#34;dnt&#34;)
     *                         .build())
     *                     .host(PageRuleActionsCacheKeyFieldsHostArgs.builder()
     *                         .resolved(true)
     *                         .build())
     *                     .queryString(PageRuleActionsCacheKeyFieldsQueryStringArgs.builder()
     *                         .ignore(true)
     *                         .build())
     *                     .user(PageRuleActionsCacheKeyFieldsUserArgs.builder()
     *                         .deviceType(false)
     *                         .geo(true)
     *                         .lang(true)
     *                         .build())
     *                     .build())
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public Optional<Boolean> lang() {
        return Optional.ofNullable(this.lang);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PageRuleActionsCacheKeyFieldsUser defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean deviceType;
        private @Nullable Boolean geo;
        private @Nullable Boolean lang;
        public Builder() {}
        public Builder(PageRuleActionsCacheKeyFieldsUser defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceType = defaults.deviceType;
    	      this.geo = defaults.geo;
    	      this.lang = defaults.lang;
        }

        @CustomType.Setter
        public Builder deviceType(@Nullable Boolean deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        @CustomType.Setter
        public Builder geo(@Nullable Boolean geo) {
            this.geo = geo;
            return this;
        }
        @CustomType.Setter
        public Builder lang(@Nullable Boolean lang) {
            this.lang = lang;
            return this;
        }
        public PageRuleActionsCacheKeyFieldsUser build() {
            final var o = new PageRuleActionsCacheKeyFieldsUser();
            o.deviceType = deviceType;
            o.geo = geo;
            o.lang = lang;
            return o;
        }
    }
}
