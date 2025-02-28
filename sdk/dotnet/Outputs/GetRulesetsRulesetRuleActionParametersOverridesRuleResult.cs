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
    public sealed class GetRulesetsRulesetRuleActionParametersOverridesRuleResult
    {
        public readonly string? Action;
        public readonly bool? Enabled;
        /// <summary>
        /// The ID of the Ruleset to target.
        /// </summary>
        public readonly string? Id;
        public readonly int? ScoreThreshold;
        public readonly string? SensitivityLevel;
        public readonly string? Status;

        [OutputConstructor]
        private GetRulesetsRulesetRuleActionParametersOverridesRuleResult(
            string? action,

            bool? enabled,

            string? id,

            int? scoreThreshold,

            string? sensitivityLevel,

            string? status)
        {
            Action = action;
            Enabled = enabled;
            Id = id;
            ScoreThreshold = scoreThreshold;
            SensitivityLevel = sensitivityLevel;
            Status = status;
        }
    }
}
