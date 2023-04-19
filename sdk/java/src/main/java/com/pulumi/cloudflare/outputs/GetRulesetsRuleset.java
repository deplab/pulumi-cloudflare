// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetRulesetsRulesetRule;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRulesetsRuleset {
    private @Nullable String description;
    /**
     * @return The ID of this resource.
     * 
     */
    private String id;
    private String kind;
    private String name;
    private String phase;
    private @Nullable List<GetRulesetsRulesetRule> rules;
    private String version;

    private GetRulesetsRuleset() {}
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The ID of this resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String kind() {
        return this.kind;
    }
    public String name() {
        return this.name;
    }
    public String phase() {
        return this.phase;
    }
    public List<GetRulesetsRulesetRule> rules() {
        return this.rules == null ? List.of() : this.rules;
    }
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesetsRuleset defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private String id;
        private String kind;
        private String name;
        private String phase;
        private @Nullable List<GetRulesetsRulesetRule> rules;
        private String version;
        public Builder() {}
        public Builder(GetRulesetsRuleset defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.phase = defaults.phase;
    	      this.rules = defaults.rules;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder phase(String phase) {
            this.phase = Objects.requireNonNull(phase);
            return this;
        }
        @CustomType.Setter
        public Builder rules(@Nullable List<GetRulesetsRulesetRule> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(GetRulesetsRulesetRule... rules) {
            return rules(List.of(rules));
        }
        @CustomType.Setter
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetRulesetsRuleset build() {
            final var o = new GetRulesetsRuleset();
            o.description = description;
            o.id = id;
            o.kind = kind;
            o.name = name;
            o.phase = phase;
            o.rules = rules;
            o.version = version;
            return o;
        }
    }
}