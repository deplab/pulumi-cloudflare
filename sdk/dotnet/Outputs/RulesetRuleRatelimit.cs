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
    public sealed class RulesetRuleRatelimit
    {
        public readonly ImmutableArray<string> Characteristics;
        public readonly string? CountingExpression;
        public readonly int? MitigationTimeout;
        public readonly int? Period;
        public readonly int? RequestsPerPeriod;
        public readonly bool? RequestsToOrigin;

        [OutputConstructor]
        private RulesetRuleRatelimit(
            ImmutableArray<string> characteristics,

            string? countingExpression,

            int? mitigationTimeout,

            int? period,

            int? requestsPerPeriod,

            bool? requestsToOrigin)
        {
            Characteristics = characteristics;
            CountingExpression = countingExpression;
            MitigationTimeout = mitigationTimeout;
            Period = period;
            RequestsPerPeriod = requestsPerPeriod;
            RequestsToOrigin = requestsToOrigin;
        }
    }
}
