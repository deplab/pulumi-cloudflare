// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class RulesetRuleActionParametersOverridesCategory
    {
        /// <summary>
        /// Action to perform in the rule-level override. Valid values are `"block"`, `"challenge"`, `"ddos_dynamic"`, `"execute"`, `"force_connection_close"`, `"js_challenge"`, `"managed_challenge"`, `"log"`, `"rewrite"`, `"score"`, or  `"skip"`.
        /// </summary>
        public readonly string? Action;
        /// <summary>
        /// Tag name to apply the ruleset rule override to.
        /// </summary>
        public readonly string? Category;
        /// <summary>
        /// Defines if the current rule-level override enables or disables the rule.
        /// </summary>
        public readonly bool? Enabled;

        [OutputConstructor]
        private RulesetRuleActionParametersOverridesCategory(
            string? action,

            string? category,

            bool? enabled)
        {
            Action = action;
            Category = category;
            Enabled = enabled;
        }
    }
}
