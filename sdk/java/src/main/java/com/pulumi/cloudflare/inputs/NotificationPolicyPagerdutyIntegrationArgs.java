// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationPolicyPagerdutyIntegrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationPolicyPagerdutyIntegrationArgs Empty = new NotificationPolicyPagerdutyIntegrationArgs();

    /**
     * The ID of this resource.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of this resource.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private NotificationPolicyPagerdutyIntegrationArgs() {}

    private NotificationPolicyPagerdutyIntegrationArgs(NotificationPolicyPagerdutyIntegrationArgs $) {
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationPolicyPagerdutyIntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationPolicyPagerdutyIntegrationArgs $;

        public Builder() {
            $ = new NotificationPolicyPagerdutyIntegrationArgs();
        }

        public Builder(NotificationPolicyPagerdutyIntegrationArgs defaults) {
            $ = new NotificationPolicyPagerdutyIntegrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of this resource.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of this resource.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public NotificationPolicyPagerdutyIntegrationArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
