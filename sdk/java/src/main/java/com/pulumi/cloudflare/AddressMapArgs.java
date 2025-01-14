// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.AddressMapIpArgs;
import com.pulumi.cloudflare.inputs.AddressMapMembershipArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AddressMapArgs extends com.pulumi.resources.ResourceArgs {

    public static final AddressMapArgs Empty = new AddressMapArgs();

    /**
     * The account identifier to target for the resource.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * If you have legacy TLS clients which do not send the TLS server name indicator, then you can specify one default SNI on the map.
     * 
     */
    @Import(name="defaultSni")
    private @Nullable Output<String> defaultSni;

    /**
     * @return If you have legacy TLS clients which do not send the TLS server name indicator, then you can specify one default SNI on the map.
     * 
     */
    public Optional<Output<String>> defaultSni() {
        return Optional.ofNullable(this.defaultSni);
    }

    /**
     * Description of the address map.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the address map.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Whether the Address Map is enabled or not.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Whether the Address Map is enabled or not.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * The set of IPs on the Address Map.
     * 
     */
    @Import(name="ips")
    private @Nullable Output<List<AddressMapIpArgs>> ips;

    /**
     * @return The set of IPs on the Address Map.
     * 
     */
    public Optional<Output<List<AddressMapIpArgs>>> ips() {
        return Optional.ofNullable(this.ips);
    }

    /**
     * Zones and Accounts which will be assigned IPs on this Address Map.
     * 
     */
    @Import(name="memberships")
    private @Nullable Output<List<AddressMapMembershipArgs>> memberships;

    /**
     * @return Zones and Accounts which will be assigned IPs on this Address Map.
     * 
     */
    public Optional<Output<List<AddressMapMembershipArgs>>> memberships() {
        return Optional.ofNullable(this.memberships);
    }

    private AddressMapArgs() {}

    private AddressMapArgs(AddressMapArgs $) {
        this.accountId = $.accountId;
        this.defaultSni = $.defaultSni;
        this.description = $.description;
        this.enabled = $.enabled;
        this.ips = $.ips;
        this.memberships = $.memberships;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AddressMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AddressMapArgs $;

        public Builder() {
            $ = new AddressMapArgs();
        }

        public Builder(AddressMapArgs defaults) {
            $ = new AddressMapArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param defaultSni If you have legacy TLS clients which do not send the TLS server name indicator, then you can specify one default SNI on the map.
         * 
         * @return builder
         * 
         */
        public Builder defaultSni(@Nullable Output<String> defaultSni) {
            $.defaultSni = defaultSni;
            return this;
        }

        /**
         * @param defaultSni If you have legacy TLS clients which do not send the TLS server name indicator, then you can specify one default SNI on the map.
         * 
         * @return builder
         * 
         */
        public Builder defaultSni(String defaultSni) {
            return defaultSni(Output.of(defaultSni));
        }

        /**
         * @param description Description of the address map.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the address map.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enabled Whether the Address Map is enabled or not.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether the Address Map is enabled or not.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param ips The set of IPs on the Address Map.
         * 
         * @return builder
         * 
         */
        public Builder ips(@Nullable Output<List<AddressMapIpArgs>> ips) {
            $.ips = ips;
            return this;
        }

        /**
         * @param ips The set of IPs on the Address Map.
         * 
         * @return builder
         * 
         */
        public Builder ips(List<AddressMapIpArgs> ips) {
            return ips(Output.of(ips));
        }

        /**
         * @param ips The set of IPs on the Address Map.
         * 
         * @return builder
         * 
         */
        public Builder ips(AddressMapIpArgs... ips) {
            return ips(List.of(ips));
        }

        /**
         * @param memberships Zones and Accounts which will be assigned IPs on this Address Map.
         * 
         * @return builder
         * 
         */
        public Builder memberships(@Nullable Output<List<AddressMapMembershipArgs>> memberships) {
            $.memberships = memberships;
            return this;
        }

        /**
         * @param memberships Zones and Accounts which will be assigned IPs on this Address Map.
         * 
         * @return builder
         * 
         */
        public Builder memberships(List<AddressMapMembershipArgs> memberships) {
            return memberships(Output.of(memberships));
        }

        /**
         * @param memberships Zones and Accounts which will be assigned IPs on this Address Map.
         * 
         * @return builder
         * 
         */
        public Builder memberships(AddressMapMembershipArgs... memberships) {
            return memberships(List.of(memberships));
        }

        public AddressMapArgs build() {
            $.accountId = Objects.requireNonNull($.accountId, "expected parameter 'accountId' to be non-null");
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
