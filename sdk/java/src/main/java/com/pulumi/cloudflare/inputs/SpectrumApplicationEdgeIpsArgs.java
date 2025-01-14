// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpectrumApplicationEdgeIpsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpectrumApplicationEdgeIpsArgs Empty = new SpectrumApplicationEdgeIpsArgs();

    /**
     * The IP versions supported for inbound connections on Spectrum anycast IPs. Required when `type` is not `static`. Available values: `all`, `ipv4`, `ipv6`.
     * 
     */
    @Import(name="connectivity")
    private @Nullable Output<String> connectivity;

    /**
     * @return The IP versions supported for inbound connections on Spectrum anycast IPs. Required when `type` is not `static`. Available values: `all`, `ipv4`, `ipv6`.
     * 
     */
    public Optional<Output<String>> connectivity() {
        return Optional.ofNullable(this.connectivity);
    }

    /**
     * The collection of customer owned IPs to broadcast via anycast for this hostname and application. Requires [Bring Your Own IP](https://developers.cloudflare.com/spectrum/getting-started/byoip/) provisioned.
     * 
     */
    @Import(name="ips")
    private @Nullable Output<List<String>> ips;

    /**
     * @return The collection of customer owned IPs to broadcast via anycast for this hostname and application. Requires [Bring Your Own IP](https://developers.cloudflare.com/spectrum/getting-started/byoip/) provisioned.
     * 
     */
    public Optional<Output<List<String>>> ips() {
        return Optional.ofNullable(this.ips);
    }

    /**
     * The type of edge IP configuration specified. Available values: `dynamic`, `static`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of edge IP configuration specified. Available values: `dynamic`, `static`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private SpectrumApplicationEdgeIpsArgs() {}

    private SpectrumApplicationEdgeIpsArgs(SpectrumApplicationEdgeIpsArgs $) {
        this.connectivity = $.connectivity;
        this.ips = $.ips;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpectrumApplicationEdgeIpsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpectrumApplicationEdgeIpsArgs $;

        public Builder() {
            $ = new SpectrumApplicationEdgeIpsArgs();
        }

        public Builder(SpectrumApplicationEdgeIpsArgs defaults) {
            $ = new SpectrumApplicationEdgeIpsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectivity The IP versions supported for inbound connections on Spectrum anycast IPs. Required when `type` is not `static`. Available values: `all`, `ipv4`, `ipv6`.
         * 
         * @return builder
         * 
         */
        public Builder connectivity(@Nullable Output<String> connectivity) {
            $.connectivity = connectivity;
            return this;
        }

        /**
         * @param connectivity The IP versions supported for inbound connections on Spectrum anycast IPs. Required when `type` is not `static`. Available values: `all`, `ipv4`, `ipv6`.
         * 
         * @return builder
         * 
         */
        public Builder connectivity(String connectivity) {
            return connectivity(Output.of(connectivity));
        }

        /**
         * @param ips The collection of customer owned IPs to broadcast via anycast for this hostname and application. Requires [Bring Your Own IP](https://developers.cloudflare.com/spectrum/getting-started/byoip/) provisioned.
         * 
         * @return builder
         * 
         */
        public Builder ips(@Nullable Output<List<String>> ips) {
            $.ips = ips;
            return this;
        }

        /**
         * @param ips The collection of customer owned IPs to broadcast via anycast for this hostname and application. Requires [Bring Your Own IP](https://developers.cloudflare.com/spectrum/getting-started/byoip/) provisioned.
         * 
         * @return builder
         * 
         */
        public Builder ips(List<String> ips) {
            return ips(Output.of(ips));
        }

        /**
         * @param ips The collection of customer owned IPs to broadcast via anycast for this hostname and application. Requires [Bring Your Own IP](https://developers.cloudflare.com/spectrum/getting-started/byoip/) provisioned.
         * 
         * @return builder
         * 
         */
        public Builder ips(String... ips) {
            return ips(List.of(ips));
        }

        /**
         * @param type The type of edge IP configuration specified. Available values: `dynamic`, `static`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of edge IP configuration specified. Available values: `dynamic`, `static`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public SpectrumApplicationEdgeIpsArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
