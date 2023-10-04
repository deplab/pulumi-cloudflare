// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class AccessIdentityProviderScimConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("groupMemberDeprovision")]
        public Input<bool>? GroupMemberDeprovision { get; set; }

        [Input("seatDeprovision")]
        public Input<bool>? SeatDeprovision { get; set; }

        [Input("secret")]
        private Input<string>? _secret;
        public Input<string>? Secret
        {
            get => _secret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("userDeprovision")]
        public Input<bool>? UserDeprovision { get; set; }

        public AccessIdentityProviderScimConfigGetArgs()
        {
        }
        public static new AccessIdentityProviderScimConfigGetArgs Empty => new AccessIdentityProviderScimConfigGetArgs();
    }
}
