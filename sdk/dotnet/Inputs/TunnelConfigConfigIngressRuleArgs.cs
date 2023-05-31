// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class TunnelConfigConfigIngressRuleArgs : global::Pulumi.ResourceArgs
    {
        [Input("hostname")]
        public Input<string>? Hostname { get; set; }

        [Input("originRequest")]
        public Input<Inputs.TunnelConfigConfigIngressRuleOriginRequestArgs>? OriginRequest { get; set; }

        [Input("path")]
        public Input<string>? Path { get; set; }

        [Input("service", required: true)]
        public Input<string> Service { get; set; } = null!;

        public TunnelConfigConfigIngressRuleArgs()
        {
        }
        public static new TunnelConfigConfigIngressRuleArgs Empty => new TunnelConfigConfigIngressRuleArgs();
    }
}
