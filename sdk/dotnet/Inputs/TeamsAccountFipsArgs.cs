// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class TeamsAccountFipsArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Only allow FIPS-compliant TLS configuration.
        /// </summary>
        [Input("tls")]
        public Input<bool>? Tls { get; set; }

        public TeamsAccountFipsArgs()
        {
        }
    }
}
