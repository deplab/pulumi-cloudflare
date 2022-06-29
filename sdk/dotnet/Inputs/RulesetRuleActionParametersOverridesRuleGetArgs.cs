// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class RulesetRuleActionParametersOverridesRuleGetArgs : Pulumi.ResourceArgs
    {
        [Input("action")]
        public Input<string>? Action { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("scoreThreshold")]
        public Input<int>? ScoreThreshold { get; set; }

        [Input("sensitivityLevel")]
        public Input<string>? SensitivityLevel { get; set; }

        [Input("status")]
        public Input<string>? Status { get; set; }

        public RulesetRuleActionParametersOverridesRuleGetArgs()
        {
        }
    }
}
