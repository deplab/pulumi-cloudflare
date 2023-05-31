// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TunnelConfigConfigIngressRuleOriginRequestIpRule {
    private @Nullable Boolean allow;
    private @Nullable List<Integer> ports;
    private @Nullable String prefix;

    private TunnelConfigConfigIngressRuleOriginRequestIpRule() {}
    public Optional<Boolean> allow() {
        return Optional.ofNullable(this.allow);
    }
    public List<Integer> ports() {
        return this.ports == null ? List.of() : this.ports;
    }
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TunnelConfigConfigIngressRuleOriginRequestIpRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allow;
        private @Nullable List<Integer> ports;
        private @Nullable String prefix;
        public Builder() {}
        public Builder(TunnelConfigConfigIngressRuleOriginRequestIpRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
    	      this.ports = defaults.ports;
    	      this.prefix = defaults.prefix;
        }

        @CustomType.Setter
        public Builder allow(@Nullable Boolean allow) {
            this.allow = allow;
            return this;
        }
        @CustomType.Setter
        public Builder ports(@Nullable List<Integer> ports) {
            this.ports = ports;
            return this;
        }
        public Builder ports(Integer... ports) {
            return ports(List.of(ports));
        }
        @CustomType.Setter
        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }
        public TunnelConfigConfigIngressRuleOriginRequestIpRule build() {
            final var o = new TunnelConfigConfigIngressRuleOriginRequestIpRule();
            o.allow = allow;
            o.ports = ports;
            o.prefix = prefix;
            return o;
        }
    }
}
