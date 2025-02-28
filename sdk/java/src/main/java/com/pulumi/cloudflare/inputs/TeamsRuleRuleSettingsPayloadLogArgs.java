// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class TeamsRuleRuleSettingsPayloadLogArgs extends com.pulumi.resources.ResourceArgs {

    public static final TeamsRuleRuleSettingsPayloadLogArgs Empty = new TeamsRuleRuleSettingsPayloadLogArgs();

    /**
     * Enable or disable DLP Payload Logging for this rule.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Enable or disable DLP Payload Logging for this rule.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private TeamsRuleRuleSettingsPayloadLogArgs() {}

    private TeamsRuleRuleSettingsPayloadLogArgs(TeamsRuleRuleSettingsPayloadLogArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TeamsRuleRuleSettingsPayloadLogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TeamsRuleRuleSettingsPayloadLogArgs $;

        public Builder() {
            $ = new TeamsRuleRuleSettingsPayloadLogArgs();
        }

        public Builder(TeamsRuleRuleSettingsPayloadLogArgs defaults) {
            $ = new TeamsRuleRuleSettingsPayloadLogArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Enable or disable DLP Payload Logging for this rule.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable or disable DLP Payload Logging for this rule.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public TeamsRuleRuleSettingsPayloadLogArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
