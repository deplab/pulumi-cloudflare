// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RulesetRuleActionParametersBrowserTtl {
    /**
     * @return Default browser TTL. This value is required when override_origin is set
     * 
     */
    private @Nullable Integer default_;
    /**
     * @return Mode of the browser TTL. Available values: `override_origin`, `respect_origin`, `bypass`
     * 
     */
    private String mode;

    private RulesetRuleActionParametersBrowserTtl() {}
    /**
     * @return Default browser TTL. This value is required when override_origin is set
     * 
     */
    public Optional<Integer> default_() {
        return Optional.ofNullable(this.default_);
    }
    /**
     * @return Mode of the browser TTL. Available values: `override_origin`, `respect_origin`, `bypass`
     * 
     */
    public String mode() {
        return this.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetRuleActionParametersBrowserTtl defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer default_;
        private String mode;
        public Builder() {}
        public Builder(RulesetRuleActionParametersBrowserTtl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.default_ = defaults.default_;
    	      this.mode = defaults.mode;
        }

        @CustomType.Setter("default")
        public Builder default_(@Nullable Integer default_) {
            this.default_ = default_;
            return this;
        }
        @CustomType.Setter
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public RulesetRuleActionParametersBrowserTtl build() {
            final var o = new RulesetRuleActionParametersBrowserTtl();
            o.default_ = default_;
            o.mode = mode;
            return o;
        }
    }
}
