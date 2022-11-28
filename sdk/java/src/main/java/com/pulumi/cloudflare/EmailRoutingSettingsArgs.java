// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EmailRoutingSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final EmailRoutingSettingsArgs Empty = new EmailRoutingSettingsArgs();

    /**
     * State of the zone settings for Email Routing.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return State of the zone settings for Email Routing.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * Flag to check if the user skipped the configuration wizard.
     * 
     */
    @Import(name="skipWizard")
    private @Nullable Output<Boolean> skipWizard;

    /**
     * @return Flag to check if the user skipped the configuration wizard.
     * 
     */
    public Optional<Output<Boolean>> skipWizard() {
        return Optional.ofNullable(this.skipWizard);
    }

    /**
     * The zone identifier to target for the resource.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private EmailRoutingSettingsArgs() {}

    private EmailRoutingSettingsArgs(EmailRoutingSettingsArgs $) {
        this.enabled = $.enabled;
        this.skipWizard = $.skipWizard;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EmailRoutingSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EmailRoutingSettingsArgs $;

        public Builder() {
            $ = new EmailRoutingSettingsArgs();
        }

        public Builder(EmailRoutingSettingsArgs defaults) {
            $ = new EmailRoutingSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled State of the zone settings for Email Routing.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled State of the zone settings for Email Routing.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param skipWizard Flag to check if the user skipped the configuration wizard.
         * 
         * @return builder
         * 
         */
        public Builder skipWizard(@Nullable Output<Boolean> skipWizard) {
            $.skipWizard = skipWizard;
            return this;
        }

        /**
         * @param skipWizard Flag to check if the user skipped the configuration wizard.
         * 
         * @return builder
         * 
         */
        public Builder skipWizard(Boolean skipWizard) {
            return skipWizard(Output.of(skipWizard));
        }

        /**
         * @param zoneId The zone identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public EmailRoutingSettingsArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.zoneId = Objects.requireNonNull($.zoneId, "expected parameter 'zoneId' to be non-null");
            return $;
        }
    }

}
