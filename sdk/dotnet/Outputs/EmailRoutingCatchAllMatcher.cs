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
    public sealed class EmailRoutingCatchAllMatcher
    {
        /// <summary>
        /// Type of matcher. Available values: `all`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private EmailRoutingCatchAllMatcher(string type)
        {
            Type = type;
        }
    }
}