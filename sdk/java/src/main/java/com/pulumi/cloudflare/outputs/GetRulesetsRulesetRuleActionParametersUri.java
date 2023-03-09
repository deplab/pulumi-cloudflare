// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetRulesetsRulesetRuleActionParametersUriPath;
import com.pulumi.cloudflare.outputs.GetRulesetsRulesetRuleActionParametersUriQuery;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRulesetsRulesetRuleActionParametersUri {
    private @Nullable Boolean origin;
    private @Nullable GetRulesetsRulesetRuleActionParametersUriPath path;
    private @Nullable GetRulesetsRulesetRuleActionParametersUriQuery query;

    private GetRulesetsRulesetRuleActionParametersUri() {}
    public Optional<Boolean> origin() {
        return Optional.ofNullable(this.origin);
    }
    public Optional<GetRulesetsRulesetRuleActionParametersUriPath> path() {
        return Optional.ofNullable(this.path);
    }
    public Optional<GetRulesetsRulesetRuleActionParametersUriQuery> query() {
        return Optional.ofNullable(this.query);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesetsRulesetRuleActionParametersUri defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean origin;
        private @Nullable GetRulesetsRulesetRuleActionParametersUriPath path;
        private @Nullable GetRulesetsRulesetRuleActionParametersUriQuery query;
        public Builder() {}
        public Builder(GetRulesetsRulesetRuleActionParametersUri defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.origin = defaults.origin;
    	      this.path = defaults.path;
    	      this.query = defaults.query;
        }

        @CustomType.Setter
        public Builder origin(@Nullable Boolean origin) {
            this.origin = origin;
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable GetRulesetsRulesetRuleActionParametersUriPath path) {
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder query(@Nullable GetRulesetsRulesetRuleActionParametersUriQuery query) {
            this.query = query;
            return this;
        }
        public GetRulesetsRulesetRuleActionParametersUri build() {
            final var o = new GetRulesetsRulesetRuleActionParametersUri();
            o.origin = origin;
            o.path = path;
            o.query = query;
            return o;
        }
    }
}
