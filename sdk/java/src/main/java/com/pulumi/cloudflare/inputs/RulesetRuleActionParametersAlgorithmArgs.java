// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RulesetRuleActionParametersAlgorithmArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetRuleActionParametersAlgorithmArgs Empty = new RulesetRuleActionParametersAlgorithmArgs();

    /**
     * Name of the ruleset.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the ruleset.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private RulesetRuleActionParametersAlgorithmArgs() {}

    private RulesetRuleActionParametersAlgorithmArgs(RulesetRuleActionParametersAlgorithmArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetRuleActionParametersAlgorithmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetRuleActionParametersAlgorithmArgs $;

        public Builder() {
            $ = new RulesetRuleActionParametersAlgorithmArgs();
        }

        public Builder(RulesetRuleActionParametersAlgorithmArgs defaults) {
            $ = new RulesetRuleActionParametersAlgorithmArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public RulesetRuleActionParametersAlgorithmArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}