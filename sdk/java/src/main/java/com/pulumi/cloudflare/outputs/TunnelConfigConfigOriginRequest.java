// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.TunnelConfigConfigOriginRequestAccess;
import com.pulumi.cloudflare.outputs.TunnelConfigConfigOriginRequestIpRule;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TunnelConfigConfigOriginRequest {
    private @Nullable TunnelConfigConfigOriginRequestAccess access;
    private @Nullable Boolean bastionMode;
    private @Nullable String caPool;
    private @Nullable String connectTimeout;
    private @Nullable Boolean disableChunkedEncoding;
    private @Nullable Boolean http2Origin;
    private @Nullable String httpHostHeader;
    private @Nullable List<TunnelConfigConfigOriginRequestIpRule> ipRules;
    private @Nullable Integer keepAliveConnections;
    private @Nullable String keepAliveTimeout;
    private @Nullable Boolean noHappyEyeballs;
    private @Nullable Boolean noTlsVerify;
    private @Nullable String originServerName;
    private @Nullable String proxyAddress;
    private @Nullable Integer proxyPort;
    private @Nullable String proxyType;
    private @Nullable String tcpKeepAlive;
    private @Nullable String tlsTimeout;

    private TunnelConfigConfigOriginRequest() {}
    public Optional<TunnelConfigConfigOriginRequestAccess> access() {
        return Optional.ofNullable(this.access);
    }
    public Optional<Boolean> bastionMode() {
        return Optional.ofNullable(this.bastionMode);
    }
    public Optional<String> caPool() {
        return Optional.ofNullable(this.caPool);
    }
    public Optional<String> connectTimeout() {
        return Optional.ofNullable(this.connectTimeout);
    }
    public Optional<Boolean> disableChunkedEncoding() {
        return Optional.ofNullable(this.disableChunkedEncoding);
    }
    public Optional<Boolean> http2Origin() {
        return Optional.ofNullable(this.http2Origin);
    }
    public Optional<String> httpHostHeader() {
        return Optional.ofNullable(this.httpHostHeader);
    }
    public List<TunnelConfigConfigOriginRequestIpRule> ipRules() {
        return this.ipRules == null ? List.of() : this.ipRules;
    }
    public Optional<Integer> keepAliveConnections() {
        return Optional.ofNullable(this.keepAliveConnections);
    }
    public Optional<String> keepAliveTimeout() {
        return Optional.ofNullable(this.keepAliveTimeout);
    }
    public Optional<Boolean> noHappyEyeballs() {
        return Optional.ofNullable(this.noHappyEyeballs);
    }
    public Optional<Boolean> noTlsVerify() {
        return Optional.ofNullable(this.noTlsVerify);
    }
    public Optional<String> originServerName() {
        return Optional.ofNullable(this.originServerName);
    }
    public Optional<String> proxyAddress() {
        return Optional.ofNullable(this.proxyAddress);
    }
    public Optional<Integer> proxyPort() {
        return Optional.ofNullable(this.proxyPort);
    }
    public Optional<String> proxyType() {
        return Optional.ofNullable(this.proxyType);
    }
    public Optional<String> tcpKeepAlive() {
        return Optional.ofNullable(this.tcpKeepAlive);
    }
    public Optional<String> tlsTimeout() {
        return Optional.ofNullable(this.tlsTimeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TunnelConfigConfigOriginRequest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable TunnelConfigConfigOriginRequestAccess access;
        private @Nullable Boolean bastionMode;
        private @Nullable String caPool;
        private @Nullable String connectTimeout;
        private @Nullable Boolean disableChunkedEncoding;
        private @Nullable Boolean http2Origin;
        private @Nullable String httpHostHeader;
        private @Nullable List<TunnelConfigConfigOriginRequestIpRule> ipRules;
        private @Nullable Integer keepAliveConnections;
        private @Nullable String keepAliveTimeout;
        private @Nullable Boolean noHappyEyeballs;
        private @Nullable Boolean noTlsVerify;
        private @Nullable String originServerName;
        private @Nullable String proxyAddress;
        private @Nullable Integer proxyPort;
        private @Nullable String proxyType;
        private @Nullable String tcpKeepAlive;
        private @Nullable String tlsTimeout;
        public Builder() {}
        public Builder(TunnelConfigConfigOriginRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
    	      this.bastionMode = defaults.bastionMode;
    	      this.caPool = defaults.caPool;
    	      this.connectTimeout = defaults.connectTimeout;
    	      this.disableChunkedEncoding = defaults.disableChunkedEncoding;
    	      this.http2Origin = defaults.http2Origin;
    	      this.httpHostHeader = defaults.httpHostHeader;
    	      this.ipRules = defaults.ipRules;
    	      this.keepAliveConnections = defaults.keepAliveConnections;
    	      this.keepAliveTimeout = defaults.keepAliveTimeout;
    	      this.noHappyEyeballs = defaults.noHappyEyeballs;
    	      this.noTlsVerify = defaults.noTlsVerify;
    	      this.originServerName = defaults.originServerName;
    	      this.proxyAddress = defaults.proxyAddress;
    	      this.proxyPort = defaults.proxyPort;
    	      this.proxyType = defaults.proxyType;
    	      this.tcpKeepAlive = defaults.tcpKeepAlive;
    	      this.tlsTimeout = defaults.tlsTimeout;
        }

        @CustomType.Setter
        public Builder access(@Nullable TunnelConfigConfigOriginRequestAccess access) {
            this.access = access;
            return this;
        }
        @CustomType.Setter
        public Builder bastionMode(@Nullable Boolean bastionMode) {
            this.bastionMode = bastionMode;
            return this;
        }
        @CustomType.Setter
        public Builder caPool(@Nullable String caPool) {
            this.caPool = caPool;
            return this;
        }
        @CustomType.Setter
        public Builder connectTimeout(@Nullable String connectTimeout) {
            this.connectTimeout = connectTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder disableChunkedEncoding(@Nullable Boolean disableChunkedEncoding) {
            this.disableChunkedEncoding = disableChunkedEncoding;
            return this;
        }
        @CustomType.Setter
        public Builder http2Origin(@Nullable Boolean http2Origin) {
            this.http2Origin = http2Origin;
            return this;
        }
        @CustomType.Setter
        public Builder httpHostHeader(@Nullable String httpHostHeader) {
            this.httpHostHeader = httpHostHeader;
            return this;
        }
        @CustomType.Setter
        public Builder ipRules(@Nullable List<TunnelConfigConfigOriginRequestIpRule> ipRules) {
            this.ipRules = ipRules;
            return this;
        }
        public Builder ipRules(TunnelConfigConfigOriginRequestIpRule... ipRules) {
            return ipRules(List.of(ipRules));
        }
        @CustomType.Setter
        public Builder keepAliveConnections(@Nullable Integer keepAliveConnections) {
            this.keepAliveConnections = keepAliveConnections;
            return this;
        }
        @CustomType.Setter
        public Builder keepAliveTimeout(@Nullable String keepAliveTimeout) {
            this.keepAliveTimeout = keepAliveTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder noHappyEyeballs(@Nullable Boolean noHappyEyeballs) {
            this.noHappyEyeballs = noHappyEyeballs;
            return this;
        }
        @CustomType.Setter
        public Builder noTlsVerify(@Nullable Boolean noTlsVerify) {
            this.noTlsVerify = noTlsVerify;
            return this;
        }
        @CustomType.Setter
        public Builder originServerName(@Nullable String originServerName) {
            this.originServerName = originServerName;
            return this;
        }
        @CustomType.Setter
        public Builder proxyAddress(@Nullable String proxyAddress) {
            this.proxyAddress = proxyAddress;
            return this;
        }
        @CustomType.Setter
        public Builder proxyPort(@Nullable Integer proxyPort) {
            this.proxyPort = proxyPort;
            return this;
        }
        @CustomType.Setter
        public Builder proxyType(@Nullable String proxyType) {
            this.proxyType = proxyType;
            return this;
        }
        @CustomType.Setter
        public Builder tcpKeepAlive(@Nullable String tcpKeepAlive) {
            this.tcpKeepAlive = tcpKeepAlive;
            return this;
        }
        @CustomType.Setter
        public Builder tlsTimeout(@Nullable String tlsTimeout) {
            this.tlsTimeout = tlsTimeout;
            return this;
        }
        public TunnelConfigConfigOriginRequest build() {
            final var o = new TunnelConfigConfigOriginRequest();
            o.access = access;
            o.bastionMode = bastionMode;
            o.caPool = caPool;
            o.connectTimeout = connectTimeout;
            o.disableChunkedEncoding = disableChunkedEncoding;
            o.http2Origin = http2Origin;
            o.httpHostHeader = httpHostHeader;
            o.ipRules = ipRules;
            o.keepAliveConnections = keepAliveConnections;
            o.keepAliveTimeout = keepAliveTimeout;
            o.noHappyEyeballs = noHappyEyeballs;
            o.noTlsVerify = noTlsVerify;
            o.originServerName = originServerName;
            o.proxyAddress = proxyAddress;
            o.proxyPort = proxyPort;
            o.proxyType = proxyType;
            o.tcpKeepAlive = tcpKeepAlive;
            o.tlsTimeout = tlsTimeout;
            return o;
        }
    }
}
