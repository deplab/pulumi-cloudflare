// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class EmailRoutingRuleActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final EmailRoutingRuleActionArgs Empty = new EmailRoutingRuleActionArgs();

    /**
     * Type of supported action.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of supported action.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * An array with items in the following form.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return An array with items in the following form.
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    private EmailRoutingRuleActionArgs() {}

    private EmailRoutingRuleActionArgs(EmailRoutingRuleActionArgs $) {
        this.type = $.type;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EmailRoutingRuleActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EmailRoutingRuleActionArgs $;

        public Builder() {
            $ = new EmailRoutingRuleActionArgs();
        }

        public Builder(EmailRoutingRuleActionArgs defaults) {
            $ = new EmailRoutingRuleActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type Type of supported action.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of supported action.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param values An array with items in the following form.
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values An array with items in the following form.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values An array with items in the following form.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public EmailRoutingRuleActionArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
