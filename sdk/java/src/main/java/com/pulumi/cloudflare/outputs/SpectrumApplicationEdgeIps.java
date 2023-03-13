// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SpectrumApplicationEdgeIps {
    /**
     * @return The IP versions supported for inbound connections on Spectrum anycast IPs. Required when `type` is not `static`. Available values: `all`, `ipv4`, `ipv6`.
     * 
     */
    private @Nullable String connectivity;
    /**
     * @return The collection of customer owned IPs to broadcast via anycast for this hostname and application. Requires [Bring Your Own IP](https://developers.cloudflare.com/spectrum/getting-started/byoip/) provisioned.
     * 
     */
    private @Nullable List<String> ips;
    /**
     * @return The type of edge IP configuration specified. Available values: `dynamic`, `static`.
     * 
     */
    private String type;

    private SpectrumApplicationEdgeIps() {}
    /**
     * @return The IP versions supported for inbound connections on Spectrum anycast IPs. Required when `type` is not `static`. Available values: `all`, `ipv4`, `ipv6`.
     * 
     */
    public Optional<String> connectivity() {
        return Optional.ofNullable(this.connectivity);
    }
    /**
     * @return The collection of customer owned IPs to broadcast via anycast for this hostname and application. Requires [Bring Your Own IP](https://developers.cloudflare.com/spectrum/getting-started/byoip/) provisioned.
     * 
     */
    public List<String> ips() {
        return this.ips == null ? List.of() : this.ips;
    }
    /**
     * @return The type of edge IP configuration specified. Available values: `dynamic`, `static`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpectrumApplicationEdgeIps defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String connectivity;
        private @Nullable List<String> ips;
        private String type;
        public Builder() {}
        public Builder(SpectrumApplicationEdgeIps defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectivity = defaults.connectivity;
    	      this.ips = defaults.ips;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder connectivity(@Nullable String connectivity) {
            this.connectivity = connectivity;
            return this;
        }
        @CustomType.Setter
        public Builder ips(@Nullable List<String> ips) {
            this.ips = ips;
            return this;
        }
        public Builder ips(String... ips) {
            return ips(List.of(ips));
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public SpectrumApplicationEdgeIps build() {
            final var o = new SpectrumApplicationEdgeIps();
            o.connectivity = connectivity;
            o.ips = ips;
            o.type = type;
            return o;
        }
    }
}
