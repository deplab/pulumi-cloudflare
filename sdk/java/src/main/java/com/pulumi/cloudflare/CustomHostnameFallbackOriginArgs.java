// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class CustomHostnameFallbackOriginArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomHostnameFallbackOriginArgs Empty = new CustomHostnameFallbackOriginArgs();

    /**
     * Hostname you intend to fallback requests to. Origin must be a proxied A/AAAA/CNAME DNS record within Clouldflare.
     * 
     */
    @Import(name="origin", required=true)
    private Output<String> origin;

    /**
     * @return Hostname you intend to fallback requests to. Origin must be a proxied A/AAAA/CNAME DNS record within Clouldflare.
     * 
     */
    public Output<String> origin() {
        return this.origin;
    }

    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private CustomHostnameFallbackOriginArgs() {}

    private CustomHostnameFallbackOriginArgs(CustomHostnameFallbackOriginArgs $) {
        this.origin = $.origin;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomHostnameFallbackOriginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomHostnameFallbackOriginArgs $;

        public Builder() {
            $ = new CustomHostnameFallbackOriginArgs();
        }

        public Builder(CustomHostnameFallbackOriginArgs defaults) {
            $ = new CustomHostnameFallbackOriginArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param origin Hostname you intend to fallback requests to. Origin must be a proxied A/AAAA/CNAME DNS record within Clouldflare.
         * 
         * @return builder
         * 
         */
        public Builder origin(Output<String> origin) {
            $.origin = origin;
            return this;
        }

        /**
         * @param origin Hostname you intend to fallback requests to. Origin must be a proxied A/AAAA/CNAME DNS record within Clouldflare.
         * 
         * @return builder
         * 
         */
        public Builder origin(String origin) {
            return origin(Output.of(origin));
        }

        /**
         * @param zoneId The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public CustomHostnameFallbackOriginArgs build() {
            $.origin = Objects.requireNonNull($.origin, "expected parameter 'origin' to be non-null");
            $.zoneId = Objects.requireNonNull($.zoneId, "expected parameter 'zoneId' to be non-null");
            return $;
        }
    }

}
