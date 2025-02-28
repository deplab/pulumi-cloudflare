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
    public sealed class GetRulesetsRulesetRuleResult
    {
        public readonly string? Action;
        public readonly Outputs.GetRulesetsRulesetRuleActionParametersResult? ActionParameters;
        public readonly string? Description;
        public readonly bool? Enabled;
        public readonly Outputs.GetRulesetsRulesetRuleExposedCredentialCheckResult? ExposedCredentialCheck;
        public readonly string Expression;
        /// <summary>
        /// The ID of the Ruleset to target.
        /// </summary>
        public readonly string Id;
        public readonly string? LastUpdated;
        public readonly Outputs.GetRulesetsRulesetRuleLoggingResult? Logging;
        public readonly Outputs.GetRulesetsRulesetRuleRatelimitResult? Ratelimit;
        public readonly string Ref;
        /// <summary>
        /// Version of the ruleset to filter on.
        /// </summary>
        public readonly string Version;

        [OutputConstructor]
        private GetRulesetsRulesetRuleResult(
            string? action,

            Outputs.GetRulesetsRulesetRuleActionParametersResult? actionParameters,

            string? description,

            bool? enabled,

            Outputs.GetRulesetsRulesetRuleExposedCredentialCheckResult? exposedCredentialCheck,

            string expression,

            string id,

            string? lastUpdated,

            Outputs.GetRulesetsRulesetRuleLoggingResult? logging,

            Outputs.GetRulesetsRulesetRuleRatelimitResult? ratelimit,

            string @ref,

            string version)
        {
            Action = action;
            ActionParameters = actionParameters;
            Description = description;
            Enabled = enabled;
            ExposedCredentialCheck = exposedCredentialCheck;
            Expression = expression;
            Id = id;
            LastUpdated = lastUpdated;
            Logging = logging;
            Ratelimit = ratelimit;
            Ref = @ref;
            Version = version;
        }
    }
}
