// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class RulesetRuleActionParametersEdgeTtlStatusCodeTtlArgs : global::Pulumi.ResourceArgs
    {
        [Input("statusCode")]
        public Input<int>? StatusCode { get; set; }

        [Input("statusCodeRanges")]
        private InputList<Inputs.RulesetRuleActionParametersEdgeTtlStatusCodeTtlStatusCodeRangeArgs>? _statusCodeRanges;
        public InputList<Inputs.RulesetRuleActionParametersEdgeTtlStatusCodeTtlStatusCodeRangeArgs> StatusCodeRanges
        {
            get => _statusCodeRanges ?? (_statusCodeRanges = new InputList<Inputs.RulesetRuleActionParametersEdgeTtlStatusCodeTtlStatusCodeRangeArgs>());
            set => _statusCodeRanges = value;
        }

        [Input("value")]
        public Input<int>? Value { get; set; }

        public RulesetRuleActionParametersEdgeTtlStatusCodeTtlArgs()
        {
        }
        public static new RulesetRuleActionParametersEdgeTtlStatusCodeTtlArgs Empty => new RulesetRuleActionParametersEdgeTtlStatusCodeTtlArgs();
    }
}
