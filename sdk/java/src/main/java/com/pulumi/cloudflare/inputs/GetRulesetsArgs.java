// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.GetRulesetsFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRulesetsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRulesetsArgs Empty = new GetRulesetsArgs();

    /**
     * The account identifier to target for the resource. Must provide only one of `zone_id`, `account_id`.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account identifier to target for the resource. Must provide only one of `zone_id`, `account_id`.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    @Import(name="filter")
    private @Nullable Output<GetRulesetsFilterArgs> filter;

    public Optional<Output<GetRulesetsFilterArgs>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * Include rule data in response.
     * 
     */
    @Import(name="includeRules")
    private @Nullable Output<Boolean> includeRules;

    /**
     * @return Include rule data in response.
     * 
     */
    public Optional<Output<Boolean>> includeRules() {
        return Optional.ofNullable(this.includeRules);
    }

    /**
     * The zone identifier to target for the resource. Must provide only one of `zone_id`, `account_id`.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. Must provide only one of `zone_id`, `account_id`.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private GetRulesetsArgs() {}

    private GetRulesetsArgs(GetRulesetsArgs $) {
        this.accountId = $.accountId;
        this.filter = $.filter;
        this.includeRules = $.includeRules;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRulesetsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRulesetsArgs $;

        public Builder() {
            $ = new GetRulesetsArgs();
        }

        public Builder(GetRulesetsArgs defaults) {
            $ = new GetRulesetsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource. Must provide only one of `zone_id`, `account_id`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource. Must provide only one of `zone_id`, `account_id`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        public Builder filter(@Nullable Output<GetRulesetsFilterArgs> filter) {
            $.filter = filter;
            return this;
        }

        public Builder filter(GetRulesetsFilterArgs filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param includeRules Include rule data in response.
         * 
         * @return builder
         * 
         */
        public Builder includeRules(@Nullable Output<Boolean> includeRules) {
            $.includeRules = includeRules;
            return this;
        }

        /**
         * @param includeRules Include rule data in response.
         * 
         * @return builder
         * 
         */
        public Builder includeRules(Boolean includeRules) {
            return includeRules(Output.of(includeRules));
        }

        /**
         * @param zoneId The zone identifier to target for the resource. Must provide only one of `zone_id`, `account_id`.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource. Must provide only one of `zone_id`, `account_id`.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public GetRulesetsArgs build() {
            return $;
        }
    }

}
