// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetZoneCacheReserveArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetZoneCacheReserveArgs Empty = new GetZoneCacheReserveArgs();

    /**
     * The zone identifier to target for the resource.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private GetZoneCacheReserveArgs() {}

    private GetZoneCacheReserveArgs(GetZoneCacheReserveArgs $) {
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetZoneCacheReserveArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetZoneCacheReserveArgs $;

        public Builder() {
            $ = new GetZoneCacheReserveArgs();
        }

        public Builder(GetZoneCacheReserveArgs defaults) {
            $ = new GetZoneCacheReserveArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param zoneId The zone identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public GetZoneCacheReserveArgs build() {
            $.zoneId = Objects.requireNonNull($.zoneId, "expected parameter 'zoneId' to be non-null");
            return $;
        }
    }

}
