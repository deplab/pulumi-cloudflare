// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TunnelConfigConfigIngressRuleOriginRequestIpRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final TunnelConfigConfigIngressRuleOriginRequestIpRuleArgs Empty = new TunnelConfigConfigIngressRuleOriginRequestIpRuleArgs();

    @Import(name="allow")
    private @Nullable Output<Boolean> allow;

    public Optional<Output<Boolean>> allow() {
        return Optional.ofNullable(this.allow);
    }

    @Import(name="ports")
    private @Nullable Output<List<Integer>> ports;

    public Optional<Output<List<Integer>>> ports() {
        return Optional.ofNullable(this.ports);
    }

    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    private TunnelConfigConfigIngressRuleOriginRequestIpRuleArgs() {}

    private TunnelConfigConfigIngressRuleOriginRequestIpRuleArgs(TunnelConfigConfigIngressRuleOriginRequestIpRuleArgs $) {
        this.allow = $.allow;
        this.ports = $.ports;
        this.prefix = $.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TunnelConfigConfigIngressRuleOriginRequestIpRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TunnelConfigConfigIngressRuleOriginRequestIpRuleArgs $;

        public Builder() {
            $ = new TunnelConfigConfigIngressRuleOriginRequestIpRuleArgs();
        }

        public Builder(TunnelConfigConfigIngressRuleOriginRequestIpRuleArgs defaults) {
            $ = new TunnelConfigConfigIngressRuleOriginRequestIpRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder allow(@Nullable Output<Boolean> allow) {
            $.allow = allow;
            return this;
        }

        public Builder allow(Boolean allow) {
            return allow(Output.of(allow));
        }

        public Builder ports(@Nullable Output<List<Integer>> ports) {
            $.ports = ports;
            return this;
        }

        public Builder ports(List<Integer> ports) {
            return ports(Output.of(ports));
        }

        public Builder ports(Integer... ports) {
            return ports(List.of(ports));
        }

        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        public TunnelConfigConfigIngressRuleOriginRequestIpRuleArgs build() {
            return $;
        }
    }

}
