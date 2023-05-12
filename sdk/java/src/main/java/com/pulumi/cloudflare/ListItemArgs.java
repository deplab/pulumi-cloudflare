// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.ListItemRedirectArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListItemArgs Empty = new ListItemArgs();

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
     * An optional comment for the item.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return An optional comment for the item.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * IP address to include in the list. Must provide only one of `ip`, `redirect`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="ip")
    private @Nullable Output<String> ip;

    /**
     * @return IP address to include in the list. Must provide only one of `ip`, `redirect`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Output<String>> ip() {
        return Optional.ofNullable(this.ip);
    }

    /**
     * The list identifier to target for the resource.
     * 
     */
    @Import(name="listId", required=true)
    private Output<String> listId;

    /**
     * @return The list identifier to target for the resource.
     * 
     */
    public Output<String> listId() {
        return this.listId;
    }

    /**
     * Redirect configuration to store in the list. Must provide only one of `ip`, `redirect`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="redirect")
    private @Nullable Output<ListItemRedirectArgs> redirect;

    /**
     * @return Redirect configuration to store in the list. Must provide only one of `ip`, `redirect`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Output<ListItemRedirectArgs>> redirect() {
        return Optional.ofNullable(this.redirect);
    }

    private ListItemArgs() {}

    private ListItemArgs(ListItemArgs $) {
        this.accountId = $.accountId;
        this.comment = $.comment;
        this.ip = $.ip;
        this.listId = $.listId;
        this.redirect = $.redirect;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListItemArgs $;

        public Builder() {
            $ = new ListItemArgs();
        }

        public Builder(ListItemArgs defaults) {
            $ = new ListItemArgs(Objects.requireNonNull(defaults));
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
         * @param comment An optional comment for the item.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment An optional comment for the item.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param ip IP address to include in the list. Must provide only one of `ip`, `redirect`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder ip(@Nullable Output<String> ip) {
            $.ip = ip;
            return this;
        }

        /**
         * @param ip IP address to include in the list. Must provide only one of `ip`, `redirect`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder ip(String ip) {
            return ip(Output.of(ip));
        }

        /**
         * @param listId The list identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder listId(Output<String> listId) {
            $.listId = listId;
            return this;
        }

        /**
         * @param listId The list identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder listId(String listId) {
            return listId(Output.of(listId));
        }

        /**
         * @param redirect Redirect configuration to store in the list. Must provide only one of `ip`, `redirect`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder redirect(@Nullable Output<ListItemRedirectArgs> redirect) {
            $.redirect = redirect;
            return this;
        }

        /**
         * @param redirect Redirect configuration to store in the list. Must provide only one of `ip`, `redirect`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder redirect(ListItemRedirectArgs redirect) {
            return redirect(Output.of(redirect));
        }

        public ListItemArgs build() {
            $.accountId = Objects.requireNonNull($.accountId, "expected parameter 'accountId' to be non-null");
            $.listId = Objects.requireNonNull($.listId, "expected parameter 'listId' to be non-null");
            return $;
        }
    }

}
