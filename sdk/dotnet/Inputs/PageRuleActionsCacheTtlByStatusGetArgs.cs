// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class PageRuleActionsCacheTtlByStatusGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A HTTP code (e.g. `404`) or range of codes (e.g. `400-499`)
        /// </summary>
        [Input("codes", required: true)]
        public Input<string> Codes { get; set; } = null!;

        /// <summary>
        /// Duration a resource lives in the Cloudflare cache.
        /// - positive number - cache for specified duration in seconds
        /// </summary>
        [Input("ttl", required: true)]
        public Input<int> Ttl { get; set; } = null!;

        public PageRuleActionsCacheTtlByStatusGetArgs()
        {
        }
    }
}
