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
    public sealed class RulesetRuleActionParametersOverrides
    {
        public readonly string? Action;
        public readonly ImmutableArray<Outputs.RulesetRuleActionParametersOverridesCategory> Categories;
        public readonly bool? Enabled;
        /// <summary>
        /// List of rules to apply to the ruleset.
        /// </summary>
        public readonly ImmutableArray<Outputs.RulesetRuleActionParametersOverridesRule> Rules;
        public readonly string? SensitivityLevel;
        public readonly string? Status;

        [OutputConstructor]
        private RulesetRuleActionParametersOverrides(
            string? action,

            ImmutableArray<Outputs.RulesetRuleActionParametersOverridesCategory> categories,

            bool? enabled,

            ImmutableArray<Outputs.RulesetRuleActionParametersOverridesRule> rules,

            string? sensitivityLevel,

            string? status)
        {
            Action = action;
            Categories = categories;
            Enabled = enabled;
            Rules = rules;
            SensitivityLevel = sensitivityLevel;
            Status = status;
        }
    }
}
