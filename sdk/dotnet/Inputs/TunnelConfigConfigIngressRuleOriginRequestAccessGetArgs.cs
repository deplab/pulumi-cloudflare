// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class TunnelConfigConfigIngressRuleOriginRequestAccessGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("audTags")]
        private InputList<string>? _audTags;
        public InputList<string> AudTags
        {
            get => _audTags ?? (_audTags = new InputList<string>());
            set => _audTags = value;
        }

        [Input("required")]
        public Input<bool>? Required { get; set; }

        [Input("teamName")]
        public Input<string>? TeamName { get; set; }

        public TunnelConfigConfigIngressRuleOriginRequestAccessGetArgs()
        {
        }
        public static new TunnelConfigConfigIngressRuleOriginRequestAccessGetArgs Empty => new TunnelConfigConfigIngressRuleOriginRequestAccessGetArgs();
    }
}
