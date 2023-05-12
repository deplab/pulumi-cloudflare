// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationPolicyWebhooksState extends com.pulumi.resources.ResourceArgs {

    public static final NotificationPolicyWebhooksState Empty = new NotificationPolicyWebhooksState();

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
     * Timestamp of when the notification webhook was created.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return Timestamp of when the notification webhook was created.
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * Timestamp of when the notification webhook last faiuled.
     * 
     */
    @Import(name="lastFailure")
    private @Nullable Output<String> lastFailure;

    /**
     * @return Timestamp of when the notification webhook last faiuled.
     * 
     */
    public Optional<Output<String>> lastFailure() {
        return Optional.ofNullable(this.lastFailure);
    }

    /**
     * Timestamp of when the notification webhook was last successful.
     * 
     */
    @Import(name="lastSuccess")
    private @Nullable Output<String> lastSuccess;

    /**
     * @return Timestamp of when the notification webhook was last successful.
     * 
     */
    public Optional<Output<String>> lastSuccess() {
        return Optional.ofNullable(this.lastSuccess);
    }

    /**
     * The name of the webhook destination.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the webhook destination.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * An optional secret can be provided that will be passed in the `cf-webhook-auth` header when dispatching a webhook notification. Secrets are not returned in any API response body. Refer to the [documentation](https://api.cloudflare.com/#notification-webhooks-create-webhook) for more details.
     * 
     */
    @Import(name="secret")
    private @Nullable Output<String> secret;

    /**
     * @return An optional secret can be provided that will be passed in the `cf-webhook-auth` header when dispatching a webhook notification. Secrets are not returned in any API response body. Refer to the [documentation](https://api.cloudflare.com/#notification-webhooks-create-webhook) for more details.
     * 
     */
    public Optional<Output<String>> secret() {
        return Optional.ofNullable(this.secret);
    }

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The URL of the webhook destinations. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return The URL of the webhook destinations. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private NotificationPolicyWebhooksState() {}

    private NotificationPolicyWebhooksState(NotificationPolicyWebhooksState $) {
        this.accountId = $.accountId;
        this.createdAt = $.createdAt;
        this.lastFailure = $.lastFailure;
        this.lastSuccess = $.lastSuccess;
        this.name = $.name;
        this.secret = $.secret;
        this.type = $.type;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationPolicyWebhooksState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationPolicyWebhooksState $;

        public Builder() {
            $ = new NotificationPolicyWebhooksState();
        }

        public Builder(NotificationPolicyWebhooksState defaults) {
            $ = new NotificationPolicyWebhooksState(Objects.requireNonNull(defaults));
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
         * @param createdAt Timestamp of when the notification webhook was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt Timestamp of when the notification webhook was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param lastFailure Timestamp of when the notification webhook last faiuled.
         * 
         * @return builder
         * 
         */
        public Builder lastFailure(@Nullable Output<String> lastFailure) {
            $.lastFailure = lastFailure;
            return this;
        }

        /**
         * @param lastFailure Timestamp of when the notification webhook last faiuled.
         * 
         * @return builder
         * 
         */
        public Builder lastFailure(String lastFailure) {
            return lastFailure(Output.of(lastFailure));
        }

        /**
         * @param lastSuccess Timestamp of when the notification webhook was last successful.
         * 
         * @return builder
         * 
         */
        public Builder lastSuccess(@Nullable Output<String> lastSuccess) {
            $.lastSuccess = lastSuccess;
            return this;
        }

        /**
         * @param lastSuccess Timestamp of when the notification webhook was last successful.
         * 
         * @return builder
         * 
         */
        public Builder lastSuccess(String lastSuccess) {
            return lastSuccess(Output.of(lastSuccess));
        }

        /**
         * @param name The name of the webhook destination.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the webhook destination.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param secret An optional secret can be provided that will be passed in the `cf-webhook-auth` header when dispatching a webhook notification. Secrets are not returned in any API response body. Refer to the [documentation](https://api.cloudflare.com/#notification-webhooks-create-webhook) for more details.
         * 
         * @return builder
         * 
         */
        public Builder secret(@Nullable Output<String> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret An optional secret can be provided that will be passed in the `cf-webhook-auth` header when dispatching a webhook notification. Secrets are not returned in any API response body. Refer to the [documentation](https://api.cloudflare.com/#notification-webhooks-create-webhook) for more details.
         * 
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param url The URL of the webhook destinations. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The URL of the webhook destinations. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public NotificationPolicyWebhooksState build() {
            return $;
        }
    }

}
