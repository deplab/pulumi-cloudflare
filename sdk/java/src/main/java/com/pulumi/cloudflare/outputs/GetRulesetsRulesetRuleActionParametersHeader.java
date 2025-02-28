// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRulesetsRulesetRuleActionParametersHeader {
    private @Nullable String expression;
    /**
     * @return Name of the ruleset.
     * 
     */
    private @Nullable String name;
    private @Nullable String operation;
    private @Nullable String value;

    private GetRulesetsRulesetRuleActionParametersHeader() {}
    public Optional<String> expression() {
        return Optional.ofNullable(this.expression);
    }
    /**
     * @return Name of the ruleset.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> operation() {
        return Optional.ofNullable(this.operation);
    }
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesetsRulesetRuleActionParametersHeader defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String expression;
        private @Nullable String name;
        private @Nullable String operation;
        private @Nullable String value;
        public Builder() {}
        public Builder(GetRulesetsRulesetRuleActionParametersHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
    	      this.name = defaults.name;
    	      this.operation = defaults.operation;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder expression(@Nullable String expression) {
            this.expression = expression;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder operation(@Nullable String operation) {
            this.operation = operation;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public GetRulesetsRulesetRuleActionParametersHeader build() {
            final var o = new GetRulesetsRulesetRuleActionParametersHeader();
            o.expression = expression;
            o.name = name;
            o.operation = operation;
            o.value = value;
            return o;
        }
    }
}
