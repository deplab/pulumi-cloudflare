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


public final class AccessCustomPageArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessCustomPageArgs Empty = new AccessCustomPageArgs();

    /**
     * The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Number of apps to display on the custom page.
     * 
     */
    @Import(name="appCount")
    private @Nullable Output<Integer> appCount;

    /**
     * @return Number of apps to display on the custom page.
     * 
     */
    public Optional<Output<Integer>> appCount() {
        return Optional.ofNullable(this.appCount);
    }

    /**
     * Custom HTML to display on the custom page.
     * 
     */
    @Import(name="customHtml")
    private @Nullable Output<String> customHtml;

    /**
     * @return Custom HTML to display on the custom page.
     * 
     */
    public Optional<Output<String>> customHtml() {
        return Optional.ofNullable(this.customHtml);
    }

    /**
     * Friendly name of the Access Custom Page configuration.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Friendly name of the Access Custom Page configuration.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Type of Access custom page to create. Available values: `identity_denied`, `forbidden`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of Access custom page to create. Available values: `identity_denied`, `forbidden`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * The zone identifier to target for the resource. Conflicts with `account_id`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. Conflicts with `account_id`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private AccessCustomPageArgs() {}

    private AccessCustomPageArgs(AccessCustomPageArgs $) {
        this.accountId = $.accountId;
        this.appCount = $.appCount;
        this.customHtml = $.customHtml;
        this.name = $.name;
        this.type = $.type;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessCustomPageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessCustomPageArgs $;

        public Builder() {
            $ = new AccessCustomPageArgs();
        }

        public Builder(AccessCustomPageArgs defaults) {
            $ = new AccessCustomPageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param appCount Number of apps to display on the custom page.
         * 
         * @return builder
         * 
         */
        public Builder appCount(@Nullable Output<Integer> appCount) {
            $.appCount = appCount;
            return this;
        }

        /**
         * @param appCount Number of apps to display on the custom page.
         * 
         * @return builder
         * 
         */
        public Builder appCount(Integer appCount) {
            return appCount(Output.of(appCount));
        }

        /**
         * @param customHtml Custom HTML to display on the custom page.
         * 
         * @return builder
         * 
         */
        public Builder customHtml(@Nullable Output<String> customHtml) {
            $.customHtml = customHtml;
            return this;
        }

        /**
         * @param customHtml Custom HTML to display on the custom page.
         * 
         * @return builder
         * 
         */
        public Builder customHtml(String customHtml) {
            return customHtml(Output.of(customHtml));
        }

        /**
         * @param name Friendly name of the Access Custom Page configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Friendly name of the Access Custom Page configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type Type of Access custom page to create. Available values: `identity_denied`, `forbidden`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of Access custom page to create. Available values: `identity_denied`, `forbidden`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param zoneId The zone identifier to target for the resource. Conflicts with `account_id`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource. Conflicts with `account_id`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public AccessCustomPageArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
