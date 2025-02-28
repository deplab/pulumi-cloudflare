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
public final class CustomHostnameSslSetting {
    /**
     * @return List of SSL/TLS ciphers to associate with this certificate.
     * 
     */
    private @Nullable List<String> ciphers;
    /**
     * @return Whether early hints should be supported. Available values: `on`, `off`.
     * 
     */
    private @Nullable String earlyHints;
    /**
     * @return Whether HTTP2 should be supported. Available values: `on`, `off`.
     * 
     */
    private @Nullable String http2;
    /**
     * @return Lowest version of TLS this certificate should support. Available values: `1.0`, `1.1`, `1.2`, `1.3`.
     * 
     */
    private @Nullable String minTlsVersion;
    /**
     * @return Whether TLSv1.3 should be supported. Available values: `on`, `off`.
     * 
     */
    private @Nullable String tls13;

    private CustomHostnameSslSetting() {}
    /**
     * @return List of SSL/TLS ciphers to associate with this certificate.
     * 
     */
    public List<String> ciphers() {
        return this.ciphers == null ? List.of() : this.ciphers;
    }
    /**
     * @return Whether early hints should be supported. Available values: `on`, `off`.
     * 
     */
    public Optional<String> earlyHints() {
        return Optional.ofNullable(this.earlyHints);
    }
    /**
     * @return Whether HTTP2 should be supported. Available values: `on`, `off`.
     * 
     */
    public Optional<String> http2() {
        return Optional.ofNullable(this.http2);
    }
    /**
     * @return Lowest version of TLS this certificate should support. Available values: `1.0`, `1.1`, `1.2`, `1.3`.
     * 
     */
    public Optional<String> minTlsVersion() {
        return Optional.ofNullable(this.minTlsVersion);
    }
    /**
     * @return Whether TLSv1.3 should be supported. Available values: `on`, `off`.
     * 
     */
    public Optional<String> tls13() {
        return Optional.ofNullable(this.tls13);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomHostnameSslSetting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> ciphers;
        private @Nullable String earlyHints;
        private @Nullable String http2;
        private @Nullable String minTlsVersion;
        private @Nullable String tls13;
        public Builder() {}
        public Builder(CustomHostnameSslSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ciphers = defaults.ciphers;
    	      this.earlyHints = defaults.earlyHints;
    	      this.http2 = defaults.http2;
    	      this.minTlsVersion = defaults.minTlsVersion;
    	      this.tls13 = defaults.tls13;
        }

        @CustomType.Setter
        public Builder ciphers(@Nullable List<String> ciphers) {
            this.ciphers = ciphers;
            return this;
        }
        public Builder ciphers(String... ciphers) {
            return ciphers(List.of(ciphers));
        }
        @CustomType.Setter
        public Builder earlyHints(@Nullable String earlyHints) {
            this.earlyHints = earlyHints;
            return this;
        }
        @CustomType.Setter
        public Builder http2(@Nullable String http2) {
            this.http2 = http2;
            return this;
        }
        @CustomType.Setter
        public Builder minTlsVersion(@Nullable String minTlsVersion) {
            this.minTlsVersion = minTlsVersion;
            return this;
        }
        @CustomType.Setter
        public Builder tls13(@Nullable String tls13) {
            this.tls13 = tls13;
            return this;
        }
        public CustomHostnameSslSetting build() {
            final var o = new CustomHostnameSslSetting();
            o.ciphers = ciphers;
            o.earlyHints = earlyHints;
            o.http2 = http2;
            o.minTlsVersion = minTlsVersion;
            o.tls13 = tls13;
            return o;
        }
    }
}
