// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessServiceTokenArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessServiceTokenArgs Empty = new AccessServiceTokenArgs();

    /**
     * The account identifier to target for the resource. Conflicts with `zone_id`.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account identifier to target for the resource. Conflicts with `zone_id`.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Length of time the service token is valid for. Available values: `8760h`, `17520h`, `43800h`, `87600h`, `forever`.
     * 
     */
    @Import(name="duration")
    private @Nullable Output<String> duration;

    /**
     * @return Length of time the service token is valid for. Available values: `8760h`, `17520h`, `43800h`, `87600h`, `forever`.
     * 
     */
    public Optional<Output<String>> duration() {
        return Optional.ofNullable(this.duration);
    }

    /**
     * Refresh the token if terraform is run within the specified amount of days before expiration
     * 
     */
    @Import(name="minDaysForRenewal")
    private @Nullable Output<Integer> minDaysForRenewal;

    /**
     * @return Refresh the token if terraform is run within the specified amount of days before expiration
     * 
     */
    public Optional<Output<Integer>> minDaysForRenewal() {
        return Optional.ofNullable(this.minDaysForRenewal);
    }

    /**
     * Friendly name of the token&#39;s intent.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Friendly name of the token&#39;s intent.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The zone identifier to target for the resource. Conflicts with `account_id`.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. Conflicts with `account_id`.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private AccessServiceTokenArgs() {}

    private AccessServiceTokenArgs(AccessServiceTokenArgs $) {
        this.accountId = $.accountId;
        this.duration = $.duration;
        this.minDaysForRenewal = $.minDaysForRenewal;
        this.name = $.name;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessServiceTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessServiceTokenArgs $;

        public Builder() {
            $ = new AccessServiceTokenArgs();
        }

        public Builder(AccessServiceTokenArgs defaults) {
            $ = new AccessServiceTokenArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource. Conflicts with `zone_id`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource. Conflicts with `zone_id`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param duration Length of time the service token is valid for. Available values: `8760h`, `17520h`, `43800h`, `87600h`, `forever`.
         * 
         * @return builder
         * 
         */
        public Builder duration(@Nullable Output<String> duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param duration Length of time the service token is valid for. Available values: `8760h`, `17520h`, `43800h`, `87600h`, `forever`.
         * 
         * @return builder
         * 
         */
        public Builder duration(String duration) {
            return duration(Output.of(duration));
        }

        /**
         * @param minDaysForRenewal Refresh the token if terraform is run within the specified amount of days before expiration
         * 
         * @return builder
         * 
         */
        public Builder minDaysForRenewal(@Nullable Output<Integer> minDaysForRenewal) {
            $.minDaysForRenewal = minDaysForRenewal;
            return this;
        }

        /**
         * @param minDaysForRenewal Refresh the token if terraform is run within the specified amount of days before expiration
         * 
         * @return builder
         * 
         */
        public Builder minDaysForRenewal(Integer minDaysForRenewal) {
            return minDaysForRenewal(Output.of(minDaysForRenewal));
        }

        /**
         * @param name Friendly name of the token&#39;s intent.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Friendly name of the token&#39;s intent.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param zoneId The zone identifier to target for the resource. Conflicts with `account_id`.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource. Conflicts with `account_id`.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public AccessServiceTokenArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
