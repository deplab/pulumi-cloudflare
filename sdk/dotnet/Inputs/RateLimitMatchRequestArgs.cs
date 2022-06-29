// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class RateLimitMatchRequestArgs : Pulumi.ResourceArgs
    {
        [Input("methods")]
        private InputList<string>? _methods;

        /// <summary>
        /// HTTP Methods, can be a subset ['POST','PUT'] or all ['\_ALL\_']. Default: ['\_ALL\_'].
        /// </summary>
        public InputList<string> Methods
        {
            get => _methods ?? (_methods = new InputList<string>());
            set => _methods = value;
        }

        [Input("schemes")]
        private InputList<string>? _schemes;

        /// <summary>
        /// HTTP Schemes, can be one ['HTTPS'], both ['HTTP','HTTPS'] or all ['\_ALL\_']. Default: ['\_ALL\_'].
        /// </summary>
        public InputList<string> Schemes
        {
            get => _schemes ?? (_schemes = new InputList<string>());
            set => _schemes = value;
        }

        /// <summary>
        /// The URL pattern to match comprised of the host and path, i.e. example.org/path. Wildcard are expanded to match applicable traffic, query strings are not matched. Use _ for all traffic to your zone. Default: '_'.
        /// </summary>
        [Input("urlPattern")]
        public Input<string>? UrlPattern { get; set; }

        public RateLimitMatchRequestArgs()
        {
        }
    }
}
