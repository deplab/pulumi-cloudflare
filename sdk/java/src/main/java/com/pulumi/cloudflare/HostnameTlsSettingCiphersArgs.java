// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HostnameTlsSettingCiphersArgs extends com.pulumi.resources.ResourceArgs {

    public static final HostnameTlsSettingCiphersArgs Empty = new HostnameTlsSettingCiphersArgs();

    /**
     * Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="hostname", required=true)
    private Output<String> hostname;

    /**
     * @return Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }

    /**
     * Ports to use within the IP rule.
     * 
     */
    @Import(name="ports")
    private @Nullable Output<List<Integer>> ports;

    /**
     * @return Ports to use within the IP rule.
     * 
     */
    public Optional<Output<List<Integer>>> ports() {
        return Optional.ofNullable(this.ports);
    }

    /**
     * Ciphers suites value.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return Ciphers suites value.
     * 
     */
    public Output<List<String>> values() {
        return this.values;
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

    private HostnameTlsSettingCiphersArgs() {}

    private HostnameTlsSettingCiphersArgs(HostnameTlsSettingCiphersArgs $) {
        this.hostname = $.hostname;
        this.ports = $.ports;
        this.values = $.values;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostnameTlsSettingCiphersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostnameTlsSettingCiphersArgs $;

        public Builder() {
            $ = new HostnameTlsSettingCiphersArgs();
        }

        public Builder(HostnameTlsSettingCiphersArgs defaults) {
            $ = new HostnameTlsSettingCiphersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostname Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder hostname(Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param ports Ports to use within the IP rule.
         * 
         * @return builder
         * 
         */
        public Builder ports(@Nullable Output<List<Integer>> ports) {
            $.ports = ports;
            return this;
        }

        /**
         * @param ports Ports to use within the IP rule.
         * 
         * @return builder
         * 
         */
        public Builder ports(List<Integer> ports) {
            return ports(Output.of(ports));
        }

        /**
         * @param ports Ports to use within the IP rule.
         * 
         * @return builder
         * 
         */
        public Builder ports(Integer... ports) {
            return ports(List.of(ports));
        }

        /**
         * @param values Ciphers suites value.
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Ciphers suites value.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values Ciphers suites value.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
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

        public HostnameTlsSettingCiphersArgs build() {
            $.hostname = Objects.requireNonNull($.hostname, "expected parameter 'hostname' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            $.zoneId = Objects.requireNonNull($.zoneId, "expected parameter 'zoneId' to be non-null");
            return $;
        }
    }

}
