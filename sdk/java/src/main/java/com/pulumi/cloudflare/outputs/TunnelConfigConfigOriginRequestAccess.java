// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TunnelConfigConfigOriginRequestAccess {
    private @Nullable List<String> audTags;
    private @Nullable Boolean required;
    private @Nullable String teamName;

    private TunnelConfigConfigOriginRequestAccess() {}
    public List<String> audTags() {
        return this.audTags == null ? List.of() : this.audTags;
    }
    public Optional<Boolean> required() {
        return Optional.ofNullable(this.required);
    }
    public Optional<String> teamName() {
        return Optional.ofNullable(this.teamName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TunnelConfigConfigOriginRequestAccess defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> audTags;
        private @Nullable Boolean required;
        private @Nullable String teamName;
        public Builder() {}
        public Builder(TunnelConfigConfigOriginRequestAccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audTags = defaults.audTags;
    	      this.required = defaults.required;
    	      this.teamName = defaults.teamName;
        }

        @CustomType.Setter
        public Builder audTags(@Nullable List<String> audTags) {
            this.audTags = audTags;
            return this;
        }
        public Builder audTags(String... audTags) {
            return audTags(List.of(audTags));
        }
        @CustomType.Setter
        public Builder required(@Nullable Boolean required) {
            this.required = required;
            return this;
        }
        @CustomType.Setter
        public Builder teamName(@Nullable String teamName) {
            this.teamName = teamName;
            return this;
        }
        public TunnelConfigConfigOriginRequestAccess build() {
            final var o = new TunnelConfigConfigOriginRequestAccess();
            o.audTags = audTags;
            o.required = required;
            o.teamName = teamName;
            return o;
        }
    }
}
