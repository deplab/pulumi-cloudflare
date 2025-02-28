// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeviceDexTestData {
    /**
     * @return The host URL for `http` test `kind`. For `traceroute`, it must be a valid hostname or IP address.
     * 
     */
    private String host;
    /**
     * @return The type of Device Dex Test. Available values: `http`, `traceroute`.
     * 
     */
    private String kind;
    /**
     * @return The http request method. Available values: `GET`.
     * 
     */
    private @Nullable String method;

    private DeviceDexTestData() {}
    /**
     * @return The host URL for `http` test `kind`. For `traceroute`, it must be a valid hostname or IP address.
     * 
     */
    public String host() {
        return this.host;
    }
    /**
     * @return The type of Device Dex Test. Available values: `http`, `traceroute`.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The http request method. Available values: `GET`.
     * 
     */
    public Optional<String> method() {
        return Optional.ofNullable(this.method);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceDexTestData defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String host;
        private String kind;
        private @Nullable String method;
        public Builder() {}
        public Builder(DeviceDexTestData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.kind = defaults.kind;
    	      this.method = defaults.method;
        }

        @CustomType.Setter
        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        @CustomType.Setter
        public Builder method(@Nullable String method) {
            this.method = method;
            return this;
        }
        public DeviceDexTestData build() {
            final var o = new DeviceDexTestData();
            o.host = host;
            o.kind = kind;
            o.method = method;
            return o;
        }
    }
}
