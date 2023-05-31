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
    public sealed class TunnelConfigConfigIngressRuleOriginRequestAccess
    {
        public readonly ImmutableArray<string> AudTags;
        public readonly bool? Required;
        public readonly string? TeamName;

        [OutputConstructor]
        private TunnelConfigConfigIngressRuleOriginRequestAccess(
            ImmutableArray<string> audTags,

            bool? required,

            string? teamName)
        {
            AudTags = audTags;
            Required = required;
            TeamName = teamName;
        }
    }
}
