// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class RulesetRuleActionParametersBrowserTtlGetArgs : Pulumi.ResourceArgs
    {
        [Input("default")]
        public Input<int>? Default { get; set; }

        [Input("mode", required: true)]
        public Input<string> Mode { get; set; } = null!;

        public RulesetRuleActionParametersBrowserTtlGetArgs()
        {
        }
    }
}
