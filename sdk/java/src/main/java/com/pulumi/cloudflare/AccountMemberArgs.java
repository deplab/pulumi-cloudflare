// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountMemberArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountMemberArgs Empty = new AccountMemberArgs();

    /**
     * Account ID to create the account member in.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return Account ID to create the account member in.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * The email address of the user who you wish to manage. Following creation, this field becomes read only via the API and cannot be updated.
     * 
     */
    @Import(name="emailAddress", required=true)
    private Output<String> emailAddress;

    /**
     * @return The email address of the user who you wish to manage. Following creation, this field becomes read only via the API and cannot be updated.
     * 
     */
    public Output<String> emailAddress() {
        return this.emailAddress;
    }

    /**
     * List of account role IDs that you want to assign to a member.
     * 
     */
    @Import(name="roleIds", required=true)
    private Output<List<String>> roleIds;

    /**
     * @return List of account role IDs that you want to assign to a member.
     * 
     */
    public Output<List<String>> roleIds() {
        return this.roleIds;
    }

    /**
     * A member&#39;s status in the account. Available values: `accepted`, `pending`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return A member&#39;s status in the account. Available values: `accepted`, `pending`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private AccountMemberArgs() {}

    private AccountMemberArgs(AccountMemberArgs $) {
        this.accountId = $.accountId;
        this.emailAddress = $.emailAddress;
        this.roleIds = $.roleIds;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountMemberArgs $;

        public Builder() {
            $ = new AccountMemberArgs();
        }

        public Builder(AccountMemberArgs defaults) {
            $ = new AccountMemberArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account ID to create the account member in.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Account ID to create the account member in.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param emailAddress The email address of the user who you wish to manage. Following creation, this field becomes read only via the API and cannot be updated.
         * 
         * @return builder
         * 
         */
        public Builder emailAddress(Output<String> emailAddress) {
            $.emailAddress = emailAddress;
            return this;
        }

        /**
         * @param emailAddress The email address of the user who you wish to manage. Following creation, this field becomes read only via the API and cannot be updated.
         * 
         * @return builder
         * 
         */
        public Builder emailAddress(String emailAddress) {
            return emailAddress(Output.of(emailAddress));
        }

        /**
         * @param roleIds List of account role IDs that you want to assign to a member.
         * 
         * @return builder
         * 
         */
        public Builder roleIds(Output<List<String>> roleIds) {
            $.roleIds = roleIds;
            return this;
        }

        /**
         * @param roleIds List of account role IDs that you want to assign to a member.
         * 
         * @return builder
         * 
         */
        public Builder roleIds(List<String> roleIds) {
            return roleIds(Output.of(roleIds));
        }

        /**
         * @param roleIds List of account role IDs that you want to assign to a member.
         * 
         * @return builder
         * 
         */
        public Builder roleIds(String... roleIds) {
            return roleIds(List.of(roleIds));
        }

        /**
         * @param status A member&#39;s status in the account. Available values: `accepted`, `pending`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status A member&#39;s status in the account. Available values: `accepted`, `pending`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public AccountMemberArgs build() {
            $.accountId = Objects.requireNonNull($.accountId, "expected parameter 'accountId' to be non-null");
            $.emailAddress = Objects.requireNonNull($.emailAddress, "expected parameter 'emailAddress' to be non-null");
            $.roleIds = Objects.requireNonNull($.roleIds, "expected parameter 'roleIds' to be non-null");
            return $;
        }
    }

}
