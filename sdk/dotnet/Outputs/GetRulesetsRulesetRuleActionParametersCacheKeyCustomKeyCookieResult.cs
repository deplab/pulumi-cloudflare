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
    public sealed class GetRulesetsRulesetRuleActionParametersCacheKeyCustomKeyCookieResult
    {
        public readonly ImmutableArray<string> CheckPresences;
        public readonly ImmutableArray<string> Includes;

        [OutputConstructor]
        private GetRulesetsRulesetRuleActionParametersCacheKeyCustomKeyCookieResult(
            ImmutableArray<string> checkPresences,

            ImmutableArray<string> includes)
        {
            CheckPresences = checkPresences;
            Includes = includes;
        }
    }
}
