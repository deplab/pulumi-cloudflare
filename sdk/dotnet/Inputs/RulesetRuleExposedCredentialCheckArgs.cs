// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class RulesetRuleExposedCredentialCheckArgs : Pulumi.ResourceArgs
    {
        [Input("passwordExpression")]
        public Input<string>? PasswordExpression { get; set; }

        [Input("usernameExpression")]
        public Input<string>? UsernameExpression { get; set; }

        public RulesetRuleExposedCredentialCheckArgs()
        {
        }
    }
}
