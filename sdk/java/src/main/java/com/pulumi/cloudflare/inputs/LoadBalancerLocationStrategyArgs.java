// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerLocationStrategyArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerLocationStrategyArgs Empty = new LoadBalancerLocationStrategyArgs();

    /**
     * Determines the authoritative location when ECS is not preferred, does not exist in the request, or its GeoIP lookup is unsuccessful. Value `pop` will use the Cloudflare PoP location. Value `resolver_ip` will use the DNS resolver GeoIP location. If the GeoIP lookup is unsuccessful, it will use the Cloudflare PoP location. Available values: `pop`, `resolver_ip`. Defaults to `pop`.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return Determines the authoritative location when ECS is not preferred, does not exist in the request, or its GeoIP lookup is unsuccessful. Value `pop` will use the Cloudflare PoP location. Value `resolver_ip` will use the DNS resolver GeoIP location. If the GeoIP lookup is unsuccessful, it will use the Cloudflare PoP location. Available values: `pop`, `resolver_ip`. Defaults to `pop`.
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * Whether the EDNS Client Subnet (ECS) GeoIP should be preferred as the authoritative location. Value `always` will always prefer ECS, `never` will never prefer ECS, `proximity` will prefer ECS only when `steering_policy=&#34;proximity&#34;`, and `geo` will prefer ECS only when `steering_policy=&#34;geo&#34;`. Available values: `always`, `never`, `proximity`, `geo`. Defaults to `proximity`.
     * 
     */
    @Import(name="preferEcs")
    private @Nullable Output<String> preferEcs;

    /**
     * @return Whether the EDNS Client Subnet (ECS) GeoIP should be preferred as the authoritative location. Value `always` will always prefer ECS, `never` will never prefer ECS, `proximity` will prefer ECS only when `steering_policy=&#34;proximity&#34;`, and `geo` will prefer ECS only when `steering_policy=&#34;geo&#34;`. Available values: `always`, `never`, `proximity`, `geo`. Defaults to `proximity`.
     * 
     */
    public Optional<Output<String>> preferEcs() {
        return Optional.ofNullable(this.preferEcs);
    }

    private LoadBalancerLocationStrategyArgs() {}

    private LoadBalancerLocationStrategyArgs(LoadBalancerLocationStrategyArgs $) {
        this.mode = $.mode;
        this.preferEcs = $.preferEcs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerLocationStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerLocationStrategyArgs $;

        public Builder() {
            $ = new LoadBalancerLocationStrategyArgs();
        }

        public Builder(LoadBalancerLocationStrategyArgs defaults) {
            $ = new LoadBalancerLocationStrategyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mode Determines the authoritative location when ECS is not preferred, does not exist in the request, or its GeoIP lookup is unsuccessful. Value `pop` will use the Cloudflare PoP location. Value `resolver_ip` will use the DNS resolver GeoIP location. If the GeoIP lookup is unsuccessful, it will use the Cloudflare PoP location. Available values: `pop`, `resolver_ip`. Defaults to `pop`.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode Determines the authoritative location when ECS is not preferred, does not exist in the request, or its GeoIP lookup is unsuccessful. Value `pop` will use the Cloudflare PoP location. Value `resolver_ip` will use the DNS resolver GeoIP location. If the GeoIP lookup is unsuccessful, it will use the Cloudflare PoP location. Available values: `pop`, `resolver_ip`. Defaults to `pop`.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param preferEcs Whether the EDNS Client Subnet (ECS) GeoIP should be preferred as the authoritative location. Value `always` will always prefer ECS, `never` will never prefer ECS, `proximity` will prefer ECS only when `steering_policy=&#34;proximity&#34;`, and `geo` will prefer ECS only when `steering_policy=&#34;geo&#34;`. Available values: `always`, `never`, `proximity`, `geo`. Defaults to `proximity`.
         * 
         * @return builder
         * 
         */
        public Builder preferEcs(@Nullable Output<String> preferEcs) {
            $.preferEcs = preferEcs;
            return this;
        }

        /**
         * @param preferEcs Whether the EDNS Client Subnet (ECS) GeoIP should be preferred as the authoritative location. Value `always` will always prefer ECS, `never` will never prefer ECS, `proximity` will prefer ECS only when `steering_policy=&#34;proximity&#34;`, and `geo` will prefer ECS only when `steering_policy=&#34;geo&#34;`. Available values: `always`, `never`, `proximity`, `geo`. Defaults to `proximity`.
         * 
         * @return builder
         * 
         */
        public Builder preferEcs(String preferEcs) {
            return preferEcs(Output.of(preferEcs));
        }

        public LoadBalancerLocationStrategyArgs build() {
            return $;
        }
    }

}
