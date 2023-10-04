// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class RulesetRuleRatelimitGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("characteristics")]
        private InputList<string>? _characteristics;

        /// <summary>
        /// List of parameters that define how Cloudflare tracks the request rate for this rule.
        /// </summary>
        public InputList<string> Characteristics
        {
            get => _characteristics ?? (_characteristics = new InputList<string>());
            set => _characteristics = value;
        }

        /// <summary>
        /// Criteria for counting HTTP requests to trigger the Rate Limiting action. Uses the Firewall Rules expression language based on Wireshark display filters. Refer to the [Firewall Rules language](https://developers.cloudflare.com/firewall/cf-firewall-language) documentation for all available fields, operators, and functions.
        /// </summary>
        [Input("countingExpression")]
        public Input<string>? CountingExpression { get; set; }

        /// <summary>
        /// Once the request rate is reached, the Rate Limiting rule blocks further requests for the period of time defined in this field.
        /// </summary>
        [Input("mitigationTimeout")]
        public Input<int>? MitigationTimeout { get; set; }

        /// <summary>
        /// The period of time to consider (in seconds) when evaluating the request rate.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// The number of requests over the period of time that will trigger the Rate Limiting rule.
        /// </summary>
        [Input("requestsPerPeriod")]
        public Input<int>? RequestsPerPeriod { get; set; }

        /// <summary>
        /// Whether to include requests to origin within the Rate Limiting count.
        /// </summary>
        [Input("requestsToOrigin", required: true)]
        public Input<bool> RequestsToOrigin { get; set; } = null!;

        /// <summary>
        /// The maximum aggregate score over the period of time that will trigger Rate Limiting rule.
        /// </summary>
        [Input("scorePerPeriod")]
        public Input<int>? ScorePerPeriod { get; set; }

        /// <summary>
        /// Name of HTTP header in the response, set by the origin server, with the score for the current request.
        /// </summary>
        [Input("scoreResponseHeaderName")]
        public Input<string>? ScoreResponseHeaderName { get; set; }

        public RulesetRuleRatelimitGetArgs()
        {
        }
        public static new RulesetRuleRatelimitGetArgs Empty => new RulesetRuleRatelimitGetArgs();
    }
}
