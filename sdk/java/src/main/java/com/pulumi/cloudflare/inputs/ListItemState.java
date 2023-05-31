// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.ListItemHostnameArgs;
import com.pulumi.cloudflare.inputs.ListItemRedirectArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListItemState extends com.pulumi.resources.ResourceArgs {

    public static final ListItemState Empty = new ListItemState();

    /**
     * The account identifier to target for the resource.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Autonomous system number to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="asn")
    private @Nullable Output<Integer> asn;

    /**
     * @return Autonomous system number to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Output<Integer>> asn() {
        return Optional.ofNullable(this.asn);
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
     * Redirect configuration to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="hostname")
    private @Nullable Output<ListItemHostnameArgs> hostname;

    /**
     * @return Redirect configuration to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Output<ListItemHostnameArgs>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * IP address to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="ip")
    private @Nullable Output<String> ip;

    /**
     * @return IP address to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Output<String>> ip() {
        return Optional.ofNullable(this.ip);
    }

    /**
     * The list identifier to target for the resource.
     * 
     */
    @Import(name="listId")
    private @Nullable Output<String> listId;

    /**
     * @return The list identifier to target for the resource.
     * 
     */
    public Optional<Output<String>> listId() {
        return Optional.ofNullable(this.listId);
    }

    /**
     * Redirect configuration to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="redirect")
    private @Nullable Output<ListItemRedirectArgs> redirect;

    /**
     * @return Redirect configuration to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Output<ListItemRedirectArgs>> redirect() {
        return Optional.ofNullable(this.redirect);
    }

    private ListItemState() {}

    private ListItemState(ListItemState $) {
        this.accountId = $.accountId;
        this.asn = $.asn;
        this.comment = $.comment;
        this.hostname = $.hostname;
        this.ip = $.ip;
        this.listId = $.listId;
        this.redirect = $.redirect;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListItemState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListItemState $;

        public Builder() {
            $ = new ListItemState();
        }

        public Builder(ListItemState defaults) {
            $ = new ListItemState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
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
         * @param asn Autonomous system number to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder asn(@Nullable Output<Integer> asn) {
            $.asn = asn;
            return this;
        }

        /**
         * @param asn Autonomous system number to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder asn(Integer asn) {
            return asn(Output.of(asn));
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
         * @param hostname Redirect configuration to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder hostname(@Nullable Output<ListItemHostnameArgs> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname Redirect configuration to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder hostname(ListItemHostnameArgs hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param ip IP address to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder ip(@Nullable Output<String> ip) {
            $.ip = ip;
            return this;
        }

        /**
         * @param ip IP address to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
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
        public Builder listId(@Nullable Output<String> listId) {
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
         * @param redirect Redirect configuration to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder redirect(@Nullable Output<ListItemRedirectArgs> redirect) {
            $.redirect = redirect;
            return this;
        }

        /**
         * @param redirect Redirect configuration to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder redirect(ListItemRedirectArgs redirect) {
            return redirect(Output.of(redirect));
        }

        public ListItemState build() {
            return $;
        }
    }

}
