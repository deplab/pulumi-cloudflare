// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TeamsAccountFips {
    /**
     * @return Only allow FIPS-compliant TLS configuration.
     * 
     */
    private @Nullable Boolean tls;

    private TeamsAccountFips() {}
    /**
     * @return Only allow FIPS-compliant TLS configuration.
     * 
     */
    public Optional<Boolean> tls() {
        return Optional.ofNullable(this.tls);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TeamsAccountFips defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean tls;
        public Builder() {}
        public Builder(TeamsAccountFips defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tls = defaults.tls;
        }

        @CustomType.Setter
        public Builder tls(@Nullable Boolean tls) {
            this.tls = tls;
            return this;
        }
        public TeamsAccountFips build() {
            final var o = new TeamsAccountFips();
            o.tls = tls;
            return o;
        }
    }
}
