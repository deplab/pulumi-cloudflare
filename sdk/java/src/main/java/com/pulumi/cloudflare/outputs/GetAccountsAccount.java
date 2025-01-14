// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAccountsAccount {
    private @Nullable Boolean enforceTwofactor;
    private @Nullable String id;
    private @Nullable String name;
    private @Nullable String type;

    private GetAccountsAccount() {}
    public Optional<Boolean> enforceTwofactor() {
        return Optional.ofNullable(this.enforceTwofactor);
    }
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountsAccount defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enforceTwofactor;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable String type;
        public Builder() {}
        public Builder(GetAccountsAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enforceTwofactor = defaults.enforceTwofactor;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder enforceTwofactor(@Nullable Boolean enforceTwofactor) {
            this.enforceTwofactor = enforceTwofactor;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public GetAccountsAccount build() {
            final var o = new GetAccountsAccount();
            o.enforceTwofactor = enforceTwofactor;
            o.id = id;
            o.name = name;
            o.type = type;
            return o;
        }
    }
}
