// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TunnelConfigConfigWarpRoutingArgs extends com.pulumi.resources.ResourceArgs {

    public static final TunnelConfigConfigWarpRoutingArgs Empty = new TunnelConfigConfigWarpRoutingArgs();

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private TunnelConfigConfigWarpRoutingArgs() {}

    private TunnelConfigConfigWarpRoutingArgs(TunnelConfigConfigWarpRoutingArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TunnelConfigConfigWarpRoutingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TunnelConfigConfigWarpRoutingArgs $;

        public Builder() {
            $ = new TunnelConfigConfigWarpRoutingArgs();
        }

        public Builder(TunnelConfigConfigWarpRoutingArgs defaults) {
            $ = new TunnelConfigConfigWarpRoutingArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public TunnelConfigConfigWarpRoutingArgs build() {
            return $;
        }
    }

}